package types;
import animals_qualities.Swimming;
import Main.Animal;

public class Reptile extends Animal implements Swimming{

    public Reptile()
    {
        super("reptile", "a lot of reptile types");

    }
    public Reptile(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "scary noises";
    }
    public String eat()
    {
        return "meat";
    }
    public String swim() {return "swims and chomps";}



}