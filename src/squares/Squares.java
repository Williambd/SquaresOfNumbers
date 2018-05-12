/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squares;

import java.util.ArrayList;

/**
 *
 * @author justine
 */
public class Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList();
        for (int i =1; i<10; i++){
            squares.add(i*i);
        }
        
        for (int i=0; i<squares.size()-1; i++){
            System.out.print("Number: "+(i+1));
            System.out.print(" Square: "+(squares.get(i))+"\n");
        }
    }
    
}
