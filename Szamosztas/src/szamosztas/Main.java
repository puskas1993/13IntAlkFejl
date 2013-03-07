package szamosztas;
public class Main {
    public static void main(String[] args) {
       int szam=12343;
       int sum=0;
               
       do{
           sum+=szam%10;
           szam=szam/10;
           System.out.println(sum);
           System.out.println(szam);
       }  while(szam/10!=0);
       
       sum+=szam%10;
       
      System.out.println(sum);  
        
    }
}
