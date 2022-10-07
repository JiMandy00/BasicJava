package collection_framework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();

        set.add("g");
        set.add("E");
        set.add("A");
        set.add("5");
        set.add("h");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
