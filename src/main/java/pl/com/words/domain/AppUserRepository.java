package pl.com.words.domain;

import org.springframework.data.repository.CrudRepository;
import pl.com.words.domain.AppUser;

import java.util.Optional;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface AppUserRepository extends CrudRepository<AppUser, Long> {
    boolean existsByUsername(String username);

    Optional<AppUser> findByUsername(String username);
}
