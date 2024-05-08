/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


public class AutoProject {
    
    private static AutoProject prg = new AutoProject();
    
    public static void main(String[] args) {
        prg.bemutato();
    }
    private void bemutato(){
        prg.bemutato_0();
        prg.bemutato_1();
        prg.bemutato_2();
    }

    private void bemutato_0() {
        new Auto();
    }

    private void bemutato_1() {
        Auto auto = new Auto(true);
        auto.tankol();
        auto.setBeindit(false);
        auto.tankol();
        auto.megy();
        auto.setBeindit(true);
        auto.megy();
        auto.tankol();
        auto.setBeindit(false);
        auto.tankol();
        auto.megy();
    }

    private void bemutato_2() {
        new Auto(false, false);
    }
    
}
