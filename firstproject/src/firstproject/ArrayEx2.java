package firstproject;

import java.util.Arrays;

public class ArrayEx2 {
public static void main(String[] args) {
	int[] x = new int[10];
	// 10ĭ�� ����� 0~9����(�ű��ġ��) ���ڰ� 0���� ���� �� 
	
	
	
	for(int i=0;i<10;i++) {
		x[i]=0;
	}
	
	System.out.println(Arrays.toString(x));
	
	
	int[][]k = new int[5][10];
	// ���� 10ĭ ���� 5ĭ¥���� 50ĭ�� ĭ�� ����... ���� 0~9���� ���� / ���� 0~4���� ���� �Ű�����..����.. 190p
	for(int i=0;i<5;i++) { //5��
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
