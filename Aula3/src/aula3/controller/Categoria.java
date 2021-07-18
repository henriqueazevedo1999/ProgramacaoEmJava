package aula3.controller;

public class Categoria
{
    private int id;
    private String descricao;

    public Categoria(int id) 
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public String getDescricao() 
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
}
