public class Mahasiswa {
    //mendeklarasikan variabel beserta datatype
    public String Nama;
    public String NIM ; 
    //NIM dalam bentuk string karena angka tidak diproses
    public float IPK;
 
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
