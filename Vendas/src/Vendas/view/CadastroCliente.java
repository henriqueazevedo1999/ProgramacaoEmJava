package Vendas.view;

import Vendas.controller.Cliente;
import Vendas.controller.Contato;
import Vendas.controller.Endereco;
import Vendas.controller.Estados;
import Vendas.models.DAOCliente;
import javax.swing.JOptionPane;

public class CadastroCliente extends javax.swing.JFrame implements ICadastro
{
    DAOCliente dao;
    private static CadastroCliente instance = null;
    
    public CadastroCliente()
    {
        dao = new DAOCliente();
        initComponents();
        populaEstados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtCidade = new javax.swing.JTextField();
        jlCidade = new javax.swing.JLabel();
        jlUF = new javax.swing.JLabel();
        jcUF = new javax.swing.JComboBox<>();
        jbSalvar = new javax.swing.JButton();
        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jlCPF = new javax.swing.JLabel();
        jlFone = new javax.swing.JLabel();
        jbLimpar = new javax.swing.JButton();
        jtFone = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jtRua = new javax.swing.JTextField();
        jlRua = new javax.swing.JLabel();
        jlNumero = new javax.swing.JLabel();
        jtNumero = new javax.swing.JTextField();
        jtBairro = new javax.swing.JTextField();
        jlBairro = new javax.swing.JLabel();
        jlCEP = new javax.swing.JLabel();
        jtCEP = new javax.swing.JTextField();
        jlTitulo = new javax.swing.JLabel();
        jtCPF = new javax.swing.JFormattedTextField();//(new MaskFormatter("###.###.###-##"));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        jlCidade.setText("Cidade");

        jlUF.setText("UF");

        jcUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a UF" }));

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jlNome.setText("Nome");

        jlCPF.setText("CPF");

        jlFone.setText("Fone");

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jlEmail.setText("Email");

        jlRua.setText("Rua");

        jlNumero.setText("Número");

        jlBairro.setText("Bairro");

        jlCEP.setText("CEP");

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Cadastro de Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlFone)
                            .addComponent(jlNome)
                            .addComponent(jlCPF)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlRua))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlNumero)
                                    .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlCidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlUF)
                                    .addComponent(jcUF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlBairro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCEP)
                                    .addComponent(jtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlEmail)
                                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jlCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlFone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlEmail)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlCEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlUF)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if (verificaCampos())
        {
            Cliente cliente = new Cliente(0);
            Endereco endereco = new Endereco();
            Contato contato = new Contato();
            
            cliente.setNome(jtNome.getText());
            cliente.setCpf(jtCPF.getText());
            
            contato.setFone(jtFone.getText());
            contato.setEmail(jtEmail.getText());
            cliente.setContato(contato);
            
            endereco.setRua(jtRua.getText());
            endereco.setNumero(Integer.parseInt(jtNumero.getText()));
            endereco.setCidade(jtCidade.getText());
            endereco.setBairro(jtBairro.getText());
            endereco.setCep(jtCEP.getText());
            endereco.setEstado(Estados.values()[jcUF.getSelectedIndex() - 1].name());
            cliente.setEndereco(endereco);
            
            if (dao.insert(cliente))
            {
                JOptionPane.showMessageDialog(rootPane, "Cliente salvo com sucesso!");
                limpaCampos();
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Erro ao salvar cliente.");
        }
        
        
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jbLimparActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                CadastroCliente.getInstance().setVisible(true);
            }
        });
    }
    
    public static CadastroCliente getInstance()
    {
        if(instance == null)
            instance =  new CadastroCliente();  

        return instance;
    }
    
    @Override
    public void limpaCampos()
    {
        jtNome.setText("");
        jtCPF.setText("");
        
        jtFone.setText("");
        jtEmail.setText("");
        
        jtRua.setText("");
        jtNumero.setText("");
        jtBairro.setText("");
        jtCEP.setText("");
        jtCidade.setText("");
        jcUF.setSelectedIndex(0);
    }
    
    @Override
    public boolean verificaCampos()
    {
        if (!CadastroUtil.VerificaCampoTexto(jtNome))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe o nome");
            return false;
        }
         
        if (!CadastroUtil.VerificaCampoCpf(jtCPF))
        {
            JOptionPane.showMessageDialog(rootPane, "CPF inválido");
            return false;
        }
        
        if (!CadastroUtil.VerificaCampoTexto(jtFone))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe o telefone");
            return false;
        }
        
        if (!CadastroUtil.VerificaCampoTexto(jtEmail))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe o email");
            return false;
        }
        
        if (!CadastroUtil.VerificaCampoTexto(jtRua))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe a rua");
            return false;
        }
        
        if (!CadastroUtil.VerificaCampoInt(jtNumero))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe o número da rua");
            return false;
        }
        
        if (!CadastroUtil.VerificaCampoTexto(jtBairro))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe o bairro");
            return false;
        }
        
        if (!CadastroUtil.VerificaCampoTexto(jtCEP))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe o CEP");
            return false;
        }
        
        if (!CadastroUtil.VerificaCampoTexto(jtCidade))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe a cidade");
            return false;
        }
        
        if (!CadastroUtil.VerificaCampoTexto(jtCEP))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe ");
            return false;
        }
        
        if (!CadastroUtil.VerificaComboBox(jcUF))
        {
            JOptionPane.showMessageDialog(rootPane, "Selecione a UF");
            return false;
        }
        
        return true;
    }

    private void populaEstados()
    {
        jcUF.removeAllItems();
        
        jcUF.addItem("Selecione a UF");
        
        for (Estados estado : Estados.values())
            jcUF.addItem(estado.name());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcUF;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCEP;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlFone;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlRua;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlUF;
    private javax.swing.JTextField jtBairro;
    private javax.swing.JTextField jtCEP;
    private javax.swing.JFormattedTextField jtCPF;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtFone;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTextField jtRua;
    // End of variables declaration//GEN-END:variables
}
