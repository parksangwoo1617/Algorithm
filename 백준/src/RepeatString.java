import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt();
        int[] repeat = new int[tmp];
        String[] str = new String[tmp];
        String[] result = new String[tmp];
        int start;
        int end;

        for (int y = 0; y < tmp; y++) {
            result[y] = "";
        }

        for (int i = 0; i < tmp; i++) {
            repeat[i] = sc.nextInt();
            str[i] = sc.next();
        }

        for (int j = 0; j < tmp; j++) {
            start = 0;
            end = 1;
            for (int k = 0; k < str[j].length(); k++) {
                for (int z = 0; z < repeat[j]; z++) {
                    result[j] += str[j].substring(start, end);
                }
                start++;
                end++;
            }
        }

        for (String s : result) {
            System.out.println(s);
        }
    }
}
