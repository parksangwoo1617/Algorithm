import java.util.Scanner;
import java.util.stream.IntStream;

public class HoneyComb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int tmp = 1;
        boolean check = true;
        if(n == 1) {
            System.out.println(tmp);
            check = false;
        }
        int[] array = {2, 3, 4, 5, 6, 7};
        tmp++;
        while(check) {
            if(IntStream.of(array).anyMatch(x -> x == n)) {
                System.out.println(tmp);
                check = false;
            } else {
                for(int i = 0; i < 6; i++) {
                    array[i] += 6;
                }
            }
            ++tmp;
        }
    }
}
