/**
 * The Balrog class implements a wrapper for the base Creature class with the following
 * additions
 * Implements a maximum/minimum strength for the creature type [100/50]
 * (attacking TWICE each round with change of bonus damage)
 * Implements a maximum/minimum hitpoint total for the creature type [200/80]
 * 
 * @author Angelo Martino
 * @version 1.0
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
     *
     * The instantiating class asks for a Balrog and the Balrog class is responsible for
     * return a Balrog object with values in the appropriate range
     * 
     */
    public Balrog()
    {
        super(
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR,
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP        
        );
          
    }
    
    /**
     * Balrog attacks twice per round
     * Each attack uses the demon attack
     * (chance of granting bonus damage)
     * 
     */
    @Override
    public int attack() 
    {
        int firstAttack = super.attack();  // calls Demon.attack()
        int secondAttack = super.attack(); // calls Demon.attack() again
        return firstAttack + secondAttack;
    }
}