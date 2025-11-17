import java.util.ArrayList;
/**
 * Prints the war out into console very nicely with updates.
 *
 * @author Angelo Martino
 * @version 1.0
 */
public class CreatureWar
{
    public static void main (String[] args)
    {
        System.out.println("=== Building Armies ===");

        ArrayList<Creature> goodArmy = ArmyBuilder.buildGoodArmy();
        ArrayList<Creature> evilArmy = ArmyBuilder.buildEvilArmy();

        System.out.println("Good Army Size: " + goodArmy.size());
        System.out.println("Evil Army Size: " + evilArmy.size());
        System.out.println("========================");
        System.out.println("     BATTLE BEGINS!     ");
        System.out.println("========================\n");
        
        int round = 1;
        
        // one-on-one skirmish
        while (!goodArmy.isEmpty() && !evilArmy.isEmpty()) {
            Creature good = goodArmy.get(0);
            Creature evil = evilArmy.get(0);
            
            System.out.println("Round " + round + ":");
            System.out.println("Good Creature: " + good.getClass().getSimpleName());
            System.out.println("Evil Creature: " + evil.getClass().getSimpleName());
            
            while (good.isAlive() && evil.isAlive()) {
                int dmgToEvil = good.attack();
                int dmgToGood = evil.attack();
                
                evil.takeDamage(dmgToEvil);
                good.takeDamage(dmgToGood);
            }
            
            // after-skirmish results
            if (!good.isAlive() && !evil.isAlive()) {
            
            }
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}