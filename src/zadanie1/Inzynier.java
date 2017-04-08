package zadanie1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Piotrek on 2017-04-05.
 */
public class Inzynier {
    private int wiek;
    private int plec;
    private String imie;
    private String nazwisko;
    private List<String> certyfikat;

    public Inzynier() {
        super();
        imie = "";
        nazwisko = "";
        wiek = 0;
        plec = 0;
        this.certyfikat = new ArrayList<String>();
    }
    public Inzynier(String imie){
        this.imie = imie;
        nazwisko = "";
        wiek = 0;
        plec = 0;
        this.certyfikat = new ArrayList<String>();
    }
    public Inzynier(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        wiek = 0;
        plec = 0;
        this.certyfikat = new ArrayList<String>();
    }
    public Inzynier(String imie, String nazwisko,int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        plec = 0;
        this.certyfikat = new ArrayList<String>();
    }
    public Inzynier(String imie, String nazwisko, int wiek, int plec){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plec = plec;
        this.certyfikat = new ArrayList<String>();
    }
    public Inzynier(String imie, String nazwisko, int wiek, int plec, List<String> certyfikat){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plec = plec;
        this.certyfikat = certyfikat;
    }
    public Inzynier(Inzynier inz){
        wiek = inz.wiek;
        plec = inz.plec;
        imie = inz.imie;
        nazwisko = inz.nazwisko;
        certyfikat = inz.certyfikat;
    }

    public int getWiek(){
        return wiek;
    }
    public int getPlec(){
        return plec;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public List<String> getCertyfikat(){
        return certyfikat;
    }
    public void setWiek(int wiek){
        this.wiek = wiek;
    }
    public void setPlec(int plec){
        this.plec = plec;
    }
    public void setImie(String imie){
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }
    public void setCertyfikat(ArrayList<String> certyfikat){
        this.certyfikat = certyfikat;
    }
    public void addCertyfikat(String certyfikat){
        this.certyfikat.add(certyfikat);
    }
    public boolean przydatny() {
        return wiek < 40 && certyfikat.size() > 3;
    }
    public void wpiszDane(String imie, String nazwisko, int wiek, int plec, String certyfikat) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plec = plec;
        this.certyfikat = new ArrayList<String>();
        this.certyfikat.add(certyfikat);
    }
    public void printDane() {
        String printPlec;
        if (plec == 1){
            printPlec = "Meżczyzna";
        }else if(plec == 2){
            printPlec = "Kobieta";
        }else {
            printPlec = "niezidentyfikowana";
        }
        System.out.println("Imie:" + imie + " Nazwisko:" + nazwisko + " wiek:" + wiek + " Płeć:" + printPlec + "\n Certyfikaty:");
        for(String crt: certyfikat) {
            System.out.println(crt);
        }
    }
}

class ComparatorImie implements Comparator<Inzynier> {

    @Override
    public int compare(Inzynier o1, Inzynier o2) {
        return o1.getImie().compareTo(o2.getImie());
    }
}
class ComparatorNazwisko implements Comparator<Inzynier> {

    @Override
    public int compare(Inzynier o1, Inzynier o2) {
        return o1.getNazwisko().compareTo(o2.getNazwisko());
    }
}
