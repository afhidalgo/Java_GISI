class HelloWorldJavaVim{
	public static void main(String[] args){
		int a = 10;
		{
			double ad = 10.5;

			System.out.println("Testing the scope, a ="+a);
			
			System.out.println("Testing the scope, a ="+ad);
		}
		System.out.println("Hello Java World from Vim, the value of a is="+a );
                
		//System.out.println("Hello Java World from Vim, the value of a is="+ad );

	}
}
