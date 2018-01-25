package miijavaxiv;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dony pradana
 */
public class Driver {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        karyawan.setId("1234");
        karyawan.setNama("dony");
        karyawan.setAlamat("abcd");
        
        Karyawan k1 = new Karyawan();
        k1.setNama("adi");
        Karyawan k2 = k1;
        k2.setNama("salman");
        System.out.println(k2.getNama());
        k1.jumlah = 50;
        
        Karyawan k3 = new Karyawan();
        System.out.println(k3.jumlah);
        
        Karyawan.jumlah=100;
        System.out.println(k1.jumlah);
        System.out.println(k3.jumlah);
//        System.out.println(Math.pow(2, 5));
//        
//        System.out.println((Math.random()*60)+40);
//        int hari=21;
//        hari=karyawan.mengajukanCuti(hari);
//        System.out.println(hari);
//        
        karyawan.mengajukanCuti(karyawan);
        System.out.println(karyawan.getId());
    }
}
