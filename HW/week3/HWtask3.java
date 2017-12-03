import java.util.*;
public class HWtask3 {
	static int j = 0;
	public static String[] permutation(String str) { 
    	String[] list = new	String[9999];
    	permutation("", str,list); 
    	return list;
}

private static void permutation(String prefix, String str, String[] strlist) {
    int n = str.length();
    if (n == 0) {
    	boolean check = false;
    	for(String s : strlist){
    		if(s == null){continue;}
    		if(s.equals(prefix)){
    			check = true;
    		}
    	}
    	if(!check){
    		strlist[j] = prefix;
    		j++;
    	}
    }
    else {
        for (int i = 0; i < n; i++){
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), strlist);
        }
    }

}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String a = sr.next();
		String b = sr.next();
		String c = sr.next();

		String[] aList = permutation(a);
		String[] bList = permutation(b);
		String[] cList = permutation(c);

		for (String elA : aList) {
			if (elA == null) {
				continue;
			}
			for (String elB : bList) {
				if (elB == null) {
					continue;	
				}
				for (String elC : cList) {
					if (elC == null) {
						continue;
					}
					if(Integer.parseInt(elA) + Integer.parseInt(elB) == Integer.parseInt(elC)){
						System.out.println(elA + " + " + elB + " = " + elC);
					}
				}
			}	
		}
	}
}