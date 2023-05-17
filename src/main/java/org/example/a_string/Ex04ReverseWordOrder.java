package org.example.a_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 4. 단어 뒤집기 - 문제 해석 오류
 */
public class Ex04ReverseWordOrder {

    public static void main(String[] args) {
        Ex04ReverseWordOrder main = new Ex04ReverseWordOrder();
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        String[] strings = new String[index];
        for (int i = 0; i < index; i++) {
            strings[i] = in.next();
        }
        List<String> results = main.solution(index, strings);
        for (String result : results) {
            System.out.println(result);
        }
        return ;
    }

    private List<String> solution(int index, String... strings) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            result.add(new StringBuilder(string)
                    .reverse()
                    .toString());
        }
        return result;
    }
}
