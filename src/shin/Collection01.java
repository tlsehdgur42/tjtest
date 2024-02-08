package shin;

import java.sql.Array;
import java.util.*;

public class Collection01 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 10; i >= 1; i--) {
            num.add(i);
        }
        System.out.println(num);

        System.out.print("정렬 전 : ");
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + "");
        }
        num.sort(Comparator.naturalOrder());

        System.out.println();
        System.out.print("정렬 후 : ");
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + "");
        }

        num.sort(Comparator.reverseOrder());
        System.out.println(num);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("두 번째");
        linkedList.addFirst("첫 번째");
        linkedList.addLast("세 번째");
        System.out.println(linkedList);

        Vector<Integer> objects = new Vector<>();


        HashSet<Object> str = new HashSet<>();
        str.add("A");
        str.add("B");
        str.add("C");
        System.out.println(str);

    }
}
