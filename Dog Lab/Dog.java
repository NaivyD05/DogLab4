// ****************************************************************
// Dog.java
//
// A class that holds a dog's name and can make it speak.
//          
// ****************************************************************
public class Dog
{
    protected String name;

    // ------------------------------------------------------------
    // Constructor -- store name
    // ------------------------------------------------------------
    public Dog(String name)
    {

        this.name = name;
    }


    // ------------------------------------------------------------
    // Returns the dog's name
    // ------------------------------------------------------------
    public String getName()//3a. the getName method works because Labrador is inheriting from Dog.Everything gets inhereted except the private intance variables.
    {

        return name;
    }

    // ------------------------------------------------------------
    // Returns a string with the dog's comments
    // ------------------------------------------------------------
    public String bark()
    {

        return "Dog barking";
    }

}
