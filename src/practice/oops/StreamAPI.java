package practice.oops;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    record Exam(String name, String type, int maxMarks, boolean active) {}

    List<Exam> exams = loadAll();

    private List<Exam> loadAll() {
        return new ArrayList<>(Arrays.asList(
                new Exam("Semester 7","Main",80, true),
                new Exam("Java Basics", "Main", 100, true),
                new Exam("Advanced Spring", "Main", 100, true),
                new Exam("SQL Database", "KT", 50, false),  // KT 1
                new Exam("Web Dev", "KT", 50, false),       // KT 2
                new Exam("Microservices", "KT", 50, true)   // KT 3
        ));
    }

    List<String> activeKtNames = exams.stream()
            .filter(Exam::active)
            .filter(e -> e.type().equals("KT"))
            .sorted(Comparator.comparing(Exam::name))
            .map(Exam::name)
            .toList();

    Integer maxMarks = exams.stream()
            .mapToInt(Exam::maxMarks)
            .max()
            .orElse(0);

    //Group by Type
    Map<String, List<Exam>> byType = exams.stream()
            .collect(Collectors.groupingBy(Exam::type));

    //Count per type
    Map<String, Long> counts = exams.parallelStream()
            .collect(Collectors.groupingBy(Exam::type, Collectors.counting()));

    //Reduce
    int totalMarks = exams.stream()
            .mapToInt(Exam::maxMarks)
            .reduce(0, Integer::sum);

    //Parallel - ForkJoinPool, use for CPU-heavy large datasets
    long count = exams.parallelStream()
            .filter(Exam::active)
            .count();

    public static void main(String[] args) {
        // 1. Create the instance (this runs all the streams automatically)
        StreamAPI api = new StreamAPI();

        System.out.println("--- 1. ALL EXAMS ---");
        System.out.println(api.exams);
        System.out.println();

        System.out.println("--- 2. ACTIVE KT NAMES (Filtered, Sorted, Mapped) ---");
        // Loop through the List<String>
        api.activeKtNames.forEach(name -> System.out.println("Active KT: " + name));
        System.out.println();

        System.out.println("--- 3. MAX MARKS (Integer) ---");
        System.out.println((api.maxMarks != null) ?     "Highest Max Mark found: " + api.maxMarks
                :   "No exams found.");
        System.out.println();

        System.out.println("--- 4. GROUPED BY TYPE (Map<String, List<Exam>>) ---");
        // Iterating through the map entries
        api.byType.forEach((type, examList) -> {
            System.out.println("Type: " + type + " -> " + examList);
        });
        System.out.println();

        System.out.println("--- 5. COUNT PER TYPE (Parallel Map) ---");
        api.counts.forEach((type, count) -> {
            System.out.println("Type '" + type + "' has " + count + " exam(s).");
        });
        System.out.println();

        System.out.println("--- 6. TOTAL MARKS (Reduce) ---");
        System.out.println("Sum of all max marks: " + api.totalMarks);
        System.out.println();

        System.out.println("--- 7. TOTAL ACTIVE EXAMS (Parallel Stream Count) ---");
        System.out.println("Number of active exams: " + api.count);
    }
}
