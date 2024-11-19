import java.util.ArrayList;

public class Inventory {
    public ArrayList<Item> Items = new ArrayList<>();

    //Methods
    public void Display(){
        System.out.println("Backpack is currently containing:");
        for(Item item : Items){
            System.out.println(" - "+item.name);
        }
    }
    public void add(Item item) {
        Items.add(item);
    }

    public Weapon getWeapon(){
        for(Item item: Items){
            try{
                return (Weapon) item;
            }catch(Exception error){}
            /*
            if (item.getClass() == Weapon.class){
                return (Weapon) item;
            }
            */
        }
        return null;
    }
    public Consumable getConsumable(){
        for(Item item: Items){
            try{
                return (Consumable) item;
            }catch(Exception error){}
            /*
            if (item.getClass() == Consumable.class){
                return (Consumable) item;
            }
            */
        }
        return null;
    }
    /* public void remove(Item item){
        Items.remove(item);
    } */
}
