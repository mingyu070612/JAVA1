void main() {
    int cost = 1015000;
    double profitRate = 0.30;
    double taxRate = 0.10;

    int price = (int) (cost * (1 + profitRate));
    int salesTax = (int) (price * taxRate);
    int purchaseTax = (int) (cost * taxRate);
    int taxToPay = salesTax - purchaseTax;

    System.out.println("매입원가 : " + cost + "원");
    System.out.println("정가(매출액) : " + price + "원");
    System.out.println("매출 세액 : " + salesTax + "원");
    System.out.println("매입 세액 : " + purchaseTax + "원");
    System.out.println("납부 세액 : " + taxToPay + "원");
}