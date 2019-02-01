public class CalandarConverter {

    static String calandarConverter(int numberOfDay) {
        switch (numberOfDay) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thurdsay";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
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



