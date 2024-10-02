package InheritanceExamples;


public class ChildDog extends Animal
{

    public ChildDog(String name, int age)
    {
        // call the Parent classes constructor to init fields.
        super(name,age);
    }


    /**
     * Override Animals setAge() method to print a message on childDogs.
     * @param newAge dogs new age
     * @return true if set. false if invalid number.
     */
    @Override
    public boolean setAge(int newAge)
    {
        // not a valid age
        if(newAge < 0)
            return false;

        System.out.println("Changing " + name + "s age to: " + newAge);
        age = newAge;
        return true;
    }

    // of course I want the children to print differently based on the animal type.
    @Override
    public String toString()
    {
        return "Dog { " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sound='woof'" +
                " }";
    }


}