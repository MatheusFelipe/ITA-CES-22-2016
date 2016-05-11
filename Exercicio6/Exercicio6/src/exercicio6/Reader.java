package exercicio6;

class Reader extends Thread {
	Buffer b;
	public void run() {
		 char x;
		 String output = "The consumer ("+this.getName().toString()+") bought this: ";
		 while ((x = b.get()) != ' ')
			 output += x;
		 System.out.println(output);
		 System.out.print("\n");
	}
	 
	Reader(Buffer b) {
		this.b = b;
		System.out.println("New consumer (" + this.getName() + ") added.");
	}
} 
