package com.Linton;

public class Mammal
{
        private String blood = "Warm-blooded vertebrate animal of a class that is distinguished by the possession of hair or fur.";
        protected int numOfLegs;

        Mammal()
        {

        }

        Mammal(int numOfLegs)
        {
            this.numOfLegs = numOfLegs;
        }

        public String getDetails()
        {
            return String.format("I am %s, I have %d legs", blood, numOfLegs);
        }

}
