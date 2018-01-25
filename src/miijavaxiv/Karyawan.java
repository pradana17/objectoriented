/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;
/**
 *
 * @author dony pradana
 */
public class Karyawan {
    private String id;
    protected String nama;
    public String alamat;
    static int jumlah;

    Karyawan() {
        System.out.println("ctor Karyawan");
    }

    public Karyawan(String id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("ctor par Karyawan");
    }

    /**
     * method ini untuk mengajukan cuti
     * @param hari jumlah hari yang diajukan
     */
    
    
    int mengajukanCuti(int hari){
       hari=18;
       return hari;
    }
    
    void mengajukanCuti(Karyawan karyawan){
       karyawan.setId("22");
       karyawan.setNama("abc");
       
    }
    
    
    /**
     * 
     */
    static void mengajukanKerja(){
        
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
