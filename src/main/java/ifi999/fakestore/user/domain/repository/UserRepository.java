package ifi999.fakestore.user.domain.repository;

import ifi999.fakestore.user.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {

}
