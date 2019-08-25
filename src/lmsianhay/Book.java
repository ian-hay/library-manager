package lmsianhay;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Book extends Library {

	
	String [] fields = new String[5];
	String title;
	String author;
	String code;
	String genre;
	
	boolean checkedOut= false;
	GregorianCalendar gcal = new GregorianCalendar();
	public Book(String line) {
	
		fields= line.split(",");
		
		code = fields[1];
		title=fields[2];
		author=fields[3];
		genre=fields[4];
		
		
		
	}
	
	public void checkOut() {
		checkedOut =true;
		
		
	}
	
	public String toString() {
		
	 return  "Book Title: " + title + "\nAuthor: "+ author+ "\nGenre: " + genre + "\nCall Number: "+code+ "\nChecked Out: "+ checkedOut ;
	}
	
	public String getCallNumber() {
		
		return code;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}
	
	public void setDateDue(GregorianCalendar dateDue) {
		// TODO Auto-generated method stub

		
		dateDue = getDateDue();
		System.out.printf("Date Due: %tD\n",dateDue);
		
	}
	public GregorianCalendar getDateDue() {
		 
		 gcal.add(Calendar.DAY_OF_YEAR, 21) ;
		 return gcal;
	 }
	
}
