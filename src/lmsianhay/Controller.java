package lmsianhay;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class Controller implements IController {
	
	Book [] books;
	Periodical [] pers;

	
	@Override
	public void displayCollection() {
		// TODO Auto-generated method stub
		for(int i=0;i<books.length;i++) {
			System.out.println(books[i].toString()+"\n");
		}
		for(int i =0;i<pers.length;i++) {
			System.out.println(pers[i].toString()+"\n");
		}
	}

	@Override
	public void checkoutMaterials() {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String callNum;
		System.out.println("What is the call Number?");
		callNum=keyboard.nextLine();
		System.out.println();
		
		try {
			if (!findItem(callNum).isCheckedOut()) {
			findItem(callNum).checkOut();	
			
			//System.out.printf("Date Out: %tD\n", findItem(callNum).getDateCheckedOut()); 
			
			findItem(callNum).setDateDue(findItem(callNum).getDateCheckedOut());
			}
			else {
				System.out.println("Item is not available.");
			}
			}
			catch(NullPointerException e) {
				System.out.println("Not a valid Call Number ");
				checkoutMaterials();
			}
		
	}

	@Override
	public ILibrary findItem(String callNum) {
		// TODO Auto-generated method stub
		for(int i=0; i<books.length;i++) {
			if(books[i].getCallNumber().equals(callNum)) {
				return books[i];
			}
		}
		
		for(int i=0;i<pers.length;i++) {
			if(pers[i].getCallNumber().equals(callNum)) {
				return pers[i];
			}
		}
		
		
		
		return null;
	}

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("------------- Menu -------------\r\n" + 
				"1) Display collection\r\n" + 
				"2) Check out materials\r\n" + 
				"3) Quit\r\n" + 
				"----------------------------------\r\n" + 
				"Please choose an option:  ");
	}

	@Override
	public void readInput(String fileName) throws IOException {
		// TODO Auto-generated method stub
		
		File file= new File(fileName);
		Scanner input=new Scanner(file); 
		
		int numBooks = Integer.parseInt(input.nextLine());
		int numPers = Integer.parseInt(input.nextLine());
		
		books = new Book[numBooks];
		pers = new Periodical[numPers];
		int bcounter = 0;
		int pcounter = 0;
		
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
		
			if(line.charAt(0)=='B') {
				
				books[bcounter]= new Book(line);
				
				bcounter++;
			}
			
			if(line.charAt(0)=='P') {
				pers[pcounter]= new Periodical(line);
		
				pcounter++;
			}
			
			
			
			
		}
		
		
		input.close();
	}
		
		
		

	

}
