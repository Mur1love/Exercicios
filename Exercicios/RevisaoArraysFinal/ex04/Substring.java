package ex04;

public class Substring {
	
		public String[] pegarLetraA(String[] v){
		
		String[] vv = new String[v.length];
		
		for (int i = 0; i < v.length; i++) {
			if(v[i].substring(0, 1).equalsIgnoreCase("a")) {
				vv[i] = v[i];
			}
		}
		return vv;
	}

}
