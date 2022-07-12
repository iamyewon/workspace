package firstproject;

import java.util.Arrays;

public class ArrayEx2 {
public static void main(String[] args) {
	int[] x = new int[10];
	// 10칸이 생기고 0~9까지(매긴다치고) 숫자가 0부터 착착 들어감 
	
	
	
	for(int i=0;i<10;i++) {
		x[i]=0;
	}
	
	System.out.println(Arrays.toString(x));
	
	
	int[][]k = new int[5][10];
	// 가로 10칸 세로 5칸짜리의 50칸의 칸이 생김... 가로 0~9까지 숫자 / 세로 0~4까지 숫자 매겨지는..ㅇㅇ.. 190p
	for(int i=0;i<5;i++) { //5줄
		for(int j=0;j<10;j++) {
			k[i][j]=0;
		}
	}
	System.out.println(Arrays.toString(k[0]));
	System.out.println(Arrays.toString(k[1]));
	System.out.println(Arrays.toString(k[2]));
	System.out.println(Arrays.toString(k[3]));
	System.out.println(Arrays.toString(k[4]));
	
	
	
	
}
}
