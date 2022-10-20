import java.sql.SQLOutput;
import java.util.Scanner;

public class DateFirstTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день");
       int day = in.nextInt();
        System.out.println("Введите месяц");
        String monthsInput = in.next();
        System.out.println("Введите год");
       int year = in.nextInt();

        // String[] months = new String[]{"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        // String[] monthsId = new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String[] months = new String[]{"январь", "март", "май", "июль", "август", "октябрь", "декабрь", "апрель", "июнь", "сентябрь", "ноябрь", "февраль"};
        String[] monthsId = new String[]{"01", "03", "05", "07", "08", "10", "12", "04", "06", "09", "11", "02"};
        //for (int i = 0; i < months.length; i++) {
        for (int i = 0; i <= 6; i++) {
            if (months[i].equalsIgnoreCase(monthsInput) && day <= 31) {
                System.out.println(day + "." + monthsId[i] + "." + year);
            }
        }
        for (int y = 7; y <= 10; y++) {
            if (months[y].equalsIgnoreCase(monthsInput) && day <= 30) {
                System.out.println(day + "." + monthsId[y] + "." + year);
            }
        }
            if (months[11].equalsIgnoreCase(monthsInput) && day <= 29) {
                System.out.println(day + "." +monthsId[11] + "." + year);
            }

        }
    }