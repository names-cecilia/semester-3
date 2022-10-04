public class ConstructorShirt1Test {
    public static void main(String[] args) {
    ConstructorShirt1 constShirt = new ConstructorShirt1('R');
    //updating new value of color code
    //printing out the object value of the constructor
    
    char kodeWarna;
    kodeWarna =  constShirt.getKodeWarna();
        System.out.println("Kode Warna : " + kodeWarna);
    }
}
