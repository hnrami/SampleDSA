package program.easy.dsa;

import java.util.HashSet;

public class firstuniuqecharater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="hemang";
		
		HashSet<Character> inpuHashSet = new HashSet<>();
		for(char ch : input.toCharArray()) {
			if(inpuHashSet.contains(ch)) {
				System.out.println("true");
			}else {
				inpuHashSet.add(ch);
				System.out.println("false");
			}
		}
				
	}

}
