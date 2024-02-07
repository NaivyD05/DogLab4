// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


public class Main
{
    public static void main(String[] args)
    {
        Dog[] dogs = new Dog[3];
	Dog dog = new Labrador("Spike","brown");
	System.out.println(dog.getName() + " says " + dog.bark());


    Dog dogY = new Yorkshire("Puca",3);
    System.out.println(dogY.getName() + " "+ dogY.bark());


        //
        (Yorkshire)(dogY).waddle();
        (Labrador)(dog).waddle();
	

    }
}
