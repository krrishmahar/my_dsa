package ques.week7;

import java.util.*;

public class Hashmap {

//    hashmap is not synchronized so it's not thread safe and cannot be shared between many thread without synchronized function but, no such problem with hashtable
//    hashmap provides null key and null table whereas hashtable do not
//    if thread synchronized is unneeded then hashmap is preferred
//    hashmap is newer version of hashtable which allows null object and many new functions

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>(2);
        Map<Integer, String> map2 = new HashMap<Integer, String>();
        map.put(11, "krrish");
        map.put(20, "yash");
        System.out.println(map.size());
        map.put(20, "vedant");
        map.put(15, "abhisekh");
        System.out.println(map.size());
//        List<Integer> list = new ArrayList<Integer>(map.keySet());
        map2.put(14, "arteius");
        System.out.println(map2.entrySet());
        map2.merge(14, "haviose", String::join);
        map2.merge(14, " esper", String::concat);
        map2.put(16, "artemus");
        System.out.println();
        System.out.println(map2.entrySet());
//        System.out.println(map.remove(20)); //overrides prev code
//        System.out.println(map.computeIfAbsent(20,y -> "yash"));
//        System.out.println(map.get(11));
//        System.out.println(map.containsValue("yash"));
//        System.out.println(map2.get(20));
//        System.out.println(map.entrySet());

        HashSet<Integer> set = new HashSet<Integer>(2);
        set.add(11);
        set.add(19);

        System.out.println(set.size());
        set.add(15);
        set.add(1);
        set.add(5);
        System.out.println(Arrays.toString(set.toArray()));
        System.out.println(set.size());

    }


}
