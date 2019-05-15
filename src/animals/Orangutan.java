package animals;

import types.Primate;


/**
 * Write a description of class Orangutan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orangutan extends Primate
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class Orangutan
     */
    public Orangutan()
    {
        super("Orangutan", "brown and friendly");
        this.age = "middle age";
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
        return "swings from trees";
    }



}
