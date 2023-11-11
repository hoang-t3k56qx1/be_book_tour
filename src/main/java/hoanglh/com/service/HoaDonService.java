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

    public List<DonDat> getAllHoaDon() {
        return hoaDonRepository.findAll();
    }

    public List<DonDat> getHoaDonById(Long id) {
        return hoaDonRepository.findByUserId(id);
    }

    public DonDat createHoaDon(DonDat hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    public DonDat updateHoaDon(DonDat hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    public void deleteHoaDon(Long id) {
        hoaDonRepository.deleteById(id);
    }
}


