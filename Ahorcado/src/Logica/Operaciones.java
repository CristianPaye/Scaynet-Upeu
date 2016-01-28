/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import Datos.Leer;
import java.io.FileNotFoundException;

/**
 *
 * @author TOSHIBA
 */
public class Operaciones {
    Leer l= new Leer();
    public String comparado[]= new String [6];
    public void comparaion(String cap[]) throws FileNotFoundException {
        l.lectura();

        for(int x=0;x<6;x++) {
            System.out.println(cap[x]);
            if(cap[x].equals(String.valueOf(l.datoleido[1].charAt(x)))){
                
                comparado[x]=cap[x];
                
            }else{
                comparado[x]="";
            }
            
        }
        
    }
    
 }
