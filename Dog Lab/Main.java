// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {


	Dog dog = new Dog("Spike");
	System.out.println(dog.getName() + " says " + dog.bark());

    //the constructor is missing the color
    Dog dogL = new Labrador("Tim", "brown");
    //the getName method works because labrador inhereted form Dog
    System.out.println(dogL.getName()+" says "+ dog.bark());


    Dog dogY = new Yorkshire("Puca",3);
    System.out.println(dogY.getName() + " says "+ dogY.bark());

        // the waddle method didn't work because it's not part of the dog class, for it to work it need to be casted
        ((Yorkshire)dogY).waddle();
        ((Labrador)dogL).waddle();


    //8)
        Dog[] dogs = new Dog[3];
    //9)
    dogs[0] = dog;
    dogs[1] = dogL;
    dogs[2] = dogY;

    //10)
        System.out.println("problem 10");
    for(int i = 0; i<dogs.length;i++){
        System.out.println(dogs[i].getName() + ": " +dogs[i].bark());
    }

        System.out.println("10a");
    for(Dog d: dogs){
        System.out.println(d.getName() +": "+ d.bark());
    }

    // you need to cast the waddle method because it's not part of the super class
        //we didn't need to cast the bark method because the child class inherets the method from the parent class
        ((Labrador)dogs[1]).waddle();



    //12)
        ArrayList<Dog> dogs1 = new ArrayList<Dog>();
        dogs1.add(dog);
        dogs1.add(dogL);
        dogs1.add(dogY);

        System.out.println("12 for loop");
        for(int i=0;i<dogs1.size();i++){
            System.out.println((dogs1.get(i)).getName() +":" + ((dogs1.get(i)).bark()));
        }

        System.out.println("12 for each loop");
        for(Dog d2:dogs1){
            System.out.println(d2.getName() +":"+d2.bark());
        }






	

    }
}
