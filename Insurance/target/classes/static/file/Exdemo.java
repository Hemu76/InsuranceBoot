class Exdemo{
	public static void main(String args[]){
		int a,c,s;
		try{
			a=0;
			c=5;
			s=c/a;
			System.out.println(s);
		}
		catch(ArithmeticException e){
			System.out.println("can not be divided by zero");		
			}
		System.out.println("exception jandled");

	}
}