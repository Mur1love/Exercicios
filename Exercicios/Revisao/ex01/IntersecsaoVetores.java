package ex01;

import java.util.Arrays;

public class IntersecsaoVetores {
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,5};
		int[] y = {1,7,3,5,6};
		int[] res = encontrarIntersecsao(x, y);
		
		System.out.println(Arrays.toString(res));
		
	}

	private static int[] encontrarIntersecsao(int[] x, int[] y) {
		int[] aux = new int[x.length + y.length];
		int k = 0;
		
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < y.length; j++) {
				if(x[i] == y[j]) {
					aux[k++] = x[i];
				}
			}
		}
		
		int[] res = new int[k];
		for(int i = 0; i < k; i++) {
			res[i] = aux[i];
		}
		return res;
	}

}
