package gepjarmu;
public class gepjarmu {
    private int kerekszam;
    private int loero;
    private int szemelyszam;
    private double sebesseg;
    private double fogyasztas;
    
    public gepjarmu(int kerekszam, int loero){
        this.setkerekszam(kerekszam);
        this.setLoero(loero);
    
    }
    
    public int getkerekszam(){
        return this.kerekszam;
    }
    
    public void setkerekszam(int kerekszam){
        this.kerekszam=kerekszam;
    }

    public int getLoero() {
        return loero;
    }

    public void setLoero(int loero) {
        this.loero = loero;
    }

    public int getSzemelyszam() {
        return szemelyszam;
    }

    public void setSzemelyszam(int szemelyszam) {
        this.szemelyszam = szemelyszam;
    }

    public double getSebesseg() {
        return sebesseg;
    }

    public void setSebesseg(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    public double getFogyasztas() {
        return fogyasztas;
    }

    public void setFogyasztas(double fogyasztas) {
        this.fogyasztas = fogyasztas;
    }
    
    public String toString(){
        return this.getkerekszam()+
                ","+this.getLoero()+
                ","+this.getFogyasztas()+
                ","+this.getSebesseg()+
                ","+this.getSzemelyszam();
    }
}

