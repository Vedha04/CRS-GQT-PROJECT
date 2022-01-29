package com.gqt.crs.entity;

/**
 * @author vedha
 *
 * 
 */
public class Professor {
		/**
	 * @param professor_id
	 * @param professor_name
	 * @param professor_email
	 * @param professor_pwd
	 */
	public Professor(int professor_id, String professor_name, String professor_email, String professor_pwd) {
		super();
		this.professor_id = professor_id;
		this.professor_name = professor_name;
		this.professor_email = professor_email;
		this.professor_pwd = professor_pwd;
	}
		private int professor_id;
		private String professor_name;
		private String professor_email;
		private String professor_pwd;
		/**
		 * @return the professor_id
		 */
		public int getProfessor_id() {
			return professor_id;
		}
		/**
		 * @param professor_id the professor_id to set
		 */
		public void setProfessor_id(int professor_id) {
			this.professor_id = professor_id;
		}
		/**
		 * @return the professor_name
		 */
		public String getProfessor_name() {
			return professor_name;
		}
		/**
		 * @param professor_name the professor_name to set
		 */
		public void setProfessor_name(String professor_name) {
			this.professor_name = professor_name;
		}
		/**
		 * @return the professor_email
		 */
		public String getProfessor_email() {
			return professor_email;
		}
		/**
		 * @param professor_email the professor_email to set
		 */
		public void setProfessor_email(String professor_email) {
			this.professor_email = professor_email;
		}
		/**
		 * @return the professor_pwd
		 */
		public String getProfessor_pwd() {
			return professor_pwd;
		}
		/**
		 * @param professor_pwd the professor_pwd to set
		 */
		public void setProfessor_pwd(String professor_pwd) {
			this.professor_pwd = professor_pwd;
		}
		
	
}
