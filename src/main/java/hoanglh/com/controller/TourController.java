package hoanglh.com.controller;

import hoanglh.com.model.*;
import hoanglh.com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tours")
public class TourController {

    private final TourService tourService;

    @Autowired
    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping
    public List<Tour> getAllTour() {
        return tourService.getAllTour();
    }

    @GetMapping("/name")
    public List<Tour> getTourByName(@RequestParam(required = false) String key) {
        if (key == null || key.trim().isEmpty()) {
            // Nếu key không tồn tại hoặc rỗng, trả về tất cả các tour
            return tourService.getAllTour();
        }

        return tourService.findByTenIgnoreCaseContaining(key);
    }

    @GetMapping("/{id}")
    public Tour getTourById(@PathVariable Long id) {
        return tourService.getTourById(id);
    }

    @PostMapping
    public Tour createTour(@RequestBody Tour tour) {
        return tourService.createTour(tour);
    }

    @PutMapping("/{id}")
    public Tour updateTour( @RequestBody Tour tour) {
        return tourService.updateTour(tour);
    }

    @DeleteMapping("/{id}")
    public void deleteTour(@PathVariable Long uid) {
        tourService.deleteTour(uid);
    }
}