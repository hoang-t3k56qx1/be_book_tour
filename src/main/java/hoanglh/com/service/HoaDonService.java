package hoanglh.com.service;

import hoanglh.com.model.*;
import hoanglh.com.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HoaDonService {

    private final HoaDonRepository hoaDonRepository;

    @Autowired
    public HoaDonService(HoaDonRepository hoaDonRepository) {
        this.hoaDonRepository = hoaDonRepository;
    }

    public List<HoaDon> getAllHoaDon() {
        return hoaDonRepository.findAll();
    }

    public HoaDon getHoaDonById(Long id) {
        return hoaDonRepository.findById(id).orElse(null);
    }

    public HoaDon createHoaDon(HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    public HoaDon updateHoaDon(HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    public void deleteHoaDon(Long id) {
        hoaDonRepository.deleteById(id);
    }
}


