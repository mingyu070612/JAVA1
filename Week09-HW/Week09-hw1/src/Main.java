void main() {
    Scanner keyboard = new Scanner(System.in);
    final int COUNT = 10;     // 공이 멈출 때까지 떨어지는 횟수
    int x;
    double height, total = 0;

    System.out.print("초기 높이 X(m)를 입력하세요: ");
    x = keyboard.nextInt();
    height = x;

    for (int i = 1; i <= COUNT; i++) {
        System.out.printf("공의 %2d번째 낙하 높이: %.4f m\n", i, height);
        if (i == 1)
            total += height;
        else
            total += height * 2;
        height = height * 2 / 3;
    }
    System.out.printf("총 이동 거리: %.4f m\n", total);
}