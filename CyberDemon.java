/**
 * The CyberDemon class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [40/20]
 * (with chance of bonus damage)
 * Implements a maximum/minimum hitpoint total for the creature type [100/25]
 * 
 * @author Angelo Martino
 * @version 1.0
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_CYBER_HP = 100;
    private static final int MIN_CYBER_HP = 25;
    private static final int MAX_CYBER_STR = 40;
    private static final int MIN_CYBER_STR = 20;

    /**
     * Constructor for objects of class CyberDemon -
     * 
     * The instantiating class asks for a CyberDemon and the CyberDemon class is responsible for
     * return a CyberDemon object with values in the appropriate range
     * 
     */
    public CyberDemon()
    {
        super(
            Randomizer.nextInt(MAX_CYBER_STR-MIN_CYBER_STR)+MIN_CYBER_STR,
            Randomizer.nextInt(MAX_CYBER_HP-MIN_CYBER_HP)+MIN_CYBER_HP        
        );     
    }
}