/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial.metodo;

/**
 *
 * @author yandu
 */
public class OperadorFatorial {
    
    public static int contador(int n){
        int f = 1;
        int c = n;
        while (c >= 1) {
            f *= c;
            c--;
        }
        return f;
    }
    
}
