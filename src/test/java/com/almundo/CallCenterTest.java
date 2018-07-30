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
public class CallCenterTest {
    
    public CallCenterTest() {
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
     * Test of tenCall method, of class CallCenter.
     */
    @Test
    public void testTenCall() {
        System.out.println("tenCall");
        new Thread(new LoadNewCall()).start();
        
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.loadAgent();
        dispatcher.dispatchCall();
    }
    
}
