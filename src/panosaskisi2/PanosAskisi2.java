/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panosaskisi2;

/**
 *
 * @author Σπίτι
 */
public class PanosAskisi2 {
    static boolean diastimata(int s1, int e1, int s2, int e2){
     
     boolean syn;
     if (s2>e1 || s1>e2){
        
         syn=false;
         System.out.println(syn);
     }
     else {
         syn=true;
     System.out.println(syn);
     }
     return syn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        diastimata(13, 19, 20, 24);
     
    }
    
}
