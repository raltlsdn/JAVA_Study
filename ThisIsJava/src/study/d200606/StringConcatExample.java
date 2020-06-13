package study.d200606;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "JDK" + 14.0;
		String str2 = str1 + "Ư¡";
		System.out.println(str2);
		
		String str3 = "JDK" + 11 + 3.0;
		String str4 = 11 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
	}

}
