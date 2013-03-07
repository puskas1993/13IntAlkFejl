package exception1;
public class Exception1 {
    public static void main(String[] args) {
        try{
            int a=5;
            int b=0;
            int c=a/b;
            int[] A;
            A = new int[5];
            A[-1]=c;
        }
        catch(ArithmeticException e){
            System.out.println("Aritmetikai hiba: "+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Tomb hiba: "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("Hiba: "+e.getMessage());
        }
    }
}
