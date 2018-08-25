import java.util.Scanner;
abstract class Animal
{
    private String b,c;
    Animal(String b,String c)
    {
        b =breed;
        c = colour;
    }
    public String getBreed()
    {
        return breed;
    }
    public String getColour()
    {
        return colour;
    }
    public abstract void speak();
}
class Dog extends Animal
{
    Dog(String b, String c)
    {
        super(b,c);
    }

    public void speak()
    {
        System.out.println("Dog barks"+"nbreed = "+getBreed()+"ncolour = "+getColour());
    }
}
class Cat extends Animal
{
    Cat(String b, String c)
    {
            super(b,c);
    }
    public void speak()
    {
        System.out.println("Cat meows"+"nbreed = "+getBreed()+"n colour = "+getColour());
    }
}
public class animal
{
    public static void main(String args[])
    {
        Cat c = new Cat("himalayan","white");
        Dog d = new Dog("bull dog","black");
        d.speak();
        c.speak();
    }
}
