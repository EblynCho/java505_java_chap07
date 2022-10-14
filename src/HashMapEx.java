import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        System.out.println("HashMap의 크기 : " + map.size());

        map.put("아이유", 30);
        map.put("유인나", 32);
        map.put("유재석", 50);
        map.put("홍길동", 30);
        map.put("이순신", 40);

        System.out.println("HashMap의 크기 : " + map.size());

        System.out.println("\t홍길동 나이 : " + map.get("홍길동"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIter = keySet.iterator();

        while (keyIter.hasNext()) {
            String key = keyIter.next();
            int value = map.get(key);
            System.out.println("key : " + key + "\tvalue : " + value);
        }
        System.out.println();

        if (map.containsKey("김종국")) {
            map.remove("김종국");
        }
        map.remove("이순신");
        map.remove("홍길동");
        System.out.println("HashMap의 크기 : " + map.size());

        map.clear();
        System.out.println("HashMap의 크기 : " + map.size());
    }
}
