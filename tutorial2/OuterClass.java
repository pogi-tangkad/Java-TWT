package tutorial2;

public class OuterClass {
    public class InnerClass {
        public void display() {
            System.out.println("This is an inner class");
        }
    }

    public void inner() {
        class InnerClassTwo {
            public void display2() {
                System.out.println("Inner class 2");
            }
        }
        InnerClassTwo in = new InnerClassTwo();
        in.display2();
    }
}
