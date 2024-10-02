package InheritanceExamples;

public class Animal
{
    protected String name;
    protected int age;

    // having the bark and meow features in each of the animals seperate classes shows teh need
    // for inheritance

    public Animal(String animalName,int animalAge)
    {

        name = animalName;
        age = animalAge;

    }

    public void eat()
    {
        System.out.println(name + " is eating..");
    }

    public void sleep()
    {
        System.out.println(name + " is sleeping..");
    }

    public boolean setName(String newName) {
        name = newName;
        return true;
    }

    public String getName() { return name; }

    public boolean setAge(int newAge) {
        age = newAge;
        return true;
    }

    public int getAge() { return age; }

}