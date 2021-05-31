package tutorial2;


public class Main {
    public static void main(String[] args) {

    /* Using Dog class

    System.out.println(Dog.count);
    Dog winter = new Dog("Winter", 3); 
    winter.speak();
    System.out.println(Dog.count);
    Dog blarg = new Dog("Blarg", 3); 
    Dog snarg = new Dog("Snarg", 3); 
    Dog gwarg = new Dog("Gwarg", 3); 
    System.out.println(Dog.count);

    */

    /* Using Student class 

    Student joe = new Student("Joe");
    Student bill = new Student("Bill");
    Student tim = new Student("Joe");

    System.out.println(joe == tim);
    System.out.println(joe.equals(bill));
    System.out.println(joe.equals(tim));
    System.out.println(joe.compareTo(bill) > 0);
    System.out.println(joe.compareTo(tim) > 0);

    System.out.println(joe);
    System.out.println(bill.toString());
    

    */

    /* Using Outer and Inner classes

    OuterClass oc = new OuterClass();
    oc.inner();
    OuterClass.InnerClass in = oc.new InnerClass();
    in.display();

    */

    /* Interfaces 

    Car ford = new Car();
    ford.speedUp(10);
    ford.changeGear(2);
    ford.display();

    int x = Vehicle.maths(4);

    System.out.println(x);

    */

    /* Enums

    Level lvl = Level.LOW;
    Level[] arr = Level.values();
    for (Level e : arr) {
        System.out.println(e);
    }
    System.out.println(Level.values());

    if (lvl == Level.LOW) {
        System.out.println(lvl);
    }else if (lvl == Level.MEDIUM) {
        System.out.println(lvl);
    }else {
        System.out.println(lvl);
    }

    System.out.println(lvl.getLvl());
    lvl.setLvl(9);
    System.out.println(lvl.getLvl());
    System.out.println(Level.valueOf("LOW"));

    */


    }
}