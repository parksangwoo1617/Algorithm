import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArithmeticSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tmp = 0;
        for (int i = 1; i <= num; i++) {
            String[] str = Integer.toString(i).split("");

            List<Integer> comparison = new ArrayList<>();
            if (str.length <= 2) {
                tmp++;
                continue;
            }
            for (int k = 0; k < str.length - 1; k++) {
                comparison.add(Integer.parseInt(str[k]) - Integer.parseInt(str[k + 1]));
            }
            if (comparison.stream().allMatch(a -> a.equals(comparison.get(0)))) {
                tmp++;
                continue;
            }

        }
        System.out.println(tmp);
    }
}
