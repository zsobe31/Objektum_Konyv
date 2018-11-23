

package objektum_konyv;


public class Konyv {

    int oldalszam;
    int aktualis;
    boolean nyitva;
    
    public Konyv(){
        oldalszam = (int)(Math.random()*100)+1;
        aktualis = 0;
        nyitva = false;
    }
    public void kinyit(){
        if (nyitva) {
            System.out.println("A könyv nyitva van!");
            return;
        }
        nyitva = true;
        aktualis = (int)(Math.random()*aktualis)+1;
        System.out.println("Kinyitottad a könyvet a(z) " + aktualis + " oldalon!");
    }
    public void bezar(){
        if (!nyitva) {
            System.out.println("A könyv be van csukva!");
            return;
        }
        nyitva = false;
        aktualis = 0;
        System.out.println("Becsuktad a könyvet!");
    }
    public void nez(){
        if (nyitva) {
            System.out.println("A könyv nyitva van a(z) " + aktualis + " oldalon!");
        }
        else {
            System.out.println("A könyv csukva van!");
        }
    }
    public void lapoz( int irany ){
        if (!nyitva) {
            System.out.println("A könyv csukva van!");
            return;
        }
        // előre lapozás
        if (irany > 0) {
            aktualis++;
            System.out.println("Lapoztál egy oldalt!");
        }
        // hátra lapozás
        else {
            aktualis--;
            System.out.println("Visszalapoztál egy oldalt!");
        }
        if (aktualis == 0 || aktualis == oldalszam + 1) {
            bezar();
        }
        
    }
    public void porget( int irany ){
        int elozo, mennyit;
        if (!nyitva) {
            System.out.println("A könyv csukva van, nem pörgethető!");
            return;
        }
        elozo = aktualis;
        // előre pörgetés
        if (irany > 0) {
            if (aktualis == oldalszam) {
                System.out.println("Az utolsó oldalon tartasz, arra nem pörgethetsz!");
                return;
            } 
            // fennmaradó oldalak
            mennyit = (int)(Math.random()*(oldalszam-aktualis))+aktualis+1;
            aktualis = mennyit;
            System.out.println("Hátra pörgettél " + Math.abs(elozo-aktualis) + " oldalt!");
        }
        // egyébként hátrafelé pörgetés
        else{
            if (aktualis == 1) {
                System.out.println("Már az első oldalon tartasz, arra nem pörgethetsz!");
                return;
            }
            // lehetséges oldalak
            mennyit = (int)(Math.random()*(aktualis-1))+1;
            aktualis = mennyit;
            System.out.println("Előre pörgettél " + Math.abs(elozo-aktualis) + " oldalt!");
        }
    }
    public String toString(){
        return " Könyv { " + " oldalszám = " + oldalszam + ", aktuális = " + aktualis +
                ", nyitva = " + nyitva + " }";
    }
    
}
