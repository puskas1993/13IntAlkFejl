package RaktarProgram;
public class Aru{
  private String nev;
  private double egysegar;
  private double menny;
  
  public Aru(String aNev, double aEgysegar){
    nev = aNev;
    egysegar = aEgysegar;
    menny = 0;
  }
  
  public String getNev(){
    return nev;
  }
  
  public double getEgysegar(){
    return egysegar;
  }
  
  public void setEgysegar(double aEgysegar){
    if (aEgysegar >= 0)
      egysegar = aEgysegar;
  } 
 
  public double getMenny(){
    return menny;
  }
  
  public double getAr(){
    return menny*egysegar;
  }  
  
  public void hozzatesz(double aMenny){
    if(aMenny>0)
      menny += aMenny;
  }
  
  public void elvesz(double aMenny){
    if(aMenny>0 && aMenny<=menny)
      menny -= aMenny;
  }
  
    @Override
  public String toString(){
    return nev+"\tEgysegar: "+egysegar+"\tMenny: "+menny+"\tAr: "+getAr();
  }
  
}//Aru