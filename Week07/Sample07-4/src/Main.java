void main() {
    Scanner keyboard = new Scanner(System.in);
    int salary;
    int tax;
    String result;
    final int MIN = 2000000;
    final int MAX = 30000000;

    System.out.print("당신의 급여 입력 : ");
    salary = keyboard.nextInt();

    if (salary >= 0 && salary <= MAX) {
        if (salary <= MIN) {
            tax = 0;
        } else if (salary <= 4000000) {
            tax = (int) ((salary - MIN) * (10.0f / 100));
        } else if (salary <= 6000000) {
            tax = (int) ((salary - MIN) * (8.0f / 100));
        } else if (salary <= 20000000) {
            tax = (int) ((salary - MIN) * (6.0f / 100));
        } else {
            tax = (int) ((salary - MIN) * (5.0f / 100));
        }
        result = String.format("급여액이 %,d 원이면 %,d원의 세금을 납부하세요.", salary, tax);
    } else {
        result = String.format("ERROR : 급여액은 0 ~ %,d 임", MAX);
    }

    System.out.println(result);
}