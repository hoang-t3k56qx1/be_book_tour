package hoanglh.com.repository;


import hoanglh.com.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourRepository extends JpaRepository<Tour, Long> {
    List<Tour> findByTenIgnoreCaseContaining(String ten);
}
