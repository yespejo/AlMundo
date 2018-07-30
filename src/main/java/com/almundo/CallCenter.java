/*
 * Se utiliza para inciar un proceso completo 
 * con 30 llamadas y 10 agentes
 */
package com.almundo;

/**
 * @author Yeismer Espejo
 * @version: V 0.0.1
 */
public class CallCenter {
    
    /*
     * Clase principal de ejecución del proceso de ejemplo
     */
    public static void main(String[] args) {
        
        new Thread(new LoadNewCall()).start();
        new Thread(new LoadNewCall()).start();
        
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.loadAgent();
        dispatcher.dispatchCall();
    }
}
