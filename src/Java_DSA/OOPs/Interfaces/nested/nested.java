package Java_DSA.OOPs.Interfaces.nested;

public class nested {
    // nested interface

    public interface NestedInterface {
        boolean isOdd(int num);
    }

}

class B implements nested.NestedInterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
