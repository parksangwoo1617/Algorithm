package 백준;

import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] result = str.split("");
        String[] words = str.split(" ");
        char front;
        char back;
        int tmp = 1;
        char ascii = 10;
        if (words.length == 1 || words.length == 0) {
            if (words.length == 0) {
                System.out.println("0");
                System.exit(0);
            }
            if(words[0].equals(String.valueOf(ascii))){
                System.out.println("0");
                System.exit(0);
            }
        }
        for (int i = 1; i < result.length - 1; i++) {
            front = result[i - 1].charAt(0);
            back = result[i + 1].charAt(0);
            if (result[i].equals(" ")) {
                if (front >= 'A' && front <= 'Z' || front >= 'a' && front <= 'z') {
                    if (back >= 'A' && back <= 'Z' || back >= 'a' && back <= 'z') {
                        tmp++;
                    }
                }
            }
        }
        System.out.println(tmp);
    }
}
