package 백준;

import java.util.ArrayList;
import java.util.List;

public class SelfNumber {
    public static void main(String[] args) {
        int num = 1;
        int tmp = 0;
        int cnt = 1;
        List<Integer> list = new ArrayList<>();
        while (true) {
            tmp = selfNumber(num);
            if (tmp > 10000) {
                break;
            } else {
                list.add(tmp);
                num++;
            }
        }

        for (int i = 0; i < 9993; i++, cnt++) {
            if (list.contains(cnt)) {
                continue;
            } else {
                System.out.println(cnt);
            }
        }

    }

    static int selfNumber(int num) {
        int tmp = 0;
        String st = Integer.toString(num);
        String[] one = st.split("");
        tmp += num;
        for (int i = 0; i < one.length; i++) {
            tmp += Integer.parseInt(one[i]);
        }
        return tmp;
    }
}
