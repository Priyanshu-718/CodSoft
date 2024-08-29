import java.util.*;
public class studentgradecalculator
{
public static void main(String[] args)
{
    Scanner a=new Scanner(System.in);
    int m1;
    int m2;
    int m3;
    int m4;
    int m5;
    int m6;
    int m7;
    int total;
    float avg;
    float result;
    System.out.println("Enter marks for subject one  :");
    m1=a.nextInt();
    System.out.println("Enter marks for subject two :");
    m2=a.nextInt();
    System.out.println("Enter marks for subject three :");
    m3=a.nextInt();
    System.out.println("Enter marks for subject four :");
    m4=a.nextInt();
    System.out.println("Enter marks for subject five :");
    m5=a.nextInt();
    System.out.println("Enter marks for subject 6 :");
    m6=a.nextInt();
    System.out.println("Enter marks for subject seven :");
    m7=a.nextInt();
    total=m1+m2+m3+m4+m5+m6+m7;
    avg=total/7;
    if(avg>=90)
    {
        System.out.println("Excelent");
    }
    else if(avg>80 && avg<90)
    {
        System.out.println(" Very Good ");
    }
    else if(avg>70 && avg<80)
    {
        System.out.println("Good");
    }
    else if(avg>70 && avg<60)
    {
        System.out.println("Average amrks");
    }
    else
    {
        System.out.println("Fail");
    }
    System.out.println("Result is: "+avg);

}
}