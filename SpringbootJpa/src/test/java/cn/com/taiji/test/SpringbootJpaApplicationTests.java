package cn.com.taiji.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;




import cn.com.taiji.domain.User;
import cn.com.taiji.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringbootJpaApplicationTests {
	private static final Logger log =LoggerFactory.getLogger(SpringbootJpaApplicationTests.class);

	
	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
	}

	
	@Test
	public void test1() {
		for(int i=0;i<9;i++) {
			User user = new User();
			user.setUsername("tom"+i);
			user.setPassword("a"+i);
			userService.saveUser(user);
		}
	}

}
