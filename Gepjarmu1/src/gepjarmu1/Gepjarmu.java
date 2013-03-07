package gepjarmu1;
public class Gepjarmu {
    public int kerekSzam;
    public int ajtoSzam;

    public Gepjarmu(int kerekszam, int ajtoszam){
    this.setAjtoSzam(ajtoszam);
    this.setKerekSzam(kerekszam);
    }
    
    public int getKerekSzam() {
        return kerekSzam;
    }

    public void setKerekSzam(int kerekSzam) {
        this.kerekSzam = kerekSzam;
    }

    public int getAjtoSzam() {
        return ajtoSzam;
    }

    public void setAjtoSzam(int ajtoSzam) {
        this.ajtoSzam = ajtoSzam;
    }

    public String toString() {
        return "Kerekszam: "+this.getKerekSzam()+", Ajtoszam "+this.getAjtoSzam();
    }
    
}
