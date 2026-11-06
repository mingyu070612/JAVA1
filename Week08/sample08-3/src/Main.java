
void main() {
    Scanner keyboard = new Scanner(System.in);
    double time;
    int totalSec, days, hours, mins, secs;

    System.out.print("시간 입력 : ");
    time = keyboard.nextDouble();

    totalSec = (int) (time * 3600);

    days = totalSec / (24 * 3600);
    hours = (totalSec % (24 * 3600)) / 3600;
    mins = (totalSec % 3600) / 60;
    secs = totalSec % 60;

    System.out.printf("%.2f 시간은 %d 일 %d 시간 %d 분 %d 초 입니다\n", time, days, hours, mins, secs);
}