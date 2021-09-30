import java.util.*;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        List<String> list = new ArrayList<>();
        Map<String, Integer> result = new HashMap<String, Integer>();
        int start = 0;
        int end = 1;
        int max = 0;
        String ch = new String("string");
        String name = new String("string2");
        boolean tmp = false;

        for (int i = 0; i < word.length(); i++) {
            String each = word.substring(start, end).toUpperCase();
            if (result.containsKey(each)) {
                result.put(each.toUpperCase(), result.get(each) + 1);
            } else {
                result.put(each.toUpperCase(), 1);
            }
            start++;
            end++;
        }

        start = 0;
        end = 1;
        for (int j = 0; j < word.length(); j++) {
            name = word.substring(start, end).toUpperCase();
            int num = result.get(name);
            if (list.contains(name)) {
                start++;
                end++;
                continue;
            } else {
                list.add(name);
            }
            if (num > max) {
                max = num;
                ch = name;
                tmp = false;
                start++;
                end++;
            } else if (num == max) {
                tmp = true;
                start++;
                end++;
            } else {
                start++;
                end++;
            }
        }

        if (tmp) {
            System.out.println("?");
        } else {
            System.out.println(ch);
        }
    }
}
