package collection_framework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();

        set.add(4);
        set.add(7);
        set.add(6);
        set.add(1);
        set.add(16);
        set.add(42);
        set.add(9);

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        Set<String> set2 = new TreeSet<String>();

        set2.add("A");
        set2.add("B");
        set2.add("a");
        set2.add("E");
        set2.add("g");

        Iterator<String> iterator2 = set2.iterator();

        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }


    }
}
