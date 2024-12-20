package Java_DSA.OOPs.staticClass;

//static class hola{} //outside classes cannot be static
public class InnerClasses {
    static class Test {
        //if not static, inner class are dependent on outer class incase, InnerClasses -> Test
        //it cannot be dependent on any instance of InnerClasses but, can use instance of a subclass like main()
        //Since, static var/func are object independent and obj are created in runtime this means
        //that anything static is completed at compile time and hence always done earlier than any other non-static thing
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Krrish");
        Test b = new Test("Yash");

        System.out.println(a.name);
        System.out.println(b.name);

    }

}
