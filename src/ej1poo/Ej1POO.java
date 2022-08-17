/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1poo;

import Entiidades.Libro;
import Servicio.LibroServico;

/**
 *
 * @author novel
 */
public class Ej1POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               LibroServico ls = new LibroServico(); 
        Libro l1 = ls.datosLibro(); 
                
        ls.MostrarLibro(l1);
        
        
    }
    
}
