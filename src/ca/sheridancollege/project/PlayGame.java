/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
import java.util.*;

/**
 *
 * @author agrit
 */
public class PlayGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome");
        System.out.println("Please register yourselves here: ");
        
        Scanner input1 = new Scanner(System.in);
        System.out.println("Name of Player 1: ");
        Player player1 = new Player(input1.next());
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Name of Player 2: ");
        Player player2 = new Player(input2.next());
        
        Player[] players = new Player[2];
        players[0] = player1;
        players[1] = player2;
        
        Game game = new Game("Card Flip", players, 5);
        System.out.println(game.toString());
        
        String[] suits = new String[4];
        suits[0] = "Hearts";
        suits[1] = "Diamonds";
        suits[2] = "Spades";
        suits[3] = "Clubs";
        
        GroupOfCards gc = new GroupOfCards(suits, 13);
    }
    
}
