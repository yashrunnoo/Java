import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject("oil painting",1350,"Impressionistic work by ABF painting"));
        storeProducts.add(new ArtObject("sculpture",2000,"bronze work by jkf"));
        listProducts();

    }

    public static void listProducts(){
        for( ProductForSale item : storeProducts)
        {
            System.out.println("_".repeat(30));
            item.showDetails();
        }
    }
}
