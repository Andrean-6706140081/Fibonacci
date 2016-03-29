package jurnal1;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 
/**
 *
 * @author Praktikum
 */
public class Fibonaci {
    
    private ArrayList<Integer> al = new ArrayList<>();
    
    public Fibonaci() {
    }
    
    public void performFibonaci(int i){
        int prevInt = 0;
        int nextInt = 1;
        for (int j = 0; j < i; j++) {
            if ( j == 0 || j == 1){
                System.out.println("1");
                al.add(1);
                continue;
            }
            al.add(al.get(j-1)+al.get(j-2));
            System.out.println("" + al.get(j));
        }
        
    }
    
    
}
