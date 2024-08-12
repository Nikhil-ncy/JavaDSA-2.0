package com.Nikhil.Hashmaps;

import java.util.*;

public class HashMapFinal<K, V> {

    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private float lf = 0.5f; // when you add the half+1 item then the size becomes double

    public HashMapFinal(){
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public static void main(String[] args) {

        HashMapFinal<String, String> map = new HashMapFinal<>();
        map.put("Nikhil", "96");
        map.put("Nilesh", "100");
        map.put("Harsh", "89");
        map.put("Kapil", "78");
        map.put("Prince", "79");
        map.put("Rohini", "95");

        System.out.println(map);
    }

    public void put(K key, V value){
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        for(Entity entity: entities){
            if (entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }

        if ((float)size / list.size() > lf){
            reHash();
        }

        entities.add(new Entity(key, value));
        size++;
    }

    private void reHash(){
        System.out.println("We are now rehashing");

        ArrayList<LinkedList<Entity>> old = list;

        size = 0;

        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for(LinkedList<Entity> entries: old){
            for(Entity entry: entries){
                put((K) entry.key, (V) entry.value);
            }
        }
    }

    public V get(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity: entities){
            if (entity.key.equals(key)){
                return (V) entity.value;
            }
        }
        return null;
    }

    public void remove(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        Entity target = null;

        for (Entity entity: entities){
            if (entity.key.equals(key)){
                target = entity;
                break;
            }
        }

        entities.remove(target);
        size--;
    }

    public boolean containsKey(K key){
        return get(key) != null;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (LinkedList<Entity> entities: list){
            for (Entity entity: entities){
                builder.append(entity.key);
                builder.append(" = ");
                builder.append(entity.value);
                builder.append(" , ");
            }
        }
        builder.append("}");
        return builder.toString();
    }

    public class Entity<K, V>{
        K key;
        V value;

        public Entity(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
}
