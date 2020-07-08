/*
 * The MIT License
 * 
 * Copyright: Copyright (C) 2014 T2Ti.COM
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * 
 * The author may be contacted at: t2ti.com@gmail.com
 *
 * @author Claudio de Barros (T2Ti.com)
 * @version 2.0
 */
package com.t2tierp.vendas.cliente;

import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.InternalFrame;

public class VendaGrid extends InternalFrame {

    public VendaGrid(VendaGridController controller) {
        initComponents();
        gridControl1.setController(controller);
        gridControl1.setGridDataLocator(controller);
    }

    public GridControl getGrid1() {
        return gridControl1;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        insertButton1 = new org.openswing.swing.client.InsertButton();
        deleteButton1 = new org.openswing.swing.client.DeleteButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        navigatorBar1 = new org.openswing.swing.client.NavigatorBar();
        gridControl1 = new org.openswing.swing.client.GridControl();
        textColumn7 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn5 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn4 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn8 = new org.openswing.swing.table.columns.client.TextColumn();
        dateColumn9 = new org.openswing.swing.table.columns.client.DateColumn();
        dateColumn10 = new org.openswing.swing.table.columns.client.DateColumn();
        textColumn11 = new org.openswing.swing.table.columns.client.TextColumn();
        integerColumn12 = new org.openswing.swing.table.columns.client.IntegerColumn();
        decimalColumn15 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn17 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn19 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn20 = new org.openswing.swing.table.columns.client.DecimalColumn();
        comboColumn21 = new org.openswing.swing.table.columns.client.ComboColumn();
        comboColumn22 = new org.openswing.swing.table.columns.client.ComboColumn();
        decimalColumn23 = new org.openswing.swing.table.columns.client.DecimalColumn();
        comboColumn26 = new org.openswing.swing.table.columns.client.ComboColumn();

        setTitle("T2Ti ERP - Vendas e Faturamento");
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Venda Cabecalho"));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel1.add(insertButton1);
        jPanel1.add(deleteButton1);
        jPanel1.add(reloadButton1);
        jPanel1.add(navigatorBar1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        gridControl1.setDeleteButton(deleteButton1);
        gridControl1.setFunctionId("vendaCabecalho");
        gridControl1.setInsertButton(insertButton1);
        gridControl1.setNavBar(navigatorBar1);
        gridControl1.setReloadButton(reloadButton1);
        gridControl1.setValueObjectClassName("com.t2tierp.vendas.java.VendaCabecalhoVO");
        gridControl1.getColumnContainer().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        textColumn7.setColumnName("cliente.pessoa.nome");
        textColumn7.setHeaderColumnName("Cliente");
        textColumn7.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn7.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn7);

        textColumn5.setColumnName("transportadora.pessoa.nome");
        textColumn5.setHeaderColumnName("Transportadora");
        textColumn5.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn5.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn5);

        textColumn4.setColumnName("condicoesPagamento.nome");
        textColumn4.setHeaderColumnName("Condicao Pagamento");
        textColumn4.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn4.setPreferredWidth(150);
        gridControl1.getColumnContainer().add(textColumn4);

        textColumn8.setColumnName("vendedor.colaborador.pessoa.nome");
        textColumn8.setHeaderColumnName("Vendedor");
        textColumn8.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn8.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn8);

        dateColumn9.setColumnName("dataVenda");
        dateColumn9.setHeaderColumnName("Data Venda");
        dateColumn9.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(dateColumn9);

        dateColumn10.setColumnName("dataSaida");
        dateColumn10.setHeaderColumnName("Data Saida");
        dateColumn10.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(dateColumn10);

        textColumn11.setColumnName("horaSaida");
        textColumn11.setHeaderColumnName("Hora Saida");
        textColumn11.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(textColumn11);

        integerColumn12.setColumnName("numeroFatura");
        integerColumn12.setHeaderColumnName("Numero Fatura");
        integerColumn12.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(integerColumn12);

        decimalColumn15.setColumnName("valorSubtotal");
        decimalColumn15.setHeaderColumnName("Valor Subtotal");
        decimalColumn15.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn15.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn15);

        decimalColumn17.setColumnName("valorComissao");
        decimalColumn17.setHeaderColumnName("Valor Comissao");
        decimalColumn17.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn17.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn17);

        decimalColumn19.setColumnName("valorDesconto");
        decimalColumn19.setHeaderColumnName("Valor Desconto");
        decimalColumn19.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn19.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn19);

        decimalColumn20.setColumnName("valorTotal");
        decimalColumn20.setHeaderColumnName("Valor Total");
        decimalColumn20.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn20.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn20);

        comboColumn21.setColumnName("tipoFrete");
        comboColumn21.setDomainId("compraTipoFrete");
        comboColumn21.setHeaderColumnName("Tipo Frete");
        comboColumn21.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(comboColumn21);

        comboColumn22.setColumnName("formaPagamento");
        comboColumn22.setDomainId("formaPagamento");
        comboColumn22.setHeaderColumnName("Forma Pagamento");
        comboColumn22.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        comboColumn22.setPreferredWidth(120);
        gridControl1.getColumnContainer().add(comboColumn22);

        decimalColumn23.setColumnName("valorFrete");
        decimalColumn23.setHeaderColumnName("Valor Frete");
        decimalColumn23.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn23.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn23);

        comboColumn26.setColumnName("situacao");
        comboColumn26.setDomainId("vendaOrcamentoSituacao");
        comboColumn26.setHeaderColumnName("Situacao");
        comboColumn26.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(comboColumn26);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(gridControl1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.ComboColumn comboColumn21;
    private org.openswing.swing.table.columns.client.ComboColumn comboColumn22;
    private org.openswing.swing.table.columns.client.ComboColumn comboColumn26;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn10;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn9;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn15;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn17;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn19;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn20;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn23;
    private org.openswing.swing.client.DeleteButton deleteButton1;
    private org.openswing.swing.client.GridControl gridControl1;
    private org.openswing.swing.client.InsertButton insertButton1;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn12;
    private javax.swing.JPanel jPanel1;
    private org.openswing.swing.client.NavigatorBar navigatorBar1;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn11;
    private org.openswing.swing.table.columns.client.TextColumn textColumn4;
    private org.openswing.swing.table.columns.client.TextColumn textColumn5;
    private org.openswing.swing.table.columns.client.TextColumn textColumn7;
    private org.openswing.swing.table.columns.client.TextColumn textColumn8;
    // End of variables declaration//GEN-END:variables
}