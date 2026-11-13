void main() {
    final int WELL = 300;
    final int UP = 55;
    final int DOWN = 13;
    final int WEEK = 7;
    int height = 0;
    int day = 1;

    for (; true; day++) {
        height += UP;
        System.out.printf("%2d일째 낮 : %3d cm\n", day, height);
        if (height >= WELL)
            break;
        height -= DOWN;       
        System.out.printf("%2d일째 밤 : %3d cm\n", day, height);
    }

    if (day <= WEEK)
        System.out.printf("%d일째 낮에 우물을 탈출합니다. (일주일 안에 가능)\n", day);
    else
        System.out.printf("%d일이 걸립니다. (일주일 안에 불가능)\n", day);
}