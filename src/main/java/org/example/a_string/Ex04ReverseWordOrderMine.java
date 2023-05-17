package org.example.a_string;

import java.util.Scanner;

/**
 * 4. 단어 뒤집기
 * 설명
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 */
public class Ex04ReverseWordOrderMine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String input = in.nextLine();
            Ex04ReverseWordOrderMine main = new Ex04ReverseWordOrderMine();
            String result = main.solution(input);
            if (result != null) {
                System.out.println(result);
            }
        }
        return ;
    }

    private String solution(String input) {
        char[] chars = input.toCharArray();
        boolean isChar = input.matches("([A-Za-z])\\w+");
        if (!isChar) {
            int parseIntInput = Integer.parseInt(input);
            if (parseIntInput >= 3 && parseIntInput <= 20) {
                return null;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            result.append(chars[i]);
        }
        return result.toString();
    }
}
