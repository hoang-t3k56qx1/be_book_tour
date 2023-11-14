package hoanglh.com.service;

import hoanglh.com.model.*;
import hoanglh.com.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TourService {

    private final TourRepository tourRepository;

    @Autowired
    public TourService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    public List<Tour> getAllTour() {
        return tourRepository.findAll();
    }
    public List<Tour> findByTenIgnoreCaseContaining(String key) {
        return tourRepository.findByTenIgnoreCaseContaining(key);
    }

    public Tour getTourById(Long id) {
        return tourRepository.findById(id).orElse(null);
    }

    public Tour createTour(Tour tour) {
        return tourRepository.save(tour);
    }

    public Tour updateTour(Tour tour) {
        return tourRepository.save(tour);
    }

    public boolean deleteTour(Long id) {
        try {
            tourRepository.deleteById(id);
            return true; // Xóa thành công
        } catch (Exception e) {
            return false; // Xóa thất bại
        }
    }
}
