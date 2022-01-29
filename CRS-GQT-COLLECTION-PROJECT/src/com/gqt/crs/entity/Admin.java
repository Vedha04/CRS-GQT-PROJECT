/**
 * 
 */
package com.gqt.crs.entity;

/**
 * @author vedha
 *
 * 
 */
public class Admin {
	/**
	 * @param admin_id
	 * @param admin_pwd
	 */
	public Admin(int admin_id, String admin_pwd) {
		super();
		this.admin_id = admin_id;
		this.admin_pwd = admin_pwd;
	}
	private int admin_id;
	private String admin_pwd;
	/**
	 * @return the admin_id
	 */
	public int getAdmin_id() {
		return admin_id;
	}
	/**
	 * @param admin_id the admin_id to set
	 */
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	/**
	 * @return the admin_pwd
	 */
	public String getAdmin_pwd() {
		return admin_pwd;
	}
	/**
	 * @param admin_pwd the admin_pwd to set
	 */
	public void setAdmin_pwd(String admin_pwd) {
		this.admin_pwd = admin_pwd;
	}
}
