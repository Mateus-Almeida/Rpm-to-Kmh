package rpmtokm;

import java.util.Scanner;



public class Rpmtokm {

        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a;
        float b = (float) 1.6092; 
        float c;   
        
        System.out.println("mph");
        a = sc.nextInt();
        
        c = b * a;
        
        System.out.println("km \n"+c);
        
        
            
    }
    
}
