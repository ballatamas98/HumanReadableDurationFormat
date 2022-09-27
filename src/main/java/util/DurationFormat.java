package util;

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
        this.year = seconds / YEAR_IN_SECONDS;
        seconds -= this.year * YEAR_IN_SECONDS;
        this.day = seconds / DAY_IN_SECONDS;
        seconds -= this.day * DAY_IN_SECONDS;
        this.hour = seconds / HOUR_IN_SECONDS;
        seconds -= this.hour * HOUR_IN_SECONDS;
        this.minute = seconds / MINUTE_IN_SECONDS;
        seconds -= this.minute * MINUTE_IN_SECONDS;
        this.second = seconds;
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

    public boolean isZero() {
        return year == 0 && day == 0 && hour == 0 && minute == 0 && second == 0;
    }
}
