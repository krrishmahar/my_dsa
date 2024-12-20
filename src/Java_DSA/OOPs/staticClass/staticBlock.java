package Java_DSA.OOPs.staticClass;

//    this is a demo to show initialization of Static variables
public class staticBlock {
    static int a = 11;
    static int b;

    //this will only run once when 1st obj is created i.e, when class is loaded for 1st time
    static {
        System.out.println("This is a static block");
        b = a * 5;
    }

    public static void main(String[] args) {
//        staticBlock obj = new staticBlock();

        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock.b += 3;
        staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);


    }
}
