package polygraphingcalculator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class GUI extends javax.swing.JFrame {
    List<Polynomial> storedPolynomials = new ArrayList();
    DefaultComboBoxModel inputBoxModel = new DefaultComboBoxModel();
    DefaultComboBoxModel polyBox1Model = new DefaultComboBoxModel();
    DefaultComboBoxModel polyBox2Model = new DefaultComboBoxModel(); 
    String mode = "Addition";
    String graphed = "";
    //Centre of the screen (x, y)
    double centreX = 0;
    double centreY = 0;
    //How many units the axis continues past the centre
    double zoom = 10;
    //Dragging variables
    int mouseX = 0;
    int mouseY = 0;
    
    int w, h;
    
    public GUI() {
        initComponents();
        this.setTitle("Ye Olde Polynomial Graphing Calculator");
        this.w = jPanel1.getWidth();
        this.h = jPanel1.getHeight();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        graphButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        xLabel = new javax.swing.JLabel();
        yLabel = new javax.swing.JLabel();
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
        secretPlusC = new javax.swing.JLabel();
        graphAllButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        xValueField = new javax.swing.JTextField();
        yValueField = new javax.swing.JLabel();

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
        setMinimumSize(new java.awt.Dimension(1200, 640));
        setPreferredSize(new java.awt.Dimension(1200, 680));

        graphButton.setText("Graph");
        graphButton.setEnabled(false);
        graphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xLabel.setBackground(new java.awt.Color(255, 255, 255));
        xLabel.setText("X: ");
        xLabel.setOpaque(true);
        jPanel1.add(xLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        yLabel.setBackground(new java.awt.Color(255, 255, 255));
        yLabel.setText("Y: ");
        yLabel.setOpaque(true);
        jPanel1.add(yLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

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

        jLabel6.setText("Operation:");

        calculateButton.setText("Calculate");
        calculateButton.setEnabled(false);
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

        graphAllButton.setText("Graph All");
        graphAllButton.setEnabled(false);
        graphAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphAllButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Ye Olde Polynomial Graphing Calculator");

        jLabel5.setText("For selected function: When x = ");

        jLabel7.setText("y = ");

        xValueField.setText("0");
        xValueField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xValueFieldKeyTyped(evt);
            }
        });

        yValueField.setText("6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yValueField)
                            .addComponent(xValueField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(storeButton)
                                        .addGap(21, 21, 21)
                                        .addComponent(removeButton)
                                        .addGap(29, 29, 29)
                                        .addComponent(clearAllButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(graphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(graphAllButton)
                                        .addGap(25, 25, 25)
                                        .addComponent(rescaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1)
                                        .addGap(10, 10, 10)
                                        .addComponent(inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(ModeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(17, 17, 17)
                                        .addComponent(polyBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(17, 17, 17)
                                        .addComponent(polyBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(resultLabel2)
                                        .addGap(16, 16, 16)
                                        .addComponent(resultLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(secretPlusC))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(calculateButton)
                                            .addComponent(operationLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(storeResultButton)))))
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(storeButton)
                    .addComponent(removeButton)
                    .addComponent(clearAllButton))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graphButton)
                    .addComponent(graphAllButton)
                    .addComponent(rescaleButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(xValueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(yValueField))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ModeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(polyBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(operationLabel)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(polyBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateButton)
                    .addComponent(storeResultButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resultLabel)
                        .addComponent(secretPlusC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void redraw(Graphics g){
        Image graph;
        if (graphed.equals("all")){
            graph = getAllGraphImage();
        }
        else{
            graph = getSelectedGraphImage();
        }
        g.drawImage(graph, 0, 0, rootPane);         
    }
    
    
    public void clearImage(Graphics g){
        double yMin = centreY - zoom;
        double yMax = centreY + zoom;
        double xMin = centreX - zoom;
        double xMax = centreX + zoom;
        
        g.setColor(Color.white);
        g.fillRect(0, 0, w, h);
        //Some axes here
        g.setColor(Color.red);
        int originX = (int) Math.round(-w*xMin/(xMax-xMin));
        int originY = (int) Math.round(h*yMax/(yMax - yMin));
        g.drawLine(0, originY, w, originY);
        g.drawLine(originX, 0, originX, h);        
    }
        
    private void storeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeButtonActionPerformed
        String text = (String)inputBox.getSelectedItem();

        try{
            this.store(new Polynomial(text));
            calculateButton.setEnabled(true);
            clearAllButton.setEnabled(true);
        }catch(Exception e){
            
        }
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
            graphButton.setEnabled(true);
            graphAllButton.setEnabled(true);
        }
        inputBox.setSelectedIndex(storedPolynomials.size()-1);
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
        graphed = "selected";
        redraw(g);
    }//GEN-LAST:event_graphButtonActionPerformed

    private void clearGraphs(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearGraphs
        this.zoom = 10;
        this.centreX = 0;
        this.centreY = 0;
        storedPolynomials = new ArrayList();
        calculateButton.setEnabled(false);
        Graphics g = jPanel1.getGraphics();
        clearImage(g);
        resultLabel.setText("");
        this.remodel();
        clearAllButton.setEnabled(false);
        graphButton.setEnabled(false);
        graphAllButton.setEnabled(false);
    }//GEN-LAST:event_clearGraphs

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        Polynomial result = null;
        Polynomial p1 = new Polynomial((String)polyBox1.getSelectedItem());
        Polynomial p2 = new Polynomial((String)polyBox2.getSelectedItem());
        secretPlusC.setText("");
        secretPlusC.setToolTipText("");
        resultLabel.setToolTipText("");
        
        if(mode.equals("Addition")){
            result = p1.polyAdd(p2);
        }
        else if(mode.equals("Subtraction")){
            result = p1.polySubtract(p2);
        }
        else if(mode.equals("Multiplication")){
            result = p1.polyMultiply(p2);
        }
        else if(mode.equals("Division")){
            Polynomial[] quotient = p1.polyDivide(p2);
            result = quotient[0];
            String remainder = quotient[1].toString();
            if(!remainder.equals("0")){
                secretPlusC.setText("*");
                secretPlusC.setToolTipText("Remainder of " + remainder);
                resultLabel.setToolTipText("Remainder of " + remainder);
            }
        }
        else if(mode.equals("Derivative")){
            result = p1.getDerivative();
        }
        else{ //This is integral
            result = p1.getIntegral();
            secretPlusC.setText(" + C");
        }
        resultLabel.setText(result.toString());
        storeResultButton.setEnabled(true);
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void jPanel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel1MouseWheelMoved
        if (evt.getWheelRotation() < 0)
            this.zoom = Math.max(this.zoom / 2, 0.01);
        else
            this.zoom = Math.min(this.zoom*2, PolyGraphingCalculator.maxValue);
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
        
        double interval = zoom*.015;
        if(evt.getX() > mouseX){
            centreX -= interval;
        }
        else if(evt.getX() < mouseX){
            centreX += interval;
        }
        if(evt.getY() > mouseY){
            centreY += interval;
        }
        else if(evt.getY() < mouseY){
            centreY -= interval;
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
            operationLabel.setText("Multiplied By:");
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
                clearGraphs(evt);
                calculateButton.setEnabled(false);
                removeButton.setEnabled(false);
                graphButton.setEnabled(false);
                graphAllButton.setEnabled(false);                
            }
            this.remodel();
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        double xLoc = 2*zoom*(evt.getX() - w/2)/w + centreX;
        double yLoc = 2*zoom*(h/2 - evt.getY())/h + centreY;
        xLabel.setText("X: "+ format(xLoc));
        yLabel.setText("Y: "+ format(yLoc));
    }//GEN-LAST:event_jPanel1MouseMoved

    private void graphAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphAllButtonActionPerformed
        this.zoom = 10;
        Graphics g = jPanel1.getGraphics();
        graphed = "all";
        redraw(g);
    }//GEN-LAST:event_graphAllButtonActionPerformed

    private void xValueFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xValueFieldKeyTyped
        this.yValueFieldUpdate();
    }//GEN-LAST:event_xValueFieldKeyTyped
    public void yValueFieldUpdate(){
        double xValue;
        Polynomial poly;
        try{
            xValue = Double.parseDouble(xValueField.getText());
            poly = new Polynomial((String)inputBox.getSelectedItem());
            yValueField.setText(Double.toString(poly.evaluateAt(xValue)));
        }catch(Exception e){
            yValueField.setText("N/A");
        }
        
        
    }
    public static String format(Number n) {
        NumberFormat format = DecimalFormat.getInstance();
        format.setRoundingMode(RoundingMode.FLOOR);
        format.setMinimumFractionDigits(0);
        format.setMaximumFractionDigits(3);
        return format.format(n);
    }
    
    public Image getAllGraphImage(){
        //Calculate necessary points
        double yMin = centreY - zoom;
        double yMax = centreY + zoom;
        double xMin = centreX - zoom;
        double xMax = centreX + zoom;
  
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);        
        Graphics2D g = (Graphics2D) bi.getGraphics();
        
        clearImage(g);
        
        g.setColor(Color.black);        
        for (Polynomial f: storedPolynomials){
        //Graph each function as an ArrayList of points            
        List<Integer> xValues = new ArrayList();
        List<Integer> yValues = new ArrayList();
        //The value of x tracks across the screen, pixel by pixel
        for (double x=xMin; x<xMax; x+=(double)2*zoom/w){                
            try{ //Stores new points if the point wasn't an overflow
                double y = f.evaluateAt(x);      
                xValues.add((int) Math.round(w*(x - xMin)/(xMax-xMin)));
                yValues.add((int) Math.round(h*(yMax - y)/(yMax - yMin)));
            } catch (java.lang.ArithmeticException e) {                    
            }
        }
        //Convert ArrayList to int[] in order to plot the points
        Object[] x = xValues.toArray();
        Object[] y = yValues.toArray();
        int[] xV = new int[x.length];
        int[] yV = new int[y.length];                    
        for (int i=0; i<x.length; i++) {
            xV[i] = (int) x[i];
            yV[i] = (int) y[i];
        }
        g.drawPolyline(xV, yV, xV.length);
        }                
        return bi;
    }
    
    public Image getSelectedGraphImage(){
        //Calculate necessary points
        double yMin = centreY - zoom;
        double yMax = centreY + zoom;
        double xMin = centreX - zoom;
        double xMax = centreX + zoom;
  
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);        
        Graphics2D g = (Graphics2D) bi.getGraphics();
        
        clearImage(g);
        
        g.setColor(Color.black);
        
        int index = inputBox.getSelectedIndex();
        
        if (index == -1){
            return bi;
        }
        
        Polynomial f;
        if(storedPolynomials.isEmpty()){
            try{
                f = new Polynomial((String)inputBox.getSelectedItem());
            }catch(NumberFormatException e){
                return bi;
            }
        }
        else{
            f = storedPolynomials.get(index);
        }
        
        //Graph the selected function as an ArrayList of points            
        List<Integer> xValues = new ArrayList();
        List<Integer> yValues = new ArrayList();
        //The value of x tracks across the screen, pixel by pixel
        for (double x=xMin; x<xMax; x+=(double)2*zoom/w){                
            try{ //Stores new points if the point wasn't an overflow
                double y = f.evaluateAt(x);      
                xValues.add((int) Math.round(w*(x - xMin)/(xMax-xMin)));
                yValues.add((int) Math.round(h*(yMax - y)/(yMax - yMin)));
            } catch (java.lang.ArithmeticException e) {                    
            }
        }
        //Convert ArrayList to int[] in order to plot the points
        Object[] x = xValues.toArray();
        Object[] y = yValues.toArray();
        int[] xV = new int[x.length];
        int[] yV = new int[y.length];                    
        for (int i=0; i<x.length; i++) {
            xV[i] = (int) x[i];
            yV[i] = (int) y[i];
        }
        g.drawPolyline(xV, yV, xV.length);
        
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
    private javax.swing.JButton graphAllButton;
    private javax.swing.JButton graphButton;
    private javax.swing.JComboBox<String> inputBox;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel operationLabel;
    private javax.swing.JComboBox<String> polyBox1;
    private javax.swing.JComboBox<String> polyBox2;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton rescaleButton;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel resultLabel2;
    private javax.swing.JLabel secretPlusC;
    private javax.swing.JButton storeButton;
    private javax.swing.JButton storeResultButton;
    private javax.swing.JLabel xLabel;
    private javax.swing.JTextField xValueField;
    private javax.swing.JLabel yLabel;
    private javax.swing.JLabel yValueField;
    // End of variables declaration//GEN-END:variables
}
