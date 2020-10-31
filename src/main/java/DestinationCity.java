import basic.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity{
    public static void main(String[] args) {
        DestinationCity d = new DestinationCity();
        List<List<String>> paths = new ArrayList<>();
        List<String> l1 = new ArrayList<>(); l1.add("London"); l1.add("New York");
        List<String> l2 = new ArrayList<>(); l2.add("New York"); l2.add("Lima");
        List<String> l3 = new ArrayList<>(); l3.add("Lima"); l3.add("Sao Paulo");
        paths.add(l1);
        paths.add(l2);
        paths.add(l3);
        System.out.println(d.destCity(paths));
    }
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for(List l: paths){
            set.add((String) l.get(0));
        }
        for(List l: paths){
            String second = (String) l.get(1);
            if(!set.contains(second)){
                return second;
            }
        }
        return "";
    }

}