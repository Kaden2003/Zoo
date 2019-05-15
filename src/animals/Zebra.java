package animals;

import types.Equine;



public class Zebra extends Equine
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class Parrot
     */
    public Zebra()
    {
        super("Zebra", "has stripes and can run");
        this.age = "dying";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     *
     */
    @Override
    public String makeNoise()
    {
        // put your code here
        return "neighs";
    }
}