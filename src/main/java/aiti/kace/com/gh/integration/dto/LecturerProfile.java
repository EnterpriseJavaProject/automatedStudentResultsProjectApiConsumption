package aiti.kace.com.gh.integration.dto;




public class LecturerProfile {
	

	private Long id;
	private String name;
	private String phone;
	private String email;
	private String password;
	
	
	
	
	
	public LecturerProfile() {
		super();
		// TODO Auto-generated constructor stub
	}





	public LecturerProfile(Long id, String name, String phone, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getPhone() {
		return phone;
	}





	public void setPhone(String phone) {
		this.phone = phone;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	@Override
	public String toString() {
		return "LecturerProfile [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	
	
	
	
	
	
	

}
	