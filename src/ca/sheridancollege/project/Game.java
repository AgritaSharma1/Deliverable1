/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.Random;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */

public class Game{

    private final String gName;//the title of the game
    private Player[] players = new Player[2];// the players of the game
    private int rounds;


    public Game(String gName, Player[] players, int rounds) {
        this.gName = gName;
        this.players = players;
        this.rounds = rounds;
    
    }

    @Override
    public String toString() {
        return "The game " + gName + " will be played between the players " + players[0] + " and " + players[1] + ". The number of rounds will be " + rounds  + "."; //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the name
     */
    public String getName() {
        return gName;
    }

    /**
     * @return the players of this game
     */
    public Player[] getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(Player[] players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public Card[] start(){
        Random random = new Random();
        String[] suits = new String[4];
        suits[0] = "Hearts";
        suits[1] = "Diamonds";
        suits[2] = "Spades";
        suits[3] = "Clubs";
        
        
        int randomSuit1 =  random.nextInt(4);
        String suit1 = suits[randomSuit1];
        int randomNum1 = random.nextInt(13);
        
        int randomSuit2 =  random.nextInt(4);
        String suit2 = suits[randomSuit2];
        int randomNum2 = random.nextInt(13);
        
        Card card1 = new Card(suit1, (randomNum1+1));
        Card card2 = new Card(suit2, (randomNum2+1));
        
        Card[] cardList = new Card[2];
        cardList[0] = card1;
        cardList[1] = card2;
        
        return cardList;
        
    }

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public void declareWinner(){};

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

}//end class
