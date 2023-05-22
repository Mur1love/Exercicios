package ex04;

public class PrincipalSubstring {
	
	public static void main(String[] args) {
		
		Substring s = new Substring();
		
		String[] x = {"Amanda", "Pedro", "Auricelio", "Ribamar"};
		
		String[] h = s.pegarLetraA(x);
		
		for (String i : h) {
			if(i != null) {
				System.out.println(i);
			}
		}
	}

}
