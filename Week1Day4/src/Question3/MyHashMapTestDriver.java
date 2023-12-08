package Question3;

public class MyHashMapTestDriver {

    public static void main(String[] args) {
        MyHashMap<String, Integer> myMap = new MyHashMap<>();
        myMap.put("Yaokun Ren", 25);
        myMap.put("Xiao Huang", 32);
        myMap.put("Ritter", 16);

        System.out.println("The value for the key Yaokun Ren : " + myMap.get("Yaokun Ren"));
        System.out.println("The value for the key Xiao Huang : " + myMap.get("Xiao Huang"));
        System.out.println("The value for the key Ritter : " + myMap.get("Ritter"));
    }
}
