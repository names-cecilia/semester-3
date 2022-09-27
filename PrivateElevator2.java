public class PrivateElevator2 {
    //declaring all variables, value, and data type as private
    private boolean bukaPintu = false;
    private int lantaiSkrg = 1;
    private int berat = 0;
    private final int KAPASITAS = 1000;
    private final int LANTAI_ATAS = 5;
    private final int LANTAI_BAWAH = 1;
    
    //all encapsulations method below
    
    //buka() public method
    public void buka() {
        bukaPintu = true;
    }
    
    //tutup() public method
    public void tutup() {
        hitungKapasitas();
        if (berat <= KAPASITAS) {
            bukaPintu = false;
        } else {
            System.out.println("Elevator kelebihan beban");
            System.out.println("Pintu akan tetap terbuka sampai seseorang keluar");
        }
    }
    
    //hitungKapasitas() public method
    private void hitungKapasitas(){
        berat = (int)(Math.random()*1500);
        //using Math.random to pick berat value
        System.out.println("Berat : " + berat);
    }
    
    //naik() public method
    public void naik(){
        if (!bukaPintu) {
            if (lantaiSkrg < LANTAI_ATAS){
                lantaiSkrg++;
                System.out.println(lantaiSkrg);
            } else {
                System.out.println("Sudah mencapai lantai atas");
            }
        } else {
            System.out.println("Pintu masih terbuka");
        }
    }
    
    //turun() public method
    public void turun(){
        if (!bukaPintu) {
            if (lantaiSkrg > LANTAI_BAWAH) {
                lantaiSkrg--;
                System.out.println(lantaiSkrg);
            } else {
                System.out.println("Sudah mencapai lantai bawah");
            }
        } else {
            System.out.println("Pintu masih terbuka");
        }
    }
    
    //setter int Lantai
    public void setLantai (int tujuan){
        if ((tujuan >= LANTAI_BAWAH) && (tujuan <= LANTAI_ATAS)) {
            while (lantaiSkrg != tujuan) {
                if (lantaiSkrg < tujuan) {
                    naik();
                } else {
                    turun();
                }
            }
        } else {
            System.out.println("Lantai Salah");
        }
    }
       
    //getter int Lantai
    public int getLantai(){
        return lantaiSkrg;
    }
    
    //getter boolean StatusPintu
    public boolean getStatusPintu(){
        return bukaPintu;
    }
    
}
