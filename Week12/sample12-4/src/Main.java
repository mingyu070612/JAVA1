//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    class Book {
        String title;
        String author;
        String[] book = new String[2];
        int pages;
        float price;
    }
    Book book1 = new Book();
    book1.title = "어서와 JAVA는 처음이지";
    book1.author = "천인국";
    book1.pages = 230;
    book1.price = 28000.0f;

    Book book2 = new Book();
    book2.title = "쉽게 배우는 자료 구조";
    book2.author = "윤병로";
    book2.pages = 330;
    book2.price = 32000.0f;

    System.out.printf("%s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f원\n",
            book1.title, book1.author, book1.pages, book1.price);
    System.out.printf("%s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f원\n",
            book2.title, book2.author, book2.pages, book2.price);
}
