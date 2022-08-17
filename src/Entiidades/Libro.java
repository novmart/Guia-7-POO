/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entiidades;

import java.util.Date;

/**
 *
 * @author novel
 */
public class Libro {
    
    public String titulo;
    public Integer isbn; 
    public String autor; 
    public Integer numPag; 
    
    //constructor vacio

    public Libro() {
    }

    public Libro(String titulo, Integer isbn, String autor, Integer numPag) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.numPag = numPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }
    
    
    
}
