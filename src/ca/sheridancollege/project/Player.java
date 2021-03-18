/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Player {

    private String Pname; //the unique name for this player

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param Pname the unique ID to assign to this player.
     */
    public Player(String Pname) {
        this.Pname = Pname;
    }

    /**
     * @return the player name
     */
    public String getName() {
        return Pname;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param Pname the player name to set
     */
    public void setName(String Pname) {
        this.Pname = Pname;
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();

}
