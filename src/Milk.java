

public class Milk extends Food {
    // Новое внутреннее поле данных РАЗМЕР
    private String taste;
    public Milk(String taste) {
        // Вызвать конструктор предка, передав ему имя класса
        super("Молоко");
        this.taste = taste;
    }
    // Переопределить способ употребления яблока
    public void consume() {
        System.out.println(this + " выпито");
    }
    //Геттер для доступа к полю данных РАЗМЕР
    public String getSize() {
        return taste;
    }
    // Сеттер для изменения поля данных РАЗМЕР
    public void setSize(String size) {
        this.taste = taste;
    }
    // Переопределенная версия метода toString(), возвращающая не только
// название продукта, но и его размер
    public String toString() {
        return super.toString() + " вкуса '" + taste.toUpperCase() + "'";
    }
}