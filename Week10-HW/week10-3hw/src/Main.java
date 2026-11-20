//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int[] weight = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};

    System.out.print("주민등록번호 입력: ");
    String input = keyboard.nextLine().replace("-", "");

    boolean valid = input.matches("[0-9]{13}");

    if (valid) {
        int gender = input.charAt(6) - '0';
        valid = gender >= 0 && gender <= 9;
    }

    if (valid) {
        int year = Integer.parseInt(input.substring(0, 2));
        int month = Integer.parseInt(input.substring(2, 4));
        int day = Integer.parseInt(input.substring(4, 6));
        int code = input.charAt(6) - '0';
        int century = (code == 1 || code == 2 || code == 5 || code == 6) ? 1900
                : (code == 3 || code == 4 || code == 7 || code == 8) ? 2000 : 1800;
        try {
            LocalDate.of(century + year, month, day);
        } catch (DateTimeException e) {
            valid = false;
        }
    }

    if (valid) {
        int sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += (input.charAt(i) - '0') * weight[i];
        }

        int check = 11 - (sum % 11);
        if (check >= 10) check -= 10;

        int last = input.charAt(12) - '0';
        valid = (check == last);
    }

    if (valid) {
        System.out.println("올바른 주민등록번호입니다.");
    } else {
        System.out.println("올바르지 않은 주민등록번호입니다.");
    }
}
