package animals;

import types.Primate;



public class ringTailed extends Primate
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class Parrot
     */
    public ringTailed()
    {
        super("Ring Tailed lemur", "jumps and walks");
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
        return "purrs and chirps";
    }
}