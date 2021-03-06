/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almundo;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.almundo.ManagerCall.Call;
import java.time.LocalDateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author yespejobohor
 */
public class DirectorTest {
    
    public DirectorTest() {
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
     * Test of onReceive method, of class Director.
     */
    @Test
    public void testOnReceive() {
        System.out.println("onReceive");
        ActorSystem actorSystem = ActorSystem.create("ActorSystem");
        actorSystem.actorOf(Props.create(Director.class), "Director").tell(new Call("---1---", LocalDateTime.now()), ActorRef.noSender());
    }
}
