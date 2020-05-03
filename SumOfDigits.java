package week1.day1.classroom;

public class SumOfDigits {

	public static void main(String[] args) {
		int sum=123;
		int rem=0;
		
		while(sum!=0)
		{
			rem+=(sum%10);
			System.out.println("remainder is"+ " " + rem );
			sum=sum/10;
			System.out.println("quotient is " +" " + sum);
		}
		
		System.out.println("sum of three numbers  is" + " " + rem);
	}

}
