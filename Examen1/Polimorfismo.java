/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import animales.Animal;
import animales.Gato;
import animales.Perro;


public class Polimorfismo {

    public static void main(String[] args) {
        Animal a;
        a = new Gato();
        test(a);
        
        a = new Perro();
        test(a);
        
        Animal animales[] = new Animal[2];
        animales[0] = new Gato();
        animales[1] = new Perro();
    }
    
    public static void test(Animal animal) {
        animal.hacerRuido();
    }
}

