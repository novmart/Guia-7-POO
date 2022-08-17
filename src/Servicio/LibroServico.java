/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entiidades.Libro;
import java.util.Scanner;

/**
 *
 * @author novel
 */
public class LibroServico {
    Scanner leer = new Scanner(System.in); 
    public Libro datosLibro(){
        //intanciar un objt de tipo vendedor 
        Libro l1 = new Libro(); 
        //lleno los atributos 
        System.out.println("Ingrese el titulo del libro: ");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese el ISBN:  ");
        l1.setIsbn(leer.nextInt());
        System.out.println("Ingrese el nombre del autor : ");
        l1.setAutor(leer.next());
        System.out.println("Ingrese el numero de paginas : ");
        l1.setNumPag(leer.nextInt());
        
        return l1; 
        
    }
    
    public void MostrarLibro(Libro l1){
        System.out.println("El titulo del libro es: " + l1.getTitulo() + " || " +  "el autor del libro es : " + l1.getAutor() + " el isbn es : " + l1.getIsbn() +
                " el numero de paginas es : " + l1.getNumPag());
                
    }
        
}
