package fr.afpa;

//L'import de java HashMap
import java.util.HashMap; //***

public class HashMapApp {
    public static void main(String[] args) {

        // Ressources :
        // https://www.youtube.com/watch?v=I9aBP0xm-lE
        // https://www.w3schools.com/java/java_hashmap.asp
        // https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-5


        //Instancier une nouvelle HashMap sur le theme de votre choix
        HashMap<String, String> aquaCreatures = new HashMap<String, String>();
        
        //Ajouter des paires clé/valeur à votre HashMap - au moins 5 paires
        aquaCreatures.put("river","salmon");
        aquaCreatures.put("lake","snake");
        aquaCreatures.put("sea","turtle");
        aquaCreatures.put("ocean","dolphin");
        aquaCreatures.put("aquarium","goldfish");

        //Récupérer la valeur d'une de vos paires
        System.out.println("La valeur récupérée est: " + aquaCreatures.get("river"));  //.GET()

        //Vérifier si une de vos clés est contenue dans la collection
        System.out.println("La clé en paramètre est présente: " + aquaCreatures.containsKey("lake"));  //.CONTAINSKEY()

        //Vérifier si une de vos valeurs est contenue dans la collection
        System.out.println("La valeur en paramètre est présente: " + aquaCreatures.containsValue("salmon"));  //.CONTAINSVALUE()

        //Ajouter une paire clé/valeur à votre HashMap
        System.out.println("Ajout d'une nouvelle paire clé/valeur");
        aquaCreatures.put("beach", "crab");    //.PUT()

        //Utiliser une méthode pour trouver le nombre de paires (la longueur de votre HashMap) et affichez la en console
        System.out.println("Nombre de paires clé/valeur: " + aquaCreatures.size());  //.SIZE()

        //Afficher toutes les clés de votre HashMap (avec une boucle for each & avec une méthode de HashMap)
        System.out.println("Voici les clés de notre HashMap: ");
        for (String i : aquaCreatures.keySet()) {    //.KEYSET()
            System.out.println(i);
        }

        System.out.println(aquaCreatures.keySet());

        //Afficher toutes les valeurs de votre HashMap (avec une boucle for each & avec une méthode de HashMap)
        System.out.println("Voici les valeurs de notre HashMap: ");
        for (String i : aquaCreatures.values()) {    //.VALUES()
            System.out.println(i);
        }

        System.out.println(aquaCreatures.values());  //.VALUES()

        //Afficher toutes les clés/valeurs de votre HashMap (avec une boucle for each & avec une méthode de HashMap)
        System.out.println("Voici les paires de notre HashMap: ");
        for (String i : aquaCreatures.keySet()) {   //.KEYSET()
            System.out.println("key: " + i + " value: " + aquaCreatures.get(i));  //.GET()
        }

        System.out.println(aquaCreatures.entrySet());  //.ENTRYSET()

        //Supprimez une de vos paires
        System.out.println("Suppression d'une de nos paires");
        aquaCreatures.remove("river");  // .REMOVE()

        //Vérifier si votre HashMap est vide
        System.out.println("La Hashmap est vide? :" + aquaCreatures.isEmpty());  //.ISEMPTY()
       

        //Supprimer tous les éléments de votre HashMap
        System.out.println("Suppression de tous les élements de notre HashMap");
        aquaCreatures.clear();   //.CLEAR()

        //Refaire la vérification
        System.out.println("La Hashmap est vide? :" + aquaCreatures.isEmpty());  //.ISEMPTY()

    }
}
