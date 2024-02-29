import java.util.*;

public class first {
    public static void main(String args[]){
        System.out.println("Helloworld Hi i am ayush and this is my fisrt ever java project.");

        //output {\n} to shift to second line.

        //print System.out.print("Hellow rold");
        // println  System.out.println("HEllo world");   to print further on second line
        //
    System.out.print("*\n**\n***\n****\n");
    // int a=25;
    // int b=30;
    // String name="Ayush";
    // System.out.println(2*(a+b));
    // //System.out.println(name);
    // int bod=(2*4)/(5+3);
    // System.out.println(bod);
    Scanner sc = new Scanner(System.in);
    System.out.print("i1:");
    int i1= sc.nextInt();
    System.out.print("i2:");
    int i2= sc.nextInt();
   // String s1= sc.next("Enter the string");
    // System.out.println(s1);
    // System.out.printf("integer 2",i2);
    // System.out.printf("String",s1,"Integer",i1,"Intenger",i2);
    // if (i1==i2){
    //     System.out.println("equal");
    // }

    
    // else {
    //     if (i1>i2){
    //         System.out.println(" 1>2");
    //     }
      
    
    //     else { 
    //         System.out.println("1<2");
    //     }
    // }
    // }

    switch (i1) {
        case 1:System.out.println("one");
             break;
        case 2:System.out.println("two");
            break;
        case 3:System.out.println("THREE");
            break;    
        default:System.out.println("Value exceded");
            break;
    }


    // BASIC CALCULATOR
    System.out.print("Enter the operator: 1:+ , 2:- , 3:* , 4:/ : ");

    int s1 = sc.nextInt();
    if (s1==1){
        System.out.println(i1+i2);
    }
    else if (s1==2){
        System.out.println(i1-i2);

    }
    else if (s1==3){
        System.out.println(i1*i2);
    }
    else if (s1==4){
        System.out.println(i1/i2);
    }
    else{
        System.out.println("Wrong Input");
    }
    
    }
}
