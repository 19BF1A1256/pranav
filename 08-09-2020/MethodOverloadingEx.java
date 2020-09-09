public class MethodOverloadingEx{
	public static void main(String[] ar){
		MethodOverloadingEx o=new MethodOverloadingEx();
		o.add(26,14);
		o.add(2.6,1.4);
		o.add(2.61001,1.40901);
		o.add(26,14,24);
	}
        public void add(int a,int b){
		System.out.println(a+b);
	}
	
        public void add(float a,float b){
		System.out.println(a+b);
	}
	
        public void add(double a,double b){
		System.out.println(a+b);
	}
	
        public void add(int a,int b,int c){
		System.out.println(a+b+c);
	}
}