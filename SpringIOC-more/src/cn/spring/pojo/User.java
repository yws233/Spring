package cn.spring.pojo;

/**
 * 用户实体类
 */
public class User implements java.io.Serializable {
	private String username; // 用户名

	// getter & setter
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
