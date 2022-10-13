import java.util.ArrayList;
import java.util.List;
//import java.util.*;  // 가능

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();  // 정석적인 방법

        System.out.println("ArrayList 생성\nlist의 길이 : " + list.size());

        list.add("HTML5");
        list.add("CSS3");
        list.add("Bootstrap5");
        list.add("JS ES6");
        list.add("React");
        list.add("Java");
        list.add("Servlet/JSP");
        list.add("Spring framework");
        list.add("Spring boot");
        list.add("Database(MySql)");
        list.add("Python");

        System.out.println("\n데이터 추가 후 arraylist의 길이 확인 : " + list.size());


        String str = list.get(5);
        System.out.println("list의 5번 index의 값 : " + str);

        System.out.println("리스트의 전체 내용 출력");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("리스트 " + i + "번 index의 값 : " + list.get(i));
        }

        System.out.println("리스트 안 데이터 삭제하기");

        list.remove(5);
        list.remove(2);
        list.remove("Java");

        System.out.println("\nremove 후 list 변수의 크기");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("리스트 " + i + "번 index 값 : " + list.get(i));
        }
//        ArrayList<String> list = new ArrayList<>();  // 뒤의 String 없어도 완성됨
//        List 클래스가 ArrayList 의 부모 이므로 부모 타입의 변수에 자식 클래스 타입인 ArrayList 객체를 대입하여 사용
//        List<String> list2 = new ArrayList<String>();  // 이렇게 많이 씀
    }
}
