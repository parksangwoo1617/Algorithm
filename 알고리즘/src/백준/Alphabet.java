package 백준;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Alphabet {
    public static void main(String[] args) {
        String[] alphabet = new String[26];
        char add = 97;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] result = str.split("");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = String.valueOf(add);
            add++;
        }

        for (int j = 0; j < alphabet.length; j++) {
            boolean bo = false;
            for (int z = 0; z < result.length; z++) {
                if (alphabet[j].equals(result[z])) {
                    System.out.print(z + " ");
                    bo = true;
                    break;
                }
            }
            if (bo == false) {
                System.out.print(-1 + " ");
            }
        }
    }
}
