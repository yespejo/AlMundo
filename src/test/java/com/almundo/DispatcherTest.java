/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almundo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yespejobohor
 */
public class DispatcherTest {
    
    public DispatcherTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of dispatchCall method, of class Dispatcher.
     */
    @Test
    public void testDispatchCall() {
        System.out.println("dispatchCall");
        Dispatcher instance = new Dispatcher();
        instance.loadAgent();
        instance.dispatchCall();
    }
    
}
