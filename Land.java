import java.io.*;
class Land
{
	public static final String Message = "YOU FILTHY SCOUNDREL! You ran again didn't ya!!.\nGimme the tax fast or choose to die !";
	public static final String Message2 = "\n>> Farmer : How many lands do you have under you!!!?  ";
	public static final String Message4 = "MF do you think I have no brain ?? You shall now die";
	public static final String Message5 = "\nGAME OVER\nYOU ARE DEAD :/";
	public static final String Message6 = "\nI knew it you bastard tell me honestly!!";
	
	public static void slowPrint(String text, int speed) throws InterruptedException, IOException{
      // import java.io.* for method to work
      Writer w = new PrintWriter(System.out);
      for(int t = 0; t < text.length(); t++){
        System.out.print(text.charAt(t));
        w.flush();
        Thread.sleep(speed);
      }
    }
	public static void display()
	{
		System.out.println("################################");
		System.out.println("	GIMME THE TAX BOI!!!!		");
		System.out.println("################################");

	}

	public static boolean isTruth()throws IOException, InterruptedException
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		boolean status = true;
		try{
			slowPrint(">> Do not Lie to me.\nAre you telling the truth ?Y/N ",30);
			char choice = (char)read.read();
			int c = (int)choice;
			if(c == 89|| c == 78 || c == 121 || c== 110)
			{
				if(c == 89 || c == 121)
					;
				else
					status = false;
			}
			else{
				System.out.println("Invalid Choice !");
				return isTruth();
			}
		}catch(Exception e)	
		{
			System.out.println("AGHHHHHHHH!!!!\nAre you trying to mock me!!!??? ");
		}
		return status;

	}

	public static void main(String[] args)throws InterruptedException, IOException {
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int lands = 0;
		boolean Lands_not_Paid = true;
		int tax = 1;
		display();
		slowPrint(Message,30);
		
		while(Lands_not_Paid)
		{
			slowPrint(Message2,30);
			try{
			lands += Integer.parseInt(read.readLine());
				if(isTruth()){
					int[] land_arr = new int[lands];
					for(int i=0; i < land_arr.length; i++)
					{ 
						final String Message8 = "\nHow big is land " + i + "??(in km^2) : ";
						slowPrint(Message8,30);
						double size = Double.parseDouble(read.readLine());
						if(size <= 0){
							slowPrint(Message4,30);
							slowPrint(Message5,90);
							System.exit(0);
						}
						else{
						tax += 0.1 * size;
					}
					}
					Lands_not_Paid = false;
				}
				else{
					slowPrint(Message6,30);
					lands = 0;
				}

			}catch(Exception e)
			{
				System.out.println("Dont think you can fool me!");
			}

		}
		String msg2 = "\nThe total tax you are paying is " + tax + "$" + "\nNow pay up you idiotaaa!!";
		slowPrint(msg2, 30);

	}
}