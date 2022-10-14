import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/Jsp");
        set.add("Java");
        set.add("mybatis");

        int size = set.size();
        System.out.println("HashSet에 저장된 수 : " + size);

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("mybatis");

        System.out.println("HashSet에 저장된 수 : " + set.size());

        iterator = set.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.clear();
        if (set.isEmpty()) {
            System.out.println("HashSet이 비어있음");
        }
    }
}
