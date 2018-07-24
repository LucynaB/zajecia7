package zad7_1;

public class CalendarConverter {

    private final static int MONDAY = 1;
    private final static int TUESDAY = 2;
    private final static int WEDNESDAY = 3;
    private final static int THURSDAY = 4;
    private final static int FRIDAY = 5;
    private final static int SATURDAY = 6;
    private final static int SUNDAY = 7;

    public static String convertDayToString(int dayNumber) {
        String dayString = "";
        switch (dayNumber) {
            case MONDAY:
                dayString = "poniedziałek";
                break;
            case TUESDAY:
                dayString = "wtorek";
                break;
            case WEDNESDAY:
                dayString = "środa";
                break;
            case THURSDAY:
                dayString = "czwartek";
                break;
            case FRIDAY:
                dayString = "piątek";
                break;
            case SATURDAY:
                dayString = "sobota";
                break;
            case SUNDAY:
                dayString = "niedziela";
                break;
        }
        return dayString;
    }

}
