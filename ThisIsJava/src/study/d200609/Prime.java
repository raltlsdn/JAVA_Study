package study.d200609;

public class Prime {
	public static void main(String[] args) {
		int i;
		int j;
		String result = "";
		int flag = 0;
		
		for(i=2; i<=100; i++) {
			if(i==2) {
				flag=1;
			} else {
				for(j=2; j<i; j++) {
					if(i%j==0) {
						flag=0;
						break;
					} else {
						flag=1;
					}
				}
			}
			if(flag==1) {
				result += i;
				result += " ";
			}
			
		}
		System.out.println(result);
	}
}
