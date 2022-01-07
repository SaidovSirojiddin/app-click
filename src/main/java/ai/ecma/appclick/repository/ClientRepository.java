package ai.ecma.appclick.repository;

import ai.ecma.appclick.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Optional<Client> findByPhoneNumber(String username);

    boolean existsByPhoneNumber(String username);
}
