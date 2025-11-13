/**
 * The Demon class represents a demonic creature.
 * Demons have a 5% chance to do magical damage (+50).
 *
 * @author Angelo Martino
 * @version 1.0
 */
public abstract class Demon extends Creature
{
    /**
     * Constructor for Demon object
     * 
     * @param str strength value
     * @param hp hit points value
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }

    /**
     * Calculates attack damage for a demon
     * Gets base damage from creature and adds bonus if triggered.
     * 
     * @return total damage dealth
     */
    @Override
    public int attack()
    {
        int damage = super.attack();
        
        if (Randomizer.nextInt(100) <=5)
        {
            damage += 50;
        }
        return damage;
    }
}