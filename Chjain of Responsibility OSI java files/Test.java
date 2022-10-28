class Test{
	public static void main(String[] args){
		System.out.println("welcome to exception handling program");
		
		//System.out.println(10/0); // this is unchecked exception

		FileInputStream file = new FileInputStream("Khan.txt");
		
		System.out.println("Rest of the program");
	}
}