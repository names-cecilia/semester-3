public class ConstructorShirt1 {
    //Declaring all default value of each variables
    private int idBaju = 0;
    private String keterangan = "-Keterangan Diperlukan-";
    
    private char kodeWarna = 'U';
    private double harga = 0.0;
    private int jmlStok = 0;
    
    public ConstructorShirt1(char kodeAwal){
        switch (kodeAwal) {
            //using switch
            case 'R':
            case 'G':
            case 'B':
                kodeWarna = kodeAwal;
                break;
            default:
                System.out.println("kodeWarna salah, gunakan R, G, atau B");
        }/*Jadi, kodeWarna akan dicek apakah memuat karakter R/G/B?
        Jika iya, akan dicetak sesuai dengan data
        Jika tidak, akan mencetak baris di Sysout dan
        kodeWarna akan diinisialisasikan menjadi Unset*/
    }
    
    public char getKodeWarna(){
        return kodeWarna;
    }
}
