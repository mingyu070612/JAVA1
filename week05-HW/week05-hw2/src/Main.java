void main() {
    Scanner keyboard = new Scanner(System.in);
    int score, tens;
    char letter;
    String sign, grade;

    System.out.print("당신의 JAVA 점수 입력 : ");
    score = keyboard.nextInt();

    tens = score == 100 ? 9 : score / 10;
    letter = (char) ('A' + (9 - tens));
    sign = (score == 100 || score % 10 >= 5) ? "+" : "0";
    grade = score < 60 ? "F" : letter + sign;

    System.out.println("입력 점수 : " + score);
    System.out.println("학점 : " + grade);
}