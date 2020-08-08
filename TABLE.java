import java.util.Scanner;
class TABLE{
	public static void main(String[] ar){
		Scanner a=new Scanner(System.in);
		System.out.print("Enter number : ");
		int m=a.nextInt();
		Scanner b=new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=b.nextInt();
  		for(int i=1;i<=n;i++){
			System.out.println(m+"x"+i+"="+(m*i));
		}
	}
}