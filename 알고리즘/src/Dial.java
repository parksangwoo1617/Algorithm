import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ring = sc.nextLine();
        boolean check = false;
        char[][] ch = null;
        int time = 0;
        int start = 0;
        int end = 1;
        char alphabet = 65;
        ch = new char[8][];
        for (int i = 0; i < 8; i++) {
            if (String.valueOf(alphabet).equals("W") || String.valueOf(alphabet).equals("P")) {
                ch[i] = new char[4];
                for (int j = 0; j < 4; j++) {
                    ch[i][j] = alphabet;
                    alphabet++;
                }
            } else {
                ch[i] = new char[3];
                for (int j = 0; j < 3; j++) {
                    ch[i][j] = alphabet;
                    alphabet++;
                }
            }
        }

        for (int k = 0; k < ring.length(); k++) {
            check = false;
            for (int z = 0; z < 8; z++) {
                if (ch[z].length == 3) {
                    for (int y = 0; y < 3; y++) {
                        if (String.valueOf(ch[z][y]).equals(ring.substring(start, end))) {
                            time += z + 3;
                            start++;
                            end++;
                            check = true;
                        }
                        if (check == true) {
                            break;
                        }
                    }
                    if (check == true) {
                        break;
                    }
                } else {
                    for (int a = 0; a < 4; a++) {
                        if (String.valueOf(ch[z][a]).equals(ring.substring(start, end))) {
                            time += z + 3;
                            start++;
                            end++;
                            check = true;
                        }
                        if (check == true) {
                            break;
                        }
                    }
                    if (check == true) {
                        break;
                    }
                }
            }
        }
        System.out.println(time);
    }
}
