package aula2.view;

import aula2.controller.ControllerPessoa;
import aula2.controller.Pessoa;
import javax.swing.JOptionPane;

public class CadastroPessoa extends javax.swing.JFrame {

    ControllerPessoa controllerPessoa;
    
    public CadastroPessoa() {
        initComponents();
        controllerPessoa = new ControllerPessoa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jbSalvarPessoa = new javax.swing.JButton();
        jbAlterarPessoa = new javax.swing.JButton();
        jbExcluirPessoa = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jtNomePessoa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtSobrenomePessoa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtDataNascimentoPessoa = new javax.swing.JTextField();
        jcNacionalidadePessoa = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtEnderecoPessoaCep = new javax.swing.JTextField();
        jtEnderecoPessoaRua = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtEnderecoPessoaBairro = new javax.swing.JTextField();
        jtEnderecoPessoaNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtEnderecoPessoaCidade = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jtContatoPessoaEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtContatoPessoaTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro pessoa");

        jbSalvarPessoa.setText("Salvar");
        jbSalvarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarPessoaActionPerformed(evt);
            }
        });

        jbAlterarPessoa.setText("Alterar");

        jbExcluirPessoa.setText("Excluir");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jbSalvarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAlterarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbExcluirPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvarPessoa)
                    .addComponent(jbAlterarPessoa)
                    .addComponent(jbExcluirPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jtNomePessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomePessoaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jtSobrenomePessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtSobrenomePessoaActionPerformed(evt);
            }
        });

        jLabel5.setText("Sobrenome");

        jLabel6.setText("Data nascimento");

        jtDataNascimentoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDataNascimentoPessoaActionPerformed(evt);
            }
        });

        jcNacionalidadePessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brasileira", "Argentina", "Canadense" }));
        jcNacionalidadePessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcNacionalidadePessoaActionPerformed(evt);
            }
        });

        jLabel15.setText("Nacionalidade");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jtNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtSobrenomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtDataNascimentoPessoa, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel15)
                    .addComponent(jcNacionalidadePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(417, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtSobrenomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtDataNascimentoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcNacionalidadePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados pessoais", jPanel1);

        jLabel7.setText("Bairro");

        jLabel8.setText("CEP");

        jtEnderecoPessoaCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEnderecoPessoaCepActionPerformed(evt);
            }
        });

        jtEnderecoPessoaRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEnderecoPessoaRuaActionPerformed(evt);
            }
        });

        jLabel9.setText("Rua");

        jtEnderecoPessoaBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEnderecoPessoaBairroActionPerformed(evt);
            }
        });

        jtEnderecoPessoaNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEnderecoPessoaNumeroActionPerformed(evt);
            }
        });

        jLabel10.setText("Número");

        jLabel11.setText("Cidade");

        jtEnderecoPessoaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEnderecoPessoaCidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jtEnderecoPessoaCep, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jtEnderecoPessoaRua, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jtEnderecoPessoaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jtEnderecoPessoaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jtEnderecoPessoaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtEnderecoPessoaRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtEnderecoPessoaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtEnderecoPessoaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtEnderecoPessoaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtEnderecoPessoaCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Endereço", jPanel2);

        jLabel12.setText("Telefone");

        jtContatoPessoaEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtContatoPessoaEmailActionPerformed(evt);
            }
        });

        jLabel14.setText("Email");

        jtContatoPessoaTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtContatoPessoaTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jtContatoPessoaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtContatoPessoaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(417, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtContatoPessoaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtContatoPessoaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Contato", jPanel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cadastro de Pessoas");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNomePessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomePessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomePessoaActionPerformed

    private void jtSobrenomePessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtSobrenomePessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSobrenomePessoaActionPerformed

    private void jtDataNascimentoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDataNascimentoPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDataNascimentoPessoaActionPerformed

    private void jtEnderecoPessoaCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEnderecoPessoaCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEnderecoPessoaCepActionPerformed

    private void jtEnderecoPessoaRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEnderecoPessoaRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEnderecoPessoaRuaActionPerformed

    private void jtEnderecoPessoaBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEnderecoPessoaBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEnderecoPessoaBairroActionPerformed

    private void jtEnderecoPessoaNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEnderecoPessoaNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEnderecoPessoaNumeroActionPerformed

    private void jtEnderecoPessoaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEnderecoPessoaCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEnderecoPessoaCidadeActionPerformed

    private void jtContatoPessoaEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtContatoPessoaEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtContatoPessoaEmailActionPerformed

    private void jtContatoPessoaTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtContatoPessoaTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtContatoPessoaTelefoneActionPerformed

    private void jcNacionalidadePessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcNacionalidadePessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcNacionalidadePessoaActionPerformed

    private void jbSalvarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarPessoaActionPerformed
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(jtNomePessoa.getText());
        pessoa.setSobrenome(jtSobrenomePessoa.getText());
        pessoa.setDataNascimento(jtDataNascimentoPessoa.getText());
        pessoa.setNacionalidade(jcNacionalidadePessoa.getSelectedItem().toString());
        
        pessoa.endereco.setRua(jtEnderecoPessoaRua.getText());
        pessoa.endereco.setNumero(jtEnderecoPessoaNumero.getText());
        pessoa.endereco.setBairro(jtEnderecoPessoaBairro.getText());
        pessoa.endereco.setCidade(jtEnderecoPessoaCidade.getText());
        pessoa.endereco.setCep(jtEnderecoPessoaCep.getText());
        
        pessoa.contato.setTelefone(jtContatoPessoaTelefone.getText());
        pessoa.contato.setEmail(jtContatoPessoaEmail.getText());
        
        if (controllerPessoa.SalvaPessoa(pessoa))
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!");
    }//GEN-LAST:event_jbSalvarPessoaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbAlterarPessoa;
    private javax.swing.JButton jbExcluirPessoa;
    private javax.swing.JButton jbSalvarPessoa;
    private javax.swing.JComboBox<String> jcNacionalidadePessoa;
    private javax.swing.JTextField jtContatoPessoaEmail;
    private javax.swing.JTextField jtContatoPessoaTelefone;
    private javax.swing.JTextField jtDataNascimentoPessoa;
    private javax.swing.JTextField jtEnderecoPessoaBairro;
    private javax.swing.JTextField jtEnderecoPessoaCep;
    private javax.swing.JTextField jtEnderecoPessoaCidade;
    private javax.swing.JTextField jtEnderecoPessoaNumero;
    private javax.swing.JTextField jtEnderecoPessoaRua;
    private javax.swing.JTextField jtNomePessoa;
    private javax.swing.JTextField jtSobrenomePessoa;
    // End of variables declaration//GEN-END:variables
}
