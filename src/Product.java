import java.util.Locale;

public class Product {
    //Atributos (características do produto)
    public String name;
    public double price;
    public int quantity;

    //Construtor (Para criar o produto já com dados)
    public Product(String name, double price, int quantity) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        this.price = price;
        this.quantity = quantity;

    }
}
