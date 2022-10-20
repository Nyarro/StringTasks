import java.util.Scanner;

public class DateTwoTask {  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите день");
    int day = in.nextInt();
    System.out.println("Введите месяц");
    String monthsInput = in.next();
    System.out.println("Введите год");
    int year = in.nextInt();
    String[] months = new String[]{"январь", "март", "май", "июль", "август", "октябрь", "декабрь", "апрель", "июнь", "сентябрь", "ноябрь", "февраль"};
    String[] monthsId = new String[]{"01", "03", "05", "07", "08", "10", "12", "04", "06", "09", "11", "02"};
    for (int i = 0; i <= 6; i++) {
        if (monthsId[i].equalsIgnoreCase(monthsInput) && day <= 31) {
            System.out.println(day + "." + months[i] + "." + year);
        }
    }
    for (int y = 7; y <= 10; y++) {
        if (monthsId[y].equalsIgnoreCase(monthsInput) && day <= 30) {
            System.out.println(day + "." + months[y] + "." + year);
        }
    }
    if (monthsId[11].equalsIgnoreCase(monthsInput) && day <= 29) {
        System.out.println(day + "." +months[11] + "." + year);
    }


}
}
