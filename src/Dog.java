public class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void bark() {
        System.out.println(name + " says woof.");
    }

    // it would make sense that each child class overrides this, in fact every object
    // is a child to the Object class

    // When we declare the datattype dog and pass to print it will call this
    // even if we say Dog d = new Animal("Fido", 3);



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
