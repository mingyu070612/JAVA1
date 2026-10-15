//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final float MOON = 0.165f;
        float weight, moon;

        System.out.print("당신의 몸무게는 얼마입니까 ?(Kg) : ");
        weight = keyboard.nextFloat();

        moon = weight * MOON;

        System.out.printf("달에서의 몸무게는 %.2f Kg입니다.\n", moon);
    }
}
