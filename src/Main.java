import InheritanceExamples.*;

public class Main
{
    public static void main(String[] args) {

        System.out.println("***** WITHOUT INHERITANCE *****");
        Dog dog = new Dog("Fido", 7);
        Cat cat = new Cat("Fluffy", 2);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println();

        cat.sleep();


        System.out.println("***** WITH INHERITANCE *****");
        // polymorphism ChildDog is a child of Animal, so I can give it the data type Animal
        // while still calling the ChildDog constructor.
        Animal cDog = new ChildDog("Fido", 8);
        Animal cCat = new ChildCat("Fluffers", 13);

        System.out.println();

        System.out.println(cDog);
        System.out.println(cCat);

        System.out.println();

        cDog.setAge(5); // method defined in Animal class
        cCat.setAge(4); // method defined in Animal class

        System.out.println(cDog);
        System.out.println(cCat);

        System.out.println();
        cDog.sleep();
        cCat.sleep();
    }
}