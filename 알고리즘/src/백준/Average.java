package 백준;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int exam;
        double[] score;
        double max = 0;
        double average;
        double sum = 0;

        Scanner sc = new Scanner(System.in);
        exam = sc.nextInt();
        score = new double[exam];

        for(int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }
        max = score[0];
        for(int j = 0; j < score.length - 1; j++) {
            if(max < score[j + 1]) {
                max = score[j + 1];
            }
        }

        for(int k = 0; k < score.length; k++) {
            score[k] = score[k] / max * 100;
        }

        for(int x = 0; x < score.length; x++) {
            sum += score[x];
        }
        average = (double) (sum / score.length);
        System.out.println(average);
    }
}
