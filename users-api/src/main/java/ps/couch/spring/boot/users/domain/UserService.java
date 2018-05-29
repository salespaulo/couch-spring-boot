package ps.couch.spring.boot.users.domain;

import java.util.Optional;

public interface UserService {
	
	Optional<User> findByUsername(final String username);

}
