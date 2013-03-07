package kaveautomata;
public final class kaveautomata {
    
    private String kavemarka;
    private int ar;
    private double tartalymennyiseg;
    private double tartalykapacitas;

    public kaveautomata(int ar, String kavemarka, double tartalymennyiseg, double tartalykapacitas){
        this.setKavemarka(kavemarka);
        this.setAr(ar);
        this.setTartalyMennyiseg(tartalymennyiseg);
        this.setTartalyKapacitas(tartalykapacitas);
    
}

    public String getKavemarka() {
        return kavemarka;
    }

    public void setKavemarka(String kavemarka) {
        this.kavemarka = kavemarka;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public double getTartalymennyiseg() {
        return tartalymennyiseg;
    }

    public void setTartalymennyiseg(double tartalymennyiseg) {
        this.tartalymennyiseg = tartalymennyiseg;
    }

    public double getTartalykapacitas() {
        return tartalykapacitas;
    }

    public void setTartalykapacitas(double tartalykapacitas) {
        this.tartalykapacitas = tartalykapacitas;
    }

    private void setTartalyMennyiseg(double tartalymennyiseg) {
        this.tartalymennyiseg=tartalymennyiseg;
    }

    private void setTartalyKapacitas(double tartalykapacitas) {
        this.tartalykapacitas=tartalykapacitas;
    }

    @Override
    public String toString() {
        return "kaveautomata{" + "kavemarka= " + this.getKavemarka() + ", ar= " + this.getAr() + ", tartalymennyiseg=" + 
                this.getTartalymennyiseg() + ", tartalykapacitas=" + this.getTartalykapacitas() + '}';
    }
    
    
    
}