package caveofprogramming;

import java.lang.reflect.Array;
import java.util.*;

//class StringLengthComparator implements Comparator<String>{
//    @Override
//    public int compare(String s1, String s2)P
//        return 0;
//}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        System.out.println(numbers.get(0));

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        for(Integer i : numbers){
            System.out.println(i);
        }

        numbers.remove(numbers.size() -1);

        ArrayList<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);

        List<String> list = new ArrayList<>();

        SortedSet<String> set = new TreeSet<>();
        //tree sets store elements in natural order

        addElements(list);
        addElements(set);

        showElements(list);
        System.out.println();
        showElements(set);

    }
    private static void addElements(Collection<String> col){
        col.add("Joe");
        col.add("Sue");
        col.add("Juliet");
        col.add("Claire");
        col.add("Mike");

    }

    private static void showElements(Collection<String> col){
        for(String element : col){
            System.out.println(element);
        }
    }

    private static void doTimings(String type, List<Integer> list){
        for(int i = 0; i < 1E5; i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1E5; i++){
            list.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type);

        HashMap<Integer, String> map = new HashMap<>();

        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(4, "Four");
        map.put(2, "Two");

        String text = map.get(6);

        System.out.println(text);

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": " + value);
        }

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();



        for (Integer key : map.keySet()){
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }

        testMap(hashMap);

        Set<String> set1 = new LinkedHashSet<>();

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        for(String element : set1) {
            System.out.println(element);
        }

        if(set1.contains("addfark")){
            System.out.println("Contains hahaha");
        }

        Set<String> set2 = new HashSet<>();

        set2.add("dog");
        set2.add("cat");
        set2.add("giraffe");
        set2.add("monkey");
        set2.add("ant");

        Set<String> insersetion = new HashSet<>(set1);

        System.out.println(insersetion);

        //keeps elements that are copies between both sets
        insersetion.retainAll(set2);

        LinkedList<String> animals = new LinkedList<>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");

        Iterator<String> it = animals.iterator();

        //calls next value and returns at the same time
        String value = it.next();
        System.out.println(value);

        List<String> animals2 = new ArrayList<>();

        animals2.add("cat");
        animals2.add("elephant");
        animals2.add("tiger");
        animals2.add("lion");
        animals2.add("snake");
        animals2.add("mongoose");

        Collections.sort(animals2);

        for(String animal : animals2){
            System.out.println(animal);
        }


    }


    public static void testMap(Map<Integer, String> map){
        map.put(9, "Fox");
        map.put(4, "Cat");
        map.put(8, "Dog");
        map.put(1, "Giraffe");
        map.put(0, "Swan");
        map.put(15, "Bear");
        map.put(6, "Snake");
    }
}
