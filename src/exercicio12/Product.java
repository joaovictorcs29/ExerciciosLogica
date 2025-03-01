package exercicio12;

public class Product {
    private String productName;
    private double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void checkPaymentDiscountMenuPrinting() {
        System.out.println("\n- - - Payment Conditions - - -");
        System.out.println("1 - In cash or Pix, receive a 15% discount");
        System.out.println("2 - Full payment on credit card, receive a 10% discount");
        System.out.println("3 - Payment in two installments on your card, it`s normal product price interest free");
        System.out.println("4 - Payment in three installments or more on your card, it`s normal product price with interest of 10%");
        System.out.print("Choose an option: ");
    }

    public void checkPaymentDiscount(int option) {
        switch (option) {
            case 1: {
                double total = this.productPrice - (this.productPrice * 0.15);
                System.out.println("Total price with 15% discount: " + total);
                break;
            }
            case 2: {
                double total = this.productPrice - (this.productPrice * 0.10);
                System.out.println("Total price with 10% discount: " + total);
                break;
            }
            case 3: {
                double total = this.productPrice;
                System.out.println("Total price is the same of the product: " + total);
                break;
            }
            case 4: {
                double total = productPrice + (productPrice * 0.10);
                System.out.println("Total price with 10% of interest: " + total);
                break;
            }
            default: {
                System.out.println("[ Invalid option ]");
                break;
            }
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
