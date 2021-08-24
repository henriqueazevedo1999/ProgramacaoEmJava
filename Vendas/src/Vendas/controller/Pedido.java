package Vendas.controller;

import java.util.Date;
import java.util.List;

public class Pedido 
{
    private List<ItemPedido> itens;
    private int idCliente;
    private Date data;
    
    public void Pedido(){};
    
    public float getTotal()
    {
        float total = 0.0f;
        for (ItemPedido item : itens)
            total += item.getTotal();
        
        return total;
    }
    
    public boolean possuiItemPedido(int idProduto)
    {
        return getIndexItemPedidoByIdProduto(idProduto) >= 0;
    }
    
    public void adicionaItem(ItemPedido item)
    {
        int idxItemPedido = getIndexItemPedidoByIdProduto(item.getProduto().getId());
        if (idxItemPedido >= 0)
            itens.get(idxItemPedido).adicionaQuantidade(item.getQuantidade());
        else   
            itens.add(item);
    }
    
    public void removeItem(int posicao)
    {
        itens.remove(posicao);
    }
    
    public ItemPedido getItem(int idx)
    {
        return itens.get(idx);
    }
    
    public ItemPedido getItemPedidoByIdProduto(int idProduto)
    {
        return getItem(getIndexItemPedidoByIdProduto(idProduto));
    }
    
    public List<ItemPedido> getItens()
    {
        return itens;
    }
    
    public int getIndexItemPedidoByIdProduto(int idProduto)
    {
        for (int idx = 0; idx < itens.size(); idx++)
        {
            if (itens.get(idx).getProduto().getId() == idProduto)
                return idx;
        }
        
        return -1;
    }

    public int getIdCliente() 
    {
        return idCliente;
    }

    public void setIdCliente(int idCliente)
    {
        this.idCliente = idCliente;
    }

    public Date getData() 
    {
        return data;
    }

    public void setData(Date data) 
    {
        this.data = data;
    }
    
    public int getQuantidadeItens()
    {
        return this.itens.size();
    }
}
