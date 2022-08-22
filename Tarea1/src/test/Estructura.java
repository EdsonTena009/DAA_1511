/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

public class Estructura {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       Arbol arbol= new Arbol();
       
       
       arbol.insertar(20, "");
       arbol.insertar(23, "");
       arbol.insertar(19, "");
       arbol.insertar(57, "");
       arbol.insertar(67, "");
       arbol.insertar(99, "");
       
       arbol.recorrer(arbol.raiz.izquierdaIQ);
    }
    
}