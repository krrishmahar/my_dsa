package Java_DSA.OOPs.Abstract;

public class Main {
    //notes: https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/lectures/17-oop/notes/abstract.txt
    //Abstract classes are used for code cleanliness where you know that your meth will be overridden.
    //obj of abstract classes cannot be created like Son or Daughter, when created they must be overridden.
    //obj cannot be created since they don't have any body what will they return
    //Abstract constructors cannot be created


    public static void main(String[] args) {
        Son son = new Son(19);
        Daughter daughter = new Daughter(21);
        son.career();
        son.partner();

        Parent.hello();


    }


}
