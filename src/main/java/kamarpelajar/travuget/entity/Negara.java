package kamarpelajar.travuget.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "negara")
public class Negara {
    
    @Id
    private int id;

    private String kode;

    private String nama;

    @Column(name = "mata_uang")
    private String mataUang;
}
