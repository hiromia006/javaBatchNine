package class8;

import java.util.*;

public class CollectionSubInterfaces {
    public static void main(String[] args) {
        // List

        List<Integer> integers = new ArrayList<>();
        integers.add(98);
        integers.add(45);
        integers.add(50);

        integers.add(2, 50);
        integers.add(502);


        integers.remove(0);

        List<Integer> integers1 = Arrays.asList(85, 65, 32);
        integers.addAll(0, integers1);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        integers.removeAll(integers1);


        //Set
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(98);
        integerSet.add(45);
        integerSet.add(50);

        integerSet.add(50);
        integerSet.add(502);
        for (Integer integer : integerSet) {
            System.out.println(integer);
        }

        integerSet.remove(50);

        Set<Integer> integerSet1 = new HashSet<>();
        integerSet1.add(65);
        integerSet1.add(85);

        integerSet.addAll(integerSet1);

        //Map
        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("name", "hanif");
        objectMap.put("age", 23);
        objectMap.put("color", "white");
        objectMap.put("height", 5.7);

        System.out.println(objectMap.toString());
        System.out.println(objectMap.get("height"));

    }
}
