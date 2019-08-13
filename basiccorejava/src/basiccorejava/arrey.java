package basiccorejava;

public class arrey {

	public static void main(String[] args) {
	int[]arr= {1,3,6,9,4,7};
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
    if(arr[i]>max)
	max=arr[i];
	}
System.out.println(max);
}
}
