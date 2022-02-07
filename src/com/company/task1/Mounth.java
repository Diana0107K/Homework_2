package com.company.task1;

public enum Mounth {
    JANUARY("January", 1),
    FEBRUARY("February", 2),
    MARCH("March", 3),
    APRIL("April", 4),
    MAY("May", 5),
    JUNE("June", 6),
    JULY("July", 7),
    AUGUST("August", 8),
    SEPTEMBER("September", 9),
    OCTOBER("October", 10),
    NOVEMBER("November", 11),
    DECEMBER("Desember", 12),
    ;

    private final String name;
    private final int number;

    Mounth(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public static int getNumberByName(String name) {
        for (Mounth mounth : values()) {
            if (mounth.name.equals(name)) {
                return mounth.number;
            }
        }
        return -1;
    }

    public static String getNameByNumber(int number) {
        for (Mounth mounth : values()) {
            if (mounth.number == number) {
                return mounth.name;
            }
        }
        return null;
    }
}
