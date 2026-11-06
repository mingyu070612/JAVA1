void main() {
    final int START = 1;
    final int END = 100;
    int total = 0;


    for (int i = START; true; i++) {
        if (i % 3 == 0 && i % 5 != 0)
            continue;
        total += i;
        if (i == END)
            break;
        /* continue */ } /* break */
    System.out.printf("%d + %d + .... + %d + %d = %,d\n", START, START + 1, END - 1, END, total);
}