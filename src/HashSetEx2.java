import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
//        문제 1) HashSet을 사용하여 로또 번호 7개를 생성하는 프로그램을 작성하세요
//        Set<Integer> lotto = new HashSet<>();
//
//
//        for (int i = 0; i < 7; i++) {  // 중복 값이 생성되면 저장이 6개 밖에 안됨
//            int rnd = (int) (Math.random() * 45) + 1;
//            lotto.add(rnd);
//        }
//
//
//        Iterator<Integer> iterator = lotto.iterator();
//        String number = "";
//
//
//        while (iterator.hasNext()) {
//            int num = iterator.next();
//            number += String.valueOf(num) +" ";
//        }
//        System.out.print(number);

        Set <Integer> lotto = new HashSet<>();
        int count = 0;

        while(count < 7) {
            int rnd = ((int) Math.random() *45)+1;

            if(lotto.add(rnd)){
                count ++;

                if(lotto.size() == 7){
                    break;
                }
            }
        }

        Iterator<Integer> iter = lotto.iterator();
        String number = "";
        while(iter.hasNext()){
            int num = iter.next();
            number += String.valueOf(num) + "";
        }
        System.out.println(number);

        System.out.println("\n\n");

        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));  // new 키워드로 객체 저장 -> 주소값이 다름

        System.out.println("총 객체 수 : " + set.size());  // 2개
    }
}
