import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String number = sc.next();
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 1;
        int sum = 0;

        for (int i = 0; i < num; i++) {
            list.add(Integer.parseInt(number.substring(start, end)));
            start++;
            end++;
        }

        sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
