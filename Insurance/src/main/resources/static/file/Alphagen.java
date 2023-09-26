class Gen {
	char a[]=new char[26];
	public synchronized void readchar(){
	for (int i=0;i<a.length;i++){	
		notify();
	System.out.println(a[i]);
try{
		wait(100);
		}
	catch(Exception e){
	}
		}
	}
	
	public synchronized void writechar(){
	int j=0;
	int i;
	for(i=65;i<=90;i++){
	a[j]=(char)i;
		j++;
	System.out.println("  write "+(char)i);
	notify();
	try{
		wait(100);
		}
	catch(Exception e){
	}
	
		}
	
	}
	
}

class Alphagen{
	public static void main(String args[])throws Exception{
	Gen gg=new Gen();
	Thread re=new Thread(){
		public void run(){
		gg.readchar(); 
			
 		}
		};
	Thread wr=new Thread(){
		public void run(){
		gg.writechar();	
		}
	};
	wr.start();
	re.start();
		
}
} 