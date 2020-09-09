public class Addition2{
	public static void main(String[] ar){
		Addition2 o=new Addition2();
		int a=Integer.parseInt(ar [0]);
		int b=Integer.parseInt(ar [1]);
		o.add(a,b);
	}
        public void add(int a,int b){
		System.out.println("Addition of a and b is:"+(a+b));
	}
}