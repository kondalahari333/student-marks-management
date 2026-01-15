//java application to manage student marks
import java.util.*;
public class studentmarks {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student name:");
        String n=sc.nextLine();
        int marks[]=new int[3];
        int total=0;
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
            total=total+marks[i];
        }
        double average=total/(double)marks.length;
        System.out.println("total marks:"+total);
        System.out.println("average marks:"+average);;
        if(average>=75){
            System.out.println("Distinction.");
        }
        else if(average>=60){
            System.out.println("First class");
        }
        else if(average>=40){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }

    }
    
}
