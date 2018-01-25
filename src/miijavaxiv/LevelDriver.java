/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;


import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author dony pradana
 */
public class LevelDriver {
    
    static void methodZ(int y, Level1 l){
        
    }
        
    static void methodZ(InterfaceX x){
        
    }
    
    public static void main(String[] args) {

        methodZ(new Level3());
        
        Level1 level11 = new Level3();

        level11.method1(0);
//        System.out.println(level11.getClass());
//        System.out.println(level11 instanceof Level1);
//        System.out.println(level11 instanceof Level2);
//        System.out.println(level11 instanceof Level3);
        
        Dictionary<Integer, String> d = new Hashtable();
        d.put(1, "abcd");
        System.out.println(d.get(d));
        
        InterfaceX ix = new Level3();
        
        List<String> x = new ArrayList();
        x.add("asadas");
        x.add("bcddfd");
        System.out.println(x);
        
        Map<String,String> map = new Hashtable();
        map.put("Indonesia", "Jakarta");
        map.put("Singapore", "Singapore");
        map.put("Brunei", "Bandar Seri Begawan");
        
        map.forEach((k,v)->//lamda expression 
                System.out.println(k+" ==> "+v));
        
        
        
   }
}
