void main() {
    int test;               // 단순 변수 : 선언 + 정의 + 초기화(X)

    int[] sample;           // 배열 선언
    sample = new int[5];    // 배열 정의 0으로 초기화

    int[] score = new int[5];     // 선언 + 정의 0으로 초기화
    score[0] = 100;         // 초기화
    score[1] = 120;
    score[2] = 300;
    score[3] = 400;
    score[4] = 700;
    score[5] = 400;

    int[] grade = new int[] {100, 120, 300, 400, 700};   // 초기화 방법

    int[] grade1 = {100, 120, 300, 400, 700};     // 초기화 방법 (권장)
    // int grade[] = new int[5];                  // C언어 표현 (다른 언어)
}
