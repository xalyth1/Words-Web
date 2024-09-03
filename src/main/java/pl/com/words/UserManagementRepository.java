package pl.com.words;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserManagementRepository extends JpaRepository<UserAccount, Long> {
    boolean existsByUsername(String username);
}
