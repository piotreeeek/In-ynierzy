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
        lista.add(new Inzynier("Dawid", "Kowalski"));
        lista.add(new Inzynier("samian", "Choj", 34, 4, "tre"));
        lista.add(new Inzynier("Jan", "Kowal", 5, 56));

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
