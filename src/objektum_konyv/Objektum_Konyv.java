

package objektum_konyv;


public class Objektum_Konyv {

    
    public static void main(String[] args) {

        Konyv k1 = new Konyv();
        System.out.println(k1);
        k1.kinyit();
        k1.kinyit();
        k1.bezar();
        k1.nez();
        k1.kinyit();
        k1.nez();
        k1.bezar();
        k1.lapoz(1);
        k1.kinyit();
        k1.lapoz(1);
        k1.lapoz(1);
        k1.nez();
        System.out.println(k1);
        k1.porget(1);
        k1.porget(-1);
        k1.nez();

    }

}
