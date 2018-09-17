# Information Expert


> Problem: what is a general principle of assigning responsibilities to objects?

> Solution: Assign a responsibility to the information expert - the class that has the information necessary to fulfill the responsibility.


By Information Expert we should look for that class that has the information needed to determine the total. Look at the attributes.

Assign the responsibility to the Class that has the information to fulfill it.

## Example

A Customer wants to know the current total of items in the shopping cart. What object has the information?

![](/img/information_expert.png)    


````      

public class Product {
    
    private String name;
    private double price;
    private int itemnumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemnumber() {
        return itemnumber;
    }

    public void setItemnumber(int itemnumber) {
        this.itemnumber = itemnumber;
    }
}
  


````     


````      

public class Customer {
    
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

````  



````      

import java.util.List;

public class ShoppingCart {

    private List<Product> products;
    
    public void addProduct(Product p){
        products.add(p);
    }
    
    public int totalItems(){
        return products.size();
    }
}

````  

