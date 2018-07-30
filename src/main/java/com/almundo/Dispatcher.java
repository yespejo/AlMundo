/*
 * Carga los agentes y se encarga de asignarle una llamada a 
 * cada uno de los agentes disponibles en el sistema
 */
package com.almundo;

import akka.actor.Props;
import com.almundo.ManagerCall.QueueThread;

/**
 * @author Yeismer Espejo
 * @version: V 0.0.1
 */
public class Dispatcher {
    
    /*
     * Carga los agentes en el orden en el 
     * que pueden atender las llamadas, se cargan primero los operadores
     * despues los supervisores y por ultimo el director
     */
    public void loadAgent(){
        QueueThread.ACTOR_LIST.offer(QueueThread.ACTOR_SYSTEM.actorOf(Props.create(Operator.class), "Operator" + QueueThread.getLastActor()));
        QueueThread.ACTOR_LIST.offer(QueueThread.ACTOR_SYSTEM.actorOf(Props.create(Operator.class), "Operator" + QueueThread.getLastActor()));
        QueueThread.ACTOR_LIST.offer(QueueThread.ACTOR_SYSTEM.actorOf(Props.create(Operator.class), "Operator" + QueueThread.getLastActor()));
        QueueThread.ACTOR_LIST.offer(QueueThread.ACTOR_SYSTEM.actorOf(Props.create(Operator.class), "Operator" + QueueThread.getLastActor()));
        QueueThread.ACTOR_LIST.offer(QueueThread.ACTOR_SYSTEM.actorOf(Props.create(Operator.class), "Operator" + QueueThread.getLastActor()));
        QueueThread.ACTOR_LIST.offer(QueueThread.ACTOR_SYSTEM.actorOf(Props.create(Operator.class), "Operator" + QueueThread.getLastActor()));
        QueueThread.ACTOR_LIST.offer(QueueThread.ACTOR_SYSTEM.actorOf(Props.create(Supervisor.class), "Supervisor" + QueueThread.getLastActor()));
        QueueThread.ACTOR_LIST.offer(QueueThread.ACTOR_SYSTEM.actorOf(Props.create(Supervisor.class), "Supervisor" + QueueThread.getLastActor()));
        QueueThread.ACTOR_LIST.offer(QueueThread.ACTOR_SYSTEM.actorOf(Props.create(Supervisor.class), "Supervisor" + QueueThread.getLastActor()));
        QueueThread.ACTOR_LIST.offer(QueueThread.ACTOR_SYSTEM.actorOf(Props.create(Director.class), "Director" + QueueThread.getLastActor()));
    }
    
    /*
     * Asigna una llamada a cada uno de los agentes disponibles
     */
    public void dispatchCall(){
        QueueThread.ACTOR_LIST.forEach((actor)->{
            QueueThread.EXECUTOR.execute(QueueThread.loadCall(actor));
        });
    }
}
