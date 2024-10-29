package View;

import Model.Product;
import Model.Sale;
import Model.Item;

public class Main {
    public static void main(String[] args) {
        
        Product arroz = new Product("Arroz", 20.50);
        Product feijao = new Product("Feijão", 7.30);
        Product oleo = new Product("Óleo", 8.99);
        Product leite = new Product("Leite", 4.50);

        
        Sale sale = new Sale();

        
        sale.addItem(new Item(arroz, 2)); 
        sale.addItem(new Item(feijao, 5));
        sale.addItem(new Item(oleo, 3)); 
        sale.addItem(new Item(leite, 10)); 

        
        sale.printReceipt();
    }
}
