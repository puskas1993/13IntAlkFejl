package gepjarmu1;
public class Auto extends Gepjarmu{
    public String rendszam;
    public double fogyasztas;
    public double kmOra;
    public double benzinTartalyMeret;
    public double benzinMennyiseg;

    public Auto(int ajtoszam, String rendszam, double fogyasztas, double benzinTartalyMeret, double benzinMennyiseg){
        super(4,ajtoszam);
        this.setKmOra(0.0);
        this.setRendszam(rendszam);
        this.setFogyasztas(fogyasztas);
        this.setBenzinTartalyMeret(benzinTartalyMeret);
        this.setBenzinMennyiseg(benzinMennyiseg);
    }
    
    
    
    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public double getFogyasztas() {
        return fogyasztas;
    }

    public void setFogyasztas(double fogyasztas) {
        this.fogyasztas = fogyasztas;
    }

    public double getKmOra() {
        return kmOra;
    }

    public void setKmOra(double kmOra) {
        this.kmOra = kmOra;
    }

    public double getBenzinTartalyMeret() {
        return benzinTartalyMeret;
    }

    public void setBenzinTartalyMeret(double benzinTartalyMeret) {
        this.benzinTartalyMeret = benzinTartalyMeret;
    }

    public double getBenzinMennyiseg() {
        return benzinMennyiseg;
    }

    public void setBenzinMennyiseg(double benzinMennyiseg) {
        this.benzinMennyiseg = benzinMennyiseg;
    }
    
    public void megy(int km){
            double benzin=(this.getFogyasztas()/100)*km;
            if(benzin<=this.getBenzinMennyiseg()){
                this.setBenzinMennyiseg(this.getBenzinMennyiseg()-benzin);
                this.setKmOra(this.getKmOra()+km);
        }else{
        double vanBenzin=this.getBenzinMennyiseg()/(this.getFogyasztas()/100);
            System.out.println("Nem tudok "+km+" km megtenni, max"+vanBenzin);
}     
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Rendszam: "+this.getRendszam()+
                ", fogyasztas: "+this.getFogyasztas()+
                ", kmOra: "+this.getKmOra()+
                ", benzinTartalyMeret: "+this.getBenzinTartalyMeret()+
                ", benzinMennyiseg: "+this.getBenzinMennyiseg();
    }
    }
