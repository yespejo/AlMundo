/*
 * Administra la cola de llamadas entrantes
 */
package com.almundo.ManagerCall;

/**
 * @author Yeismer Espejo
 * @version: V 0.0.1
 */
public class QueueCall {   
    
    /*
     * Ingresa una llamada a la cola de llamadas
     */
    public void newCall(Call call) {
        QueueThread.QUEUE_LOCAL.offer(call);
    }
    
    public void printPullCall(){
        System.out.println(QueueThread.QUEUE_LOCAL.size());
    }
    
    /*
     * Retorna la primera llamada de la cola
     */
    public Call sendCall(){
        return QueueThread.QUEUE_LOCAL.poll();
    }
}