/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


public class Haromszog {
    private int aOldal;
    private int bOldal;
    private int cOldal;
    
    public Haromszog(int aOldal, int bOldal, int cOldal){
        this.aOldal = aOldal;
        this.bOldal = bOldal;
        this.cOldal = cOldal;
        
    }
    
    public int Kerulet(){
        return getaOldal()+getbOldal()+getcOldal();
    }
    
    public int getaOldal(){
        return aOldal;
    }
    
    public int getbOldal(){
        return bOldal;
    }
    
    public int getcOldal(){
        return cOldal;
    }
    
}
