

/**
 * The Balrog class implements a wrapper for the base Creature class with the following
 * additions
 * Implements a maximum/minimum strength for the creature type [100/50]
 * (attacking TWICE each round)
 * Implements a maximum/minimum hitpoint total for the creature type [200/80]
 * 
 * @author Bill Crosbie
 * @version 2025-04 v1.1
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Balrog -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Balrog and the human class is responsible for
     * return a Balrog object with values in the appropriate range
     * 
     */
    public Balrog()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR,
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP        
        );
          
    }
    
    public int attack() {
        int totalDamage;    //give a place to hold a value returned from creature
        
        totalDamage = super.attack();   //ask creature to compute the damage due to strength
        
        //roll the dice, and if in range, double the damage value
        if (Randomizer.nextInt(10) == 10) totalDamage = totalDamage * 2;
        
        return totalDamage;
    }
    // attack() - not overridden because Humans generate basic damage

}
