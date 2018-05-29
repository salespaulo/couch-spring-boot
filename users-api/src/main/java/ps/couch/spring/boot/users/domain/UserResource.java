package ps.couch.spring.boot.users.domain;

public class UserResource {
	
	private String username;
	
	private String password;
	
	private String refreshToken;

	public UserResource(final String username, final String password, final String refreshToken) {
		this.username = username;
		this.password = password;
		this.refreshToken = refreshToken;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	
}
