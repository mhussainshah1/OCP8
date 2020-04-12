package java14;

public class Switch {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        Day day = Day.FRIDAY;
        switch (day) {
            case MONDAY->
                System.out.println("Aweful");
            case TUESDAY
                , WEDNESDAY -> System.out.println("Okay");
            case THURSDAY->
                System.out.println("");
            case FRIDAY->
                System.out.println("Great");
            case SATURDAY
                , SUNDAY -> System.out.println("Awesome");
        }

        int numLetter = switch (day) {
            case MONDAY
                , FRIDAY, SUNDAY -> 6;
            case TUESDAY->
                7;
            case THURSDAY
                , SATURDAY -> 8;
            case WEDNESDAY->
                9;
        };
            System.out.println(numLetter);
    }
}
