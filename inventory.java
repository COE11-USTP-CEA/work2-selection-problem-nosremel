import java.util.List;
import java.util.ArrayList;

class Inventory{
    public static void main(String[]args){
        System.out.println("Cutab Enterprises");
        List<Item> prod = new ArrayList();
        float total = 0.0f;

        Item a1 = new Item("Milo", "Powdered Milk", 7.00f);
        Item b2 = new Item("Breeze", "Detergent", 8.00f);
        Item c3 = new Item("Rolex", "Wrist Watch", 3200.00f);
        Item d4 = new Item("Modess", "Napkin", 6.00f);
        Item e5 = new Item("Pampers", "Diapers", 12.00f);
       

        prod.add(a1);
        prod.add(b2);
        prod.add(c3);
        prod.add(d4);
        prod.add(e5);
      
        for(Item x: prod){
           
           if(e.Getname()=="Detergent"){
                System.out.println("Product Found");
            }
            
            else{
                System.out.println("Product not Found");
            }
            total = total + e.Getprice();
        }
        
        System.out.println(total);
    }
}
