package sda.entity;


import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tiptranzactii")
public class TipTranzactii {

    @Id
    @Column(name = "IdTiptranzactie")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int idTiptranzactie;

    private String tipTranzactie;

  /*  @OneToOne
    Tranzactii tranzactii;*/

    public int getIdTiptranzactie() {
        return idTiptranzactie;
    }

    public void setIdTiptranzactie(int idTiptranzactie) {
        this.idTiptranzactie = idTiptranzactie;
    }

    public String getTipTranzactie() {
        return tipTranzactie;
    }

    public void setTipTranzactie(String tipTranzactie) {
        this.tipTranzactie = tipTranzactie;
    }


}
