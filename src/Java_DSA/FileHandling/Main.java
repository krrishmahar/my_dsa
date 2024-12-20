package Java_DSA.FileHandling;

import java.io.*;

import static java.lang.Thread.sleep;

public class Main {

    static void inputSR(){
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.println("Enter some letters: ");
            int letters = isr.read();
            while(isr.ready()){
                System.out.println((char) letters);
                letters = isr.read();
            }
            isr.close();
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    static void fileReader(){
        try (FileReader fr = new FileReader("Java_DSA/FileHandling/note.txt")) {
            int letters = fr.read();
            while(fr.ready()){
                System.out.println((char) letters);
                letters = fr.read();
            }
            fr.close();
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    static void BufferedFileReader(){
        // BufferedReader in = new BufferedReader(new FileReader("foo.in"));
        //will buffer the input from the specified file.
        //Without buffering, each invocation of read() or readLine() could cause bytes to be
        //read from the file, converted into characters, and then returned, which can be very inefficient.
//        try (FileReader fr = new FileReader("Java_DSA/FileHandling/note.txt")) {
//            int letters = fr.read();
//            while(fr.ready()){
//                System.out.println((char) letters);
//                letters = fr.read();
//            }
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
//        }

        // byte(keyboard) to char stream then reading char stream
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){//kinda faster
            System.out.println("you typed: "+ br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        try (BufferedReader br = new BufferedReader(new FileReader("Java_DSA/FileHandling/note.txt"))) {
            while (br.ready()){
                br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Output:
    static void outStreamer(){
        OutputStream out = System.out;
//            out.write(😘);//range exceeded
//            out.write(97);

        System.out.println();//Same can be done with FileWriter using its superclass OutputStreamWriter
        try (OutputStreamWriter osr = new OutputStreamWriter(System.out)){
            osr.write("Hello World\n");
            osr.write(97);
            osr.write('!');
            osr.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileWriter fr = new FileWriter("Java_DSA/FileHandling/note.txt")) {
            fr.write("Hello World\n");
            fr.append("I am Krrish");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedWriter fr = new BufferedWriter(new FileWriter("Java_DSA/FileHandling/note2.txt"))) {
            fr.write("Hare Krishna\n");
            fr.append("Hare Rama");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //File Creation
    static void creatingFile(){
        //create
        try {
            File file = new File("Java_DSA/FileHandling/book.txt");
            file.createNewFile();
            File file2 = new File("Java_DSA/FileHandling/del.txt");
            file2.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //write in the file
        try (FileWriter fw = new FileWriter("Java_DSA/FileHandling/book.txt")){
            fw.write("Hare Krishna\n");
            fw.write("Hare Rama");
            } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //reading from the file
        try (BufferedReader fr = new BufferedReader(new FileReader("Java_DSA/FileHandling/book.txt"))) {
            while (fr.ready()){
                System.out.println(fr.readLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //deleting the file
        try {
            File fo = new File("Java_DSA/FileHandling/del.txt");
            if (fo.delete()){
                System.out.println("File deleted!");
                System.out.println(fo.getName());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        creatingFile();
    }
}
