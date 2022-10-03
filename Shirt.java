public class Shirt {
    /*defining all variables*/
    public int shirtID = 0;
    public String description = "-description required-";
    public char colorCode = 'u';
    public double price = 0.0;
    public int quantityInStock = 0;
    
    public void displayShirtInformation(){
        //public method and doesn't return any value (void)
        
        /*all information*/
        System.out.println("Shirt ID : " + shirtID);
        System.out.println("Shirt Description : " + description);
        System.out.println("Color Code : " + colorCode);
        System.out.println("Shirt Price : " + price);
        System.out.println("Quantity in Stock : " + quantityInStock);
    }
    
    public static void main(String[] args) {
        /*calling the previous displayShirtInformation function
        to print out*/
        Shirt shirt = new Shirt();
        shirt.displayShirtInformation();
    }

}
