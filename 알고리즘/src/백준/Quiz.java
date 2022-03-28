package 백준;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String quiz;
        int[] score;
        int tmp;
        int num;

        int tc = sc.nextInt();
        score = new int[tc];

        for(int i = 0; i < tc; i++) {
            quiz = sc.next();
            String array[] = quiz.split("");
            tmp = 0;
            num = 1;
            for(int j = 0; j < array.length; j++) {
                if(array[j].equals("O")) {
                    tmp += num;
                    ++num;
                } else if(array[j].equals("X")) {
                    num = 1;
                }
            }
            score[i] = tmp;
        }

        for(int s : score) {
            System.out.println(s);
        }
    }
}
