package hoanglh.com.controller;

import hoanglh.com.model.*;
import hoanglh.com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/hoadons")
public class HoaDonController {

    private final HoaDonService hoaDonService;

    @Autowired
    public HoaDonController(HoaDonService hoaDonService) {
        this.hoaDonService = hoaDonService;
    }

    @GetMapping
    public List<HoaDon> getAllHoaDon() {
        return hoaDonService.getAllHoaDon();
    }

    @GetMapping("/{id}")
    public HoaDon getHoaDonById(@PathVariable Long id) {
        return hoaDonService.getHoaDonById(id);
    }

    @PostMapping
    public HoaDon createHoaDon(@RequestBody HoaDon hoaDon) {
        return hoaDonService.createHoaDon(hoaDon);
    }

    @PutMapping("/{id}")
    public HoaDon updateHoaDon( @RequestBody HoaDon hoaDon) {
        return hoaDonService.updateHoaDon(hoaDon);
    }

    @DeleteMapping("/{id}")
    public void deleteHoaDon(@PathVariable Long uid) {
        hoaDonService.deleteHoaDon(uid);
    }
}

