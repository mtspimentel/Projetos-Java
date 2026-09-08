package StorageCalculator;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity){  // Construtor
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) { // void pois ela não retorna resposta, só acrescenta algo no estoque
        this.quantity += quantity; // o this força pegar o quantity lá de cima.
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                +", $ "
                +price
                +", "
                +quantity
                +" units, Total: $ "
                +totalValueInStock();
    }
}
