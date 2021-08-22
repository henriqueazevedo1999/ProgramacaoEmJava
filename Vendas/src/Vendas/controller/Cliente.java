package Vendas.controller;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private Contato contato;
    private Endereco endereco;

    public Cliente()
    {
    }
    
    public Cliente(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    public Contato getContato()
    {
        return contato;
    }

    public void setContato(Contato contato)
    {
        this.contato = contato;
    }

    public Endereco getEndereco()
    {
        return endereco;
    }

    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }
}