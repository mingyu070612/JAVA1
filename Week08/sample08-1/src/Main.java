void main() {
    Scanner keyboard = new Scanner(System.in);
    int age;
    String fee;

    System.out.print("나이 입력: ");
    age = keyboard.nextInt();

    fee = age >= 18 ? "4,000원" :
            (age >= 13 ? "3,000원" :
                    (age >= 7 ? "1,000원" : "무료"));

    System.out.printf("요금 : %s\n", fee);
}