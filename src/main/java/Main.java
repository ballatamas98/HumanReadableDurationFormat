import formatter.ReadableDurationFormatter;

public class Main {

    public static void main(String[] args) {
        System.out.println(ReadableDurationFormatter.format(Integer.parseInt(args[0])));
    }


}
