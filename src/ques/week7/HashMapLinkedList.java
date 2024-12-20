package ques.week7;

import java.util.*;

public class HashMapLinkedList<K, V> {

    ArrayList<LinkedList<Entity>> list;

    private int SIZE = 0;
    private float lf = 0.5f;
    //load factor(lf) is set to increase(double) the size of hashmap when elements in map are lf*Entity.length = 50% of map
//    lf = size / list.size

    public HashMapLinkedList() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public HashMapLinkedList(K key, V value) {
        this(); // Calls the default constructor to initialize the list
        put(key, value); // Adds the provided key-value pair to the map
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> l = list.get(hash);

        for (Entity e : l) {
            if (e.equals(key)){
                e.value = value;
            return;
            }
        }

        if ((float) SIZE / list.size() > lf) {
            reHash();
        }

        l.add(new Entity(key, value));
        SIZE++;
    }

    private void reHash() {
        System.out.println("we are now rehashing");
        //copying all elements in list and adding into lest double the size

        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        SIZE = 0;
        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for (LinkedList<Entity> e : old) {
            for (Entity entry : e) {
                put( entry.key,  entry.value);
            }
        }
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity e : entities) {
            if (e.key.equals(key)) {
                return e.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        Entity target = null;
        for (Entity e : entities){
            if (e.key.equals(key)){
                target = e;
                break;
            }
        }
        entities.remove(target);
        SIZE--;
    }

    public Boolean containsKey(K key) {
        return get(key) != null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (LinkedList<Entity> entities : list) {
            for (Entity e : entities) {
                sb.append("`");
                sb.append(e.key);
                sb.append("`");
                sb.append(" = ");
                sb.append("`");
                sb.append(e.value);
                sb.append("`");
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private class Entity{
        K key;
        V value;

        Entity(K key, V value){
            this.key =  key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
//    HashMapLinkedList<String, String> hashmap = new HashMapLinkedList<String, String>();
//        hashmap.put("mango", "king of fruits");
//        hashmap.put("apple", "docter's nightmare");
//        hashmap.put("lichi", "sweet and juicy");
//        hashmap.put("pineapple", "best with italian pizza");
//        System.out.println(hashmap.get("lichi"));
//        System.out.println(hashmap.get("mango"));
//        System.out.println(hashmap.containsKey("lichi"));
//        System.out.println(hashmap.toString());
        HashMapLinkedList<String, String> e = new HashMapLinkedList<>("a", "sweet");
        e.put("lichi", "sweet and juicy and plump");
        System.out.println(e.get("lichi"));
        System.out.println(e.get("a"));
        System.out.println(e.containsKey("lichi"));
        System.out.println(e.get("lichi"));
        System.out.println(e);
    }



}
