package cn.com.taiji.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.taiji.domain.User;
import cn.com.taiji.domain.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	@Transactional(propagation =Propagation.REQUIRED)
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		this.userRepository.saveAndFlush(user);
	}

}
