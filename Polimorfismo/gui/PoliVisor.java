package gui;

import graphics.Cuadrado;
import graphics.FiguraGrafica;
import graphics.Triangulo;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JColorChooser;

/**
 * @author Héctor Quej Cosgaya
 * @author Jose Aguilar Canepa
 * 
 * Esta clase te permitirá visualizar el poder del polimorfismo.
 */
public class PoliVisor extends javax.swing.JFrame {

    private FiguraGrafica figura;
    private Color c;
    
    public PoliVisor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelTipo = new javax.swing.JPanel();
        botonCuadrado = new javax.swing.JButton();
        botonRectangulo = new javax.swing.JButton();
        botonTriangulo = new javax.swing.JButton();
        panelControl = new javax.swing.JPanel();
        botonArriba = new javax.swing.JButton();
        botonColor = new javax.swing.JButton();
        botonIzquierda = new javax.swing.JButton();
        botonDerecha = new javax.swing.JButton();
        botonAbajo = new javax.swing.JButton();
        botonGrande = new javax.swing.JButton();
        botonPequeno = new javax.swing.JButton();
        panelFigura = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "¿Qué deseas dibujar?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14))); // NOI18N

        botonCuadrado.setText("Un cuadrado!");
        botonCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuadradoActionPerformed(evt);
            }
        });

        botonRectangulo.setText("Un rectángulo!");

        botonTriangulo.setText("Un triángulo!");
        botonTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTrianguloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTipoLayout = new javax.swing.GroupLayout(panelTipo);
        panelTipo.setLayout(panelTipoLayout);
        panelTipoLayout.setHorizontalGroup(
            panelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonRectangulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTipoLayout.setVerticalGroup(
            panelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonCuadrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRectangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonTriangulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelControl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        botonArriba.setText("^");
        botonArriba.setEnabled(false);
        botonArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaActionPerformed(evt);
            }
        });

        botonColor.setText("C");
        botonColor.setEnabled(false);
        botonColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonColorActionPerformed(evt);
            }
        });

        botonIzquierda.setText("<");
        botonIzquierda.setEnabled(false);
        botonIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIzquierdaActionPerformed(evt);
            }
        });

        botonDerecha.setText(">");
        botonDerecha.setEnabled(false);
        botonDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDerechaActionPerformed(evt);
            }
        });

        botonAbajo.setText("v");
        botonAbajo.setEnabled(false);
        botonAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoActionPerformed(evt);
            }
        });

        botonGrande.setText("+");
        botonGrande.setEnabled(false);
        botonGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGrandeActionPerformed(evt);
            }
        });

        botonPequeno.setText("-");
        botonPequeno.setEnabled(false);
        botonPequeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPequenoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonIzquierda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonPequeno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonDerecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonGrande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(botonArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonColor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPequeno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelFiguraLayout = new javax.swing.GroupLayout(panelFigura);
        panelFigura.setLayout(panelFiguraLayout);
        panelFiguraLayout.setHorizontalGroup(
            panelFiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );
        panelFiguraLayout.setVerticalGroup(
            panelFiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelFigura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void botonArribaActionPerformed(java.awt.event.ActionEvent evt) {                                            
        figura.mover(getPanelGraphics(), "arriba");
    }                                           

    private void botonAbajoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        figura.mover(getPanelGraphics(), "abajo");
    }                                          

    private void botonIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        figura.mover(getPanelGraphics(), "izquierda");
    }                                              

    private void botonDerechaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        figura.mover(getPanelGraphics(), "derecha");
    }                                            

    private void botonPequenoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        figura.encojer(getPanelGraphics());
    }                                            

    private void botonGrandeActionPerformed(java.awt.event.ActionEvent evt) {                                            
        figura.agrandar(getPanelGraphics());
    }                                           

    private void botonColorActionPerformed(java.awt.event.ActionEvent evt) {                                           
        c = JColorChooser.showDialog(this, "Selecciona el nuevo color", Color.BLACK);
        
        if (c == null) {
            c = Color.BLACK;
        }
        
        figura.cambiarColor(getPanelGraphics(), c);
    }                                          

    private void botonCuadradoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        figura = new Cuadrado(15, 15, 50);
        figura.dibujar(getPanelGraphics());
        enableControls();
    }                                             

    private void botonTrianguloActionPerformed(java.awt.event.ActionEvent evt) {                                               
        figura = new Triangulo();
        figura.dibujar(getPanelGraphics());
        enableControls();
    }                                              

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
            java.util.logging.Logger.getLogger(PoliVisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PoliVisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PoliVisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PoliVisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PoliVisor().setVisible(true);
            }
        });
    }
    
    private Graphics getPanelGraphics() {
        Graphics g = panelFigura.getGraphics();
        g.clearRect(0, 0, panelFigura.getHeight(), panelFigura.getWidth());
        g.setColor(c);
        return g;
    }
    
    private void enableControls(){
        botonAbajo.setEnabled(true);
        botonArriba.setEnabled(true);
        botonIzquierda.setEnabled(true);
        botonDerecha.setEnabled(true);
        botonPequeno.setEnabled(true);
        botonGrande.setEnabled(true);
        botonColor.setEnabled(true);
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton botonAbajo;
    private javax.swing.JButton botonArriba;
    private javax.swing.JButton botonColor;
    private javax.swing.JButton botonCuadrado;
    private javax.swing.JButton botonDerecha;
    private javax.swing.JButton botonGrande;
    private javax.swing.JButton botonIzquierda;
    private javax.swing.JButton botonPequeno;
    private javax.swing.JButton botonRectangulo;
    private javax.swing.JButton botonTriangulo;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelFigura;
    private javax.swing.JPanel panelTipo;
    // End of variables declaration                   
}
