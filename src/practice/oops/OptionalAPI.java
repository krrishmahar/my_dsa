package practice.oops;

import java.util.*;

public class OptionalAPI {

    record Student(String id, String name, int attendance) {}

    private final List<Student> students = List.of(
            new Student("VU1F2324090", "KRRISH", 80),
            new Student("VU1F2324094", "VEDANTH", 90),
            new Student("VU1F232078", "SIDD", 70)
    );

    // 1. Returning an Optional from a Stream lookup
    public Optional<Student> findById(String id) {
        return students.stream()
                .filter(s -> s.id().equals(id))
                .findFirst(); // Returns an Optional<Student> automatically
    }

    public static void main(String[] args) {
        OptionalAPI api = new OptionalAPI();

        // SCENARIO 1: Student Exists
        System.out.println("--- Scenario 1: Fetching KRRISH ---");
        api.findById("VU1F2324090")
                .map(Student::name)
                .ifPresent(name -> System.out.println("Found student: " + name));

        // SCENARIO 2: Student Missing (Handling with orElseThrow)
        System.out.println("\n--- Scenario 2: Fetching Invalid ID ---");
        try {
            Student missingStudent = api.findById("INVALID_ID")
                    .orElseThrow(() -> new NoSuchElementException("Student record not found in DB"));
        } catch (Exception e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }

        // SCENARIO 3: Conditional filtering with Optional
        System.out.println("\n--- Scenario 3: Checking Attendance Eligibility ---");
        String result = api.findById("VU1F232078") // SIDD has 70% attendance
                .filter(s -> s.attendance() >= 75)
                .map(s -> s.name() + " is eligible for exams.")
                .orElse("Student is detained due to low attendance.");

        System.out.println(result);
    }
}