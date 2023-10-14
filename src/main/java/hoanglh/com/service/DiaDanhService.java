package hoanglh.com.service;

import hoanglh.com.model.*;
import hoanglh.com.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DiaDanhService {

    private final DiaDanhRepository diaDanhRepository;

    @Autowired
    public DiaDanhService(DiaDanhRepository diaDanhRepository) {
        this.diaDanhRepository = diaDanhRepository;
    }

    public List<DiaDanh> getAllDiaDanh() {
        return diaDanhRepository.findAll();
    }

    public DiaDanh getDiaDanhById(Long id) {
        return diaDanhRepository.findById(id).orElse(null);
    }

    public DiaDanh createDiaDanh(DiaDanh diaDanh) {
        return diaDanhRepository.save(diaDanh);
    }

    public DiaDanh updateDiaDanh(DiaDanh diaDanh) {
        return diaDanhRepository.save(diaDanh);
    }

    public void deleteDiaDanh(Long id) {
        diaDanhRepository.deleteById(id);
    }
}

