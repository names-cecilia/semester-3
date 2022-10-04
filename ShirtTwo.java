public class ShirtTwo {
    //declaring all default value of each variables
    public int shirtID = 0;
    public String description = "-description required-";
    public char colorCode = 'U';
    public double price = 0.0;
    public int quantityInStock = 0;
    
    public void setShirtInfo(int ID, String desc, double cost){
        shirtID = ID;
        description = desc;
        price = cost;
    }
    
    public void setShirtInfo(int ID, String desc, double cost, char color){
        shirtID = ID;
        description = desc;
        price = cost;
        colorCode = color;
    }
    
    public void setShirtInfo(int ID, String desc, double cost, char color, int quantity){
        shirtID = ID;
        description = desc;
        price = cost;
        colorCode = color;
        quantityInStock = quantity;
    }
    
    //This method displays the values for an item
    public void display(){
        System.out.println("Item ID : " + shirtID);
        System.out.println("Item description : " + description);
        System.out.println("Color code : " + colorCode);
        System.out.println("Item price : " + price);
        System.out.println("Quantity in stock : " + quantityInStock);
    }
}
