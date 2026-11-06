void main() {
    final int MONEY = 100000000;
    final int MONTH = 2000000;
    int life = MONEY;
    int month = 1;

    while (true) {
        life -= 2000000;
        if (month % 12 == 0) {
            life = (int) (life + (life * (5 / 100.0f)));
        }
        if (life < MONTH)
            break;
        System.out.printf("%2d개월 후 원금 : %,11d원\n", month++, life);
    }

    System.out.printf("%2d 개월까지 살고 나면 잔고는 %,d원 남아요.\n", month, life);
}