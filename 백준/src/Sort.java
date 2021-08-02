import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        int tmp = 0;

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for(int j = 0; j < n; j++) {
            for(int k = 0; k < n - 1; k++) {
                if(array[k] > array[k + 1]) {
                   tmp = array[k];
                   array[k] = array[k + 1];
                   array[k + 1] = tmp;
                }
            }
        }
        for(int l : array) {
            System.out.println(l);
        }
    }
}
