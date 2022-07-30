package com.sambit.java8features.enumExample;

public enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

class EnumTest{
    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void printDays(){
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad...");
                break;
            case TUESDAY:
                System.out.println("Tuesday is good..");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday is mid of the week");
                break;
            case THURSDAY:
                System.out.println("Thursday is relax...");
                break;
            case FRIDAY:
                System.out.println("Friday is a dry day...");
                break;
            case SATURDAY:
                System.out.println("Saturday is a holiday");
                break;
            case SUNDAY:
                System.out.println("Sunday is a very special day for me....");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        EnumTest monday = new EnumTest(Day.SUNDAY);
        monday.printDays();
    }
}
