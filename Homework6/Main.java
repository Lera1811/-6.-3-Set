package homeWork6;

 import java.util.*;

 public class Main {
     public static void main(String[] args) {

     }

     /**
      *  1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
      *  2. Создать множество ноутбуков.
      *  3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
      *  отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
      *  “Введите цифру, соответствующую необходимому критерию:
      *  1 - ОЗУ
      *  2 - Объем ЖД
      *  3 - Операционная система
      *  4 - Цвет …
      *   1. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
      *   2. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
      */
     private static Set<Object> createLaptopSet() {
         Laptop laptop = new Laptop("HP", "11R12L", 4, 250, "Windows 7", "Black");
         Laptop laptop1 = new Laptop("Lenovo", "8ЕЕ64V", 8, 150, "Windows 10", "Black");
         Laptop laptop2 = new Laptop("Acer", "A241W", 8, 250, "Windows 11", "White");
         Laptop laptop3 = new Laptop("Asus", "236U", 6, 500, "Windows 10", "Gray");
         Laptop laptop4 = new Laptop("DELL", "526Lite", 4, 200, "Windows 7", "Black");
         Laptop laptop5 = new Laptop("DELL", "813SE", 16, 500, "Windows 11", "White");
         Laptop laptop6 = new Laptop("Acer", "A26EW", 16, 250, "Windows 10", "Gray");

         Set<Object> setLaptop = new HashSet<>();
         setLaptop.add(laptop);
         setLaptop.add(laptop1);
         setLaptop.add(laptop2);
         setLaptop.add(laptop3);
         setLaptop.add(laptop4);
         setLaptop.add(laptop5);
         setLaptop.add(laptop6);

         return setLaptop;
     }
     private static int createCriterion(){
         Map<Integer, String> criterion = new HashMap<Integer, String>();
         criterion.put(1, "ОЗУ");
         criterion.put(2, "Объем ЖД");
         criterion.put(3, "Операционная система");
         criterion.put(4, "Цвет");

         System.out.println("Выберите параметр для фильтрации: " + criterion);
         System.out.println("Введите число: ");
         Scanner scanner = new Scanner(System.in);
         int selectedCriterion = scanner.nextInt();
         return selectedCriterion;
     }
     private static void filterSelection(int selectedCriterion, Laptop laptop){
         if (selectedCriterion == 1){
             filter1(laptop);
         }
         else if (selectedCriterion == 2){
             filter2(laptop);
         }
     }
     private static void filter1(Laptop laptop){
        System.out.println("Введите миниальный объем ОЗУ: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (laptop.getRam() >= size){
            System.out.println(laptop);
        }
     }
     private static void filter2(Laptop laptop){
         System.out.println("Введите миниальный объем ЖД: ");
         Scanner scanner = new Scanner(System.in);
         int size = scanner.nextInt();
         if (laptop.getSsd() >= size){
             System.out.println(laptop);
         }
     }
 }