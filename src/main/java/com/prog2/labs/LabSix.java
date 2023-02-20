package com.prog2.labs;

import java.util.ArrayList;
import java.util.Scanner;

public class LabSix {

    public static void main(String[] args) {
        // test cases
        //String input = "5\n5 41 77 74 22 44\n1 12\n4 37 34 36 52\n0\n3 20 22 33\n5\n1 3\n3 4\n3 1\n4 3\n5 5";
        //System.out.println(arrayListProblem(input)); // expected output: "74\n52\n37\nERROR!\nERROR!"
    }

    public static String arrayListProblem(String input) {
        Scanner scanner = new Scanner(input);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> array = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>(d);
            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }
            array.add(line);
        }
        int q = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            try {
                sb.append(array.get(x).get(y)).append("\n");
            } catch (Exception e) {
                sb.append("ERROR!\n");
            }
        }
        scanner.close();
        return sb.toString().trim();
    }
}

