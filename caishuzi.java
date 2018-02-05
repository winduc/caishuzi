package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class caishuzi {

	public List getNums() {// 生成数字
		List li = new ArrayList();
		Random rr = new Random();
		while (li.size() < 4) {
			int num = rr.nextInt(10);
			if (!li.contains(num)) {
				//System.out.println(num);
				li.add(num);
			} else {
				num = rr.nextInt(10);
			}
		}
		//System.out.println(li);

		return li;

	}
	public int caishuzi(List list) {
		Scanner ss = new Scanner(System.in);
		System.out.println("请输入数字");
		String srnum = ss.next();
		//System.out.println(alist);
		String a[] = srnum.split("");
		ArrayList  b = new ArrayList();
		for(int i=0;i<a.length;i++){
		   b.add(Integer.valueOf(a[i]));
		}
		int A = 0;
		int B = 0;
		for(int j=0;j<list.size();j++) {
			if(list.get(j)==b.get(j)) {
				A++;
			}
			if(list.contains(b.get(j))) {
				B++;
			}
			
			
		}
		B = B-A;
		if(A!=4) {
				System.out.println("A"+A+"B"+B);
		}
		return A;
	}
	public static void main(String[] args) {
		caishuzi cc = new caishuzi();
		List list = cc.getNums();
		while(true) {
			int flag = cc.caishuzi(list);
			if(flag ==4){
			System.out.println("恭喜");
				break;
				
			}
		}
		
		
		
	}
	
}
