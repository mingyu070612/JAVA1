//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double C;
        double F;

        System.out.print("섭씨 온도를 입력하세요 : ");
        C = keyboard.nextDouble();

        F = C * 9 / 5 + 32;

        System.out.println("섭씨 : " + C);
        System.out.println("화씨 : " + F);
    }
}