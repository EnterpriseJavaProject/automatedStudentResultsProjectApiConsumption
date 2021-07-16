package aiti.kace.com.gh.integration.dto;

public class StudentProfile {
	
	
	private Long id;
	private String student_id;
	private String student_name;
	private String course;
	private String course_level;
	private String date_of_birth;
	private String email;
	private String phone;
	private String gender;
	private String address;
	private String course_start_date;
	private String course_end_date;
	private String date_of_issue;
	private String reg_date;
	private String update_time;
	
	
	
	
	public StudentProfile() {
		super();
		// TODO Auto-generated constructor stub
	}




	public StudentProfile(Long id, String student_id, String student_name, String course, String course_level,
			String date_of_birth, String email, String phone, String gender, String address, String course_start_date,
			String course_end_date, String date_of_issue, String reg_date, String update_time) {
		super();
		this.id = id;
		this.student_id = student_id;
		this.student_name = student_name;
		this.course = course;
		this.course_level = course_level;
		this.date_of_birth = date_of_birth;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
		this.course_start_date = course_start_date;
		this.course_end_date = course_end_date;
		this.date_of_issue = date_of_issue;
		this.reg_date = reg_date;
		this.update_time = update_time;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getStudent_id() {
		return student_id;
	}




	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}




	public String getStudent_name() {
		return student_name;
	}




	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}




	public String getCourse() {
		return course;
	}




	public void setCourse(String course) {
		this.course = course;
	}




	public String getCourse_level() {
		return course_level;
	}




	public void setCourse_level(String course_level) {
		this.course_level = course_level;
	}




	public String getDate_of_birth() {
		return date_of_birth;
	}




	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPhone() {
		return phone;
	}




	public void setPhone(String phone) {
		this.phone = phone;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getCourse_start_date() {
		return course_start_date;
	}




	public void setCourse_start_date(String course_start_date) {
		this.course_start_date = course_start_date;
	}




	public String getCourse_end_date() {
		return course_end_date;
	}




	public void setCourse_end_date(String course_end_date) {
		this.course_end_date = course_end_date;
	}




	public String getDate_of_issue() {
		return date_of_issue;
	}




	public void setDate_of_issue(String date_of_issue) {
		this.date_of_issue = date_of_issue;
	}




	public String getReg_date() {
		return reg_date;
	}




	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}




	public String getUpdate_time() {
		return update_time;
	}




	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}




	@Override
	public String toString() {
		return "StudentProfile [id=" + id + ", student_id=" + student_id + ", student_name=" + student_name
				+ ", course=" + course + ", course_level=" + course_level + ", date_of_birth=" + date_of_birth
				+ ", email=" + email + ", phone=" + phone + ", gender=" + gender + ", address=" + address
				+ ", course_start_date=" + course_start_date + ", course_end_date=" + course_end_date
				+ ", date_of_issue=" + date_of_issue + ", reg_date=" + reg_date + ", update_time=" + update_time + "]";
	}




	
	
	
	
	
	
	
	
	

}
