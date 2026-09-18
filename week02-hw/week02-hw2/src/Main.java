//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);

    int radius;
    double boxArea;
    double circleArea;
    double area;

    System.out.println("원의 반지름을 입력하시오");

    radius = keyboard.nextInt();

    boxArea = (radius * 2) * (radius * 2);
    circleArea = radius * radius * 3.141592;
    area = boxArea - circleArea;

    System.out.printf("원의 반지름 : %d\n", radius);
    System.out.printf("정사각형 면적 : %.0f Cm2\n", boxArea);
    System.out.printf("원의 면적 : %.2f Cm2\n", circleArea);
    System.out.printf("구하는 면적 : %.2f Cm2\n", area);
}
