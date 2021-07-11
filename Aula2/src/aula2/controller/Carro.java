package aula2.controller;

public class Carro 
{
    private String placa;
    private String marca;
    private String modelo;
    private String cor;

    public Carro()
    {
        
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public String toString()
    {
        return "Carro: {Placa: " + getPlaca() + "Marca: " + getMarca() + "Modelo: " + getModelo() + "Cor: " + getCor() + "}";
    }
}
