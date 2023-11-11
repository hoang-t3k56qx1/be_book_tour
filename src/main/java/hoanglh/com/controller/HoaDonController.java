package hoanglh.com.controller;

import hoanglh.com.model.*;
import hoanglh.com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/dondats")
public class HoaDonController {

    private final HoaDonService hoaDonService;

    @Autowired
    public HoaDonController(HoaDonService hoaDonService) {
        this.hoaDonService = hoaDonService;
    }

    @GetMapping
    public List<DonDat> getAllHoaDon() {
        return hoaDonService.getAllHoaDon();
    }

    @GetMapping("/{id}")
    public List<DonDat> getHoaDonById(@PathVariable Long id) {
        return hoaDonService.getHoaDonById(id);
    }

    @PostMapping
    public DonDat createHoaDon(@RequestBody DonDat hoaDon) {
        return hoaDonService.createHoaDon(hoaDon);
    }

    @PutMapping("/{id}")
    public DonDat updateHoaDon( @RequestBody DonDat hoaDon) {
        return hoaDonService.updateHoaDon(hoaDon);
    }

    @DeleteMapping("/{id}")
    public void deleteHoaDon(@PathVariable Long uid) {
        hoaDonService.deleteHoaDon(uid);
    }
}

