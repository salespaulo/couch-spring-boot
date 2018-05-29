package ps.couch.spring.boot.users.domain;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public Optional<User> findByUsername(final String username) {
		return userRepository.findById(username);
	}

}
