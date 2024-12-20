package Java_DSA.OOPs.EnumExample;

public class Basics {

    enum Week  {
        //these are all Objects and java considers them Enum as a Class but, enum cannot be extended
        Monday, Tuesday, Wednesday, Thursday, Friday, saturday, Sunday
        //these are enum constants
        //are public, static and final
        //since, it's final, there will be no child class i.e, No Inheritance
        //Object type is Week
        //since it is final, you cannot make abstract fun() like void hello();



//        @Override
//        public void  hello() {
//            System.out.println("hola! Morning");
//        }
//        Week() {
//            System.out.println("Constructor called for " + this);
//        }
        //these constant's constructor prints every object in it

        //this is not private or protected, only public or default
        //reason: we don't want to create new object but only use constant obj in enum Week
        //internally: public static final week Monday = new Week();

    }


    public static void main(String[] args) {
        Week week;
        week = Week.Friday;
        Week[] ss = Week.values();

        //This acts as the array object

//        System.out.println(ss[0]);
//        week.hello();
//        System.out.println(week.valueOf("Tuesday"));
        //        for (Week day: Week.values()){
//            System.out.println(day);
//        }

//        System.out.println(week);
//        System.out.println(week.ordinal());

        //Switch also supports enum

        switch (week){
            case Monday -> {
                System.out.println(week);
            }
            case Tuesday -> {
                System.out.println(week);
            }case Wednesday -> {
                System.out.println(week);
            }
            case Thursday->{
                System.out.println(week);
            }
            case Friday -> {
                System.out.println("lol");
            }case saturday -> {
                System.out.println(week);
            }case Sunday -> {
                System.out.println(week);
            }default -> {
                System.out.println("solved");
            }
        }

    }


}
