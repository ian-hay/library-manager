package lmsianhay;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Periodical extends Library {

	boolean checkedOut = false;
	
	String[] fields = new String[6];
	String code, title,volume,issue,genre;
	String checked="NO";
	GregorianCalendar gcal;
	
	GregorianCalendar cal;
	
	public Periodical(String line) {
		
		fields= line.split(",");
		code=fields[1];
		title=fields[2];
		volume=fields[3];
		issue=fields[4];
		genre=fields[5];
	}
	
	
	public void checkOut() {
		
		checkedOut=true;
		checked="YES";
		gcal= new GregorianCalendar();
		cal=new GregorianCalendar();
		System.out.println(toString());
	}
	
	public String toString() {
		 

    	
    	return "Periodical Title: "+ title+ "\nVolume: "+ volume+ "\nIssue: "+issue+ "\nSubject: " + issue+ "\nCall Number: "+code+"\nChecked Out: "+checked ;
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
		System.out.printf("Date Out: %tD\n",cal);
		System.out.printf("Date Due: %tD\n",dateDue);
		
	}
	public GregorianCalendar getDateDue() {
		 
		 gcal.add(Calendar.DAY_OF_YEAR, 7) ;
		 return gcal;
	 }

	

}
