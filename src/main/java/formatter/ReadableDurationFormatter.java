package formatter;

import util.DurationFormat;

public class ReadableDurationFormatter {

    public static String format(int seconds) {
        if (seconds == 0) {
            return "now";
        }else {
            DurationFormat number = new DurationFormat(seconds);
            StringBuilder result = new StringBuilder();

            finalizeDurationFormat(buildTemporaryDurationFormat(number, result));
            return result.toString();
        }
    }

    private static StringBuilder finalizeDurationFormat(StringBuilder result) {
        int startIndexOfLastComma = result.toString().lastIndexOf(", ");
        result.replace(startIndexOfLastComma, startIndexOfLastComma + 1, "");
        startIndexOfLastComma = result.toString().lastIndexOf(", ");
        result.replace(startIndexOfLastComma, startIndexOfLastComma + 1, " and ");
        return result;
    }

    private static StringBuilder buildTemporaryDurationFormat(DurationFormat number, StringBuilder result) {
        if (number.getYear() > 0) {
            result.append(number.getYear()).append(" year").append(plural(number.getYear())).append(", ");
        }
        if (number.getDay() > 0) {
            result.append(number.getDay()).append(" day").append(plural(number.getDay())).append(", ");
        }
        if (number.getHour() > 0) {
            result.append(number.getHour()).append(" hour").append(plural(number.getHour())).append(", ");
        }
        if (number.getMinute() > 0) {
            result.append(number.getMinute()).append(" minute").append(plural(number.getMinute())).append(", ");
        }
        if (number.getSecond() > 0) {
            result.append(number.getSecond()).append(" second").append(plural(number.getSecond())).append(", ");
        }
        return result;
    }

    public static String plural(int number) {
        return number > 1 ? "s" : "";
    }
}