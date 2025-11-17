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
                System.out.println("Both combatants have fallen!");
                goodArmy.remove(0);
                evilArmy.remove(0);
            }
            else if (!good.isAlive()) {
                System.out.println("Good creature has fallen.");
                goodArmy.remove(0);
            }
            else {
                System.out.println("Evil creature has fallen.");
                evilArmy.remove(0);
            }

            System.out.println("Remaining: Good = " + goodArmy.size()
                + ", Evil = " + evilArmy.size() + "\n");

            round++;
        }

        System.out.println("========================");
        System.out.println("      BATTLE ENDS       ");
        System.out.println("========================");

        if (goodArmy.isEmpty() && evilArmy.isEmpty()) {
            System.out.println("Both armies were wiped out.");
        }
        else if (goodArmy.isEmpty()) {
            System.out.println("Evil Army Wins the War!");
        }
        else {
            System.out.println("Good Army Wins the War!");
        }
    }
}