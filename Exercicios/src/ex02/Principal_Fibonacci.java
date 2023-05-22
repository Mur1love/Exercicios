package ex02;

public class Principal_Fibonacci {
	
	public static void main(String[] args) {
		
		int n1 = 0, n2 = 1;
		int proxNum = 0;
		
		System.out.println("Fibonacci Sequence: ");
		
		while (proxNum <= 150) {
			
			System.out.println(proxNum);
			n1 = n2;
			n2 = proxNum;
			proxNum = n1 + n2;
		
		}
		
	}

}
