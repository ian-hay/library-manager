package lmsianhay;

import java.util.GregorianCalendar;

public class Library implements ILibrary {

	boolean checkedOut = false;
	public Library() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		checkedOut=true;
		GregorianCalendar dateChecked = new GregorianCalendar();
		
		
	}

	@Override
	public String getCallNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCheckedOut() {
		// TODO Auto-generated method stub
		
		return checkedOut;
	}

	@Override
	public GregorianCalendar getDateCheckedOut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GregorianCalendar getDateDue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDateDue(GregorianCalendar dateDue) {
		// TODO Auto-generated method stub

	}

}
