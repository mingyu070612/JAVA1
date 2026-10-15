import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int width, length, height;
        int vol;

        System.out.print("직육면체 가로 세로 높이 입력 : ");
        width = keyboard.nextInt();
        length = keyboard.nextInt();
        height = keyboard.nextInt();

        vol = width * length * height;

        System.out.printf("직육면체 가로 = %d Cm\n", width);
        System.out.printf("직육면체 세로 = %d Cm\n", length);
        System.out.printf("직육면체 높이 = %d Cm\n", height);
        System.out.printf("직육면체 부피 = %d Cm\n", vol);
    }
}
