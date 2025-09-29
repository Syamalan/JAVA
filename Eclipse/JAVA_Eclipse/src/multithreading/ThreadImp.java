package multithreading;
import java.util.*;

public class ThreadImp {
	List<Integer> prime=new ArrayList<>();
	List<Integer> fib=new ArrayList<>();
	List<Integer> commonNum= new ArrayList<>();
	

	public synchronized void primeNums() {
		System.out.println("Prime Numbers from upto 1000 are:");
		for(int i=1;i<=1000;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				prime.add(i);
		}
		}		
		for(Integer p:prime) {
			System.out.print(p+" ");
		}
		System.out.println();
	}
	
	public synchronized void fibnocci() {
		System.out.println("Fibnocci series until 1000");

		int first=0;
		int next=1;
		System.out.print(first+" "+next+" ");
		while(true) {
			int temp=first;
			first=next;
			next=first+temp;
			if(next>1000)
				break;
			fib.add(next);
		}
		for(Integer f:fib) {
			System.out.print(f+" ");
		}
		System.out.println();
	}
	
	public synchronized void commonNums() {
		System.out.println("Common Numbers");
		for(Integer num1:prime) {
			//System.out.println(num1);
			for(Integer num2:fib) {
				if(num1.equals(num2)) {
					//System.out.println(num1);
					commonNum.add(num1);
				}
			}
		}
		
		commonNum.forEach(System.out::println);
	}
//	public static void main(String[] args) {
//		ThreadImp a = new ThreadImp();
//		a.fibnocci();
//		a.primeNums();
//		a.commonNums();
//		
//
//}
}
