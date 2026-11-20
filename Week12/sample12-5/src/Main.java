//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    class Book {
        String title;
        String author;
        int pages;
        float price;
    }

    Book[] books = new Book[2];
    books[0] = new Book();
    books[0].title = "어서와 JAVA는 처음이지";
    books[0].author = "천인국";
    books[0].pages = 230;
    books[0].price = 28000.0f;

    Book[1] = new Book();
    books[1].title = "쉽게 배우는 자료 구조";
    books[1].author = "윤병로";
    books[1].pages = 330;
    books[1].price = 32000.0f;

    for (int i = 0; i < title.length; 1++) {
        System.out.printf("%s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f원\n\n",
                books[i].title, books[i].author, books[i].pages, books[i].price);
    }
