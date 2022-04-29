package fr.waytolearnx;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

    //1 - exercice 1 - écrire : hello world !
//------------------------------------------------------
        //System.out.println("hello world !");

        // exercice 2 - Écrivez une méthode qui inverse une chaîne.
//------------------------------------------------------
        //String str = "WayToLearnX";

        //StringBuffer sb = new StringBuffer(str);

        //System.out.println(sb.reverse());

    // Exercice 3- Écrivez une méthode qui renvoie
//------------------------------------------------------
        //int[] tab = {1, 1, 2, 9, 4};
        //a- le plus grand entier dans un tableau.
        // System.out.println(Arrays.stream(tab).max().getAsInt());
        //Ou
        /*int max = tab[0];
        for (int i : tab) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);*/
        //ou
        /*int max = tab[0];
        for (int i = 0; i < tab.length-1; i++) {
        max = Math.max(tab[i], tab[i+1]);
        }
        System.out.println(max);*/

        //b- le plus petit entier dans un tableau.
        //System.out.println(Arrays.stream(tab).min().getAsInt());

        //c- le nombre d'occurences de chaque chiffre dans un tableau.
        //System.out.println(Arrays.stream(tab).boxed().collect(java.util.stream.Collectors.groupingBy(i -> i, java.util.stream.Collectors.counting())));

        //d- la somme de tous les chiffres dans un tableau.
        //System.out.println(Arrays.stream(tab).sum());

        //e- la moyenne de tous les chiffres dans un tableau.
        //System.out.println(Arrays.stream(tab).average().getAsDouble());

        //f- convertir un tableau en liste.
        /*for (int i : tab) {
        System.out.print(i + ",");
        }
        System.out.println(Arrays.stream(tab).boxed().collect(Collectors.toList()));*/

        //g- convertir un tableau en set.
        //System.out.println(Arrays.stream(tab).boxed().collect(Collectors.toSet()));

        // Exercice 4 - Écrivez un programme Java pour afficher la valeur ascii d’un caractère donné.
//------------------------------------------------------
        /*int chr = 'A';
        System.out.println("La valeur ASCII de A est "+chr+".");*/

        // Exercice 5 - Écrivez un programme Java pour trouver la taille d’un fichier.
//------------------------------------------------------
        /*String file = "src/fr/waytolearnx/Main.java";
        System.out.println("La taille du fichier est "+new java.io.File(file).length()+" octets.");*/

        // Exercice 6 - Écrivez un programme Java pour afficher la date d’aujourd’hui.
//------------------------------------------------------
       // System.out.println("La date d'aujourd'hui est "+Calendar.getInstance().getTime());

        // Exercice 7 - Écrivez un programme Java pour afficher la date d’aujourd’hui en français.
//------------------------------------------------------
        //a- en chiffres
        /*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(java.time.LocalDate.now()));*/

        //b- en lettres
        /*DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
        System.out.println(dtf2.format(java.time.LocalDate.now()));*/

        //c- avoir le jour d'aujourd'hui en lettres
        /*DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEEE");
        System.out.println(dtf3.format(java.time.LocalDate.now()));*/

        //d- avoir le jour d'aujourd'hui en chiffres
       /* DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("d");
        System.out.println(dtf4.format(java.time.LocalDate.now()));*/

        //e- le jour de la semaine en chiffre (1 = lundi, 2 = mardi, etc.)
        //System.out.println(java.time.LocalDate.now().getDayOfWeek().getValue());

        // f- jour et heure selon le format spécifié
        /*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));*/

        // Exercice 8 - Écrivez un programme Java pour afficher la date d’aujourd’hui en anglais.
//------------------------------------------------------
        /*System.out.println(new java.util.Date().toString());*/

        // Exercice 9 - Écrivez un programme Java pour afficher la date d’aujourd’hui en français.
//------------------------------------------------------
        /*System.out.println(new java.util.Date().toString());*/

        // Exercice 10 - Écrivez un programme qui affiche la vitesse moyenne en miles par heure.
//------------------------------------------------------
        /*double vitesse = 10;
        double distance = 100;
        double temps = 1;
        System.out.println("La vitesse moyenne en miles par heure est "+vitesse*distance/temps+".");*/

        // Exercice 11 - Écrivez un programme Java pour afficher la vitesse moyenne en km par heure.
//------------------------------------------------------
        /*double vitesse = 10;
        double distance = 100;
        double temps = 1;
        System.out.println("La vitesse moyenne en km par heure est "+vitesse*distance/temps+".");*/

        // Exercice 12 - Écrivez un programme Java pour afficher la vitesse moyenne en km par heure.
//------------------------------------------------------
        /*double vitesse = 10;
        double distance = 100;
        double temps = 1;
        System.out.println("La vitesse moyenne en km par heure est "+vitesse*distance/temps+".");*/

        // Exercice 13 - Écrivez un programme Java pour afficher la vitesse moyenne en km par heure.
//------------------------------------------------------
        /*double vitesse = 10;
        double distance = 100;
        double temps = 1;
        System.out.println("La vitesse moyenne en km par heure est "+vitesse*distance/temps+".");*/

        // Exercice 14 - Une bonne vieille factorielle
        //------------------------------------------------------

        /*int result = 1;
        int fact = 5;

        for (int i = 1; i <= fact; i++) {
            result *= i;
        }
        System.out.println(result);
*/

        // Exercice 15 - Un bon vieux fizz buzz
        //------------------------------------------------------

        /*for (int i = 1; i <= 100; i++) {
            System.out.println(i%15==0 ? "FizzBuzz" : i%3==0 ? "Fizz" : i%5==0 ? "Buzz" : i);
        }
*/
        // Exercice 16 - Un chouette tri à bulles

       // int tab[] = {1,40, 39,454,15,68,27,38,39,10};

        /*for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length-1; j++) {
                if (tab[j] > tab[j+1]) {
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(tab));*/

        //ou

       /* ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(tab).boxed().sorted().collect(Collectors.toList());

        for (Integer n : integerArray) {
            System.out.print(n + " ");
        }*/


    }
}
