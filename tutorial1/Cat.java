package tutorial1;

public class Cat extends Dog {

    private int food;

    public Cat(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }

    public Cat(String name, int age) {
        super(name, age);
        this.food = 50;
    }

    public Cat(String name) {
        super(name, 0);
        this.food = 20;
    }

    public void speak() {
        System.out.println("Meow! My name is " + this.name + " and I get fed " + this.food + " grams of food.");
    }
    
    public void eat(int x) {
        this.food -= x;
    }
}
