package extra_notes;

import java.util.Objects;

class database{
    private final int id;
    private final String name;

    //need getter to initialize them


    public database(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        database database = (database) o;
        return id == database.id && Objects.equals(name, database.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "database{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

//instead of this we can use
record db (int id, String name) implements Cloneable{
    static int age;
    db {
        if (id==0) throw new IllegalArgumentException("Bro, java has canonical constructor as well as compact constructor");
    }
    //this is a compact constructor
}
//record keyword creates a constructor, toString bydefault
//all db args are private final, meaning it doesn't have set() reason, it's only application is s


public class recordKeyword {
    public static void main(String[] args) {
        //assume, ya need a class just to hold some data while it being passed in server to client or db to server
        //we can use record keyword which does it in m ore less lines of code

//        database d1 = new database(11,"Krrish");
//        database d2 = new database(11,"Krrish");
//        database d2 = new database(19,"Mahar");
//        System.out.println(d1.equals(d2));

        //it's fuckin' great
        db d1 = new db(11,"Krrish");
        db d2 = new db(11,"Krrish");
//        db d3 = new db(0,"Krrish");
        System.out.println(d1);
        System.out.println(d1.id());
        System.out.println(d2.equals(d1));

    }
}
