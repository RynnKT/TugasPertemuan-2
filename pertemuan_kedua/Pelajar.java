/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_kedua;

/**
 *
 * @author Ridho
 */


public class Pelajar extends Manusia implements GuruLes,JualanOnline  {

    /**
     * @return the Nim
     */
    protected String getNim() {
        return Nim;
    }

    /**
     * @return the Nama
     */
    protected String getNama() {
        return Nama;
    }

    /**
     * @param Nim the Nim to set
     */
    
    private String Nim;
    private String Nama;

    public Pelajar(String Nim, String Nama, String makan, String Berenergi) {
        super (makan, Berenergi);
        this.Nama = Nama;
        this.Nim = Nim;
    }
    
    public void mengemas() {
        System.out.println("mengemas barang");
    }
    public void mengirim() {
        System.out.println("mengirim produk");
    }
    public void menjawab() {
        System.out.println("menjawab kritik");
    }

    public void mengajar() {
        System.out.println("mengajar anak tk");
    }
    public void menilai() {
        System.out.println("menilai tugasnya");
    }
    public void meluluskan() {
        System.out.println("meluluskan yang nilai nya bagus");
    }
    
    public void bermain() {
        System.out.println("bermain voli");
    }
    public void belajar() {
        System.out.println("belajar bahasa inggris");
    }
    public void istirahat() {
        System.out.println("istirahat di kamar");
    }
    public static void main(String[] args) {
        Pelajar orang = new Pelajar("09040624085","Ridho", "Nasi", "Kuat");
        
        System.out.println("Nim : "+orang.getNim());
        System.out.println("Nama : "+orang.getNama());
        System.out.println("Makan : "+orang.getMakan());
        System.out.println("Berenergi itu : "+orang.getBerenergi());
        
        System.out.println("");
        
        orang.mengemas();  
        orang.mengirim();
        orang.menjawab();
        
        System.out.println("   ");
        
        orang.mengajar();  
        orang.menilai();
        orang.meluluskan();
        
        System.out.println("");
        
        orang.bermain();  
        orang.belajar();
        orang.istirahat();
       
        
    }
}
