import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int width;    // 가로 길이
        int height;   // 세로 길이
        char type;    // 직, 정 사각형
        int area;     // 면적

        System.out.print("사각형의 가로 길이 입력 (예 5) : ");
        width = keyboard.nextInt();
        System.out.print("사각형의 세로 길이 입력 (예 5) : ");
        height = keyboard.nextInt();

        // 1. boolean 타입 선언 추가
        boolean flag = (width > 0 && height > 0);

        type = (width == height) ? '정' : '직';
        area = width * height;

        // 2. String.format 서식문자에 세로 길이(%d) 출력 부분 보완
        String result = flag ? String.format("**** %c사각형 넓이 *****\n\t가로 길이 : %,d Cm\n\t세로 길이 : %,d Cm\n\t넓    이 : %,d \u33a0\n", type, width, height, area) : "Data 오류 입니다";

        System.out.println(result);
    }
}
