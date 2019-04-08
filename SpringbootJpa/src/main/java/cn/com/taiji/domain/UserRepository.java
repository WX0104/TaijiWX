package cn.com.taiji.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends JpaRepository<User, String>,JpaSpecificationExecutor<User>,PagingAndSortingRepository<User,String>{

	@Query("select u from User u where u.id=1")
	List<User> findAllUsers();
}
