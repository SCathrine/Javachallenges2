package javachallenge;

public class DistinictIndicesForEqualNums {

	//JAVACHALLENGE 8
	int k=3,counts=0,c=0;
	int[] ss=new int[3];
	int[] aa=new int[4];
	boolean flag=false;
	public int subfn(int[] check) {
		
		for(int i=0;i<check.length;i++) {
			if(check[i]!=0) {
			if(check[i]<=k) {
				
				counts++;
				
				c=c+counts;
			
		}
		
		else {
			
			aa[i]=check[i];
			   
		}
		}
		}
		return counts;
		
	}
	
	
	
	public static void main(String[] args) {
		
		DistinictIndicesForEqualNums d=new DistinictIndicesForEqualNums();
		int[] nums= {1,3,1,2,3};
		int[] c=new int[nums.length];
		int[] no=new int[nums.length];
		String[] store=new String[nums.length];
		int[] indexval=new int[nums.length];
		int[] check=new int[4];
		int count=0,index1,index2,sub=0,ind=0;
		for(int i=0;i<nums.length;i++) {
			
			for(int j=1+i;j<nums.length;j++) {
			
			if(nums[i]==nums[j]) {
				
				count++;
				c[i]=count;
				no[i]=nums[i];
				index1=i;
				index2=j;
				
				sub=(index2-index1);
				//int co = d.subfn(sub);
				check[ind]=sub;
				ind++;
			}
				
			else {
				
				count=0;
				c[i]=count;
				no[i]=nums[i];
				
			}
		}
		
			
			
			

	}
		
		int flg = d.subfn(check);
		if(flg>=1) {
			
			System.out.println("true");
		}
		else {
			
			System.out.println("false");
		}

}
}
