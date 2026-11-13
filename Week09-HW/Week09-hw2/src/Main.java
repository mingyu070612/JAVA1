void main() {
    final int TOTAL = 37;
    final int LEGS = 102;

    for (int chicken = 0; chicken <= TOTAL; chicken++) {
        int dog = TOTAL - chicken;
        if (chicken * 2 + dog * 4 == LEGS)
            System.out.printf("닭 : %d마리, 개 : %d마리\n", chicken, dog);
    }
}
