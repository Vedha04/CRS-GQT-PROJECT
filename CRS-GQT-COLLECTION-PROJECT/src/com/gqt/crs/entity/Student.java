/**
 * 
 */
package com.gqt.crs.entity;

/**
 * @author vedha
 *
 * 
 */
public class Student {
	/**
	 * @param student_id
	 * @param student_name
	 * @param student_email
	 * @param student_pwd
	 * @param student_addr
	 */
	public Student(int student_id, String student_name, String student_email, String student_pwd, String student_addr) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_email = student_email;
		this.student_pwd = student_pwd;
		this.student_addr = student_addr;
	}
	private int student_id;
	private String student_name;
	private String student_email;
	private String student_pwd;
	private String student_addr;
	/**
	 * @return the student_id
	 */
	public int getStudent_id() {
		return student_id;
	}
	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	/**
	 * @return the student_name
	 */
	public String getStudent_name() {
		return student_name;
	}
	/**
	 * @param student_name the student_name to set
	 */
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	/**
	 * @return the student_email
	 */
	public String getStudent_email() {
		return student_email;
	}
	/**
	 * @param student_email the student_email to set
	 */
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	/**
	 * @return the student_pwd
	 */
	public String getStudent_pwd() {
		return student_pwd;
	}
	/**
	 * @param student_pwd the student_pwd to set
	 */
	public void setStudent_pwd(String student_pwd) {
		this.student_pwd = student_pwd;
	}
	/**
	 * @return the student_addr
	 */
	public String getStudent_addr() {
		return student_addr;
	}
	/**
	 * @param student_addr the student_addr to set
	 */
	public void setStudent_addr(String student_addr) {
		this.student_addr = student_addr;
	}
	

}
