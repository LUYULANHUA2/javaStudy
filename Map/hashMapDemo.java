package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashMapDemo {
   public static void main(String[] args) {
    Map<String, List<String>> map = new HashMap<>();
    List<String> list1 = new ArrayList<>();
    list1.add("nihao");
    list1.add("nihaoll");
    list1.add("nihaogg");
    map.put("001", list1);
    
    // 获取键为 "001" 的列表
    List<String> strs = map.getOrDefault("001", new ArrayList<>());
    // 输出列表中的所有值
    for (String str : strs) {
        System.out.println(str);
    }
   }
}
