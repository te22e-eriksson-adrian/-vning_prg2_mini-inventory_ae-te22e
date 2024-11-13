import java.util.ArrayList;

public class Inventory {
    public ArrayList<Item> Items = new ArrayList<>();

    //Methods
    public void Display(){
        System.out.println("Backpack is currently containing:");
        for(Item item : Items){
            System.out.println(" - "+item);
        }
    }
    public void add(Item item) {
        Items.add(item);
    }
    /* public void remove(Item item){
        Items.remove(item);
    } */
}
