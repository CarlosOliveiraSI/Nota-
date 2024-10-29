package Model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Item> items = new ArrayList<>();

    
    public void addItem(Item item) {
        items.add(item);
    }

    
    public double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

   
    public void printReceipt() {
        System.out.println("Nota de Venda:");
        System.out.println("----------------------------");
        System.out.printf("%-15s %-8s %-8s %-8s\n", "Produto", "Qtd", "Preço", "Subtotal");

        for (Item item : items) {
            System.out.printf("%-15s %-8d %-8.2f %-8.2f\n",
                    item.getProduct().getName(),
                    item.getQuantity(),
                    item.getProduct().getUnitPrice(),
                    item.getSubtotal());
        }

        System.out.println("----------------------------");
        System.out.printf("Total: R$ %.2f\n", getTotal());
    }
}
