package fr.afpa;

import java.util.Stack; //*** 

public class StackApp {
    public static void main(String[] args) {

        // Ressources :
        // https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-5 -> crtl + F : '14.6.7.1. L'interface java.util.Deque' (ca aide si vous y retrouvez sinon utilisé les autres)
        // https://codegym.cc/fr/groups/posts/fr.828.pile-java
        // https://www.youtube.com/watch?v=KInG04mAjO0
        

        //Instancier une nouvelle Stack(Pile) sur le theme de votre choix
        Stack<String> stack = new Stack<String>();
        
        //Ajouter des valeurs dans votre stack
        stack.push("lolipop");  //.PUSH
        stack.push("chocolate");
        stack.push("chewing-gum");
        stack.push("marshmallow");
        stack.push("smurf"); 
        stack.push("tagada");
        stack.push("dragibus");


        //Afficher votre stack
        System.out.println("Voici les éléments de notre Stack: " + stack);

        //Supprimer l'élément du dessus de votre stack
        System.out.println("Suppression de l'élément du dessus");
        stack.pop();  //.POP
        
        //Afficher l'élément du dessus de votre stack
        System.out.println("Affichage de l'élément du dessus: " + stack.peek());  //.PEEK()

        //Supprimer le premier élément de votre stack
        System.out.println("Suppression du premier élément");
        // stack.removeFirst();  //.REMOVEFIRST()

        //Afficher le premier élément de votre stack
        System.out.println("Affichage du premier élément: " + stack.get(0));  //.GET(index)
       
        //Chercher et affichez la position d'un de vos éléments (la valeur indiquera la position de l'élément par rapport au dessus de la stack)
        System.out.println("L'élément est en " + stack.search("smurf") + "eme position par rapport au dessus de la Stack");   //.SEARCH()

        //Vérifier si votre stack est vide 
        System.out.println("La Stack est vide?: " + stack.isEmpty());  //.ISEMPTY()

        //Supprimer tous les éléments de votre stack
        System.out.println("Suppression de tous les élements de notre Stack");
        stack.clear();  //.CLEAR()

        //Refaire la vérification
        System.out.println("La Stack est vide?: " + stack.isEmpty());  //.ISEMPTY()
       
    }
}
