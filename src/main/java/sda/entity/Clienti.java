package sda.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="clienti")
public class Clienti  {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name ="native", strategy = "native")
    private int Id;

    private String user;

    private Long cnp;


    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Cont> cont;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Long getCnp() {
        return cnp;
    }

    public void setCnp(Long cnp) {
        this.cnp = cnp;
    }



    public void setCont(List<Cont> cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "Clienti{" +
                "Id=" + Id +
                ", user='" + user + '\'' +
                ", cnp=" + cnp +
                '}';
    }
}
