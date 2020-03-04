package com.Linton;

public class Person extends Mammal implements Carnivore
{

    private String name; String surname;
    private int day; int month; int year;

        Person()
        {

        }

        Person(String name, String surname, int day, int month, int year)
        {
            this.name = name;
            this.surname = surname;
            this.day = day;
            this.month = month;
            this.year = year;
        }

        Person(String name, String surname, int day, int month, int year, int numOfLegs)
        {
            this.name = name;
            this.surname = surname;
            this.day = day;
            this.month = month;
            this.year = year;
            this.numOfLegs = numOfLegs;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        public String toString()
        {
            return String.format("My name is %s %s, my birthday is %d/%d/%d", name, surname, day, month, year);
        }

}
