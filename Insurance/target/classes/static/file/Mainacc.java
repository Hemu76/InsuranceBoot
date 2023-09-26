class Account{
	private String name;
	private int ano;
	public double bal;
	
	public  Account( String name, int ano, double bal){
		this.name=name;
		this.ano=ano;
		this.bal=bal;
		}

	public void dep(double amnt){
		bal+=amnt;
		System.out.println(bal);
		}
	
	public double withdraw(double wamnt){
		if(wamnt>bal){
			System.out.println("sorry");
			}
		else{
			bal=bal-wamnt;
			}
		return bal;
	}
}

class Savings extends Account{
	public  Savings (String name, int ano, double bal){
		super(name,ano,bal);
		}

	public double withdraw(double wamnt){
		if(wamnt>bal){
			System.out.println("sorry");
			}
		else{
			bal=bal-wamnt;
			System.out.println(bal);
			}
		return bal;
	}
	void  callintrest(){
		System.out.println("intrest");
		}
}

class Current extends Account{
	public  Current (String name, int ano, double bal){
		super(name,ano,bal);
		}
	public double withdraw(double wamnt){
		if(bal-wamnt<=1000){
			System.out.println("bal should be more then 1000");
			}
		else{
			bal=bal-wamnt;
			}
		return bal;
	}
	void callfixedintrest(){
			System.out.println("fixd intrest");
			}
}
class Trans{
	public void action(Account a){
		a.dep(19000);
		System.out.println(a.withdraw(14000));
		if(a instanceof Savings){
			Savings s =(Savings)a;
			s.callintrest();
			}
		else if(a instanceof Current){
			Current c=(Current)a;
			c.callfixedintrest();
			}
	}
}
class Mainacc{
	public static void main(String args[]){
		Trans t=new Trans();
		Savings s =new Savings("sai",123,50000);
		t.action(s);
		Current c=new Current("hiii",555,100000);
		t.action(c);	
	}
}				



		
