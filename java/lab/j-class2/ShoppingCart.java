/*
4 - Online Shopping Cart
Create a class Product with attributes like name, price, and quantity. Design a class ShoppingCart
to manage products added to the cart. Implement methods to add products, remove products,
calculate the total price, and display cart contents. 
*/

import java.util.*;

class Product {

  private String name;
  private float price;
  private int quantity;

  Product(String name, float price, int quantity) {
    this.setName(name);
    this.setPrice(price);
    this.setQuantity(quantity);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public float getPrice() {
    return this.price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getQuantity() {
    return this.quantity;
  }
}

public class ShoppingCart {
    
    private static final Scanner scanner = new Scanner (System.in);
    private List <Product> cart=new ArrayList<Product>();
    ShoppingCart()
    {
        System.out.println("Shopping cart created!");
    }
    void addProducts(String name, float price, int quantity)
    {
        cart.add(new Product(name, price, quantity));
        System.out.println(name+" added to cart");
    }
    void removeProducts(String name)
    {
        boolean found=false;
        for(int i=0;i<cart.size();i++)
        {
            if(name.equals(this.cart.get(i).getName()))
            {
                this.cart.remove(i);
                found=true;
            }
        }
        if(found)
        {
            System.out.println("Product "+name+" removed from cart");
        }
        else{
            System.out.println("No product with the given name dosent exist in the cart.");
        }
    }
    void getTotalPrice()
    {
        float price=0f;
        for (Product product:cart)
        {
            price+=product.getQuantity()*product.getPrice();
        }
        System.out.println("Total price is Rs "+price);
    }
    void displayCart()
    {
        System.out.println("The cart contains:");
        for (Product product:cart)
        {
            System.out.println(product.getQuantity()+" quantity of "+product.getName());
        }
    }
    public static void main(String[] args) {
        ShoppingCart cart1=new ShoppingCart();
        int quantity,choice;
        float price;
        String name;
        boolean exit=false;
        while(true)
        {
            System.out.println("Enter");
            System.out.println("1 to add product");
            System.out.println("2 to remove product");
            System.out.println("3 to calculate total price");
            System.out.println("4 to display cart");
            System.out.println("5 to exit");
            System.out.print("enter your choice:");
            choice=scanner.nextInt();
            if(!(choice>=1 && choice<=5))
            {
                System.out.println("\n !! Enter a valid choice !!\n");
                continue;
            }
            switch(choice)
            {
                case 1:
                while(true)
                {
                    System.out.print("enter product name:");
                    name=scanner.next();
                    System.out.print("enter price of one item:");
                    price=scanner.nextFloat();
                    System.out.print("enter the quantity:");
                    quantity=scanner.nextInt();
                    cart1.addProducts(name, price, quantity);
                    System.out.print("enter 1 to add products else enter 0:");
                    choice=scanner.nextInt();
                    if (choice==0)
                    {
                        break;
                    }
                }
                break;
                case 2:
                    System.out.print("enter the name of the product to be removed:");
                    name=scanner.next();
                    cart1.removeProducts(name);
                    break;
                case 3:
                    cart1.getTotalPrice();
                    break;
                case 4:
                    cart1.displayCart();
                    break;
                case 5:
                    exit=true;
            }
            if(exit)
            {
                break;
            }
        }
    }
}
