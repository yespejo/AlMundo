/*
 * Cargar el pull de llamadas entrantes
 */
package com.almundo;

import com.almundo.ManagerCall.Call;
import com.almundo.ManagerCall.QueueCall;
import java.time.LocalDateTime;

/**
 * @author Yeismer Espejo
 * @version: V 0.0.1
 */
public class LoadNewCall implements Runnable {
    
    /*
     * Se crea un hilo que carga 15 llamadas con el fin
     * de llamarlo en paralelo y pder generar el proceso 
     * de congestion del sistema
     */
    @Override
    public void run() {
        QueueCall queueCall = new QueueCall();
        queueCall.newCall(new Call("---1---", LocalDateTime.now()));
        queueCall.newCall(new Call("---2---", LocalDateTime.now()));
        queueCall.newCall(new Call("---3---", LocalDateTime.now()));
        queueCall.newCall(new Call("---4---", LocalDateTime.now()));
        queueCall.newCall(new Call("---5---", LocalDateTime.now()));
        queueCall.newCall(new Call("---6---", LocalDateTime.now()));
        queueCall.newCall(new Call("---7---", LocalDateTime.now()));
        queueCall.newCall(new Call("---8---", LocalDateTime.now()));
        queueCall.newCall(new Call("---9---", LocalDateTime.now()));
        queueCall.newCall(new Call("---10--", LocalDateTime.now()));
        queueCall.newCall(new Call("---11--", LocalDateTime.now()));
        queueCall.newCall(new Call("---12--", LocalDateTime.now()));
        queueCall.newCall(new Call("---13--", LocalDateTime.now()));
        queueCall.newCall(new Call("---14--", LocalDateTime.now()));
        queueCall.newCall(new Call("---15--", LocalDateTime.now()));
    }    
}
