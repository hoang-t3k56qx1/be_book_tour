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
    private float gia;
    private String thoiGian;
    private DiaDanh diaDanh;
    private String lichTrinh;
    private List<String> img;

}

