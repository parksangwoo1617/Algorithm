import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] std = new int[c];
        int[] score;
        int[][] storage = new int[1000][1000];
        int sum;
        int tmp;
        double average;
        double ratio;

        for(int i = 0; i < c; i++) {
            std[i] = sc.nextInt();
            score = new int[std[i]];
            for(int j = 0; j < std[i]; j++) {
                score[j] = sc.nextInt();
                storage[i][j] = score[j];
            }
        }
        for(int k = 0; k < c; k++) {
            sum = 0;
            for(int x = 0; x < std[k]; x++) {
                sum += storage[k][x];
            }
            average = (double)sum / (double)std[k];
            tmp = 0;
            for(int z = 0; z < std[k]; z++) {
                if(storage[k][z] > average) {
                    ++tmp;
                }
            }
            ratio = (double)tmp / (double)std[k] * 100;
            System.out.println(String.format("%.3f", ratio) + "%");
        }
    }
}
