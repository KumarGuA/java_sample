package ControlStatements.PujithaAssessments;

//write a java program to find the frequency of each element in an integer array . (ARRAY)

class FrequencyCheck{
	
	public void arrayInt() {
		int[] arr=new int[] {1,2,3,2,1,4};
		int[] emptyArr = new int[arr.length];
		int visited = -1;
		for(int i =0;i<arr.length;i++) {				
			int c=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					c+=1;
					emptyArr[j]=visited;
				}
			}
			if(emptyArr[i]!=visited) {
				emptyArr[i]=c;
			}
		}
		for(int k=0;k<emptyArr.length;k++) {
			if(emptyArr[k]!= visited)
				System.out.println(arr[k]+" - "+emptyArr[k]);
		}
	}
}


public class Array1 {

	public static void main(String[] args) {
		
		FrequencyCheck fc = new FrequencyCheck();
		fc.arrayInt();
	}

}
