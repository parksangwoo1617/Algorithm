import java.util.Scanner;

public class CountOfNumber {
    public static void main(String[] args) {
        int num1, num2, num3;
        int result, array[], count, tmp, tmp2;
        int num[] = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 수");
        num1 = sc.nextInt();
        System.out.println("두 번째 수");
        num2 = sc.nextInt();
        System.out.println("세 번째 수");
        num3 = sc.nextInt();

        result = num1 * num2 * num3;
        tmp = result;
        System.out.println(result);
        for(int i = 0;; i++) {
            tmp /= 10;
            if( tmp <= 10) {
                System.out.println(i);
                count = i + 2;
                break;
            } else {
                continue;
            }
        }
        System.out.println(count + "얜 카운트야");

        array = new int[count];
        tmp2 = result;

        //for(int j = 0; j < count; j++) {
        //    for(int z = 10; z <= count; z *= 10) {
        //        tmp2 %= z;
        //        array[j] = tmp2;
        //    }
        //}
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
                    System.out.println(array[k] + "앤 디폴트");
                    break;
            }
        }
        for(int cnt : num) {
            System.out.println(cnt);
        }
    }
}
