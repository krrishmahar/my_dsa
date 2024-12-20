package extra_notes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class streamAPI {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(2, 3, 4, 5, 6, 8, 9, 2, 651, 5, 22, 5);
        Consumer <Integer> con = n -> System.out.println(n);
//        System.out.println(con);
//        list.forEach(n -> System.out.println(n));
//        list.forEach(con);
//        list.forEach(System.out::println);

        //Stream provides ots of methods and like it's name it can be only runned once at program
        //ya can't use a stream as filter list for s2 then print it
        Stream<Integer> s1 = list.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
//        s1.forEach(System.out::println);
//        s2.forEach(System.out::println);
//        int result = s3.reduce(0, (c,e) -> c+e);
        int result = s3.reduce(0, Integer::max);
//        s3.forEach(System.out::println);

//        System.out.println(result);

        List<Integer> nums = Arrays.asList(10,9,8,12,4,2,3,0,6);
        Stream<Integer> re_result = nums.stream()
                .filter(n -> n%2==0)
                .map(n -> n*10)
                .sorted();
        re_result.forEach(System.out::println);
        //seriously better, It's not difficult, it's just unfamiliar.
        //


    }
}