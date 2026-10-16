void main() {
    Scanner keyboard = new Scanner(System.in);
    int apple;
    int pear;
    int payment;
    final int APPLE = 500;
    final int PEAR = 600;
    int price;
    boolean flag;
    String result;

    System.out.printf("구입한 사과 개수 : ");
    apple = keyboard.nextInt();
    System.out.printf("구입한 배의 개수 : ");
    pear = keyboard.nextInt();
    System.out.printf("지불한 금액 : ");
    payment = keyboard.nextInt();

    price = apple * APPLE + pear * PEAR;
    flag = payment >= price;
    result = flag == true ? String.format("물품 가격 : %,d 원\n지불 금액 : %,d 원\n반환 금액 : %,d 원\n",
            price, payment, payment - price) : "금액이 부족 합니다.";
    System.out.println(result);
}

