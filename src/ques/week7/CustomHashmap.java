package ques.week7;

import javax.swing.text.html.parser.Entity;
import java.util.Map;

class mapUsingHash{
    private Entity[] entities;

    public mapUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key, Integer value) {
        int hash = Math.abs(key.hashCode() % entities.length);  //Division hashing method
        entities[hash] = new Entity(key, value);
    }

//    public void entrySet(){
//        int hash = Math.abs(key.hashCode() % entities.length);
//        for(int i = 0; i < entities.length; i++){
//            entities[hash]
//        }
//    }

    public Integer get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }



    private class Entity {
        String key;
        Integer value;

        public Entity(String key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }

}

public class CustomHashmap {

    public static void main(String[] args) {
        mapUsingHash hashmap = new mapUsingHash();
        hashmap.put("mango", 1);
        hashmap.put("apple", 2);
        hashmap.put("lichi", 8);
        hashmap.put("pineapple", 1);
        System.out.println(hashmap.get("lichi"));
        System.out.println(hashmap.get("mango"));
        System.out.println(hashmap.get("pineapple"));
    }

}
