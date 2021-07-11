package exerciciocarro.model;

public class Carro {

    private String Placa;
    private String Modelo;
    private String Marca;
    private double Km;
    private double LitrosAbastecidos;
    private double CapacidadeTanque;

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public double getKm() {
        return Km;
    }

    public void setKm(double Km) {
        this.Km = Km;
    }

    public double getLitrosAbastecidos() {
        return LitrosAbastecidos;
    }

    public void setLitrosAbastecidos(double LitrosAbastecidos) {
        this.LitrosAbastecidos = LitrosAbastecidos;
    }

    public double getCapacidadeTanque() {
        return CapacidadeTanque;
    }

    public void setCapacidadeTanque(double CapacidadeTanque) {
        this.CapacidadeTanque = CapacidadeTanque;
    }

    public double getConsumo()
    {
        return LitrosAbastecidos * Km;
    }
}
