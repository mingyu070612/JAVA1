//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    final int SIZE = 12;                // ISBN 앞 12자리
    int[] isbn = new int[SIZE];         // ISBN 숫자
    int[] weight = new int[SIZE];       // 가중치 (1, 3 반복)
    int[] multi = new int[SIZE];        // 숫자 * 가중치
    String source;
    boolean flag = true;
    int count = 0;
    int sum = 0, rest, check;

    System.out.print("ISBN 앞 12자리 입력 (예 : 978-89-954321-0) : ");
    source = keyboard.nextLine();

    /**  1단계. 숫자만 배열에 저장 *****/
    for (int i = 0; i < source.length(); i++) {
        char c = source.charAt(i);
        if (c >= '0' && c <= '9') {
            if (count < SIZE)
                isbn[count] = c - '0';
            count++;
        } else if (c != '-')
            flag = false;
    }
    if (count != SIZE)
        flag = false;

    if (flag == true) {
        /********  2 ~ 3단계. 가중치 1, 3 곱하기 + 합계 *****/
        for (int i = 0; i < SIZE; i++) {
            weight[i] = (i % 2 == 0) ? 1 : 3;
            multi[i] = isbn[i] * weight[i];
            sum += multi[i];
        }

        /**********  4 ~ 5단계. 나머지, 체크 기호 ******/
        rest = sum % 10;
        check = (rest == 0) ? 0 : 10 - rest;

        /**********  출력 (6 ~ 7단계 포함) ******/
        System.out.println();
        System.out.print("숫자   : ");
        for (int i = 0; i < SIZE; i++)
            System.out.printf("%3d", isbn[i]);
        System.out.print("\n가중치 : ");
        for (int i = 0; i < SIZE; i++)
            System.out.printf("%3d", weight[i]);
        System.out.print("\n곱     : ");
        for (int i = 0; i < SIZE; i++)
            System.out.printf("%3d", multi[i]);
        System.out.println();
        System.out.printf("합계 = %d, 나머지 = %d, 체크 기호 = %d\n", sum, rest, check);
        System.out.printf("검증 : (%d + %d) %% 10 = %d → %s\n", sum, check, (sum + check) % 10,
                (sum + check) % 10 == 0 ? "유효한 ISBN" : "오류");
        System.out.println("완성된 ISBN : " + source + "-" + check);
    } else
        System.out.println("ERROR : 숫자 12자리를 입력하세요 (하이픈 가능)");
}