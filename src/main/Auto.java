/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


public class Auto {
    private boolean uzemanyag;
    private boolean beinditva;
    private static int peldanyDb;
    
    public Auto(){
        this(false);
    }
    public Auto(boolean beindit){
        this(true, beindit);
    }
    
    public Auto(boolean beindit, boolean uzemanyag){
        this.uzemanyag = uzemanyag;
        this.beinditva = beindit;
        Auto.peldanyDb++;
        System.out.println("Az %d. verzió!\n".formatted(peldanyDb));
        System.out.println("üzemanyag: " + uzemanyag);
        System.out.println("beinditva: " + beinditva);
        System.out.println("-----------------------");
    }
    
    public void setBeindit(boolean beinditva){
        this.beinditva = beinditva;
        String b = beinditva ? "beindítva!" : "leállítva";
        System.out.println("Az autó " + b);
    }
    
    //setuzemanyag(false)
    public void megy(){
        if (beinditva && uzemanyag) {
            uzemanyag = false;
            System.out.println("megérkeztünk de kifogyott a benzin!");
        }else if(!beinditva){
            System.out.println("nem haladtunk, mert nincs beindítva!");
        }
        else if(!uzemanyag){
            System.out.println("nem haladtunk, mert nincs benzin!");
        }
    }
    
    //setuzemanyag(true)
    public void tankol(){
        if (!beinditva) {
            uzemanyag = true;
            System.out.println("tele a tank!");
        }else{
            System.out.println("nem sikerült tankolni, be van indítva az autó!");
        }
    }
}
