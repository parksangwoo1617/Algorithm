package 백준;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] result = new int[10];
        ArrayList<Integer> compare = new ArrayList<>();
        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }

        for (int j = 0; j < 10; j++) {
            result[j] = array[j] % 42;
        }

        for (int z = 0; z < 10; z++) {
            if(z == 0) {
                cnt++;
                compare.add(result[z]);
            }
            for (int y = 0; y < compare.size(); y++) {
                if(result[z] == compare.get(y)) {
                    break;
                } else if(compare.get(y) == compare.get(compare.size() - 1) && result[z] != compare.get(y)) {
                    cnt++;
                    compare.add(result[z]);
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
