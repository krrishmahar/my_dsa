package practice.oops;


public class UserDefinedException {


    static void main() {
        try {
            NameValidator.validateName("Krrish");
        } catch (RuntimeException e){
            e.printStackTrace();
        }

    }
}

class NameValidator{
    static void validateName(String name){
        if ("Krrish".equalsIgnoreCase(name)){
            throw new InvalidNameException("Access Denied!\nThe name " + name + "is not allowed");
        }
        System.out.println("Welcome! "+ name);
    }

}

class InvalidNameException extends RuntimeException {
    public String message;

    public InvalidNameException(String message){
        super(message);
    }
}

