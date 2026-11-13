void main() {
    final int TOTAL = 37;
    final int LEGS = 102;
    int chicken = 0;

    while (chicken <= TOTAL) {
        int dog = TOTAL - chicken;
        if (chicken * 2 + dog * 4 == LEGS)
            System.out.printf("닭 : %d마리, 개 : %d마리\n", chicken, dog);
        chicken++;
    }
}
