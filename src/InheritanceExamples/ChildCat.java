package InheritanceExamples;

public class ChildCat extends Animal
{
    public ChildCat(String name, int age)
    {
        super(name,age);
    }


    // of course I want the children to print differently based on the animal type.
    @Override
    public String toString()
    {
        return "Cat { " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sound='meow'" +
                " }";
    }

}