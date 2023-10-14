package hoanglh.com.model;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private User user;
    private Tour tour;
    private int soLuong;
    private String ngayDat;
    private String ngayBatDau;
    private String ngayKetThuc;


}