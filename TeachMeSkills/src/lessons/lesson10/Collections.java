package lessons.lesson10;

import java.util.*;


import static lesson7.StringUtils.*;

public class Collections<T extends Object> {


    HashSet getPalindroms(Collection<String> words) {
        HashSet<String> hashSetGetPalindroms = new HashSet<>();
        for (String s : words) {
            if (isPalindrome(s)) {
                hashSetGetPalindroms.add(s);
            }
        }
        return hashSetGetPalindroms;
    }

    ArrayList createArrayList(T... elements) {
        ArrayList<T> list = new ArrayList<>();
        for (T t : elements) {
            list.add(t);
        }
        return list;
    }

    static ArrayList randomGetArrayList(ArrayList list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size() + i; i++) {
            int random = (int) (Math.random() * (list.size()));
            arrayList.add(list.get(random));
            list.remove(random);
        }
        return arrayList;
    }

    static Character findMostFrequentChar(String s) {
        char[] array = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : array) {
            if (map.containsKey(c)) {
                int key = map.get(c);
                map.replace(c, ++key);
            } else {
                map.put(c, 1);
            }
        }
        int max = 0;
        Character character = null;
        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            if (item.getValue() > max) {
                max = item.getValue();
                character = item.getKey();
            }
        }
        return character;
    }

    static List sort(List<String> strings) {
        List<String> list = new ArrayList<>(strings);
        list.sort((o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o2.length() > o1.length()) {
                return -1;
            }
            return o1.compareTo(o2);
        });
        return list;
    }

    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList2 = new ArrayList<>();
        String st1 = "Приииииииииивет";
        String st2 = "";
        String st3 = "Tanya";
        String st4 = "Molodec";
        String st5 = "Dyrochka";
        String st11 = "Приииииииииивет";
        String st22 = "";
        String st33 = "Tanya";
        String st44 = "Molodec";
        String st55 = "Dyrochka";
        stringArrayList.add(st1);
        stringArrayList.add(st2);
        stringArrayList.add(st3);
        stringArrayList.add(st4);
        stringArrayList.add(st5);
        stringArrayList2.add(st1);
        stringArrayList2.add(st2);
        stringArrayList2.add(st3);
        stringArrayList2.add(st4);
        stringArrayList2.add(st5);
        System.out.println(findMostFrequentChar(st4));
        System.out.println(randomGetArrayList(stringArrayList2));
        System.out.println(sort(stringArrayList));
    }
}
