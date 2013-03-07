package raktarprogram;

import RaktarProgram.Aru;

public class RaktarProgram{    
  public static void main(String [] args){    
    Aru aru1, aru2;    
    aru1 = new Aru("Paradicsom",300);    
    aru2 = new Aru("Paprika",250);    
    aru1.hozzatesz(125);    
    System.out.println(aru1);    
    System.out.println(aru2);    
    aru1.elvesz(25);    
    aru2.hozzatesz(100);    
    aru2.setEgysegar(280);    
    System.out.println(aru1);    
    System.out.println(aru2);    
    // stb...

  }
}