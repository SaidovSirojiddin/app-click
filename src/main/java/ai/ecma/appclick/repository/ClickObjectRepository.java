package ai.ecma.appclick.repository;

import ai.ecma.appclick.entity.ClickObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClickObjectRepository extends JpaRepository<ClickObject, Long> {
}