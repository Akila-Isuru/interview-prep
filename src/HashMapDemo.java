import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Python");
        map.put(2, "Java");
        map.put(3, "Python");
        map.put(2,"GoLang");

        System.out.println(map);
    }
}
