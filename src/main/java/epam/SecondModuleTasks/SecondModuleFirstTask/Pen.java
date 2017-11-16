package main.java.epam.SecondModuleTasks.SecondModuleFirstTask;

public class Pen {
    private String type;
    private String color;
    private double price;

    public Pen() {
        this.type = "Ink";
        this.color = "Blue";
        this.price = 11.5;
    }

    public Pen(String type, String color, double price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (Double.compare(pen.price, price) != 0) return false;
        if (!type.equals(pen.type)) return false;
        return color.equals(pen.color);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = type.hashCode();
        result = 31 * result + color.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
