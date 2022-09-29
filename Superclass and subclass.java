//superclass
public class Mahasiswa {
    //mendeklarasikan variabel beserta datatype
    protected String Nama;
    protected String NIM ; 
    //NIM dalam bentuk string karena angka tidak diproses
    protected float IPK;
 
    public Mahasiswa(String Nama, String NIM, float IPK){
        this.Nama = Nama;
        this.NIM = NIM;
        this.IPK = IPK;
    }
    
    //membuat getter Nama, NIM, dan IPK
    public String getNama(){
        return Nama;
    }
    public String getNIM(){
        return NIM;
    }
    
    //subclass pertama
        public class Mahasiswa_S1 extends Mahasiswa{
    public Mahasiswa_S1(String Nama, String NIM, float IPK){
        super(Nama, NIM, IPK);//variabel dari superclass
    
    //menghitung ipk apakah cumlaude atau tidak
    //operasi disimpan dalam method isCumlaude
    public void isCumlaude(){
        if (IPK > 3.50) {
            System.out.println("Mahasiswa Cumlaude");
        } else {
            System.out.println("Tidak Cumlaude");
        }
    }
    
    //menampilkan data mahasiswa
    public void dataMahasiswa(){
        System.out.println("\nData Mahasiswa S1");
        System.out.println("Nama : " + getNama());
        System.out.println("NIM : " + getNIM());
        System.out.println("IPK : " + getIPK());
    }
}

    }
    public float getIPK(){
        return IPK;
    }
    
    //membuat setter Nama, NIM, dan IPK
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    public void setIPK (float IPK){
        this.IPK = IPK;
    }
    
}


//subclass kedua
public class Mahasiswa_S2 extends Mahasiswa{
    public Mahasiswa_S2(String Nama, String NIM, float IPK){
        super(Nama, NIM, IPK); //variabel dari superclass
    }
    
    //menghitung ipk apakah cumlaude atau tidak
    //disimpan dalam public method
    public void isCumlaude(){
        if (IPK > 3.75) {
            System.out.println("Mahasiswa Cumlaude");
        } else {
            System.out.println("Tidak Cumlaude");
        }
    }
    
    //menampilkan data mahasiswa
    public void dataMahasiswa(){
        System.out.println("\nData Mahasiswa S3");
        System.out.println("Nama : " + getNama());
        System.out.println("NIM : " + getNIM());
        System.out.println("IPK : " + getIPK());
    }
}



//subclass ketiga
public class Mahasiswa_S3 extends Mahasiswa{
    public Mahasiswa_S3(String Nama, String NIM, float IPK){
        super(Nama, NIM, IPK); //variabel dari superclass
    }
    
    //menghitung ipk apakah cumlaude atau tidak
    //disimpan dalam public method
    public void isCumlaude(){
        if (IPK > 3.90) {
            System.out.println("Mahasiswa Cumlaude");
        } else {
            System.out.println("Tidak Cumlaude");
        }
    }
    
    //menampilkan data mahasiswa
    public void dataMahasiswa(){
        System.out.println("\nData Mahasiswa S3");
        System.out.println("Nama : " + getNama());
        System.out.println("NIM : " + getNIM());
        System.out.println("IPK : " + getIPK());
    }
}

//subclass keempat
public class UjiMahasiswa {
    public static void main(String[] args) {
        //mengisi data/parameter objek setiap kelas
        
        Mahasiswa_S1 a = new Mahasiswa_S1("Andrea", "0903", (float) 3.00);
        a.dataMahasiswa(); //memanggil dataMahasiswa untuk ditampilkan
        a.isCumlaude(); //memanggil operasi isCumlaude
        
        Mahasiswa_S2 b = new Mahasiswa_S2("Surya", "0802", (float) 3.75);
        b.dataMahasiswa(); //memanggil data Mahasiswa untuk ditampilkan
        b.isCumlaude();//memanggil operasi isCumlaude
        
        Mahasiswa_S3 c = new Mahasiswa_S3("Nala", "0701", (float) 4.00);
        c.dataMahasiswa(); //memanggil data Mahasiswa untuk ditampilkan
        c.isCumlaude(); //memanggil operasi isCumlaude
        System.out.println("--------------------");
    }
}


