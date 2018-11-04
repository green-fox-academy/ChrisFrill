import java.util.*;

public class MatchMaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static List<String> makingMatches(List<String> girls, List<String> boys){
        ArrayList<String> girlsAndBoys = new ArrayList<String>();
        for (int i = 0; i < girls.size(); i++){
            girlsAndBoys.add(girls.get(i));
            girlsAndBoys.add(boys.get(i));
        }
        return girlsAndBoys;
    }
}