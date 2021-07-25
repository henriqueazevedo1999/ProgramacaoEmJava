package aula3.controller;

public class Produto 
{
    private int id;
    private String descricao;
    private float preco;
    private float estoque;
    private Categoria categoria;

    public Produto(int id) 
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

    public float getPreco() 
    {
        return preco;
    }

    public void setPreco(float preco)
    {
        this.preco = preco;
    }

    public float getEstoque()
    {
        return estoque;
    }

    public void setEstoque(float estoque)
    {
        this.estoque = estoque;
    }

    public Categoria getCategoria()
    {
        return categoria;
    }

    public void setCategoria(Categoria categoria)
    {
        this.categoria = categoria;
    }
}