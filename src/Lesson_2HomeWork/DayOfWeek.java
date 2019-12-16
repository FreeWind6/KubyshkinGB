package Lesson_2HomeWork;

public enum DayOfWeek {
    MONDAY("Понедельник", "40"),
    TUESDAY("Вторник", "32"),
    WEDNESDAY("Среда", "24"),
    THURSDAY("Четверг", "16"),
    FRIDAY("Пятница", "8"),
    SATURDAY("Суббота", "Сегодня выходной!"),
    SUNDAY("Воскресенье", "Сегодня выходной!");

    private String rus;
    private String hoursLeft;

    public String getHoursLeft() {
        return hoursLeft;
    }

    public String getRus() {
        return rus;
    }

    DayOfWeek(String rus, String hoursLeft) {
        this.rus = rus;
        this.hoursLeft = hoursLeft;
    }
}

class DayOfWeekMain {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.FRIDAY));
    }

    public static String getWorkingHours(DayOfWeek days) {
        return days.getHoursLeft();

//Мне так больше нравится, но это не по заданию =)
/*        if (days.getRus() == "Суббота" || days.getRus() == "Воскресенье") {
            System.out.println(days.getHoursLeft());
        }
        if (days.getRus() == "Понедельник" || days.getRus() == "Четверг" || days.getRus() == "Пятница") {
            System.out.println("Осталось: " + days.getHoursLeft() + " часов");
        }
        if (days.getRus() == "Вторник" || days.getRus() == "Среда") {
            System.out.println("Осталось: " + days.getHoursLeft() + " часа");
        }*/
    }
}
