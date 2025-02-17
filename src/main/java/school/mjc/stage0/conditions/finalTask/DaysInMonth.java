package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        String days = switch (month) {
            case 4, 6, 9, 11 -> "30";
            case 1, 3, 5, 7, 8, 10, 12 -> "31";
            case 2 -> {
                if (isLeap) {
                    yield "29";
                } else {
                    yield "28";
                }
            }
            default -> "invalid date";
        };
        System.out.println(days);
    }
}
