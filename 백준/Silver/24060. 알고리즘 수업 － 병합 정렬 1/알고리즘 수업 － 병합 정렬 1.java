import java.io.*;
import java.util.*;
public class Main {
	
	static int[] tmp;
	static int n, k;
	static int cnt = 0;
	static int result = -1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		int[] a = new int[n]; tmp = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		merge_sort(a, 0, n-1);
		bw.write(result + "");
		
		br.close();
		bw.close();
	}
	
	static void merge_sort(int[] a, int p, int r) {
		if(p < r) {
			int q = (p + r) / 2; // 중간 인덱스
			
			merge_sort(a, p, q); // 전반부 정렬
			merge_sort(a, q+1, r); // 후반부 정렬
			merge(a, p, q, r); // 병합
		}
	}
	
	static void merge(int[] a, int p, int q, int r) {
		int i = p; 
		int j = q + 1; 
		int t = 0;
		
		while(i <= q && j <= r) {
			if(a[i] <= a[j]) tmp[t++] = a[i++];
			else tmp[t++] = a[j++];
		}
		
		while(i <= q) { // 왼쪽 배열
			tmp[t++] = a[i++];
		}
		
		while(j <= r) { // 오른쪽 배열
			tmp[t++] = a[j++];
		}
		
		i = p; t = 0;
		while(i <= r) { // 결과 저장
			cnt++;
			
			if(cnt == k) {
				result = tmp[t];
				return;
			}
			
			a[i++] = tmp[t++];
		}
	}
}