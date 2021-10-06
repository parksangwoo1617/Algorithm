import java.util.Scanner;

public class NumberBackwards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[2];
        int[] comparison = new int[2];

        for (int i = 0; i < 2; i++) {
            num[i] = sc.nextInt();
        }

        for (int j = 0; j < 2; j++) {
            int tmp = num[j] % 10;
            comparison[j] = (tmp * 100) + (num[j] % 100 - tmp) + (num[j] / 100);
        }

        int result = Math.max(comparison[0], comparison[1]);

        System.out.println(result);
    }
}
