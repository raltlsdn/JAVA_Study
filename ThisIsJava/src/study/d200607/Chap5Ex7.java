package study.d200607;

public class Chap5Ex7 {
	public static void main(String[] args) {
		int max =0;
		int[] array = {1, 5, 3, 8, 2 };
		
		// for문을 사용하여 주어진 배열에서 최대값 찾기
		for (int i =0; i<array.length;i++) {
			if (array[i] > max) {
				max = array[i];
			} else {
				continue;
			}
		}

		
		
		
		System.out.println("max : " + max);
	}
}
