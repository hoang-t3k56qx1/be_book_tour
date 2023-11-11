package hoanglh.com.repository;


import hoanglh.com.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoaDonRepository extends JpaRepository<DonDat, Long> {

    @Query("SELECT d FROM DonDat d WHERE d.user.id = :userId")
    List<DonDat> findByUserId(Long userId);
}
