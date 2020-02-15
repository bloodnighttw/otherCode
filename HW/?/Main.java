import java.util.*;
public class Main
{
   public static void main(String[] args)
   {
	Scanner sc = new Scanner(System.in);
	int x=0;
	 x =sc.nextInt();
	 sc.nextLine();
	float sum =(float) 0;
	for(int i=0;i<x;i++)
	 sum =sum+ sc.nextFloat();
	 
 	System.out.println((sum/x));	

   
   }
   

   
}
