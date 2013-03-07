package fx3x_2;
public class Main {
    public static double F(double x){
        return (3*x)-2;
    } 
    
    public static void main(String[] args) {
        int j=0;
        
        for(double i=-3500; i<=3500; i+=0.01){
        //System.out.println(F(i));
            j++;
        }
            System.out.println("Pontok szama: "+j);
        
    }
}
