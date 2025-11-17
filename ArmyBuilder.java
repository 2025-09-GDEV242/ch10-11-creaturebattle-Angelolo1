import java.util.ArrayList;
/**
 * ArmyBuilder class is in charger of creating the "good" and "evil" armies which
 * will be fighting each other
 *
 * @author Angelo Martino
 * @version 1.0
 */
public class ArmyBuilder
{
    /**
     * Builds the good army
     * Mostly Humans, Elves, and Wizards
     */
    public static ArrayList<Creature> buildGoodArmy() 
    {
        ArrayList<Creature> army = new ArrayList<>();

        // builds 100 good creatures
        for (int i = 0; i < 100; i++) {
            int roll = Randomizer.nextInt(10) + 1; // 1-10

            if (roll <= 6) {
                army.add(new Human());
            }
            else if (roll <= 8) {
                army.add(new Elf());
            }
            else {
                army.add(new Wizard());
            }
        }
        return army;
    }

    /**
     * Builds the evil army
     * Mostly CyberDemons, Balrogs, and Goblins
     */
    public static ArrayList<Creature> buildEvilArmy() 
    {
        ArrayList<Creature> army = new ArrayList<>();

        int armySize = Randomizer.nextInt(10) + 40; // 40-49

        // builds 40-49 evil creatures
        for (int i = 0; i < armySize; i++) {
            int roll = Randomizer.nextInt(25) + 1; // 1-10

            if (roll <= 18) {
                army.add(new Goblin());
            }
            else if (roll <= 24) {
                army.add(new CyberDemon());
            }
            else {
                army.add(new Balrog());
            }
        }
        return army;
    }
}