package sda.entity;


import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="cont")
public class Cont  {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name ="native", strategy = "native")
    public int id;

    @OneToOne
    @JoinColumn(name="IdClient")
    public Clienti client;

    public long Sold;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Clienti getClient() {
        return client;
    }

    public void setClient(Clienti client) {
        this.client = client;
    }




    @Override
    public String toString() {
        return "Cont{" +
                "id=" + id +
                ", Sold=" + Sold +
                '}';
    }
}
