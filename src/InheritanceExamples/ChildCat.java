package InheritanceExamples;

/**
 * When we use inheritance you'll notice that the classes become much cleaner and more concise.
 */
public class ChildCat extends Animal
{
    public ChildCat(String name, int age)
    {
        super(name,age); // call the Parents constructor to init fields.
    }


    // of course, I want the children to print differently based on the animal type.
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