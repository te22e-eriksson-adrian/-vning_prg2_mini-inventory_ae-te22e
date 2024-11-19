import java.util.Scanner;

public class ProgramMain {
    Scanner keyboard = new Scanner(System.in);
    Character player = new Character();

    public ProgramMain(){ 
        System.out.println();
        System.out.print("What is the name of your Character?: ");
        player.name = keyboard.nextLine();

        System.out.println();
        createItemsData();
        int choice = 0;
        int onlyOnce = 1;

        while (choice != 6){
            System.out.println();
            player.backpack.Display();

            if (onlyOnce == 1){
                System.out.println();
                System.out.println("Look, here is a new helmet! Would you like to store it in your inventory?");
                System.out.println("If so, then please answer '1', if not, then please answer '2'.");
                onlyOnce = 0;
            }else{
                System.out.println();
                System.out.println("Program Menu: \n 3. Perform an attack on an opponent. \n 4. Eat/Drink consumable. \n 5. Continue the program witout specific action. \n 6. Shut down the program.");
            }
            
            System.out.print("Choice: ");
            try{
                choice = keyboard.nextInt();
                keyboard.nextLine();
            }catch (Exception e){
                System.out.println("Wrong input! Please, restart the program and choose between the numbers 1 and 6 next time.");
                choice = 6;
            }

            switch (choice) {
                case 1:
                    // Adds the helmet!
                    Armor helmet = new Armor();
                    helmet.name = "Iron helmet";
                    helmet.weight = 1;
                    helmet.protection = 15;

                    player.backpack.add(helmet);
                    System.out.println();
                    System.out.println("The helmet was added to your backpack.");
                    break;
                case 2:
                    // Does not add the helmet!
                    System.out.println();
                    System.out.println("The helmet was not added to your backpack.");
                    break;
                case 3:
                    int result = player.backpack.getWeapon().Attack();
                    System.out.println();
                    System.out.println("You made "+result+" damage to your opponent.");
                    break;
                case 4:
                    player.backpack.getConsumable().Use(player);
                    break;
                case 5:
                    // Does nothing!
                    break;
                case 6:
                    // Shuts the program down, without triggering default statement.
                    break;
                default:
                    System.out.println();
                    System.out.println("Wrong input! Please, restart the program and choose between the numbers 1 and 6 next time.");
                    break;
            }
        }
        System.out.println("The program has been shut down!");
        keyboard.close();
    }
    public void createItemsData(){
        Weapon knife = new Weapon();
        Consumable healingPotion = new Consumable();

        knife.name = "Knife";
        knife.weight = 1;

        healingPotion.name = "Healing Potion";
        healingPotion.weight = 2;
        healingPotion.UsesCurrent = 0;

        player.backpack.add(knife);
        player.backpack.add(healingPotion);
    }
}
