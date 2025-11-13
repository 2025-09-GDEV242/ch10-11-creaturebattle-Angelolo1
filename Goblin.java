/**
 * The Goblin class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Angelo Martino
 * @version 1.0
 */
public class Goblin extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_GOBLIN_HP = 20;
    private static final int MIN_GOBLIN_HP = 10;
    private static final int MAX_GOBLIN_STR = 16;
    private static final int MIN_GOBLIN_STR = 6;

    /**
     * Constructor for objects of class Goblin -
     * 
     * The instantiating class asks for a Goblin and the Goblin class is responsible for
     * return a Goblin object with values in the appropriate range
     * 
     */
    public Goblin()
    {
        super(
            Randomizer.nextInt(MAX_GOBLIN_STR-MIN_GOBLIN_STR)+MIN_GOBLIN_STR,
            Randomizer.nextInt(MAX_GOBLIN_HP-MIN_GOBLIN_HP)+MIN_GOBLIN_HP        
        );
    }
}