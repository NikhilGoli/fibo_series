package fibonacci;

public class fibo_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int num=6, num1 = 0, num2 = 1, sum;
		
		for(int i=0; i<num; i++) {
			
			System.out.print( num1 +" " );
		
		 sum=num1+num2;
		num1=num2;
	    num2=sum;
		
		
		}
		
	}

}
