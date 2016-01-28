/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author TOSHIBA
 */
public class Leer {
    
    public String datoleido[]=new String[2];
    
    public  void lectura() throws FileNotFoundException {
        
        try{  
        File Archivo = new File("C:/Respuesta.txt");
        FileReader Archivoleeido= new FileReader(Archivo);
        BufferedReader Rutaarchivo=new BufferedReader(Archivoleeido); 
        
        for(int x=0;x<2;x++){
            datoleido[x]=Rutaarchivo.readLine();
            
        }
        
        }catch(FileNotFoundException ex){
            System.out.println("no hay archibo");
         
    }
        catch(IOException io) {
            
        }
    
}

    public void lectura(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

