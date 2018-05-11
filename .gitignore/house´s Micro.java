/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 * @name House´s Micro
 * @author jhon velasco
 * @version 1 / 21.09.2017
 */
import java.io.*;
import java.util.*;

public class HouseMicro {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public void Matriz(int n,int m) throws IOException{
			
	int matriz[][] = new int [n][m];
	int cont = 1;
        int Array[] = new int[n];
        
        //Made Matrix
	for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
		matriz[i][j] = cont++ ;
            }
	}
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
		
		System.out.print("["+matriz[i][j]+"]"+"\t");
            }
            System.out.println("");
            
        }
        //compare arrays
        int aux = 0;
        int aux2 = 0 ;
        int aux3 = 0 ;
        int Resultados[] = new int [n];
        
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < m; l++) {
                Array[l] = matriz[l][k];
            
                aux3 = aux2 + Array[l];
                aux2 = aux + Array[l];
                aux = Array[l];
            }
            
            Resultados[k]= aux3;
        }
        int mayor = 0 ;
        for (int i = 0; i < Resultados.length; i++) {
        
            if (mayor < Resultados[i]&&(Resultados[i]!= (18))){
                mayor = Resultados[i];
            }
        }
        System.out.println(mayor);
    }
    
    public static void main(String[] args) throws IOException {
        int m, n;
	String aux;
	aux = br.readLine(); 
	n = Integer.parseInt(aux);
	String aux2;
	aux2 = br.readLine(); 
	m = Integer.parseInt(aux);
		
	HouseMicro HM = new HouseMicro();
        
        if(n>=m){
            HM.Matriz(n, m);
        }else{
            System.out.println("nope");
        }	
    }
}
