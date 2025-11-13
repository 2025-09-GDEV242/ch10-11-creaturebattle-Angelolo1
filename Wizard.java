/**
 * The Wizard class implements a wrapper for the base Creature class with the following
 * additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * (with chance of double damage)
 * Implements a maximum/minimum hitpoint total for the creature type [25/8]
 * 
 * @author Angelo Martino
 * @version 1.0
 */
public class Wizard extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_WIZARD_HP = 30;
    private static final int MIN_WIZARD_HP = 15;
    private static final int MAX_WIZARD_STR = 22;
    private static final int MIN_WIZARD_STR = 10;

    /**
     * Constructor for objects of class Wizard -
     * 
     * The instantiating class asks for a Wizard and the Wizard class is responsible for
     * return a Wizard object with values in the appropriate range
     * 
     */
    public Wizard()
    {
        super(
            Randomizer.nextInt(MAX_WIZARD_STR-MIN_WIZARD_STR)+MIN_WIZARD_STR,
            Randomizer.nextInt(MAX_WIZARD_HP-MIN_WIZARD_HP)+MIN_WIZARD_HP        
        );
          
    }
    
    /**
     * 5% chance to deal double damage
     * 
     * @return the total damage dealt by wizard
     */
    @Override
    public int attack() {
        int damage = super.attack();  
        
        //roll the dice, and if in range, double the damage value
        if (Randomizer.nextInt(5) == 0) damage = damage * 2;
        
        return damage;
    }
}
