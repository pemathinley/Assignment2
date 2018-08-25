
import java.util.Scanner;
class Print
{
    public void print()
    {
        System.out.println("NULL argument");
    }
    public void print(int x)
    {
        System.out.println("Integer argument"+ x);
    }
    public void print(float x)
    {
        System.out.println("float argument"+x);
    }
}
public class overload
{
    public static void main(String args[])
    {
	   Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        float d=sc.nextFloat();
		Print a = new Print();
        Print b = new Print();
        Print c = new Print();
        a.print();
        b.print(p);
        c.print(d);
    }
}
