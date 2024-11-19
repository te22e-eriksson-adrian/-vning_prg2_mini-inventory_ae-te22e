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
        player.backpack.Display();

        System.out.println();
        System.out.println("Look, here is a new helmet! Would you like to store it in your inventory?");
        System.out.println("If so, then please answer '1', if not, then please answer '2'.");
        System.out.print("Choice: ");
        int choice = keyboard.nextInt();
        keyboard.nextLine();
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
            default:
                System.out.println();
                System.out.println("Wrong input! Please, restart the program and choose between the numbers 1 and 2 next time.");
                break;
        }

        player.backpack.Display();

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
