package general.boot.webservice.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import general.boot.webservice.integration.vo.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {

}
