import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();

        list1.add("0번");
        list1.add("1번");
        list1.add("2번");

        System.out.println("list1의 0번 index : " + list1.get(0));
        System.out.println("list1의 크기 : " + list1.size());

        list1.set(0, "00번");
        System.out.println("list1의 0번 index : " + list1.get(0));

        list1.remove(2);
        list1.remove(1);
        System.out.println("list1의 크기 : " + list1.size());

        System.out.println("\n\n");

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.println("ArrayList로 10000개 추가 시 걸린 시간 : " + (endTime - startTime) + " ns");

        System.out.println();

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.println("LinkedList로 10000개 추가 시 걸린 시간 : " + (endTime - startTime) + " ns");
    }
}
