package hoanglh.com.model;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ten;

    @Column(columnDefinition = "TEXT")
    private String moTa;


    private float gia;

    private String thoiGian;

    @ManyToOne
    @JoinColumn(name = "dia_danh_id")
    private DiaDanh diaDanh;

    private String lichTrinh;

    @Column(columnDefinition = "TEXT")
    private String  imgs;

}

