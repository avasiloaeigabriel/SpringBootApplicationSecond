package Streams;

import java.util.*;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");
        myList.add("e");

        boolean xContainChecker = myList.contains("x");
        System.out.println(xContainChecker);
        if (xContainChecker == false) {
            System.out.println("It does not contain the letter \"x\"");
        } else {
            System.out.println("It contains the letter \"x\"");
        }

        HashMap<Integer, String> myHashMap = new HashMap<>();
        myHashMap.put(10, "Gabi");//E de tipul Key,Value;

        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("unu");
        myHashSet.add("doi");
        myHashSet.add("trei");
        System.out.println(myHashSet);
    }

}
