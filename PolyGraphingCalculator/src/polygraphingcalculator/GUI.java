package polygraphingcalculator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class GUI extends javax.swing.JFrame {
    List<Polynomial> storedPolynomials = new ArrayList();
    DefaultComboBoxModel inputBoxModel = new DefaultComboBoxModel();
    DefaultComboBoxModel polyBox1Model = new DefaultComboBoxModel();
    DefaultComboBoxModel polyBox2Model = new DefaultComboBoxModel(); 
    String mode = "Addition";
    //Centre of the screen (x, y)
    double centreX = 0;
    double centreY = 0;
    //How many units the axis continues past the centre
    double zoom = 10;
    //Dragging variables
    int mouseX = 0;
    int mouseY = 0;
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        graphButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        storeButton = new javax.swing.JButton();
        polyBox1 = new javax.swing.JComboBox<>();
        polyBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        clearAllButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resultLabel2 = new javax.swing.JLabel();
        operationLabel = new javax.swing.JLabel();
        ModeBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        rescaleButton = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();
        storeResultButton = new javax.swing.JButton();
        inputBox = new javax.swing.JComboBox<>();
        removeButton = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        graphButton.setText("Graph");
        graphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphButtonActionPerformed(evt);
            }
        });

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 640));
        jPanel1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel1MouseWheelMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        storeButton.setText("Store");
        storeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeButtonActionPerformed(evt);
            }
        });

        polyBox1.setModel(polyBox1Model);

        polyBox2.setModel(polyBox2Model);

        jLabel1.setText("y=");

        clearAllButton.setText("Clear All");
        clearAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearGraphs(evt);
            }
        });

        jLabel2.setText("Polynomial 1: y =");

        jLabel3.setText("Polynomial 2: y =");

        resultLabel2.setText("Result:");

        operationLabel.setText("Added With:");

        ModeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Addition", "Subtraction", "Multiplication", "Division", "Derivative", "Integral" }));
        ModeBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ModeBoxItemStateChanged(evt);
            }
        });

        jLabel6.setText("Calculator Mode:");

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        rescaleButton.setText("Reset Zoom");
        rescaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rescaleButtonActionPerformed(evt);
            }
        });

        resultLabel.setText("0");

        storeResultButton.setText("Store Result");
        storeResultButton.setEnabled(false);
        storeResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeResultButtonActionPerformed(evt);
            }
        });

        inputBox.setEditable(true);
        inputBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "x^2 - 5x + 6" }));

        removeButton.setText("Remove");
        removeButton.setEnabled(false);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(polyBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(operationLabel)
                                                .addComponent(jLabel2))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(polyBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(storeButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ModeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removeButton))
                                .addGap(36, 36, 36)
                                .addComponent(clearAllButton)
                                .addContainerGap(48, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(graphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(rescaleButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(resultLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(resultLabel))
                                    .addComponent(calculateButton)
                                    .addComponent(storeResultButton))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(storeButton)
                            .addComponent(clearAllButton)
                            .addComponent(removeButton))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ModeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(polyBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(operationLabel)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(polyBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(calculateButton)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resultLabel2)
                            .addComponent(resultLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(storeResultButton)
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rescaleButton)
                            .addComponent(graphButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void redraw(Graphics g){
        Image graph = getGraphImage();
        g.drawImage(graph, 0, 0, rootPane);         
    }
        
    private void storeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeButtonActionPerformed
        String text = (String)inputBox.getSelectedItem();
        this.store(new Polynomial(text));
    }//GEN-LAST:event_storeButtonActionPerformed
    public void store(Polynomial p){
        boolean duplicate = false;
        for(Polynomial poly: storedPolynomials){
            if(p.toString().equals(poly.toString())){
                duplicate = true;
                break;
            }
        }
        if(!duplicate){
            storedPolynomials.add( p );
            this.remodel();
            removeButton.setEnabled(true);
        }
    }
    public void remodel(){
        inputBoxModel.removeAllElements();
        polyBox1Model.removeAllElements();
        polyBox2Model.removeAllElements();
        
        for(Polynomial poly: storedPolynomials){
            inputBoxModel.addElement(poly.toString());
            polyBox1Model.addElement(poly.toString());
            polyBox2Model.addElement(poly.toString());
        }
        inputBox.setModel(inputBoxModel);
        polyBox1.setModel(polyBox1Model);
        polyBox2.setModel(polyBox2Model);        
    }
    
    private void graphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphButtonActionPerformed
        this.zoom = 10;
        Graphics g = jPanel1.getGraphics();
        redraw(g);
    }//GEN-LAST:event_graphButtonActionPerformed

    private void clearGraphs(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearGraphs
        this.zoom = 10;
        this.centreX = 0;
        this.centreY = 0;
        storedPolynomials = new ArrayList();
        Graphics g = jPanel1.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        this.remodel();
    }//GEN-LAST:event_clearGraphs

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        //NEEDS WORK
        Polynomial result = null;
        Polynomial p1 = new Polynomial((String)polyBox1.getSelectedItem());
        Polynomial p2 = new Polynomial((String)polyBox2.getSelectedItem());
        
        if(mode.equals("Addition")){
            result = p1.polyAdd(p2);
        }
        else if(mode.equals("Subtraction")){
            result = p1.polySubtract(p2);
        }
        else if(mode.equals("Multiplication")){
            result = p1.polyMultiply(p2);
        }
        else if(mode.equals("Derivative")){
            //TODO code
            
        }
        else{ //This is integral
            //TODO code
        }
        resultLabel.setText(result.toString());
        storeResultButton.setEnabled(true);
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void jPanel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel1MouseWheelMoved
        if (evt.getWheelRotation() < 0)
            this.zoom /= 2;
        else
            this.zoom = Math.min(this.zoom*2, Math.pow(2, 30));
        Graphics g = jPanel1.getGraphics();
        redraw(g);      
    }//GEN-LAST:event_jPanel1MouseWheelMoved

    private void rescaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rescaleButtonActionPerformed
        this.zoom = 10;
        this.centreX = 0;
        this.centreY = 0;
        Graphics g = jPanel1.getGraphics();
        redraw(g);
    }//GEN-LAST:event_rescaleButtonActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        //Really basic rn, doesn't quite work
        if(evt.getX() > mouseX){
            centreX -= .2;
        }
        else if(evt.getX() < mouseX){
            centreX += .2;
        }
        if(evt.getY() > mouseY){
            centreY += .2;
        }
        else if(evt.getY() < mouseY){
            centreY -= .2;
        }

        Graphics g = jPanel1.getGraphics();
        redraw(g);
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MouseDragged

    private void ModeBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ModeBoxItemStateChanged
        mode = (String)ModeBox.getSelectedItem();
        boolean visible = true;
        if(mode.equals("Addition")){
            operationLabel.setText("Added With:");
        }
        else if(mode.equals("Subtraction")){
            operationLabel.setText("Subtracted By:");
        }
        else if(mode.equals("Multiplication")){
            operationLabel.setText("Multiplied With:");
        }
        else if(mode.equals("Division")){
            operationLabel.setText("Divided By:");
        }
        else{
            visible = false;
        }
        operationLabel.setVisible(visible);
        jLabel3.setVisible(visible);
        polyBox2.setVisible(visible);
        
    }//GEN-LAST:event_ModeBoxItemStateChanged

    private void storeResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeResultButtonActionPerformed
        this.store(new Polynomial(resultLabel.getText()));
        storeResultButton.setEnabled(false);
    }//GEN-LAST:event_storeResultButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int removeIndex = inputBox.getSelectedIndex();
        if(removeIndex != -1){
            storedPolynomials.remove(removeIndex);
            if(storedPolynomials.isEmpty()){
                removeButton.setEnabled(false);
            }
            this.remodel();
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MouseClicked

    public Image getGraphImage(){
        //Calculate necessary points
        double yMin = centreY - zoom;
        double yMax = centreY + zoom;
        double xMin = centreX - zoom;
        double xMax = centreX + zoom;
        int w = jPanel1.getWidth();
        int h = jPanel1.getHeight();     
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);        
        Graphics2D g = (Graphics2D) bi.getGraphics();
        
        g.setColor(Color.white);
        g.fillRect(0, 0, w, h);        
        //Some axes here
        g.setColor(Color.red);
        int originX = (int) Math.round(-w*xMin/(xMax-xMin));
        int originY = (int) Math.round(h*yMax/(yMax - yMin));
        g.drawLine(0, originY, w, originY);
        g.drawLine(originX, 0, originX, h);
        
        g.setColor(Color.black);        
        for (Polynomial f: storedPolynomials){
            //Graph each function as an ArrayList of points            
            List<Integer> xValues = new ArrayList();
            List<Integer> yValues = new ArrayList();
            int i = 0;
            //The value of x tracks across the screen, pixel by pixel
            for (double x=xMin; x<xMax; x+=(double)2*zoom/w){                
                try{ //Stores new points if the point wasn't an overflow
                    double y = f.evaluateAt(x);      
                    xValues.add((int) Math.round(w*(x - xMin)/(xMax-xMin)));
                    yValues.add((int) Math.round(h*(yMax - y)/(yMax - yMin)));
                } catch (java.lang.ArithmeticException e) {                    
                }
                i++;
            }
            //Convert ArrayList to int[] in order to plot the points
            Object[] x = xValues.toArray();
            Object[] y = yValues.toArray();
            int[] xV = new int[x.length];
            int[] yV = new int[y.length];                    
            for (int k=0; k<x.length; k++) {
                xV[k] = (int) x[k];
                yV[k] = (int) y[k];
            }
            g.drawPolyline(xV, yV, xV.length);
        }                
        return bi;
    }
    
    
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ModeBox;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton clearAllButton;
    private javax.swing.JButton graphButton;
    private javax.swing.JComboBox<String> inputBox;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel operationLabel;
    private javax.swing.JComboBox<String> polyBox1;
    private javax.swing.JComboBox<String> polyBox2;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton rescaleButton;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel resultLabel2;
    private javax.swing.JButton storeButton;
    private javax.swing.JButton storeResultButton;
    // End of variables declaration//GEN-END:variables
}
