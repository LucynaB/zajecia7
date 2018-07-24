package zad7_1;

import zad7_1.CalendarConverter;

public class ConverterTest {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            System.out.println(i+" dzień tygodnia to "+ CalendarConverter.convertDayToString(i));

        }
    }
}
