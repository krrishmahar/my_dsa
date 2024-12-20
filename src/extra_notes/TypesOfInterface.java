package extra_notes;

@FunctionalInterface
interface AB {
//    void hello();
    String word(String word);
    //types of interface containing only one method
}

//class BA implements AB{
//
//    @Override
//    public void hello() {
//        System.out.println("hello");
//    }
//}

public class TypesOfInterface {
    public static void main(String[] args) {

        //usecase of functional interface
//        AB ab = new AB() {
////            @Override
////            public void hello() {
////                System.out.println("hell");
////            }
//            public void word(){}
//        };

        //better way to do this, use lambda expression
        AB obj = a -> "Hello! " + a;

        System.out.println(obj.word("krrish"));


    }
}
