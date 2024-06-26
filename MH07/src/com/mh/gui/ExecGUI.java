/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mh.gui;

import com.mh.biz.MaquinaHelados;
import com.mh.exceptions.NotEnoughMoneyException;
import com.mh.exceptions.NotValidPositionException;
import com.mh.exceptions.QuantityExceededException;
import com.mh.pojo.Helado;
import com.mh.utils.Utils;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author dev
 */
public class ExecGUI extends javax.swing.JFrame {
    ImageIcon logo = new ImageIcon("logazo.png");
    /**
     * Creates new form ExecGUI
     */
    public ExecGUI() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBotonCero = new javax.swing.JButton();
        jBotonDos = new javax.swing.JButton();
        jBotonUno = new javax.swing.JButton();
        jBotonTres = new javax.swing.JButton();
        jBotonCinco = new javax.swing.JButton();
        jBotonCuatro = new javax.swing.JButton();
        jBotonSeis = new javax.swing.JButton();
        jBotonOcho = new javax.swing.JButton();
        jBotonSiete = new javax.swing.JButton();
        jBotonNueve = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaHelados = new javax.swing.JTable();
        jBotonPedir = new javax.swing.JButton();
        jBotonBorrar = new javax.swing.JButton();
        jBotonIntroducir = new javax.swing.JButton();
        jCajaDinero = new javax.swing.JTextField();
        jBotonDevolver = new javax.swing.JButton();
        jCajaPos = new javax.swing.JTextField();
        jLabelTextos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jBotonCero.setBackground(new java.awt.Color(255, 255, 255));
        jBotonCero.setForeground(new java.awt.Color(0, 0, 0));
        jBotonCero.setText("0");
        jBotonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonCeroActionPerformed(evt);
            }
        });

        jBotonDos.setBackground(new java.awt.Color(255, 255, 255));
        jBotonDos.setForeground(new java.awt.Color(0, 0, 0));
        jBotonDos.setText("2");
        jBotonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonDosActionPerformed(evt);
            }
        });

        jBotonUno.setBackground(new java.awt.Color(255, 255, 255));
        jBotonUno.setForeground(new java.awt.Color(0, 0, 0));
        jBotonUno.setText("1");
        jBotonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonUnoActionPerformed(evt);
            }
        });

        jBotonTres.setBackground(new java.awt.Color(255, 255, 255));
        jBotonTres.setForeground(new java.awt.Color(0, 0, 0));
        jBotonTres.setText("3");
        jBotonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonTresActionPerformed(evt);
            }
        });

        jBotonCinco.setBackground(new java.awt.Color(255, 255, 255));
        jBotonCinco.setForeground(new java.awt.Color(0, 0, 0));
        jBotonCinco.setText("5");
        jBotonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonCincoActionPerformed(evt);
            }
        });

        jBotonCuatro.setBackground(new java.awt.Color(255, 255, 255));
        jBotonCuatro.setForeground(new java.awt.Color(0, 0, 0));
        jBotonCuatro.setText("4");
        jBotonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonCuatroActionPerformed(evt);
            }
        });

        jBotonSeis.setBackground(new java.awt.Color(255, 255, 255));
        jBotonSeis.setForeground(new java.awt.Color(0, 0, 0));
        jBotonSeis.setText("6");
        jBotonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSeisActionPerformed(evt);
            }
        });

        jBotonOcho.setBackground(new java.awt.Color(255, 255, 255));
        jBotonOcho.setForeground(new java.awt.Color(0, 0, 0));
        jBotonOcho.setText("8");
        jBotonOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonOchoActionPerformed(evt);
            }
        });

        jBotonSiete.setBackground(new java.awt.Color(255, 255, 255));
        jBotonSiete.setForeground(new java.awt.Color(0, 0, 0));
        jBotonSiete.setText("7");
        jBotonSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSieteActionPerformed(evt);
            }
        });

        jBotonNueve.setBackground(new java.awt.Color(255, 255, 255));
        jBotonNueve.setForeground(new java.awt.Color(0, 0, 0));
        jBotonNueve.setText("9");
        jBotonNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonNueveActionPerformed(evt);
            }
        });

        jTablaHelados.setBackground(new java.awt.Color(255, 255, 255));
        jTablaHelados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posición", "Nombre", "Precio", "Tipo", "Cantidad"
            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }
    );
    jTablaHelados.setFocusable(false);
    jTablaHelados.getTableHeader().setReorderingAllowed(false);
    jTablaHelados.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTablaHeladosMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTablaHelados);
    DefaultTableModel m = (DefaultTableModel) this.jTablaHelados.getModel();

    Object[] o = null;
    try{
        for (Helado helado : mh.showIceCream()) {
            o = new Object[]{helado.getPosicion(),helado.getNombre(),Utils.formateoDosDecimales(helado.getPrecio()) + "€" ,helado.getTipo(),helado.getCantidad()};
            m.addRow(o);
        }
    }catch(Exception e){
        e.printStackTrace();
    }

    jBotonPedir.setBackground(new java.awt.Color(255, 255, 255));
    jBotonPedir.setForeground(new java.awt.Color(0, 0, 0));
    jBotonPedir.setText("Pedir Helado");
    jBotonPedir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBotonPedirActionPerformed(evt);
        }
    });

    jBotonBorrar.setBackground(new java.awt.Color(255, 255, 255));
    jBotonBorrar.setForeground(new java.awt.Color(0, 0, 0));
    jBotonBorrar.setText("<");
    jBotonBorrar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBotonBorrarActionPerformed(evt);
        }
    });

    jBotonIntroducir.setBackground(new java.awt.Color(255, 255, 255));
    jBotonIntroducir.setForeground(new java.awt.Color(0, 0, 0));
    jBotonIntroducir.setText("Introducir dinero");
    jBotonIntroducir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBotonIntroducirActionPerformed(evt);
        }
    });

    jCajaDinero.setEditable(false);
    jCajaDinero.setText("0.00€");
    jCajaDinero.setPreferredSize(new java.awt.Dimension(100, 40));
    jCajaDinero.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCajaDineroActionPerformed(evt);
        }
    });

    jBotonDevolver.setBackground(new java.awt.Color(255, 255, 255));
    jBotonDevolver.setForeground(new java.awt.Color(0, 0, 0));
    jBotonDevolver.setText("D");
    jBotonDevolver.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBotonDevolverActionPerformed(evt);
        }
    });

    jCajaPos.setEditable(false);
    jCajaPos.setMinimumSize(new java.awt.Dimension(150, 70));
    jCajaPos.setPreferredSize(new java.awt.Dimension(100, 40));
    jCajaPos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCajaPosActionPerformed(evt);
        }
    });

    jLabelTextos.setForeground(new java.awt.Color(0, 0, 0));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(69, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jCajaDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBotonIntroducir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBotonDevolver))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jBotonCuatro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBotonCinco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBotonSeis))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jBotonSiete)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jBotonOcho)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBotonNueve))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jBotonCero)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBotonBorrar))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jBotonUno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBotonDos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBotonTres))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jCajaPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelTextos)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jBotonPedir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(32, 32, 32)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(40, 40, 40))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(103, 103, 103)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jBotonIntroducir)
                .addComponent(jCajaDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jBotonDevolver))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBotonUno)
                        .addComponent(jBotonDos)
                        .addComponent(jBotonTres))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBotonCuatro)
                        .addComponent(jBotonCinco)
                        .addComponent(jBotonSeis))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBotonSiete)
                        .addComponent(jBotonOcho)
                        .addComponent(jBotonNueve))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBotonCero)
                        .addComponent(jBotonBorrar))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jBotonPedir)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCajaPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                    .addComponent(jLabelTextos)
                    .addGap(40, 40, 40))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );

    this.jCajaDinero.setEditable(false);
    this.jCajaPos.setEditable(false);
    this.jLabel1.setIcon(logo);

    jMenu1.setText("Menú");

    jMenuItem1.setText("Informe de ventas");
    jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem1ActionPerformed(evt);
        }
    });
    jMenu1.add(jMenuItem1);

    jMenuBar1.add(jMenu1);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonUnoActionPerformed
        // TODO add your handling code here:
        this.jCajaPos.setText(this.jCajaPos.getText() + "1");

    }//GEN-LAST:event_jBotonUnoActionPerformed

    private void jBotonPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonPedirActionPerformed
        // TODO add your handling code here:
        mh.setMonedero(Double.parseDouble(jCajaDinero.getText().substring(0, jCajaDinero.getText().length() - 1)));
        Helado conseguido = null;
        try {
            conseguido = mh.pedirHelado(this.jCajaPos.getText());
            this.refrescarTabla();
            this.jLabelTextos.setText("Aqui tiene su: " + conseguido.getNombre() + "\n" + " No olvide su cambio: " + Utils.formateoDosDecimales(mh.getMonedero()) );
            jCajaDinero.setText("0.00€");
            try {
                String ruta = "src/com/mh/sounds/pedir.wav";
                AudioInputStream aui = AudioSystem.getAudioInputStream(new File(ruta).getAbsoluteFile());
                try {
                    Clip clip = AudioSystem.getClip();
                    clip.open(aui);
                    clip.start();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (NotValidPositionException ex) {
            jLabelTextos.setText("Posición no válida");
        } catch (NotEnoughMoneyException ex) {
            jLabelTextos.setText("No tienes suficiente saldo");
        } catch (QuantityExceededException ex) {
            jLabelTextos.setText("No quedan mas existencias de este helado");
        } catch (Exception ex) {
            jLabelTextos.setText("Ha ocurrido un error inesperado");
        }
        this.jCajaPos.setText("");


    }//GEN-LAST:event_jBotonPedirActionPerformed

    private void jBotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBorrarActionPerformed
        // TODO add your handling code here:
        this.jCajaPos.setText("");
    }//GEN-LAST:event_jBotonBorrarActionPerformed

    private void jCajaPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCajaPosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jCajaPosActionPerformed

    //A partir del DOS

    private void jBotonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonDosActionPerformed
        // TODO add your handling code here:
        this.jCajaPos.setText(this.jCajaPos.getText() + "2");
    }//GEN-LAST:event_jBotonDosActionPerformed

    private void jBotonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonTresActionPerformed
        // TODO add your handling code here:
        this.jCajaPos.setText(this.jCajaPos.getText() + "3");
    }//GEN-LAST:event_jBotonTresActionPerformed

    private void jBotonCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonCuatroActionPerformed
        // TODO add your handling code here:
        this.jCajaPos.setText(this.jCajaPos.getText() + "4");
    }//GEN-LAST:event_jBotonCuatroActionPerformed

    private void jBotonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonCincoActionPerformed
        // TODO add your handling code here:
        this.jCajaPos.setText(this.jCajaPos.getText() + "5");
    }//GEN-LAST:event_jBotonCincoActionPerformed

    private void jBotonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSeisActionPerformed
        // TODO add your handling code here:
        this.jCajaPos.setText(this.jCajaPos.getText() + "6");
    }//GEN-LAST:event_jBotonSeisActionPerformed

    private void jBotonSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSieteActionPerformed
        // TODO add your handling code here:
        this.jCajaPos.setText(this.jCajaPos.getText() + "7");
    }//GEN-LAST:event_jBotonSieteActionPerformed

    private void jBotonOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonOchoActionPerformed
        // TODO add your handling code here:
        this.jCajaPos.setText(this.jCajaPos.getText() + "8");
    }//GEN-LAST:event_jBotonOchoActionPerformed

    private void jBotonNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonNueveActionPerformed
        // TODO add your handling code here:
        this.jCajaPos.setText(this.jCajaPos.getText() + "9");
    }//GEN-LAST:event_jBotonNueveActionPerformed

    private void jBotonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonCeroActionPerformed
        // TODO add your handling code here:
        this.jCajaPos.setText(this.jCajaPos.getText() + "0");
    }//GEN-LAST:event_jBotonCeroActionPerformed

    private void jCajaDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCajaDineroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCajaDineroActionPerformed

    private void jBotonIntroducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonIntroducirActionPerformed
        // TODO add your handling code here:
        DialogMonedero dM = new DialogMonedero(this, true);
        dM.setVisible(true);
        this.refrescarTabla();
    }//GEN-LAST:event_jBotonIntroducirActionPerformed

    private void jBotonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonDevolverActionPerformed
        // TODO add your handling code here:
        this.jLabelTextos.setText("Aqui tiene su cambio: " + jCajaDinero.getText());
        jCajaDinero.setText("0.0€");

    }//GEN-LAST:event_jBotonDevolverActionPerformed

    private void jTablaHeladosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaHeladosMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = this.jTablaHelados.getSelectedRow();
        TableModel m = this.jTablaHelados.getModel();
        String pos = m.getValueAt(filaSeleccionada, 0).toString();
        this.jCajaPos.setText(pos);
    }//GEN-LAST:event_jTablaHeladosMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        DialogInformeVentas dIV = new DialogInformeVentas(this, true);
        dIV.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(ExecGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExecGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExecGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExecGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExecGUI().setVisible(true);

            }
        });
    }

    public void refrescarTabla() {

        DefaultTableModel m = (DefaultTableModel) this.jTablaHelados.getModel();
        m.setRowCount(0);
        Object[] o = null;
        try {
            for (Helado helado : mh.showIceCream()) {
                o = new Object[]{helado.getPosicion(), helado.getNombre(), helado.getPrecio(), helado.getTipo(), helado.getCantidad()};
                m.addRow(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    MaquinaHelados mh = new MaquinaHelados();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonBorrar;
    private javax.swing.JButton jBotonCero;
    private javax.swing.JButton jBotonCinco;
    private javax.swing.JButton jBotonCuatro;
    private javax.swing.JButton jBotonDevolver;
    private javax.swing.JButton jBotonDos;
    private javax.swing.JButton jBotonIntroducir;
    private javax.swing.JButton jBotonNueve;
    private javax.swing.JButton jBotonOcho;
    private javax.swing.JButton jBotonPedir;
    private javax.swing.JButton jBotonSeis;
    private javax.swing.JButton jBotonSiete;
    private javax.swing.JButton jBotonTres;
    private javax.swing.JButton jBotonUno;
    protected static javax.swing.JTextField jCajaDinero;
    private javax.swing.JTextField jCajaPos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTextos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaHelados;
    // End of variables declaration//GEN-END:variables
}
