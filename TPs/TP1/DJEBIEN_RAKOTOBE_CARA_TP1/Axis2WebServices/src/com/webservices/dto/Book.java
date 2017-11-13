package com.webservices.dto;
import java.util.Date;

/**
 * Classe representant un livre
 * @author DJEBIEN Tarik
 * @author RAKOTOBE Sitraka Eric
 */
public class Book {
	
	private Long isbn;
	private String author;
	private String title;
	private String editor;
	private String borrower;
	private String booker;
	private Date startDate ; 
	private Date endDate ; 
	
	public Book() {}

	/**
	 * @return the isbn
	 */
	public Long getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the editor
	 */
	public String getEditor() {
		return editor;
	}

	/**
	 * @param editor the editor to set
	 */
	public void setEditor(String editor) {
		this.editor = editor;
	}

	/**
	 * @return the borrower
	 */
	public String getBorrower() {
		return borrower;
	}

	/**
	 * @param borrower the borrower to set
	 */
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	
	/**
	 * @return the booker
	 */
	public String getBooker() {
		return booker;
	}

	/**
	 * @param booker the booker to set
	 */
	public void setBooker(String booker) {
		this.booker = booker;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String toString() {
		return "-- Description du livre --"+
			"isbn: "+isbn+", "+
			"author:" +author+", "+
			"title:" +title+", "+
			"editor:" +editor+", "+
			"borrower:"+borrower;
	}
}
