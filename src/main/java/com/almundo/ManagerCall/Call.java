/*
 * Clase donde se almacenan los datos de la llamada entrante
 */
package com.almundo.ManagerCall;

import java.time.LocalDateTime;

/**
 * @author Yeismer Espejo
 * @version: V 0.0.1
 */
public class Call {
    private String numberPhone;
    private LocalDateTime dateCall;
    
    public Call (String numberPhone, LocalDateTime dateCall) {
        this.numberPhone = numberPhone;
        this.dateCall = dateCall;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public LocalDateTime getDateCall() {
        return dateCall;
    }

    public void setDateCall(LocalDateTime dateCall) {
        this.dateCall = dateCall;
    }
    
}
