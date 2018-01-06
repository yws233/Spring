package cn.spring.pojo;

/**
 * 用户实体类
 */
public class User implements java.io.Serializable {
	private Integer id; // 用户ID
	private String username; // 用户名
	private String age; // 年龄
	private String email; // 电子邮件

	// getter & setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
