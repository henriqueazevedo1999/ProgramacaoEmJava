package aula3.controller;

public class Endereco {
    private String rua;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private int numero;

    public Endereco() 
    {
    }

    public String getRua() 
    {
        return rua;
    }

    public void setRua(String rua) 
    {
        this.rua = rua;
    }

    public String getBairro() 
    {
        return bairro;
    }

    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    }

    public String getCep() 
    {
        return cep;
    }

    public void setCep(String cep) 
    {
        this.cep = cep;
    }

    public String getCidade()
    {
        return cidade;
    }

    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }

    public String getEstado()
    {
        return estado;
    }

    public void setEstado(String estado) 
    {
        this.estado = estado;
    }

    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }
}