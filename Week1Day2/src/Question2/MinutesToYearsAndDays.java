package Question2;

public class MinutesToYearsAndDays {

    public static void convertMinutesToYearsAndDays(long minutes) {
        final int MINUTES_IN_YEAR = 365 * 24 * 60;
        final int MINUTES_IN_DAY = 24 * 60;

        int years = (int) (minutes / MINUTES_IN_YEAR);
        int days = (int) ((minutes % MINUTES_IN_YEAR) / MINUTES_IN_DAY);

        System.out.printf("%d minutes is approximately %d years and %d days%n", minutes, years, days);
    }

    public static void main(String[] args) {
        // Test
        long testcase1 = 3456789;
        convertMinutesToYearsAndDays(testcase1);
    }
}
