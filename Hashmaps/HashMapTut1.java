package com.Nikhil.Hashmaps;

class MapUsingHash{

    private Entity[] entities;

    public MapUsingHash(){
        entities = new Entity[100];
    }

    public void put(String key, String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value); // overriding
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            entities[hash] = null;
        }
    }

    private class Entity{
        String key;
        String value;

        public Entity(String key, String value){
            this.key = key;
            this.value = value;
        }
    }
}


public class HashMapTut1 {
    public static void main(String[] args) {

//        HashMap<String, Integer> map = new HashMap<>();
//
//        map.put("Nilesh", 98);
//        map.put("Kapil", 94);
//        map.put("Prince", 90);
//
//        System.out.println("Marks Prince got = "+map.get("Prince"));
//        System.out.println(map.getOrDefault("Apoorv", 78));
//
//        System.out.println(map.containsKey("prince"));
//
//        HashSet<Integer> set = new HashSet<>();
//        set.add(56);
//        set.add(4);
//        set.add(9);
//        set.add(12);
//        set.add(56);
//        set.add(10);
//
//        System.out.println(set);

        MapUsingHash map = new MapUsingHash();
        map.put("Nikhil", "96");
        map.put("Nilesh", "100");
        map.put("Harsh", "89");
        map.put("Kapil", "78");
        map.put("Prince", "79");
        map.put("Rohini", "95");

        System.out.println(map.get("Nikhil"));
    }

}
