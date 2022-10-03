public class Elevator {
    //declaring all variables and each values
    public boolean pintuTerbuka = false;
    public int lantaiSaatIni = 3;
    public final int maxLantai = 10;
    public final int minLantai = 1;
    
    //first funciton
    public void bukaPintu(){
        System.out.println("Buka pintu");
        pintuTerbuka = true; //changing the variables value
        System.out.println("Pintu terbuka");
    }
    
    //second function
    public void tutupPintu(){
        System.out.println("Tutup pintu");
        pintuTerbuka = false; //return back to the real value
        System.out.println("Pintu tertutup");
    }
    
    //third function
    public void naik(){
        System.out.println("Naik satu lantai");
        lantaiSaatIni++; //adding 1 to lantai saat ini
        System.out.println("Lantai : " + lantaiSaatIni);
    }
    
    //fourth function
    public void turun(){
        System.out.println("Turun satu lantai");
        lantaiSaatIni--; //substracting 1 to lantai saat ini
        System.out.println("Lantai : " + lantaiSaatIni);
    }
}
