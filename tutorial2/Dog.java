package tutorial2;

public class Dog {

    protected static int count = 0;
    
    protected String name;
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        Dog.count += 1;
        Dog.display();
        this.display2();
    }

    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old");
    }

    public static void display() {
        System.out.println("I am a dog!");
    }

    public void display2() {
        System.out.println("I am a dog named " + this.name + "!");
    }

}
