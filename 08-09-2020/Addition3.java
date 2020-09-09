import java.util.Scanner;
public class Addition3{
	public static void main(String[] value){
		Addition3 o=new Addition3();
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		o.add(a,b);
	}
        public void add(int a,int b){
		System.out.println("Addition of a and b is:"+(a+b));
	}
}