package codsoft;
import java.util.*;
public class Task2
{
int n =0,total=0;
float avg=0;
public Task2(int arr[],int n)
{
this.n=n;
   for(int i=0;i<n;i++)
   {
    total+=arr[i];
   }
   avg=(float)total/n;
}
public int gettotal()
{
return total;
}
public float getavg()
{
return avg;
}
public String getGrade()
{
String grade;
if (avg >= 90)
{
grade = "A";
        }
        else if (avg>= 80)
        {
            grade = "B";
        }
        else if (avg >= 70)
        {
            grade = "C";
        }
        else if (avg >= 60)
        {
            grade = "D";
        }
        else
        {
            grade = "F";
        }
        return grade;
}        
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of Subjects:");
int n = sc.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the marks obtained out of 100 in subject " + (i + 1) + ": ");
arr[i] = sc.nextInt();
}
Task2 t = new Task2(arr,n);
System.out.println("Total marks: "+t.gettotal());
System.out.println("Average Percenatge: "+t.getavg()+"%");
System.out.println("Grade: "+t.getGrade());
sc.close();
 }
}
