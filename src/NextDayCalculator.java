public class NextDayCalculator {

    public static final String HYPHEN = "-";
    public static final int FIRST_MONTH_OF_YEAR = 1;
    public static  int LAST_DAY_OF_MONTH = 31;
    public static final int FIRST_DAY_OF_MONTH = 1;
    public static final int LAST_MONTH_OF_YEAR = 12;

    public static String nextDayCalculator(int day, int month, int year){
        getDayOfMonth(month, year);
        boolean isLastDayOfMonth = day == LAST_DAY_OF_MONTH;

        if (isLastDayOfMonth){
            day = FIRST_DAY_OF_MONTH;

            boolean isLastMonthOfYear = month == LAST_MONTH_OF_YEAR;

            if (isLastMonthOfYear){
               month = FIRST_MONTH_OF_YEAR;
               year++;
           } else
               month++;
        } else day++;

        return day + HYPHEN + month + HYPHEN + year;
    }

    private static void getDayOfMonth(int month, int year) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                LAST_DAY_OF_MONTH = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                LAST_DAY_OF_MONTH = 30;
                break;
            case 2:
                isLeafYear(year);
        }
    }

    private static void isLeafYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            LAST_DAY_OF_MONTH = 29;
        } else
            LAST_DAY_OF_MONTH = 28;
    }
}
