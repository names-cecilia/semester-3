public class Orang {
    public int tahunUmur = 32;
    //variables can accessed from anywhere in the class
    
    public void hitungUmur(){
        int hariUmur = tahunUmur * 365; //converting age to days
        long detikUmur = tahunUmur * 365 * 24L * 60 * 60; //converting age to seconds
        
        System.out.println("Umur anda adalah : " + hariUmur + " hari");
        System.out.println("Umur anda adalah : " + detikUmur + " detik");
    }
    
    public static void main(String[] args) {
        /*the point from where the program starts its execution or
        simply the entry point of Java programs is the main() method.*/
        Orang o = new Orang();
        o.hitungUmur();
    }
}
