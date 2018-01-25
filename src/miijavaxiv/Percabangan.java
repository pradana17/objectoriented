package miijavaxiv;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dony pradana
 */
public class Percabangan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("input bulan : ");
            BULAN bulan = BULAN.valueOf(scanner.next());
            
            int jumlah_hari=0;
            System.out.println("input tahun : ");
            int tahun=scanner.nextInt();
            switch (bulan) {
                case JANUARI : case MARET: case MEI: case JULI: case AGUSTUS: case OKTOBER : case DESEMBER:
                    jumlah_hari = 31;
                    break;
                case FEBRUARI:
                    jumlah_hari = tahun%4 ==0 ? 29 : 28;
                    break;
                case APRIL: case JUNI: case SEPTEMBER: case NOVEMBER:
                    jumlah_hari = 30;
                    break;
                default:
                    System.out.println("asdada");
                    break;
            }
            System.out.println(jumlah_hari);
        }
    }
}

enum BULAN{
    JANUARI, FEBRUARI, MARET, APRIL, MEI, JUNI, JULI, AGUSTUS, SEPTEMBER, OKTOBER, NOVEMBER, DESEMBER
}