package types;
import animals_qualities.Walking;
import Main.Animal;

public class Equine extends Animal implements Walking
{
    public Equine()
    {
        super("equine", "a lot of walking things");

    }
    public Equine(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "neigh";
    }
    public String eat()
    {
        return "grass";
    }
    public String walk() {return "runs and walks";}



}