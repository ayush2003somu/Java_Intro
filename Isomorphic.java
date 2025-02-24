import java.util.*;
class Isomorphic {
    public static void main(String [] args) {
        String s1="jmpdwrd";
        String s2="tglkqyk";
        if (s1.length()!=s2.length()) System.out.println("false");
        HashMap<Character,Integer> set1 = new HashMap<>();
        HashMap<Character,Integer> set2 = new HashMap<>();
        for (int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if (set1.containsKey(c)){
                set1.put(c,set1.get(c)+1);
            }
            else{
                set1.put(c,1);
            }
            c = s2.charAt(i);
            if (set2.containsKey(c)){
                set2.put(c,set2.get(c)+1);
            }
            else{
                set2.put(c,1);
            }            
        }
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for (char key:set1.keySet()){
            list1.add(set1.get(key));
        }
        for (char key:set2.keySet()){
            list2.add(set2.get(key));
        }
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(set1);
        System.out.println(set2);        
        if (list1.equals(list2))System.out.println("True");
        else System.out.println("false");
    }
}