public class ShoppingCartThreads {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        CustomerThread customerThread = new CustomerThread(shoppingCart);
        DisplayThread displayThread = new DisplayThread(shoppingCart);

        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration " + (i+1) + ":");
            customerThread.start();
            displayThread.start();

            try {
                customerThread.join();
                displayThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println();
        }
    }
}

class ShoppingCart {
    private String productName;
    private int quantity;
    private double price;
    private double totalCost;

    public synchronized void addItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.totalCost += quantity * price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalCost() {
        return totalCost;
    }
}

class CustomerThread extends Thread {
    private ShoppingCart shoppingCart;
    private int count = 0;

    public CustomerThread(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void run() {
        while (count < 5) {
            String productName = "Product " + (count + 1);
            int quantity = (int) (Math.random() * 10) + 1;
            double price = (Math.random() * 100) + 1;
            shoppingCart.addItem(productName, quantity, price);
            count++;
        }
    }
}

class DisplayThread extends Thread {
    private ShoppingCart shoppingCart;

    public DisplayThread(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void run() {
        try {
            Thread.sleep(1000); // Wait for the customer to finish adding products
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            String productName = shoppingCart.getProductName();
            int quantity = shoppingCart.getQuantity();
            double price = shoppingCart.getPrice();
            double totalCost = shoppingCart.getTotalCost();

            System.out.println("Product Name: " + productName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price: " + price);
            System.out.println("Total Cost: " + totalCost);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
