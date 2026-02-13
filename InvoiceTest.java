package week03.invoice;

public class InvoiceTest {

    public static void main(String[] args) {

        invoice inv = new invoice();

        System.out.println("Part Number: " + inv.getPartNumber());
        System.out.println("Description: " + inv.getPartDescription());
        System.out.println("Quantity: " + inv.getQuantity());
        System.out.println("Price: " + inv.getPricePerItem());

    }
}
