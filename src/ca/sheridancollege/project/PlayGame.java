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
        System.out.println("\nRules: \nAce has a rank of 1. \nKing has a rank of 13. \nQueen has a rank of 12. \nJack has a rank of 11.");
        
        if(confirm == 0){
            for(int i = 1; i <= game.getRounds(); i++){
                Card[] cardList = new Card[3];
                cardList = game.start();
                Scanner input4 = new Scanner(System.in);
                System.out.println("\n\nYou have two options :"
                    + " \n1. Play \n2. "
                    + "Swap and then Play \nEnter 1 or 2:");
                int choice = input4.nextInt();
            
                if (choice==1){
                    
                    if(cardList[0].getRank()>cardList[1].getRank()){
                        System.out.println("The card for player 1 is " + cardList[0] + "\nThe card for player 2 is " + cardList[1]);
                        System.out.println(player1 + " gets one point !");
                        player1Score++;
                    }
                    else if(cardList[0].getRank()<cardList[1].getRank()){
                        System.out.println("The card for player 1 is " + cardList[0] + "\nThe card for player 2 is " + cardList[1]);
                        System.out.println(player2 + " gets one point !");
                        player2Score++;
                    }
                    else{
                        System.out.println("The card for player 1 is " + cardList[0] + "\nThe card for player 2 is " + cardList[1]);
                        System.out.println("It's a tie");
                    }
                    
                }
                else if(choice==2){ 
                    System.out.println("Before Swap the cards were: " + "\nThe card for player 1 was " + cardList[0] + "\nThe card for player 2 was " + cardList[1] + "\nBut now : ");
                    game.swap(cardList);
                    if(cardList[0].getRank()>cardList[1].getRank()){
                        System.out.println("The card for player 1 is " + cardList[0] + "\nThe card for player 2 is " + cardList[1]);
                        System.out.println(player1 + " gets one point !");
                        player1Score++;
                    }
                    else if(cardList[0].getRank()<cardList[1].getRank()){
                        System.out.println("The card for player 1 is " + cardList[0] + "\nThe card for player 2 is " + cardList[1]);
                        System.out.println(player2 + " gets one point !");
                        player2Score++;
                    }
                    else{
                        System.out.println("The card for player 1 is " + cardList[0] + "\nThe card for player 2 is " + cardList[1]);
                        System.out.println("It's a tie");
                    }
                    
                
                }
                else{
                    System.out.println("Not a valid input !");
                    break;
                }
                
                System.out.println(player1 + "'s Score is :" + player1Score + 
                        "\n" + player2 + "'s Score is :" + player2Score);
            }    
            game.declareWinner(player1Score, player2Score);
        }
        
        else{
            System.out.println("Invalid Input !");
        }
        
        
    }
    
}
