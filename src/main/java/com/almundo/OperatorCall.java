/*
 * Carga la llamada a cada uno de los actores
 */
package com.almundo;

import akka.actor.ActorRef;
import com.almundo.ManagerCall.QueueThread;

/**
 * @author Yeismer Espejo
 * @version: V 0.0.1
 */
public class OperatorCall implements Runnable {
    
    private ActorRef actor;
    
    /*
     * Nos retorna el pull de direcciones para ubicar el actor
     */
    public OperatorCall (ActorRef actor) {
        this.actor = actor;
    }
    
    /*
     * Toma una llamada de la cola se la asigna al actor
     * la elimina de la cola para darla como atendida
     */
    @Override
    public void run() {
        if(QueueThread.QUEUE_LOCAL.peek() != null){
            this.actor.tell(QueueThread.QUEUE_LOCAL.poll(), ActorRef.noSender());
            QueueThread.ACTOR_SYSTEM.stop(this.actor);
        }
    }
}
