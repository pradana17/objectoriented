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
public class ScopeVariable {
    int z;
    static int y;
    
    public void methodA(int z){
        this.z= 29;
        y = 24;
    }
    
    
    /**
     * static hanya di level class bukan di objek
     * static void hanya bisa memanggil variable dan method yg bertipe static
     */
    
    public static void methodC(){
        
    }
    
    public void methodB(){
        int z = 20;
        this.z = z;
        
    }
}
