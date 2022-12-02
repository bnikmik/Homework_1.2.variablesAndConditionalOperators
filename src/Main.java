public class Main {
    public static void main(String[] args) {
        int a1 = 1;
        int b1 = 3;
        int a2 = 0;
        int b2 = 3;
        if (b1 < a2 || b2 < a1) {
            System.out.println("Пересечения нет");
        } else if (b1 == a2) {
            System.out.println("Пересечение - точка = " + b1);
        } else if (b2 == a1) {
            System.out.println("Пересечение - точка = " + b2);
        } else if (a1 <= a2 && b1 < b2) {
            System.out.println("Пересечение - отрезок [" + a2 + ";" + b1 + "]");
        } else if (a2 <= a1 && b2 < b1) {
            System.out.println("Пересечение - отрезок [" + a1 + ";" + b2 + "]");
        } else if (b1 <= b2 && a2 < a1) {
            System.out.println("Пересечение - отрезок [" + a1 + ";" + b1 + "]");
        } else if (b2 <= b1 && a1 < a2) {
            System.out.println("Пересечение - отрезок [" + a2 + ";" + b2 + "]");
        } else {
            System.out.println("Отрезки совпадают и находятся на координатах [" + a1 + ";" + b1 + "]");
        }
    }
}