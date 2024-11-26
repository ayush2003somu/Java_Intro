public class lenLastwd {

    public static void main(String[] args) {
        String s = "   fly me   to   the moona  ";
        int count=0;
        for (int i=s.length()-1;i>=0;i--){
            if (s.substring(i,i+1).equals(" ")){
                continue;
            }
            else {
                count++;
                if ((i-1)!=-1 && s.substring(i-1,i).equals(" ")){
                    break;
                }
            }
        }
        System.out.println(count);
    }
    }
