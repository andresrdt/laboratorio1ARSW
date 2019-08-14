package edu.eci.arsw.math;

import static edu.eci.arsw.math.Main.bytesToHex;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2112076
 */
public class PiDigitsThread extends Thread{
    int inicio,ran;
    byte[] digits;

    public PiDigitsThread(int inicio, int ran) {
        this.inicio = inicio;
        this.ran=ran;
    }
   
    @Override
    public void run(){
       digits= PiDigits.getDigitsO(inicio,ran);
    }

    public byte[] getDigits() {
        return digits;
    }
    
    
    
}
