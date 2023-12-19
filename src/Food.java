


public class Food implements Consumable {
    String name = null;

    public Food(String name) {
        this.name = name;
    }
    // Переопределенная версия метода equals(), которая при сравнении
// учитывает не только поле name (Шаг 1), но и проверяет совместимость
// типов (Шаг 2) и совпадение размеров (Шаг 3)
    // Определение конструктора класса Food, который принимает параметр name и присваивает его переменной класса name.
    public boolean equals(Object arg0)
    {
        if (!(arg0 instanceof Food)) return false;// Шаг 1//5. Проверка, является ли объект arg0 экземпляром класса Food. Если нет, то метод возвращает false.
        if (name==null || ((Food)arg0).name==null) return false;// Шаг 2//Проверка, является ли поле name объекта текущего класса или объекта arg0 равным null. Если да, то метод возвращает false.
        return name.equals(((Food)arg0).name);// Шаг 3//равнение значений полей name текущего объекта и объекта arg0. Если они совпадают, то метод возвращает true, в противном случае – false
    }
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void consume() {

    }
}
