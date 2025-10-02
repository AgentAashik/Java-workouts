package List;

import java.util.*;

public class caseTransform {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Rajinikanth");
        names.add("Kamal Hassan");
        names.add("Vijay");
        names.add("Ajith Kumar");
        names.add("Surya");

        List<String> upperNames = new ArrayList<>();
        List<String> lowerNames = new ArrayList<>();

        for(String name : names) {
            upperNames.add(name.toUpperCase());
        }

        for(String name : names) {
            lowerNames.add(name.toLowerCase());
        }

        System.out.println("---------Original List----------");
        for(String name : names) {
            System.out.println(name);
        }

        System.out.println("---------Transform Upper case----------");
        for(String name : upperNames) {
            System.out.println(name);
        }


        System.out.println("---------Transform Lower case----------");
        for(String name : lowerNames) {
            System.out.println(name);
        }



    }
}
