


public class Main {


    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int Cheesecount = 0;
        int Applecount = 0;
        int Milkcount =0;
        for(int itemIndex=0; itemIndex <args.length; itemIndex++)
        {
            String[] parts = args[itemIndex].split("/");
            if (parts[0].equals("Cheese"))
            {
                breakfast[itemIndex] = new Cheese();

            } else if (parts[0].equals("Apple"))
            {
                // У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemIndex] = new Apple(parts[1]);

            }
            else if (parts[0].equals("Milk"))
            {
                // У молока – 1 параметр, который находится в parts[1]
                breakfast[itemIndex] = new Milk(parts[1]);

            }

            // ... Продолжается анализ других продуктов для завтрака
        }
        // Перебор всех элементов массива
        for (Food item: breakfast) {
            // Если дошли до элемента null – значит достигли конца
// списка продуктов, ведь 20 элементов в массиве было
// выделено с запасом, и они могут быть не использованы все
            if (item==null) break;
            // Если элемент не null – употребить продукт
            item.consume();
        }
        Apple apple1 = new Apple("");
        Cheese cheese1 = new Cheese();
        Milk milk1 = new Milk("");
        for (int i = 0; i < args.length; i++) {
            if (breakfast[i].equals(apple1)) {
                Applecount++;
            } else if (breakfast[i].equals(cheese1)) {
                Cheesecount++;
            } else if (breakfast[i].equals(milk1)) {
                Milkcount++;
            }
        }
        System.out.println("Сьедено сыра: " + Cheesecount);
        System.out.println("Сьедено яблок: "+Applecount);
        System.out.println("Выпито молока: "+Milkcount);
        System.out.println("Всего хорошего!");
    }
}