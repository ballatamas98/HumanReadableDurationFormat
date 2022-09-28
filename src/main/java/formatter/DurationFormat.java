package formatter;

public class DurationFormat {
    private static final int YEAR_IN_SECONDS = 31_556_000;
    private static final int DAY_IN_SECONDS = 86_400;
    private static final int HOUR_IN_SECONDS = 3600;
    private static final int MINUTE_IN_SECONDS = 60;

    private int year;
    private int day;
    private int hour;
    private int minute;
    private int second;

    public DurationFormat(int seconds) {
        int remainingSeconds = seconds;
        this.year = remainingSeconds / YEAR_IN_SECONDS;
        remainingSeconds -= this.year * YEAR_IN_SECONDS;
        this.day = remainingSeconds / DAY_IN_SECONDS;
        remainingSeconds -= this.day * DAY_IN_SECONDS;
        this.hour = remainingSeconds / HOUR_IN_SECONDS;
        remainingSeconds -= this.hour * HOUR_IN_SECONDS;
        this.minute = remainingSeconds / MINUTE_IN_SECONDS;
        remainingSeconds -= this.minute * MINUTE_IN_SECONDS;
        this.second = remainingSeconds;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

}
