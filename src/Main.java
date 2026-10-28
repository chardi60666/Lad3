import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chernysov Aryem, 3925Б1ПРпп2");
        // Интерфейс Packable отделяет упаковку от цены и позволяет учитывать любые упаковываемые позиции.
        // Поэтому общий цикл работает с контрактом интерфейса, без проверок конкретных типов.
        List<MenuItem> menu = new ArrayList<>();
        menu.add(new HotDish("Стейк", 300, 65));
        menu.add(new Drink("Морс", 400));
        menu.add(new Dessert("Чизкейк", 150));
        List<Packable> takeaway = new ArrayList<>();
        takeaway.add((Packable) menu.get(0));
        takeaway.add((Packable) menu.get(1));
        takeaway.add(new CutlerySet("Набор", 3));
        for (MenuItem item : menu) {
            System.out.printf("%s: %.2f руб.%n", item.getName(), item.price());
        }
        menu.sort(Comparator.comparingDouble(MenuItem::price));
        System.out.println("Меню по возрастанию цены:");
        for (MenuItem item : menu) {
            System.out.printf("%s: %.2f руб.%n", item.getName(), item.price());
        }
        double packagingTotal = 0;
        for (Packable item : takeaway) {
            packagingTotal += item.packagingCost();
        }
        System.out.printf("Упаковка заказа на вынос: %.2f руб.%n", packagingTotal);
    }
}
// Абстрактный базовый класс задаёт общие данные блюд и не позволяет создавать неопределённое блюдо напрямую.
// Интерфейс MenuItem задаёт единый контракт получения цены для сортировки разных блюд.