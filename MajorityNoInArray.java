package javachallenge;

import java.util.Arrays;

public class MajorityNoInArray {
	//JAVACHALLENGE 6
	public static void main(String[] args) {
		int[] num= {4,1,1,1,1,2,3,3,4,5};
		int length = num.length;
		int half=(length/2);
		int count=1,index=0,counts=0;
		int[] c=new int[half];
		int[] c1=new int[half];
		int[] num2=new int[half];
		System.out.println(half);

		for(int i=0;i<length;i++) {
			if(num[i]!=0) {
				
				count=1;
				
			for(int j=1+i;j<length;j++) {
				
				if(num[i]==num[j]) {
					count++;
					c[index]=count;
					num2[index]=num[i];
					num[j]=0;
					
				}
				/*else {
					
					break;
				}*/
			}
			if (count > 1) {
			index++;
			}
		}
			
	}
		
		String string1 = Arrays.toString(num2);
		System.out.println("Repeated numbers" +" " +string1);
		String string = Arrays.toString(c);
		System.out.println("counts" +" " +string);
		
		for(int j=0;j<c.length;j++) {
			if(c[j]!=0) {
			
				if(c[j]>half) {
					
					counts=1;
					c1[j]=counts;
					
					
				}
				else {
					
					count=0;
				}
				
				
				
			}
			
		}
		
		for(int j=0;j<c1.length;j++) {
			if(c1[j]!=0) {
		
		if(c1[j]==1) {
			System.out.println("Majority element in array is number" +" " +num2[j]);
		}
		
		
		
		//String string2 = Arrays.toString(c1);
		//System.out.println("count" +" " +string2);
			}
		}
		
		
}
}
