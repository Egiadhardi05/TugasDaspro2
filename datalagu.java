/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daspro;

/**
 *
 * @author USER
 */
class lagu {
    String judul;
    String genre;
    String pencipta;


public lagu (String j, String g, String p){
    this.judul = j;
    this.genre = g;
    this.pencipta = p;
}

void tampilData(){
    System.out.println("=======Data Lagu=======");
    System.out.println("Judul Lagu    :"+this.judul);
    System.out.println("Genre         :"+this.genre);
    System.out.println("pencipta Lagu :"+this.pencipta);
    System.out.println("=======================");
    System.out.println("");
 }
}

public class datalagu{
    public static void main(String[]args){
        lagu L1=new lagu("DIA","Pop","Fredy");
        L1.tampilData();
    }
}

