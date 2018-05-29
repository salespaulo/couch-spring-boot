package ps.couch.spring.boot.users.domain;

import java.util.function.Function;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class User {
	
	public static final Function<User, UserResource> toResource = 
			user -> new UserResource(user.getUsername(), user.getPassword(), user.getRefreshToken());
	
	@Id
	private String username;

	@Column
	private String password;

	@Lob
	@Column
	private String refreshToken;

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
