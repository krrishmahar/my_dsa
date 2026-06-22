package practice.oops;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface ExamScorer {
    int score(int correct, int total);

    default double percent(int c, int t) {  return (double) c / t * 100; }
}

public class functionalInterface {
    ExamScorer gtu = (c, t) -> c*4;
    ExamScorer negMk = (c, t) -> c*4 - (t-c);

    // Built-in FI (java.util.function)
    Predicate<Integer>  passing = score -> score >= 40;
//    Function<, >
    Consumer<String> log      = System.out::println;    // T → void
    BiFunction<Integer,Integer,Integer> add = Integer::sum;  // T,U → R

}
