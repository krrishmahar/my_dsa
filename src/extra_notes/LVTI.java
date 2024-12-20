package extra_notes;

public class LVTI {

    public static void main(String[] args) {
//    LVTI = Local variable type interference => meaning declareing var without datatype
//    even if java is static typed language, we can use var keyword for local variables
        var name = "krrish mahar";
        System.out.println("hello " + name);
        int a;
//        var b; // must be initialized like in go
// for var keyword, if detected compiler checks for it's value in compile time and if not assigned it throws an error.
        int[] nums = new int[10];
        var num = new int[11];
//        var numss[] = new int[11]; //var cannot be assigned as an array or Object

    }
}