public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int agePeople = 19;
        if (agePeople >= 18) {
            System.out.println("Если возраст человека " + agePeople + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека " + agePeople + " он не достиг совершеннолетия, " + "нужно немного подождать");
        }
        System.out.println();
        System.out.println("Задача №2");
        int temperature = 5;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println();
        System.out.println("Задача №3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то, придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то, можно ездить спокойно");
        }
        System.out.println();
        System.out.println("Задача №4");
        int age = 33;
        if ((age >= 2) && (age <= 6)) {
            System.out.println("Если возраст человека равен " + age + " то, ему нужно ходить в детский сад");
        }
        if ((age >= 7) && (age <= 17)) {
            System.out.println("Если возраст человека равен " + age + " то, ему нужно ходить в школу");
        }
        if ((age >= 18) && (age <= 24)) {
            System.out.println("Если возраст человека равен " + age + " то, его место в университете");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " то, ему пора ходить на работу");
        }
        System.out.println();
        System.out.println("Задача №5");
        int yearChildren = 4;
        if (yearChildren < 5) {
            System.out.println("Если возраст ребенка равен " + yearChildren + " то, ему нельзя кататься на аттракционе");
        } else if ((yearChildren >= 5) && (yearChildren <= 14)) {
            System.out.println("Если возраст ребенка равен " + yearChildren + " то, ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + yearChildren + " то, ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();
        System.out.println("Задача №6");
        int capacity = 150;
        if (capacity <= 60) {
            System.out.println("Есть сидячие места");
        } else if ((capacity >= 60) && (capacity <= 102)) {
            System.out.println("Есть стоячие места");
        } else {
            System.out.println("Мест нет");
        }
        System.out.println();
        System.out.println("Задача №7");
        int one = 10;
        int two = 20;
        int three = 30;
        if ((one > two) && (one > three)) {
            System.out.println(one);
        } else if ((two > one) && (two > three)) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}