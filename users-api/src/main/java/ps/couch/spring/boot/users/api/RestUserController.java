package ps.couch.spring.boot.users.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ps.couch.spring.boot.users.domain.User;
import ps.couch.spring.boot.users.domain.UserResource;
import ps.couch.spring.boot.users.domain.UserService;

@RestController
public class RestUserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/{username}")
	public UserResource getByUsername(@PathVariable("username") String username) {
		return userService.findByUsername(username)
				.map(User.toResource)
				.orElseThrow(() -> new RuntimeException("Usuario nulo!"));
	}
	
}
