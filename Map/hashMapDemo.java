package Map;

import java.util.HashMap;
import java.util.Map;

public class hashMapDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "lihua");
        map.put("002", "liming");
        String value = map.put("001", "xiaoming");
        System.out.println("value = " + value);
        System.out.println(map);

        for (int i = 0; i < 19; i++)
            System.out.println(i);
    }
}
