package org.example.a_string;

import java.util.Scanner;

/**
 * 2. 대소문자 변환
 * 설명
 *      대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 *
 * 입력
 *      첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 *      문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 *      첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 *
 * StuDY => sTUdy
 *
 * 참고
 *      A-Z 65~90
 *      a-z 97~122
 */
public class Ex02ConvertUpperLowerCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Ex02ConvertUpperLowerCase main = new Ex02ConvertUpperLowerCase();
        String result = main.solution(input);
        System.out.println(result);
        return ;
    }

    private String solution(String input) {
        String result = "";
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) result += Character.toUpperCase(c);
            if (Character.isUpperCase(c)) result += Character.toLowerCase(c);
        }
        return result;
    }
}