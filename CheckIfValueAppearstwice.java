package javachallenge;

public class CheckIfValueAppearstwice {

	
	//JAVACHALLENGE 7
	public static void main(String[] args) {
		
		int[] num= {1,2,3,4,4};
		int[] c=new int[num.length];
		int[] n=new int[num.length];
		boolean flag=true;
		int count=1;
		
		
		for(int i=0;i<num.length;i++) {
			if(num[i]!=0) {
			for(int j=1+i;j<num.length;j++) {
			
			if(num[i]==num[j]) {
				
				count++;
				c[i]=count;
				num[j]=0;
			}
			else {
				
				count=1;
				c[i]=count;
				n[i]=num[i];
			}
			
		}
			}
		
	}
		
		
		for(int j=0;j<c.length;j++) {
			if(c[j]!=0) {
			if(c[j]==1) {
				
				flag=false;
			}
			else {
				
				if(c[j]==2) {
					flag=true;
					
					
				}
			}
			}
		}
			if(flag==false) {
				
				System.out.println("false");
			}
			else {
				
				System.out.println("true");
			}
		
			
			
		}
		
		
}

