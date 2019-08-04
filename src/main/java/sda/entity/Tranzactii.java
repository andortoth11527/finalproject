package sda.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tranzactii")
public class Tranzactii implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int Id;



    @OneToOne
    @JoinColumn(name = "TipTranzactie")
    private TipTranzactii tipTranzactii;

    private String contSursa;
    private String contDestinatie;
    private long suma;
    private String data;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public TipTranzactii getTipTranzactii() {
        return tipTranzactii;
    }

    public void setTipTranzactii(TipTranzactii tipTranzactii) {
        this.tipTranzactii = tipTranzactii;
    }

    public String getContSursa() {
        return contSursa;
    }

    public void setContSursa(String contSursa) {
        this.contSursa = contSursa;
    }

    public String getContDestinatie() {
        return contDestinatie;
    }

    public void setContDestinatie(String contDestinatie) {
        this.contDestinatie = contDestinatie;
    }

    public long getSuma() {
        return suma;
    }

    public void setSuma(long suma) {
        this.suma = suma;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Tranzactii{" +
                "Id=" + Id +
                ", tipTranzactii=" + tipTranzactii +
                ", contSursa='" + contSursa + '\'' +
                ", contDestinatie='" + contDestinatie + '\'' +
                ", suma=" + suma +
                ", data='" + data + '\'' +
                '}';
    }
}