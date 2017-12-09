/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] vetA = new int[5];
        int[] vetB = new int[5];
        
        for(int i = 0; i < vetA.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            vetA[i] = scan.nextInt();
        }
        
        for(int i = 0; i < vetA.length; i++){
            vetB[i] = vetA[i];
        }
          
        
    }
}
