package aula3.controller;

public class FiltroCliente {
    private String nome;
    private String cpf;
    private FiltroContato filtroContato;
    private FiltroEndereco filtroEndereco;

    public FiltroCliente()
    {
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

    public FiltroContato getFiltroContato()
    {
        return filtroContato;
    }

    public void setFiltroContato(FiltroContato filtroContato)
    {
        this.filtroContato = filtroContato;
    }

    public FiltroEndereco getFiltroEndereco()
    {
        return filtroEndereco;
    }

    public void setFiltroEndereco(FiltroEndereco filtroEndereco)
    {
        this.filtroEndereco = filtroEndereco;
    }
}