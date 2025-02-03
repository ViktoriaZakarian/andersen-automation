package by.ViktoriaZakarian.tasks;

import org.openqa.selenium.WebElement;

public class TaskThree {

    public void info(WebElement element1, WebElement element2) {

        int x1 = element1.getLocation().getX();
        int y1 = element1.getLocation().getY();
        int area1 = element1.getSize().getWidth() * element1.getSize().getHeight();

        int x2 = element2.getLocation().getX();
        int y2 = element2.getLocation().getY();
        int area2 = element2.getSize().getWidth() * element2.getSize().getHeight();

        if (y1 < y2) {
            System.out.println("Первый элемент находится выше второго.");
        } else if (y1 > y2) {
            System.out.println("Второй элемент находится выше первого.");
        } else {
            System.out.println("Элементы находятся на одной высоте.");
        }

        if (x1 < x2) {
            System.out.println("Первый элемент находится левее второго.");
        } else if (x1 > x2) {
            System.out.println("Второй элемент находится левее первого.");
        } else {
            System.out.println("Элементы находятся на одной горизонтальной позиции.");
        }

        if (area1 > area2) {
            System.out.println("Первый элемент занимает большую площадь.");
        } else if (area1 < area2) {
            System.out.println("Второй элемент занимает большую площадь.");
        } else {
            System.out.println("Элементы занимают одинаковую площадь.");
        }
    }
}
