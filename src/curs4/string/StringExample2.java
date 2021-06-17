package curs4.string;

public class StringExample2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("AABBBCC");
		System.out.println(sb);

		//for(int i=0; i<sb.length(); i++) {
			
		//	if(sb.charAt(i) == 'B') {
		//		sb.setCharAt(i, '0'); 
		//}}
		
		String newValue = sb.toString().replace('B', 'X');
		
		System.out.println(newValue);
}
}
