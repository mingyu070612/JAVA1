//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    String title1 = "어서와 JAVA는 처음이지";
    String author1 = "천인국";
    int pages1 = 230;
    float price1 = 28000.0f;

    String title2 = "쉽게 배우는 자료 구조";
    String author2 = "윤병로";
    int pages2= 330;
    float price2 = 32000.0f;

    System.out.printf("%s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f원\n",
            title1, author1, pages1, price1);
    System.out.printf("%s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f원\n",
            title2, author2, pages2, price2);
}