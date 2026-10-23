void main() {
    Scanner keyboard = new Scanner(System.in);
    int price;
    char member;
    String result;

    System.out.print("구매 금액 입력 : ");
    price = keyboard.nextInt();
    System.out.print("멤버십 회원이면 Y, 아니면 N 입력 : ");
    member = keyboard.next().charAt(0);

    result = price < 0 ? "오류 : 구매 금액은 음수일 수 없습니다" :
            ((price >= 50000) || ((member == 'Y') && (price >= 30000))) ?
                    "무료배송 적용" : "배송비 부과";

    System.out.println(result);
}
