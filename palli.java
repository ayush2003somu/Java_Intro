public class palli { 
    public static void main(String[] var0) {
      System.out.println("Ayush Srivastava");

      String s = "0p";
      StringBuilder s1 = new StringBuilder("");
      s=s.toLowerCase();
      for (int i=0;i<s.length();i++){
        if (Character.isAlphabetic(s.charAt(i))||s.charAt(i) >= '0' & s.charAt(i) <= '9'){
         s1=s1.append(s.charAt(i));
        }  
      }
      StringBuilder s2= new StringBuilder("");
      for (int i=0;i<s1.length();i++){
         s2.append(s1.charAt(s1.length()-i-1));
      }
      System.out.println(s1);
      System.out.println(s2);
      if (s1.toString().equals(s2.toString())){
         System.out.println("pall");
      }
      else{
         System.out.println("not pall");
      }
    }
 }
 

