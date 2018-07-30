/*
 * Actor que se utiliza para atender las llamadas como director
 */
package com.almundo;

import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import com.almundo.ManagerCall.Call;
import com.almundo.ManagerCall.QueueThread;
import java.time.format.DateTimeFormatter;

/**
 * @author Yeismer Espejo
 * @version: V 0.0.1
 */
public class Director extends UntypedActor {
    private final LoggingAdapter log = Logging.getLogger(getContext().system(), this);
    private Call call;

    /*
     * Recibe la llamada en el contexto del actor
     * atiende la llamada con una  duración aleatoria entre 5 a 10 sec
     * al terminar la llamada genera un nuevo actor que se encarga de atender una nueva llamada de la lista
     */
    @Override
    public void onReceive(Object o) {
        this.setCall((Call) o);
        log.info("Receive message Operator -- >" + this.getCall().getNumberPhone() + "(" + this.getCall().getDateCall().format(DateTimeFormatter.ISO_DATE) + ")");
        try {
            Thread.sleep(((int)(Math.random()*(10000 - 5000)) + 1000));
            QueueThread.EXECUTOR.execute(QueueThread.loadCall(QueueThread.ACTOR_SYSTEM.actorOf(Props.create(Operator.class), "Operator" + QueueThread.getLastActor())));
        } catch (InterruptedException ex) {
            log.info(Operator.class.getName(), ex);
        }
    }

    public Call getCall() {
        return call;
    }

    public void setCall(Call call) {
        this.call = call;
    }    
}
