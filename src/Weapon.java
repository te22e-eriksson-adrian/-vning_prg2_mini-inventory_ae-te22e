import java.util.Random;

public class Weapon extends Item{
    public int minDamage = 10;
    public int maxDamage = 20; // (+1)
    
    Random gen = new Random();

    //Methods
    public int Attack(){
        Random generator = new Random();
        int random = generator.nextInt(minDamage, maxDamage + 1);
        return random;
    }
}
