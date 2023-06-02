package CSE1204;

import java.util.ArrayList;

import javax.print.event.PrintJobListener;

public class Second {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Guava");
        System.out.println(fruits);
        fruits.add(0, "Banana");
        System.out.println(fruits);
        fruits.remove("Guava");
        System.out.println(fruits);
        System.out.println(fruits.get(0));
        fruits.add("Guava");
        System.out.println(fruits);
        fruits.add("Apple");
        System.out.println(fruits);
        fruits.add("Orange");
        System.out.println(fruits);

        System.out.println(fruits.size());
        fruits.sort(null);
        System.out.println(fruits);

        print(fruits);
        
    }

    private static void print(ArrayList<String> fruits) {
        for (String str : fruits) {
            System.out.println(str);
        }
    }
}
