import java.util.*;

public class strings {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // String str = sc.nextLine();
        // // StringBuilder name = new StringBuilder(str);
        // System.out.println(name);


        // String name2 = sc.nextLine()  ;
        // System.out.println(name2);

        // if (name.compareTo(name2)==0){
        //     System.out.println("strings are equal");

          // }
         // else{
        //     System.out.println("strings are not equal");
//  alter on the index
    // for (int i=0;i<=name.length();i++){
    //     String str2= sc.nextLine();
    //     // name.setCharAt(i,str2);
    //     System.out.println(name);
    //     // insert in betwen the string
    //     name.insert(i,str2 );
    //     System.out.println(name);
    //     // delete any character
    // }
    // StringBuilder str2 = new StringBuilder("");



      //   ## String Matching ##
    String[] words = {"mass","as","hero","superhero"};
       List<String> str = new ArrayList<>();
       for (int i=0;i<words.length-1;i++){
           for (int j =i+1;i<words.length;j++){
               if (words[i].length()>words[j].length()){
                   continue;
               }
               else if (words[j].contains(words[i])){
                   if(!str.contains(words[i])){
                   str.add(words[i]);
                   }
               }
               
           }
       }
       System.out.println(str);

        }

      }
  