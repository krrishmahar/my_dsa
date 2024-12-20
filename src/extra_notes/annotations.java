package extra_notes;


class A{
    public  void call(){
        System.out.println("Hello! A");
    }
}

@Deprecated
class B extends A{
    @Override
    public void call(){
        System.out.println("Hello! B");
    }
}

public class annotations {

    @SuppressWarnings("Cannot divide by Zero")
    static int div(int x, int y){
        int a =0;
      return x/y;
    }

    public static void main(String[] args) {
        A b = new A();
        b.call();

        System.out.println(div(10,5));
    }


}
