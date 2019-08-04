package sda.model;

public class ContDTO {
 public int id;
 public int idClient;
 public long sold;

    public ContDTO(int id, int idClient, long sold) {
        this.id = id;
        this.idClient = idClient;
        this.sold = sold;
    }
}
