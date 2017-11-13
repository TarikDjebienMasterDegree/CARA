package com.webservices.dto;
import java.util.List;

/**
 * Classe representant un utilisateur
 * de la bibliotheque
 * @author DJEBIEN Tarik
 * @author RAKOTOBE Sitraka Eric
 */
public class User {
	
	private Long id;
	private String name;
	private Integer age;
	private String address;
	private List<Book> booksBorrowed ;
	
	public User(){}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	

	/**
	 * @return the books
	 */
	public List<Book> getBooks() {
		return booksBorrowed;
	}

	/**
	 * @param books the books to set
	 */
	public void setBooks(List<Book> booksBorrowed) {
		this.booksBorrowed = booksBorrowed;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User description [id=").append(id).append(", name=").append(name)
				.append(", age=").append(age).append(", address=")
				.append(address).append("]");
		return builder.toString();
	}
}
