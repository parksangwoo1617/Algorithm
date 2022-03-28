import java.util.Scanner;

public class CountOfNumber {
    public static void main(String[] args) {
        int num1, num2, num3;
        int result, array[], count, tmp, tmp2;
        int num[] = new int[10];

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        result = num1 * num2 * num3;
        tmp = result;
        for(int i = 0;; i++) {
            tmp /= 10;
            if( tmp <= 10) {
                count = i + 2;
                break;
            } else {
                continue;
            }
        }

        array = new int[count];
        tmp2 = result;

        int spec;
        for(int j = 0; j < count; j++) {
            spec = tmp2 % 10;
            array[j] = spec;
            tmp2 /= 10;
        }


        for(int k = 0; k < count; k++) {
            switch (array[k]) {
                case 1: num[1] += 1;
                    break;
                case 2: num[2] += 1;
                    break;
                case 3: num[3] += 1;
                    break;
                case 4: num[4] += 1;
                    break;
                case 5: num[5] += 1;
                    break;
                case 6: num[6] += 1;
                    break;
                case 7: num[7] += 1;
                    break;
                case 8: num[8] += 1;
                    break;
                case 9: num[9] += 1;
                    break;
                default: num[0] += 1;
                    break;
            }
        }
        for(int cnt : num) {
            System.out.println(cnt);
        }
    }
}
