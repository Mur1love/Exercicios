package ex02;

public class PrincipalBinPDec {
	
	public static void main(String[] args) {
		BinarioParaDecimal c = new BinarioParaDecimal();
		
		int bits[] = {0,0,1,1,1};
		
		int dec = c.conversorBinario(bits);
		
		System.out.println(dec);
		
		
	}

}
