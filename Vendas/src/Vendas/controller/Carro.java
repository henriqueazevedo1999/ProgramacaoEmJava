package Vendas.controller;

public class Carro
{
    private int id;
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private int capacidadeTanque;

    public Carro()
    {
    }
    
    public Carro(int id)
    {
        setId(id);
    }
    
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }

    public String getPlaca()
    {
        return placa;
    }

    public void setPlaca(String placa)
    {
        this.placa = placa;
    }

    public String getCor()
    {
        return cor;
    }

    public void setCor(String cor) 
    {
        this.cor = cor;
    }

    public int getCapacidadeTanque()
    {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) 
    {
        this.capacidadeTanque = capacidadeTanque;
    }
}
