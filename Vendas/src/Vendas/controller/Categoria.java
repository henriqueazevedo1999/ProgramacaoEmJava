package Vendas.controller;

public class Categoria
{
    private int id;
    private String descricao;
    
    public Categoria(){}
    
    public Categoria(String descricao) 
    {
        setDescricao(descricao);
    }
    
    public Categoria(int id, String descricao) 
    {
        setId(id);
        setDescricao(descricao);
    }

    public void setId(int id)
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
