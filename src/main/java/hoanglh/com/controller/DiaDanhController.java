package hoanglh.com.controller;

import hoanglh.com.model.*;
import hoanglh.com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/diadanhs")
public class DiaDanhController {

    private final DiaDanhService diaDanhService;

    @Autowired
    public DiaDanhController(DiaDanhService diaDanhService) {
        this.diaDanhService = diaDanhService;
    }

    @GetMapping
    public List<DiaDanh> getAllDiaDanhs() {
        return diaDanhService.getAllDiaDanh();
    }

    @GetMapping("/{id}")
    public DiaDanh getDiaDanhById(@PathVariable Long id) {
        return diaDanhService.getDiaDanhById(id);
    }

    @PostMapping
    public DiaDanh createDiaDanh(@RequestBody DiaDanh diaDanh) {
        return diaDanhService.createDiaDanh(diaDanh);
    }

    @PutMapping("/{id}")
    public DiaDanh updateDiaDanh( @RequestBody DiaDanh diaDanh) {
        return diaDanhService.updateDiaDanh(diaDanh);
    }

    @DeleteMapping("/{id}")
    public void deleteDiaDanh(@PathVariable Long uid) {
        diaDanhService.deleteDiaDanh(uid);
    }
}



