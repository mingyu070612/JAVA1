//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    double[] score = new double[7];
    double sum = 0;
    double max = 60.0;
    double min = 100.0;

    for (int i = 0; i < score.length; i++) {
        System.out.print((i + 1) + "번째 심사위원 점수: ");
        score[i] = keyboard.nextDouble();

        sum += score[i];
        if (score[i] > max) max = score[i];
        if (score[i] < min) min = score[i];
    }
    double result = (sum - max - min) / 5.0;

    System.out.printf("최고 점수: %.1f점%n", max);
    System.out.printf("최저 점수: %.1f점%n", min);
    System.out.printf("최종 점수: %.2f점%n", result);
    keyboard.close();

}