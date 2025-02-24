class reverseString{
    public static void main(String[] args) {
        String s = "  Hello World  ";
        String str ="";
        int count=0;

        for (int i=s.length()-1;i>=0;i--){
            if (s.charAt(i)==' ' && count==0){
                continue;
            }
            else if (s.charAt(i)!=' '){
                count++;
                System.out.println(count);
                if (i==0){
                    str = str + s.substring(i, i+count);
                    }
            }
            else {
                System.out.println(s.substring(i+1, i+1+count));
                str = str + s.substring(i+1, i+1+count)+" ";
                count=0;
                
            }

        }
        System.out.println("'"+str+"'");
        if (str.su)
        System.out.println(str.substring(0, str.length()-1));
        

    }
}