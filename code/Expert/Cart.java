package Expert;

import java.util.ArrayList;

public class Cart {

    // Custor wants at all time to
    // know the amount of produxt in cart

    private ArrayList<Product> products;


    public int totalProducts(){
        return products.size();
    }


}
