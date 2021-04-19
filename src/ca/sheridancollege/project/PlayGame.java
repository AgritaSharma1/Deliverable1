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
public class PlayGame{

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int player1Score = 0;
        int player2Score = 0;
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
        
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter '0' to continue: ");
        int confirm = input3.nextInt();
        
        if(confirm == 0){
            for(int i = 0; i <= game.getRounds(); i++){
                Card[] cardList = new Card[2];
                cardList = game.start();
                Scanner input4 = new Scanner(System.in);
                System.out.println("Now, you have two options :"
                    + " \n1. Play \n2. "
                    + "Swap and then Play \nEnter 1 or 2:");
                int choice = input4.nextInt();
            
                if (choice==1){
                
                    }
                else if(choice==2){
                
                }
                else{
                    System.out.println("Not a valid input !");
                    break;
                }
            }    
        }
        
        else{
            System.out.println("Invalid Input !");
        }
        
        
    }
    
}
