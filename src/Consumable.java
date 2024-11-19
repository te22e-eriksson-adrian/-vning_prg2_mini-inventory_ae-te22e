public class Consumable extends Item{
    public int UsesMax = 3;
    public int UsesCurrent;

    //Methods
    public void Use(Character target){
        if (UsesMax < 4) {
            target.Hp += 10;
            UsesCurrent++;
            System.out.println();
            System.out.println("The consumable was used.");
        }else{
            System.out.println();
            System.out.println("The Consumable Item is already used up.");
        }
    }
}
