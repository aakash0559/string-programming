package hwString;

public class LowerCaseToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aakash";
		char c[]=new char[s.length()];
			for(int i=0;i<c.length;i++){
				c[i]=s.charAt(i);
			}	
			for(int i=0;i<c.length;i++){
				System.out.println((char)(c[i]-32));
			}
	}

}
