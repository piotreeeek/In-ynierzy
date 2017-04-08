package zadanie1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Piotrek on 2017-04-05.
 */
public class Start {
    public static void main(String[] args) {

        List<Inzynier> lista = new ArrayList<Inzynier>();
        List<String> certList = new ArrayList<String>();
        certList.add("Certyfikat1");
        certList.add("Certyfikat 2");
        certList.add("certyfikat3");

        lista.add(new Inzynier("Dawid", "Kowalski"));
        lista.add(new Inzynier("Marta", "Zwierzchowska", 34, 1, certList));
        lista.add(new Inzynier("Jan", "Kaminski", 5, 2));

        for (Inzynier inz: lista){
            inz.printDane();
        }
        System.out.println("Sortowanie imon:");
        lista.sort(new ComparatorImie());
        for (Inzynier inz: lista){
            inz.printDane();
        }
        System.out.println("Sortowanie nazwisk:");
        lista.sort(new ComparatorNazwisko());
        for (Inzynier inz: lista){
            inz.printDane();
        }
    }
}
