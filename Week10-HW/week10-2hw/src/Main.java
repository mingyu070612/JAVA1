//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String[] name = new String[10];
    double[] weight = new double[10];
    double sum = 0;
    int above = 0;

    for (int i = 0; i < 10; i++) {
        System.out.print((i + 1) + "번째 학생 이름: ");
        name[i] = keyboard.next();
        do {
            System.out.print("몸무게(30.0~120.0kg): ");
            weight[i] = keyboard.nextDouble();
        } while (weight[i] < 30.0 || weight[i] > 120.0);
        sum += weight[i];
    }

    double average = sum / 10.0;
    for (int i = 0; i < 10; i++) {
        if (weight[i] >= average) above++;
    }
    double rate = above / 10.0 * 100;

    // 몸무게를 기준으로 이름과 몸무게를 함께 오름차순 정렬
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9 - i; j++) {
            if (weight[j] > weight[j + 1]) {
                double tempWeight = weight[j];
                weight[j] = weight[j + 1];
                weight[j + 1] = tempWeight;

                String tempName = name[j];
                name[j] = name[j + 1];
                name[j + 1] = tempName;
            }
        }
    }

    System.out.printf("평균 몸무게: %.1fkg%n", average);
    System.out.printf("평균 이상자 비율: %.1f%%%n", rate);
    System.out.println("하위 2명:");
    for (int i = 0; i < 2; i++)
        System.out.printf("%s : %.1fkg%n", name[i], weight[i]);
    System.out.println("상위 2명:");
    for (int i = 8; i < 10; i++)
        System.out.printf("%s : %.1fkg%n", name[i], weight[i]);

}