/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author agrit
 */
public class GameTest {
    
    public GameTest() {
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
     * Test of declareWinner method, of class Game.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        int score1 = 1;
        int score2 = 0;
        Player[] players = new Player[2];
        players[0] = new Player("player1");
        players[1] = new Player("player2");
        Game instance = new Game("Card Flip", players, 5);
        instance.declareWinner(score1, score2);
        
    }

    
}
