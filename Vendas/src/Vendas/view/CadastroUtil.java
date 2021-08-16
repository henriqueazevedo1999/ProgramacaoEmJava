package Vendas.view;

import Vendas.utils.ValidaCpfCnpj;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadastroUtil 
{
    public static boolean VerificaCampoTexto(JTextField campo)
    {
        if (campo.getText().isEmpty())
        {
            campo.requestFocus();
            return false;
        }
        return true;
    }
    
    public static boolean VerificaCampoCpf(JTextField campo)
    {
        if (campo.getText().isEmpty() || (!ValidaCpfCnpj.isValid(campo.getText())))
        {
            campo.requestFocus();
            return false;
        }
        return true;
    }
    
    public static boolean VerificaComboBox(JComboBox comboBox)
    {
        if (comboBox.getSelectedIndex() <= 0)
        {
            comboBox.requestFocus();
            return false;
        }
        
        return true;
    }
    
    public static boolean VerificaCampoInt(JTextField campo)
    {
        try 
        {
            Integer.parseInt(campo.getText());
        } 
        catch (NumberFormatException e)
        {
            campo.requestFocus();
            return false;
        }
        return true;
    }
    
    public static boolean VerificaCampoFloat(JTextField campo)
    {
        try 
        {
            Float.parseFloat(campo.getText());
        } 
        catch (NumberFormatException e)
        {
            campo.requestFocus();
            return false;
        }
        return true;
    }
    
    public static boolean VerificaCampoFloat(JTextField campo, boolean maiorQueZero)
    {
        VerificaCampoFloat(campo);
        
        if (Float.parseFloat(campo.getText()) <= 0)
            return false;

        return true;
    }
}
