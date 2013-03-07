/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gepjarmu;

/**
 *
 * @author Diák
 */
public class auto extends gepjarmu {
    private String rendszam;
    private String alvatzszam;
    private double benzintartaly;
    private double benzinmennyiseg;
    
    public auto(String rendszam, String alvazszam, double benzintartaly, double benzinmennyiseg, int kerekszam, int loero, double fogyasztas ) {
    super(kerekszam, loero);
    this.setRendszam(rendszam);
    this.setAlvazszam(alvazszam);
    this.setBenzintartaly(benzintartaly);
    this.setBenzinmennyiseg(benzinmennyiseg);
    super.setFogyasztas(fogyasztas);
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getAlvazszam() {
        return alvatzszam;
    }

    public void setAlvazszam(String alvazszam) {
        this.alvatzszam = alvazszam;
    }

    public double getBenzintartaly() {
        return benzintartaly;
    }

    public void setBenzintartaly(double benzintartaly) {
        this.benzintartaly = benzintartaly;
    }

    public double getBenzinmennyiseg() {
        return benzinmennyiseg;
    }

    public void setBenzinmennyiseg(double benzinmennyiseg) {
        this.benzinmennyiseg = benzinmennyiseg;
    }

    public boolean megy(double km){
        if((super.getFogyasztas()/100)*km<=this.getBenzinmennyiseg()){
            double fogy=(super.getFogyasztas()/100)*km;
            this.setBenzinmennyiseg(this.getBenzinmennyiseg()-fogy);
            return true;
        }
    return false;
    }
    
    public boolean Tankol(double liter){
        if(this.getBenzinmennyiseg()+liter<=this.getBenzintartaly()){
            this.setBenzinmennyiseg(this.getBenzinmennyiseg()+liter);
            return true;
        }
        return false;
    
    }
    
    @Override
    public String toString() {
        return super.toString()+
                ","+this.getAlvazszam()+
                ","+this.getRendszam()+
                ","+this.getBenzinmennyiseg()+
                ","+this.getBenzintartaly();

    }

}
