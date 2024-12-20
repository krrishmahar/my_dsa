package Java_DSA.OOPs.inheritance;

public class Box {
    private double l;
    double w, h;
    double radius = -1;

    static void greeting() {
        System.out.println("Hello! I'm under the box please help me");
    }

    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;

    }

    // Cube:
    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}
