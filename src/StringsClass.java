
public class StringsClass {

	public static void main(String[] args) {
	
		String s1 = "S ANAND";
		String s2 =reverse(s1);
		System.out.println(s2);
	
	}
	
	static String reverse(String name){
		StringBuilder sb = new StringBuilder();
		for(int i=name.length()-1;i>=0;i--){
			
			sb.append(name.charAt(i));
			
		}
		
		return sb.toString();
	}
}
