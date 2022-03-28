package 백준;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CMD {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        String[] fileName = new String[num];
        String[] test = new String[num];
        int start = 0;
        int end = 1;
        int tmp = 0;
        List<String> search = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            fileName[i] = sc.next();
        }

        while (true) {
            tmp++;
            for (int k = 0; k < num; k++) {
                test[k] = fileName[k].substring(start, end);
            }

            for (int z = 0; z < num; z++) {
                if (z + 1 == num) {
                    search.add(test[z]);
                    start++;
                    end++;
                    break;
                } else if (!test[z].equals(test[z + 1])){
                    search.add("?");
                    start++;
                    end++;
                    break;
                } else {
                    continue;
                }
            }
            if (tmp == fileName[0].length()) {
                break;
            }
        }

        search.forEach(System.out::print);
    }
}
