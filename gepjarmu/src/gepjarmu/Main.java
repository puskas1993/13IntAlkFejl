package gepjarmu;
public class Main {
    public static void main(String[] args) {
        gepjarmu g1=new gepjarmu(4,72);
        g1.setFogyasztas(7.2);
        g1.setSebesseg(132);
        g1.setSzemelyszam(3);
        System.out.println(g1);
        
        auto ford=new auto("FFG-234","WASW234",40.0,40.0,4,80,7.2);
        System.out.println(ford);
        ford.megy(120);
        System.out.println(ford);
        ford.Tankol(4);
        System.out.println(ford);
        
        auto audi=new auto("asd-123","QWER1234",50.0,50.0,4,90,8.1);
        System.out.println(audi);
        audi.megy(300);
        System.out.println(audi);
        audi.Tankol(100);
        System.out.println(audi);
        
    }
}
