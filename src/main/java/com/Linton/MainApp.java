package com.Linton;
import java.util.Scanner;

public class MainApp
{
        public static void main( String[] args )
        {
            Scanner scan = new Scanner(System.in);

            //Encapsulation
            Mammal mammal = new Mammal(4);
            System.out.println(mammal.getDetails());

            press(scan);

            //Inheritance
            Person Linton  = new Person("Linton", "Appollis", 17, 8, 1985, 2);
            System.out.println(Linton.toString());
            System.out.println(Linton.getDetails());

            press(scan);

            //Polymorphism
            Carnivore con = Linton;
            System.out.println(con.diet);

            press(scan);

            //Composition
            Name name = new Name("Dimitri", "Johannes");
            DateOfBirth dob = new DateOfBirth(11, 9, 1985);
            PersonComposition Dimitri = new PersonComposition(name, dob);
            System.out.println(Dimitri.toString());

        }

        public static void press(Scanner scan)
        {
            System.out.println("\nPress select enter to continue\n");
            String y = scan.nextLine();
        }

}
