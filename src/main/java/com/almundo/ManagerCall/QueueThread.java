/*
 * Contiene los contextos globales para la ejecución del sistema
 */
package com.almundo.ManagerCall;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import com.almundo.OperatorCall;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Yeismer Espejo
 * @version: V 0.0.1
 */
public class QueueThread {

    public static final ThreadLocal<String> THREAD  = new ThreadLocal<>();
    public static final Queue<Call> QUEUE_LOCAL  = new LinkedList();
    public static final Queue<ActorRef> ACTOR_LIST  = new LinkedList();
    public static Integer LAST_ACTOR  = 0;
    public static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(10);
    public static final ActorSystem ACTOR_SYSTEM = ActorSystem.create("ActorSystem");  
    
    public static Runnable loadCall(ActorRef actor){
        return new OperatorCall(actor);
    }
    
    public static Integer getLastActor(){
        QueueThread.LAST_ACTOR ++;
        return QueueThread.LAST_ACTOR;
    }
}
