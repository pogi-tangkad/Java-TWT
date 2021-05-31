package tutorial1;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Set;
//import java.util.TreeMap;
//import java.util.Scanner;
//import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /* Comment Block 
 
        // Test comment
        System.out.println("Hello World!");
        System.out.println("Hello World2!");

        // Variables using 'Primitive' DataTypes
        int hello_world = 5;
        System.out.println(hello_world);

        double num2 = 5.0;
        System.out.println(num2);

        boolean b = true; 
        System.out.println(b);

        char c = 'K';
        System.out.println(c);

        int Kevin = hello_world - 2;
        System.out.println(Kevin);


        // Variables using 'Non-Primitive' DataTypes
        String str = "Kevin is learning Java";
        System.out.println(str);
    
        */

        /* Playing with math

        int x = 5;
        int y = 7;
        int z = 57;
        double z2 = 57;

        int sum = x + y + z;
        int sub = x - y - z;
        int mul = x * y * z;
        int div1 = z / y;
        double div2 = z / y;
        double div3 = z2 / y;
        double div4 = z / (double)y;
        double exp = Math.pow(x,y);

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div1);
        System.out.println(div2);
        System.out.println(div3);
        System.out.println(div4);
        System.out.println(exp);

        int x = 56 % 5;

        System.out.println(x);

        */

        /* standard inputs

        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();
        int scanned2 = sc.nextInt();

        System.out.println(scanned);
        System.out.println(scanned2);

        String scanned3 = sc.next();
        System.out.println(scanned3);

        */

        /* if/else if/else and nested if

        System.out.print("Input your age:  ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if (age >= 18) {
            System.out.println("You are an adult!");
            System.out.print("Input your favorite food:  ");
            String food = sc.nextLine();
            if (food.equals("pizza")) {
                System.out.println("Mine too!");
            }
            else {
                System.out.println("Not mine!");
            }
        }
        else if (age >= 13) {
            System.out.println("You are a teenager!");
        }
        else {
            System.out.println("You are a child!");
        }
        
        */

        /* Lists and Arrays

        String[] new_arr = new String[5];
        // {"hello", "hi", "tim", "bill", "joe"}
        new_arr[0] = "hello";
        new_arr[1] = "hi";
        new_arr[2] = "tim";
        //new_arr[3] = "bill";
        new_arr[4] = "joe";
        String x = new_arr[3];
        String y = new_arr[1];

        System.out.println(x);
        System.out.println(y);

        int[] nums = {2,3,4,500,6,8,8};

        System.out.println(nums[5]);

        */

        /* For loops

        for (int x = 1; x <= 5; x++){
            for (int i = x; i <= 30; i+=x) {
                System.out.println(i);
            }
        }

        int[] arr = {1,5,7,3,4,5,5,4,8,6,3,3,2,185,7,5,47,89,562,4,5,5,65,98,7,4,4,22,6,6,6,5,5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                System.out.println("Found a '5' at index " + i);
            }
        }

        */

        /* For Each Loop 

        int[] arr = {1,5,7,3,4,5};
        String[] names = new String[5];

        int count = 0;
        for (int element:arr) {
            System.out.println(element + " " + count);
            count++;
        }

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.print("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        }
        for (String n:names) {
            System.out.println(n);
            if (n.equals("yum")) {
                break;
            }
        }

        */

        /* While loops 

        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number: ");
        int x = sc.nextInt();f
        while (x != 10) {
            System.out.println("maybe 10...");
            x = sc.nextInt();
        }
        
        int x;
        do{
            System.out.print("Type a number: ");
            x = sc.nextInt();
        } while (x != 10);

        */

        /* Lists and Sets

        Set<Integer> t = new HashSet<Integer>();
        t.add(5);
        t.add(7);
        t.add(5); //Sets can only have 1 of each unique element
        t.add(2);
        t.add(-4);
        t.add(9);
        t.remove(7);

        System.out.println(t);  //order or location is not stored

        boolean boo = t.contains(5);

        System.out.println(boo);

        int siz = t.size();

        System.out.println(siz);

        Set<Integer> t2 = new HashSet<Integer>();
        t2.add(7);
        t2.add(9);
        t2.add(5); //Sets can only have 1 of each unique element
        t2.add(5);
        t2.add(-4);
        t2.add(2);
        t2.remove(7);

        System.out.println(t2);  //order or location is not stored

        boolean boo2 = t2.contains(5);

        System.out.println(boo2);

        int siz2 = t2.size();

        System.out.println(siz2);

        ArrayList<Integer> t3 = new ArrayList<Integer>();
        t3.add(5);
        t3.add(7);
        t3.add(5);
        t3.add(2);
        t3.add(-4);
        t3.add(9);
        t3.remove(3); // removes at index not value because arrays can have duplicates

        System.out.println(t3.get(3));
        t3.set(1,33); //have to have an object at the index before set works (already existing)

        System.out.println(t3.subList(1, 4));

        System.out.println(t3);  //order or location is not stored

        boolean boo3 = t3.contains(5);

        System.out.println(boo3);

        int siz3 = t3.size();

        System.out.println(siz3);

        */

        /* Maps : keys must be unique
        Map m = new HashMap();   // Does not store order
        m.put("Derf", 5);
        m.put("Fred", 3);
        m.put("Johnny", 2);
        m.put("Khyle", 8);

        System.out.println(m.get("Derf"));

        Map m = new TreeMap();  // Sorted order and keys have to be same datatype
        m.put("Derf", 5);
        m.put("Fred", 3);
        m.put("Johnny", 2);
        m.put("Khyle", 8);

        System.out.println(m);
        System.out.println(m.get("Derf"));
        
        Map m = new LinkedHashMap();  // Ordered as entered
        m.put("Derf", 5);
        m.put("Fred", 3);
        m.put("Johnny", 2);
        m.put("Khyle", 8);

        System.out.println(m);
        System.out.println(m.get("Derf"));
        System.out.println(m.get("Regina"));
        System.out.println(m.containsValue(2));
        System.out.println(m.containsKey("Khyle"));
        System.out.println(m.values());
        m.clear();
        System.out.println(m);
        System.out.println(m.isEmpty());

        */


        /* Small section for testing what I have learned 

        Map m = new HashMap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string to count the letter: ");
        // String str = "Hello, there stranger.  My name is Derf.  What can I do you for.";
        String str = sc.nextLine();

        for (char x:str.toCharArray()) {
            if (m.containsKey(x)) {
                System.out.print(".I");
                m.replace(x, m.get(x), (int)m.get(x) + 1);
            }
            else {
                System.out.print(".A");
                m.put(x, 1);
            }
        }
        System.out.println("\n" + m);
        
        */

        /* Objects */

        //Scanner sc = new Scanner(System.in);
        //int x = 5;
        //String str = "hello";

        /* Methods 

        //sc.next();          // sc Object using the next Method
        //str.length();       // str Object using the length Method
        
        derf("DERF!!!!!!!!", 3);              // Self created Method from below

        System.out.println(add2(6));                  // Self created Method with a return type

        System.out.println(strang("hi"));
    
    }
    
    public static void derf(String str, int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(str);
        }
    }

    public static int add2(int x) {
        return x + 2;
    }

    public static String strang(String x) {
        return x + "!!!!!!!!!!";
    }

    */

    /** Classes */
    Dog winter = new Dog("Winter", 3);
    Dog woof = new Dog("Woof", 17);
    Dog bark = new Dog("Bark", 18);
    winter.speak();
    woof.speak();
    bark.speak();
    System.out.println(winter.getAge());
    winter.setAge(1);
    winter.speak();

    Cat fart = new Cat("Fart", 12, 3);
    fart.speak();
    Cat fart2 = new Cat("Fart2", 8);
    fart2.speak();
    Cat fart3 = new Cat("Fart3");
    fart3.speak();

    }

}