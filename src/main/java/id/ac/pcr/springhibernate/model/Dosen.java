package id.ac.pcr.springhibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dosen")
public class Dosen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dosen_id")
    private int id;
    @Column(name = "niy",unique = true)
    private String niy;
    @Column(name = "nama")
    private String nama;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNiy() {
        return niy;
    }

    public void setNiy(String niy) {
        this.niy = niy;
    }
}
