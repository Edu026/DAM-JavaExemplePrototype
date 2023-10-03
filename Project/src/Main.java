import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Electrodomestic> llista = new ArrayList<>();
        List<Electrodomestic> llistaCopy = new ArrayList<>();

        Rentadora rentadora = new Rentadora(); 

        rentadora.nom = "Sony 2000";
        rentadora.color = "White";
        rentadora.preu = 500;
        rentadora.marca = "SONY";
        rentadora.eficiencia = "B";
        rentadora.revolucions = 10;
        rentadora.soroll = 200;

        llista.add(rentadora);
   
        Rentadora anotherRentadora = (Rentadora) rentadora.clone();
        llista.add(anotherRentadora);

        Forn forn = new Forn();

        forn.nom = "Fornet 77";
        forn.color = "Black";
        forn.preu = 770;
        forn.marca = "BOSH";
        forn.eficiencia = "C";
        forn.temperatura = 300;
        forn.autonetella = "si";

        llista.add(forn);

        Forn anotherForn = (Forn) forn.clone();


        // Clonar la llista
        for (Electrodomestic obj : llista) {
            llistaCopy.add(obj.clone());
        }

        System.out.println("Comparar la mateixa llista:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llista.get(i));
        }

        System.out.println("Comparar amb la llista clonada:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(i));
        }

        System.out.println("Comparar amb la llista clonada però invertida:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(llista.size() - i - 1));
        }
    }

    static void compare (int i, Electrodomestic a, Electrodomestic b) {
        if (a == b) {
            System.out.println(i + ": Els electrodomestics són el mateix objecte");
        } else {
            System.out.print(i + ": Els electrodomestics són objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": Els electrodomestics són idèntics");
            } else {
                System.out.println(i + ": Els electrodomestics NO són identics");
            }
        }
    }
}
