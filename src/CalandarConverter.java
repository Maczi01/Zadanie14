public class CalandarConverter {

    static final int MONDAY = 1;
    static final int TUESDAY = 2;
    static final int WEDNESDAY= 3;
    static final int THURSDAY = 4;
    static final int FRIDAY = 5;
    static final int SATURDAY = 6;
    static final int SUNDAY = 7;


    static String calandarConverter(int numberOfDay) {
        switch (numberOfDay) {
            case MONDAY:
                return "Monday";
            case TUESDAY:
                return "Tuesday";
            case WEDNESDAY:
                return "Wednesday";
            case THURSDAY:
                return "Thurdsay";
            case FRIDAY:
                return "Friday";
            case SATURDAY:
                return "Saturday";
            case SUNDAY:
                return "Sunday";
            default:
                return "Wrong number";
        }
    }
    static void daysLoop() {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i + " day of week is " + calandarConverter(i));
            System.out.println();
        }
    }
}



