import java.util.Arrays;

public class TimeComplexityTest {
	public static void main(String args[]){
		doTest(1000000,1,10,5);
		/*doTest(1000000,1,10,2);
		doTest(1000000,1,10,3);*/
		
	}
	
	public static void doTest(int baseScale,int factor, int times, int testIndex){
		long t1,t2;
		int totalFactoredTime=0,totalUnfactoredTime=0;
		
		for (int i=0;i<times;i++){
			System.out.println("Test:\t\t"+testIndex+ " - " + (i+1));
			
			t1=test(baseScale,testIndex);

			System.out.println("baseScale:\t\t"+baseScale+ "\t\tTime:\t\t" + t1 +"ms");

			t2=test(baseScale*factor,testIndex);

			System.out.println("factoredScale:\t\t"+baseScale*factor+ "\t\tTime:\t\t" + t2 +"ms");
			
			System.out.println("factor:\t\t"+factor+"\tTime factor:\t"+ 1.0 * t2 /t1+"\n");
			
			totalUnfactoredTime+=t1;
			totalFactoredTime+=t2;
		}
		System.out.println("\n\nAverage base time:\t"+totalUnfactoredTime / times+"\tAverage factored time:\t"+totalFactoredTime/times);
		System.out.println("factor:\t\t\t"+factor+"\tAverage time factor:\t"+ 1.0*totalFactoredTime/totalUnfactoredTime+"\n\n\n\n\n");
	}
	
	public static long test(int scale, int testIndex){
		long t1,t2;
		//Integer a[]=RandomIntegerMaker.makeRandomInt(scale, 1, 100000);
		switch(testIndex){
		case 1:
			t1=System.currentTimeMillis();
			QuickSort.quickSortXZM(a);
			t2=System.currentTimeMillis();
			break;

		default:
			t1=t2=0;
		}
		//RandomIntegerMaker.printArray(a,5);
		return t2-t1;
		
	}
}
