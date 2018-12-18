package com.company;


public class Client {
    private String Nom;
    private String Cognoms;
    private String DNI;

    public Client(String nom, String cognoms, String DNI) throws BankClientException {
        Nom = nom;
        Cognoms = cognoms;
        if(OperacionsBanc.validar(DNI)) this.DNI = DNI;
        else
            throw new BankClientException(ExceptionMessage.WRONG_DNI);

    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getCognoms() {
        return Cognoms;
    }

    public void setCognoms(String cognoms) {
        Cognoms = cognoms;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void transferencia(CompteEstalvi font, CompteEstalvi desti, double suma) {
        //TODO implementar transferència

       //REVISAR ESTO???
        double saldoDisponible = font.getSaldo();
        saldoDisponible = saldoDisponible - suma;
        font.getLlista_usuaris();

        double saldoDisponibleDestino = desti.getSaldo();
        saldoDisponibleDestino = saldoDisponibleDestino + suma;

    }

}