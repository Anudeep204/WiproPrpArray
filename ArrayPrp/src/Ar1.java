

public class Ar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
   int a[]=new int[]{2,4,6,8,9};
   int sum=0;
   for(int i=0;i<a.length;i++)
   {
	
	sum=sum+a[i];
   }
   System.out.println("Sum:"+sum);
   System.out.println("Average:"+(sum/a.length));
	}

}
