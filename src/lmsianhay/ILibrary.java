package lmsianhay;

import java.util.GregorianCalendar;

public interface ILibrary {

	/**
	* Sets the boolean value checkedOut to true, and
	* initializes the dateChecked out attribute (a
	* GregorianCalendar object).
	*/
	public void checkOut();

	/**
	* Generates a string with the details of the library item
	* whose call number has been input by the user 
	* and returns that string.
	* If the user wants to check out the library item, the string to be
	* returned also includes information that the item has been checked out,
	* the date it was checked out, and the due date by which the item should be returned.
	* @return A string with details of this library item.
	*/
	 public String toString();
	 /**
	 * Returns the call number of this object.
	 * @return the callNumber
	 */
	 public String getCallNumber();
	 /**
	 * Returns true or false depending on if this item has been checked out.
	 * @return the boolean value for isCheckedOut
	 */
	//CS 1120 Spring 2019 LA3 Library Catalog System
//	6
	 public boolean isCheckedOut();
	 /**
	 * Returns the date this item was checked out.
	 * @return the dateCheckedOut
	 */
	 public GregorianCalendar getDateCheckedOut();
	 /**
	 * Returns the date this item is due to be returned.
	 * @return the dateDue
	 */
	 public GregorianCalendar getDateDue();

	 /**
	 * Sets the dateDue to the parameter received.
	 * @param dateDue the dateDue to set
	 */
	 public void setDateDue(GregorianCalendar dateDue);

	
}
