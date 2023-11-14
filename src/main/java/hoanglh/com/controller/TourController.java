package hoanglh.com.controller;

import hoanglh.com.model.*;
import hoanglh.com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PutMapping
    public Tour updateTour( @RequestBody Tour tour) {
        return tourService.updateTour(tour);
    }

    @DeleteMapping("/{uid}")
    public ResponseEntity<String> deleteTour(@PathVariable Long uid) {
        boolean deleted = tourService.deleteTour(uid);

        if (deleted) {
            return new ResponseEntity<>("Xóa thành công", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Lỗi: Tour không tồn tại hoặc không thể xóa", HttpStatus.OK);
        }
    }
}