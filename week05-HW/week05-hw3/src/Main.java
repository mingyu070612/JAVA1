void main() {
    int total = 54321;
    int hour, min, sec, rest;

    hour = total / 3600;
    rest = total % 3600;
    min = rest / 60;
    sec = rest % 60;

    System.out.printf("%d 초 = %d 시간 %d 분 %d 초\n", total, hour, min, sec);
}
