package 백준;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        int goal = sc.nextInt();
        int cnt = 0;
        int[] values = new int[type];
        for (int i = 0; i < type; i++) {
            values[i] = sc.nextInt();
        }
        for (int j = type - 1; j >= 0; j--) {
            while(goal != 0) {
                if (values[j] > goal) {
                    break;
                }
                goal -= values[j];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
