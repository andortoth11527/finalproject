package sda.model;

public class TranzactiiDTO {

     public int id;
     public int idClient;
     public int tipTranzactie;
     public String contSursa;
     public String contDestinatie;
     public int suma;
     public String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getTipTranzactie() {
        return tipTranzactie;
    }

    public void setTipTranzactie(int tipTranzactie) {
        this.tipTranzactie = tipTranzactie;
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

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }
}
