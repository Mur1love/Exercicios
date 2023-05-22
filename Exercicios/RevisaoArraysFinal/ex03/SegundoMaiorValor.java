package ex03;

public class SegundoMaiorValor {
	
	public int encontrarSegundoMaior(int[] v) {
		int mValor = 0;
		int segmValor = 0;
		
		for (int i = 0; i < v.length; i++) {
			if(mValor < v[i]) {
				mValor = v[i];
			}
		}
		for (int j = 0; j < v.length; j++) {
			if(segmValor < v[j] && v[j] != mValor) {
				segmValor = v[j];
			}
		}
		return segmValor;
	}
	

}
