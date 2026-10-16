void main() {
    Scanner keyboard = new Scanner(System.in);
    int age;
    boolean flag;
    int fee;
    String result;

    System.out.printf("나이 입력 : ");
    age = keyboard.nextInt();

    flag = (age >= 0 && age <= 120) ? true : false;
    fee = (age <= 7 || age >= 65) ? 0 :
            ((age >= 8 && age <= 13) ? 3000 :
                    (age >= 14 && age <=19) ? 4000 : 5000);
    result = flag == true ? String.format("나이 : %d 세, 요금 = %,d 원", age, fee) : "나이 오류입니다.";

    System.out.println(result);
}
