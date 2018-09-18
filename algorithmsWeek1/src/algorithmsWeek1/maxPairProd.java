package algorithmsWeek1;

import java.util.*;
import java.io.*;

public class maxPairProd {
	static long naiveAlgs(int[] numbers) {
		long product = 0;
		int n = numbers.length;
			for (int i = 0; i < n; ++i) {
				for (int j = i + 1; j < n; ++j) {
					product = Math.max(product,((long)numbers[i]) * (long)(numbers[j]));
				}
			}
		return product;
		}
	
	static long fastAlgs(int[] numbers) {
		int index = 0;
		int temp = 0;
		
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>numbers[index]) {
				index = i;
			}
		}
		
		//swapping value
		temp = numbers[numbers.length-1];
		numbers[numbers.length-1] = numbers[index];
		numbers[index] = temp;

		index = 0;
		
		for(int j=1; j<numbers.length-1; j++) {
			if(numbers[j]>numbers[index]) {
				index = j;
			}
		}
		
		//swapping value
		temp = numbers[numbers.length-2];
		numbers[numbers.length-2] = numbers[index];
		numbers[index] = temp;
		
		long largest = (long) numbers[numbers.length-1];
		long secondL = (long) numbers[numbers.length-2];
		long ret = largest * secondL;
		return ret;
	}
	
	public static void main(String[] args) {
		FastScanner scanner = new FastScanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for(int i=0; i<n; i++) {
			numbers[i]= scanner.nextInt();
		}
		System.out.println(fastAlgs(numbers));
	}
	
	static class FastScanner{
		BufferedReader br;
		StringTokenizer st;
		
		FastScanner(InputStream stream){
			try {
				br = new BufferedReader(new InputStreamReader(stream));
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
		String next() {
			while(st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
