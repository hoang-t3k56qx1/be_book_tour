package hoanglh.com.repository;

import hoanglh.com.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaDanhRepository extends JpaRepository<DiaDanh, Long> {

}

