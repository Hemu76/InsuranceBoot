class Superclass {
    public void getObj() {
     System.out.println("suoer");
    }
}

class Subclass extends Superclass {
    //@Override
    public void getObj() {
      
	 System.out.println("sub");
    	//return this;
	}
}
class Covarient{
	public static void main(String args[]){
		Subclass s= new Subclass();
		s.getObj();
		}
}