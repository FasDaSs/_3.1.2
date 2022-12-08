package preproject.spring.boot.ppBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import preproject.spring.boot.ppBoot.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
