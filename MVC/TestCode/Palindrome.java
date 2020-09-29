package function;

public class Palindrome {
	String s="";
	public String pal(String a,String b,String c,String d) {

		String[] array=new String[4];
		array[0]=a;
		array[1]=b;
		array[2]=c;
		array[3]=d;
		for(int i=3;i>=0;i--) {
	 s=s+""+array[i];
	}
		return s;
	}
	
}