package start;

import calc.*;

import java.util.*;

public class start {
    public static void main(String[] args) {
        System.out.println("start");
        calc C = new calc();
        System.out.println(calc.add(1, 2));
        str s = new str();
        System.out.println(s.retstr("2ww"));
        int[] aaa = {2, 3, 1, 4};
        for (int a : aaa) {
            System.out.println(a);
        }
        Arrays.sort(aaa);
        for (int a : aaa) {
            System.out.println(a);
        }
        Set set = new HashSet();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add(123);
        set.add(222.11);
        set.add(123);
        set.add("aaa");
        System.out.println(set);

        List arrayList = Arrays.asList(aaa);
        for (int a : aaa) {
            System.out.println(a);
        }
        System.out.println(arrayList.size());
    }
}

