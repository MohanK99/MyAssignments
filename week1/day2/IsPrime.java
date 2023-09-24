package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		
		int a=10;
		boolean flag=true;
		for(int i=1;i<a;i++)
		{
			if(a%2==1)
			flag=false;
			break;
			}
		if(flag)
			System.out.println("It is a Prime number");
		else
			System.out.println("It is not a Prime number");
}
	
	
}
