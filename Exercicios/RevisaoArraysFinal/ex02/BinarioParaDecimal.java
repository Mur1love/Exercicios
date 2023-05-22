package ex02;

public class BinarioParaDecimal {
	
	public int conversorBinario(int[] bits) {
		int dec = 0;
		int exp = bits.length-1;
		for (int i = 0; i < bits.length; i++) {
			dec += bits[i] * Math.pow(2, exp);		
			exp--;
		}
		return dec;
		
	}

}
