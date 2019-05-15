package types;
import animals_qualities.Flying;
import Main.Animal;


public class Bird extends Animal implements Flying{

        public Bird()
        {
            super("bird", "a lot of bird types");

        }
        public Bird(String name, String desc)
        {
            super(name, desc);
        }
        public String makeNoise()
        {
            return "chirps";
        }
        public String eat()
        {
            return "seed";
        }
        public String fly() {return "runs and flys";}



    }