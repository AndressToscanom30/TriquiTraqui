package TriquiTraque;

import java.awt.Color;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    
    public Main() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    Jugador jugador1 = new Jugador("", "X", Color.BLACK);
    Jugador jugador2 = new Jugador("", "O", Color.BLACK);
    
    String[][] matriz = new String[3][3];
    String[][] matriz4 = new String[4][4];
    String[][] matriz5 = new String[5][5];
            
    Tablero tablero = new Tablero(matriz);
    Tablero tablero4 = new Tablero(matriz4);
    Tablero tablero5 = new Tablero(matriz5);
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtNombreJ1 = new javax.swing.JTextField();
        colorJ1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtNombreJ2 = new javax.swing.JTextField();
        colorJ2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        rbt3X3 = new javax.swing.JRadioButton();
        rbt4X4 = new javax.swing.JRadioButton();
        rbt5X5 = new javax.swing.JRadioButton();
        jbJugar = new javax.swing.JButton();
        JTabbedPane = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jp3X3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jl1 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        jl3 = new javax.swing.JLabel();
        jl4 = new javax.swing.JLabel();
        jl5 = new javax.swing.JLabel();
        jl6 = new javax.swing.JLabel();
        jl7 = new javax.swing.JLabel();
        jl8 = new javax.swing.JLabel();
        jl9 = new javax.swing.JLabel();
        jbReiniciar3x3 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jlJugador1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jlJugador2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        puntajeJ1 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        puntajeJ2 = new javax.swing.JLabel();
        jp4X4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jl10 = new javax.swing.JLabel();
        jl11 = new javax.swing.JLabel();
        jl12 = new javax.swing.JLabel();
        jl13 = new javax.swing.JLabel();
        jl14 = new javax.swing.JLabel();
        jl15 = new javax.swing.JLabel();
        jl16 = new javax.swing.JLabel();
        jl17 = new javax.swing.JLabel();
        jl18 = new javax.swing.JLabel();
        jl19 = new javax.swing.JLabel();
        jl20 = new javax.swing.JLabel();
        jl21 = new javax.swing.JLabel();
        jl22 = new javax.swing.JLabel();
        jl23 = new javax.swing.JLabel();
        jl24 = new javax.swing.JLabel();
        jl25 = new javax.swing.JLabel();
        jbReiniciar4x4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jl2Jugador1 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jl2Jugador2 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        puntaje4J1 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        puntaje4J2 = new javax.swing.JLabel();
        jp5X5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jl26 = new javax.swing.JLabel();
        jl27 = new javax.swing.JLabel();
        jl28 = new javax.swing.JLabel();
        jl29 = new javax.swing.JLabel();
        jl30 = new javax.swing.JLabel();
        jl31 = new javax.swing.JLabel();
        jl32 = new javax.swing.JLabel();
        jl33 = new javax.swing.JLabel();
        jl34 = new javax.swing.JLabel();
        jl35 = new javax.swing.JLabel();
        jl36 = new javax.swing.JLabel();
        jl37 = new javax.swing.JLabel();
        jl38 = new javax.swing.JLabel();
        jl39 = new javax.swing.JLabel();
        jl40 = new javax.swing.JLabel();
        jl41 = new javax.swing.JLabel();
        jl42 = new javax.swing.JLabel();
        jl43 = new javax.swing.JLabel();
        jl44 = new javax.swing.JLabel();
        jl45 = new javax.swing.JLabel();
        jl46 = new javax.swing.JLabel();
        jl47 = new javax.swing.JLabel();
        jl48 = new javax.swing.JLabel();
        jl49 = new javax.swing.JLabel();
        jl50 = new javax.swing.JLabel();
        jbReiniciar5x5 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jl3Jugador1 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jl3Jugador2 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        puntaje3J1 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        puntaje3J2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jugador 1 - X", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 200));

        jLabel1.setText("Nombre:");

        colorJ1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amarillo", "Azul", "Rojo", "Marrón", "Verde", "Rosado", "Morado", "Naranja" }));

        jLabel3.setText("Color marca:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(colorJ1, 0, 104, Short.MAX_VALUE)
                    .addComponent(jtNombreJ1))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jugador 2 - O", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 200));

        jLabel2.setText("Nombre:");

        colorJ2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amarillo", "Azul", "Rojo", "Marrón", "Verde", "Rosado", "Morado", "Naranja" }));

        jLabel4.setText("Color marca:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(colorJ2, 0, 104, Short.MAX_VALUE)
                    .addComponent(jtNombreJ2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuración del juego", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel9.setText("¿En que tipo de tablero desea jugar?");

        rbt3X3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbt3X3);
        rbt3X3.setText("3 X 3");

        rbt4X4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbt4X4);
        rbt4X4.setText("4 X 4");

        rbt5X5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbt5X5);
        rbt5X5.setText("5 X 5");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(rbt4X4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbt3X3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbt5X5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(rbt3X3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbt4X4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbt5X5))
        );

        jbJugar.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jbJugar.setText("Jugar");
        jbJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbJugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jbJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 560));

        JTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 2, 24)); // NOI18N
        jLabel5.setText("Bienvenidos al increíble juego de...");

        jLabel8.setFont(new java.awt.Font("Vensim Sans", 1, 36)); // NOI18N
        jLabel8.setText("Triquitraque");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel5)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(236, 236, 236))
        );

        JTabbedPane.addTab("", jPanel5);

        jPanel4.setBackground(new java.awt.Color(51, 0, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setPreferredSize(new java.awt.Dimension(220, 220));

        jl1.setBackground(new java.awt.Color(255, 255, 255));
        jl1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl1.setForeground(new java.awt.Color(51, 51, 51));
        jl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl1.setMaximumSize(new java.awt.Dimension(55, 55));
        jl1.setMinimumSize(new java.awt.Dimension(55, 55));
        jl1.setOpaque(true);
        jl1.setPreferredSize(new java.awt.Dimension(55, 55));
        jl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl1MousePressed(evt);
            }
        });

        jl2.setBackground(new java.awt.Color(255, 255, 255));
        jl2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl2.setForeground(new java.awt.Color(51, 51, 51));
        jl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl2.setMaximumSize(new java.awt.Dimension(55, 55));
        jl2.setMinimumSize(new java.awt.Dimension(55, 55));
        jl2.setOpaque(true);
        jl2.setPreferredSize(new java.awt.Dimension(55, 55));
        jl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl2MousePressed(evt);
            }
        });

        jl3.setBackground(new java.awt.Color(255, 255, 255));
        jl3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl3.setForeground(new java.awt.Color(51, 51, 51));
        jl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl3.setMaximumSize(new java.awt.Dimension(55, 55));
        jl3.setMinimumSize(new java.awt.Dimension(55, 55));
        jl3.setOpaque(true);
        jl3.setPreferredSize(new java.awt.Dimension(55, 55));
        jl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl3MousePressed(evt);
            }
        });

        jl4.setBackground(new java.awt.Color(255, 255, 255));
        jl4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl4.setForeground(new java.awt.Color(51, 51, 51));
        jl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl4.setMaximumSize(new java.awt.Dimension(55, 55));
        jl4.setMinimumSize(new java.awt.Dimension(55, 55));
        jl4.setOpaque(true);
        jl4.setPreferredSize(new java.awt.Dimension(55, 55));
        jl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl4MousePressed(evt);
            }
        });

        jl5.setBackground(new java.awt.Color(255, 255, 255));
        jl5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl5.setForeground(new java.awt.Color(51, 51, 51));
        jl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl5.setMaximumSize(new java.awt.Dimension(55, 55));
        jl5.setMinimumSize(new java.awt.Dimension(55, 55));
        jl5.setOpaque(true);
        jl5.setPreferredSize(new java.awt.Dimension(55, 55));
        jl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl5MousePressed(evt);
            }
        });

        jl6.setBackground(new java.awt.Color(255, 255, 255));
        jl6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl6.setForeground(new java.awt.Color(51, 51, 51));
        jl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl6.setMaximumSize(new java.awt.Dimension(55, 55));
        jl6.setMinimumSize(new java.awt.Dimension(55, 55));
        jl6.setOpaque(true);
        jl6.setPreferredSize(new java.awt.Dimension(55, 55));
        jl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl6MousePressed(evt);
            }
        });

        jl7.setBackground(new java.awt.Color(255, 255, 255));
        jl7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl7.setForeground(new java.awt.Color(51, 51, 51));
        jl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl7.setMaximumSize(new java.awt.Dimension(55, 55));
        jl7.setMinimumSize(new java.awt.Dimension(55, 55));
        jl7.setOpaque(true);
        jl7.setPreferredSize(new java.awt.Dimension(55, 55));
        jl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl7MousePressed(evt);
            }
        });

        jl8.setBackground(new java.awt.Color(255, 255, 255));
        jl8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl8.setForeground(new java.awt.Color(51, 51, 51));
        jl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl8.setMaximumSize(new java.awt.Dimension(55, 55));
        jl8.setMinimumSize(new java.awt.Dimension(55, 55));
        jl8.setOpaque(true);
        jl8.setPreferredSize(new java.awt.Dimension(55, 55));
        jl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl8MousePressed(evt);
            }
        });

        jl9.setBackground(new java.awt.Color(255, 255, 255));
        jl9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl9.setForeground(new java.awt.Color(51, 51, 51));
        jl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl9.setMaximumSize(new java.awt.Dimension(55, 55));
        jl9.setMinimumSize(new java.awt.Dimension(55, 55));
        jl9.setOpaque(true);
        jl9.setPreferredSize(new java.awt.Dimension(55, 55));
        jl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jbReiniciar3x3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbReiniciar3x3.setText("Cambiar configuración");
        jbReiniciar3x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReiniciar3x3ActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(42, 194, 159));
        jPanel9.setPreferredSize(new java.awt.Dimension(320, 428));

        jPanel12.setPreferredSize(new java.awt.Dimension(40, 66));

        jlJugador1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlJugador1.setText("Jugador 1");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlJugador1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlJugador1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jlJugador2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlJugador2.setText("Jugador 2");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jlJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlJugador2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        puntajeJ1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        puntajeJ1.setText("0");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(puntajeJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(puntajeJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        puntajeJ2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        puntajeJ2.setText("0");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(puntajeJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(puntajeJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp3X3Layout = new javax.swing.GroupLayout(jp3X3);
        jp3X3.setLayout(jp3X3Layout);
        jp3X3Layout.setHorizontalGroup(
            jp3X3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp3X3Layout.createSequentialGroup()
                .addGroup(jp3X3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp3X3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jp3X3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbReiniciar3x3)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp3X3Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jp3X3Layout.setVerticalGroup(
            jp3X3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp3X3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jbReiniciar3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        JTabbedPane.addTab("", jp3X3);

        jPanel7.setBackground(new java.awt.Color(51, 0, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setPreferredSize(new java.awt.Dimension(220, 220));

        jl10.setBackground(new java.awt.Color(255, 255, 255));
        jl10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl10.setForeground(new java.awt.Color(51, 51, 51));
        jl10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl10.setMaximumSize(new java.awt.Dimension(55, 55));
        jl10.setMinimumSize(new java.awt.Dimension(55, 55));
        jl10.setOpaque(true);
        jl10.setPreferredSize(new java.awt.Dimension(55, 55));
        jl10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl10MousePressed(evt);
            }
        });

        jl11.setBackground(new java.awt.Color(255, 255, 255));
        jl11.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl11.setForeground(new java.awt.Color(51, 51, 51));
        jl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl11.setMaximumSize(new java.awt.Dimension(55, 55));
        jl11.setMinimumSize(new java.awt.Dimension(55, 55));
        jl11.setOpaque(true);
        jl11.setPreferredSize(new java.awt.Dimension(55, 55));
        jl11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl11MousePressed(evt);
            }
        });

        jl12.setBackground(new java.awt.Color(255, 255, 255));
        jl12.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl12.setForeground(new java.awt.Color(51, 51, 51));
        jl12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl12.setMaximumSize(new java.awt.Dimension(55, 55));
        jl12.setMinimumSize(new java.awt.Dimension(55, 55));
        jl12.setOpaque(true);
        jl12.setPreferredSize(new java.awt.Dimension(55, 55));
        jl12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl12MousePressed(evt);
            }
        });

        jl13.setBackground(new java.awt.Color(255, 255, 255));
        jl13.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl13.setForeground(new java.awt.Color(51, 51, 51));
        jl13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl13.setMaximumSize(new java.awt.Dimension(55, 55));
        jl13.setMinimumSize(new java.awt.Dimension(55, 55));
        jl13.setOpaque(true);
        jl13.setPreferredSize(new java.awt.Dimension(55, 55));
        jl13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl13MousePressed(evt);
            }
        });

        jl14.setBackground(new java.awt.Color(255, 255, 255));
        jl14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl14.setForeground(new java.awt.Color(51, 51, 51));
        jl14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl14.setMaximumSize(new java.awt.Dimension(55, 55));
        jl14.setMinimumSize(new java.awt.Dimension(55, 55));
        jl14.setOpaque(true);
        jl14.setPreferredSize(new java.awt.Dimension(55, 55));
        jl14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl14MousePressed(evt);
            }
        });

        jl15.setBackground(new java.awt.Color(255, 255, 255));
        jl15.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl15.setForeground(new java.awt.Color(51, 51, 51));
        jl15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl15.setMaximumSize(new java.awt.Dimension(55, 55));
        jl15.setMinimumSize(new java.awt.Dimension(55, 55));
        jl15.setOpaque(true);
        jl15.setPreferredSize(new java.awt.Dimension(55, 55));
        jl15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl15MousePressed(evt);
            }
        });

        jl16.setBackground(new java.awt.Color(255, 255, 255));
        jl16.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl16.setForeground(new java.awt.Color(51, 51, 51));
        jl16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl16.setMaximumSize(new java.awt.Dimension(55, 55));
        jl16.setMinimumSize(new java.awt.Dimension(55, 55));
        jl16.setOpaque(true);
        jl16.setPreferredSize(new java.awt.Dimension(55, 55));
        jl16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl16MousePressed(evt);
            }
        });

        jl17.setBackground(new java.awt.Color(255, 255, 255));
        jl17.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl17.setForeground(new java.awt.Color(51, 51, 51));
        jl17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl17.setMaximumSize(new java.awt.Dimension(55, 55));
        jl17.setMinimumSize(new java.awt.Dimension(55, 55));
        jl17.setOpaque(true);
        jl17.setPreferredSize(new java.awt.Dimension(55, 55));
        jl17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl17MousePressed(evt);
            }
        });

        jl18.setBackground(new java.awt.Color(255, 255, 255));
        jl18.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl18.setForeground(new java.awt.Color(51, 51, 51));
        jl18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl18.setMaximumSize(new java.awt.Dimension(55, 55));
        jl18.setMinimumSize(new java.awt.Dimension(55, 55));
        jl18.setOpaque(true);
        jl18.setPreferredSize(new java.awt.Dimension(55, 55));
        jl18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl18MousePressed(evt);
            }
        });

        jl19.setBackground(new java.awt.Color(255, 255, 255));
        jl19.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl19.setForeground(new java.awt.Color(51, 51, 51));
        jl19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl19.setMaximumSize(new java.awt.Dimension(55, 55));
        jl19.setMinimumSize(new java.awt.Dimension(55, 55));
        jl19.setOpaque(true);
        jl19.setPreferredSize(new java.awt.Dimension(55, 55));
        jl19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl19MousePressed(evt);
            }
        });

        jl20.setBackground(new java.awt.Color(255, 255, 255));
        jl20.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl20.setForeground(new java.awt.Color(51, 51, 51));
        jl20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl20.setMaximumSize(new java.awt.Dimension(55, 55));
        jl20.setMinimumSize(new java.awt.Dimension(55, 55));
        jl20.setOpaque(true);
        jl20.setPreferredSize(new java.awt.Dimension(55, 55));
        jl20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl20MousePressed(evt);
            }
        });

        jl21.setBackground(new java.awt.Color(255, 255, 255));
        jl21.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl21.setForeground(new java.awt.Color(51, 51, 51));
        jl21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl21.setMaximumSize(new java.awt.Dimension(55, 55));
        jl21.setMinimumSize(new java.awt.Dimension(55, 55));
        jl21.setOpaque(true);
        jl21.setPreferredSize(new java.awt.Dimension(55, 55));
        jl21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl21MousePressed(evt);
            }
        });

        jl22.setBackground(new java.awt.Color(255, 255, 255));
        jl22.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl22.setForeground(new java.awt.Color(51, 51, 51));
        jl22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl22.setMaximumSize(new java.awt.Dimension(55, 55));
        jl22.setMinimumSize(new java.awt.Dimension(55, 55));
        jl22.setOpaque(true);
        jl22.setPreferredSize(new java.awt.Dimension(55, 55));
        jl22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl22MousePressed(evt);
            }
        });

        jl23.setBackground(new java.awt.Color(255, 255, 255));
        jl23.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl23.setForeground(new java.awt.Color(51, 51, 51));
        jl23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl23.setMaximumSize(new java.awt.Dimension(55, 55));
        jl23.setMinimumSize(new java.awt.Dimension(55, 55));
        jl23.setOpaque(true);
        jl23.setPreferredSize(new java.awt.Dimension(55, 55));
        jl23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl23MousePressed(evt);
            }
        });

        jl24.setBackground(new java.awt.Color(255, 255, 255));
        jl24.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl24.setForeground(new java.awt.Color(51, 51, 51));
        jl24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl24.setMaximumSize(new java.awt.Dimension(55, 55));
        jl24.setMinimumSize(new java.awt.Dimension(55, 55));
        jl24.setOpaque(true);
        jl24.setPreferredSize(new java.awt.Dimension(55, 55));
        jl24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl24MousePressed(evt);
            }
        });

        jl25.setBackground(new java.awt.Color(255, 255, 255));
        jl25.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl25.setForeground(new java.awt.Color(51, 51, 51));
        jl25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl25.setMaximumSize(new java.awt.Dimension(55, 55));
        jl25.setMinimumSize(new java.awt.Dimension(55, 55));
        jl25.setOpaque(true);
        jl25.setPreferredSize(new java.awt.Dimension(55, 55));
        jl25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl25MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jl10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jl14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jl18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jl21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jl22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jl13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jl14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jl16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jbReiniciar4x4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbReiniciar4x4.setText("Cambiar configuración");
        jbReiniciar4x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReiniciar4x4ActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(42, 194, 159));
        jPanel10.setPreferredSize(new java.awt.Dimension(320, 428));

        jPanel16.setPreferredSize(new java.awt.Dimension(40, 66));

        jl2Jugador1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl2Jugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl2Jugador1.setText("Jugador 1");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl2Jugador1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl2Jugador1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jl2Jugador2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl2Jugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl2Jugador2.setText("Jugador 2");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jl2Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl2Jugador2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        puntaje4J1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        puntaje4J1.setText("0");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(puntaje4J1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(puntaje4J1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        puntaje4J2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        puntaje4J2.setText("0");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(puntaje4J2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(puntaje4J2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp4X4Layout = new javax.swing.GroupLayout(jp4X4);
        jp4X4.setLayout(jp4X4Layout);
        jp4X4Layout.setHorizontalGroup(
            jp4X4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp4X4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jp4X4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbReiniciar4x4)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(318, Short.MAX_VALUE))
        );
        jp4X4Layout.setVerticalGroup(
            jp4X4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp4X4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jbReiniciar4x4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        JTabbedPane.addTab("", jp4X4);

        jPanel8.setBackground(new java.awt.Color(51, 0, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setPreferredSize(new java.awt.Dimension(220, 220));

        jl26.setBackground(new java.awt.Color(255, 255, 255));
        jl26.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl26.setForeground(new java.awt.Color(51, 51, 51));
        jl26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl26.setMaximumSize(new java.awt.Dimension(55, 55));
        jl26.setMinimumSize(new java.awt.Dimension(55, 55));
        jl26.setOpaque(true);
        jl26.setPreferredSize(new java.awt.Dimension(55, 55));
        jl26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl26MousePressed(evt);
            }
        });

        jl27.setBackground(new java.awt.Color(255, 255, 255));
        jl27.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl27.setForeground(new java.awt.Color(51, 51, 51));
        jl27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl27.setMaximumSize(new java.awt.Dimension(55, 55));
        jl27.setMinimumSize(new java.awt.Dimension(55, 55));
        jl27.setOpaque(true);
        jl27.setPreferredSize(new java.awt.Dimension(55, 55));
        jl27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl27MousePressed(evt);
            }
        });

        jl28.setBackground(new java.awt.Color(255, 255, 255));
        jl28.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl28.setForeground(new java.awt.Color(51, 51, 51));
        jl28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl28.setMaximumSize(new java.awt.Dimension(55, 55));
        jl28.setMinimumSize(new java.awt.Dimension(55, 55));
        jl28.setOpaque(true);
        jl28.setPreferredSize(new java.awt.Dimension(55, 55));
        jl28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl28MousePressed(evt);
            }
        });

        jl29.setBackground(new java.awt.Color(255, 255, 255));
        jl29.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl29.setForeground(new java.awt.Color(51, 51, 51));
        jl29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl29.setMaximumSize(new java.awt.Dimension(55, 55));
        jl29.setMinimumSize(new java.awt.Dimension(55, 55));
        jl29.setOpaque(true);
        jl29.setPreferredSize(new java.awt.Dimension(55, 55));
        jl29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl29MousePressed(evt);
            }
        });

        jl30.setBackground(new java.awt.Color(255, 255, 255));
        jl30.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl30.setForeground(new java.awt.Color(51, 51, 51));
        jl30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl30.setMaximumSize(new java.awt.Dimension(55, 55));
        jl30.setMinimumSize(new java.awt.Dimension(55, 55));
        jl30.setOpaque(true);
        jl30.setPreferredSize(new java.awt.Dimension(55, 55));
        jl30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl30MousePressed(evt);
            }
        });

        jl31.setBackground(new java.awt.Color(255, 255, 255));
        jl31.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl31.setForeground(new java.awt.Color(51, 51, 51));
        jl31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl31.setMaximumSize(new java.awt.Dimension(55, 55));
        jl31.setMinimumSize(new java.awt.Dimension(55, 55));
        jl31.setOpaque(true);
        jl31.setPreferredSize(new java.awt.Dimension(55, 55));
        jl31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl31MousePressed(evt);
            }
        });

        jl32.setBackground(new java.awt.Color(255, 255, 255));
        jl32.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl32.setForeground(new java.awt.Color(51, 51, 51));
        jl32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl32.setMaximumSize(new java.awt.Dimension(55, 55));
        jl32.setMinimumSize(new java.awt.Dimension(55, 55));
        jl32.setOpaque(true);
        jl32.setPreferredSize(new java.awt.Dimension(55, 55));
        jl32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl32MousePressed(evt);
            }
        });

        jl33.setBackground(new java.awt.Color(255, 255, 255));
        jl33.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl33.setForeground(new java.awt.Color(51, 51, 51));
        jl33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl33.setMaximumSize(new java.awt.Dimension(55, 55));
        jl33.setMinimumSize(new java.awt.Dimension(55, 55));
        jl33.setOpaque(true);
        jl33.setPreferredSize(new java.awt.Dimension(55, 55));
        jl33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl33MousePressed(evt);
            }
        });

        jl34.setBackground(new java.awt.Color(255, 255, 255));
        jl34.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl34.setForeground(new java.awt.Color(51, 51, 51));
        jl34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl34.setMaximumSize(new java.awt.Dimension(55, 55));
        jl34.setMinimumSize(new java.awt.Dimension(55, 55));
        jl34.setOpaque(true);
        jl34.setPreferredSize(new java.awt.Dimension(55, 55));
        jl34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl34MousePressed(evt);
            }
        });

        jl35.setBackground(new java.awt.Color(255, 255, 255));
        jl35.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl35.setForeground(new java.awt.Color(51, 51, 51));
        jl35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl35.setMaximumSize(new java.awt.Dimension(55, 55));
        jl35.setMinimumSize(new java.awt.Dimension(55, 55));
        jl35.setOpaque(true);
        jl35.setPreferredSize(new java.awt.Dimension(55, 55));
        jl35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl35MousePressed(evt);
            }
        });

        jl36.setBackground(new java.awt.Color(255, 255, 255));
        jl36.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl36.setForeground(new java.awt.Color(51, 51, 51));
        jl36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl36.setMaximumSize(new java.awt.Dimension(55, 55));
        jl36.setMinimumSize(new java.awt.Dimension(55, 55));
        jl36.setOpaque(true);
        jl36.setPreferredSize(new java.awt.Dimension(55, 55));
        jl36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl36MousePressed(evt);
            }
        });

        jl37.setBackground(new java.awt.Color(255, 255, 255));
        jl37.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl37.setForeground(new java.awt.Color(51, 51, 51));
        jl37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl37.setMaximumSize(new java.awt.Dimension(55, 55));
        jl37.setMinimumSize(new java.awt.Dimension(55, 55));
        jl37.setOpaque(true);
        jl37.setPreferredSize(new java.awt.Dimension(55, 55));
        jl37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl37MousePressed(evt);
            }
        });

        jl38.setBackground(new java.awt.Color(255, 255, 255));
        jl38.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl38.setForeground(new java.awt.Color(51, 51, 51));
        jl38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl38.setMaximumSize(new java.awt.Dimension(55, 55));
        jl38.setMinimumSize(new java.awt.Dimension(55, 55));
        jl38.setOpaque(true);
        jl38.setPreferredSize(new java.awt.Dimension(55, 55));
        jl38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl38MousePressed(evt);
            }
        });

        jl39.setBackground(new java.awt.Color(255, 255, 255));
        jl39.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl39.setForeground(new java.awt.Color(51, 51, 51));
        jl39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl39.setMaximumSize(new java.awt.Dimension(55, 55));
        jl39.setMinimumSize(new java.awt.Dimension(55, 55));
        jl39.setOpaque(true);
        jl39.setPreferredSize(new java.awt.Dimension(55, 55));
        jl39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl39MousePressed(evt);
            }
        });

        jl40.setBackground(new java.awt.Color(255, 255, 255));
        jl40.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl40.setForeground(new java.awt.Color(51, 51, 51));
        jl40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl40.setMaximumSize(new java.awt.Dimension(55, 55));
        jl40.setMinimumSize(new java.awt.Dimension(55, 55));
        jl40.setOpaque(true);
        jl40.setPreferredSize(new java.awt.Dimension(55, 55));
        jl40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl40MousePressed(evt);
            }
        });

        jl41.setBackground(new java.awt.Color(255, 255, 255));
        jl41.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl41.setForeground(new java.awt.Color(51, 51, 51));
        jl41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl41.setMaximumSize(new java.awt.Dimension(55, 55));
        jl41.setMinimumSize(new java.awt.Dimension(55, 55));
        jl41.setOpaque(true);
        jl41.setPreferredSize(new java.awt.Dimension(55, 55));
        jl41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl41MousePressed(evt);
            }
        });

        jl42.setBackground(new java.awt.Color(255, 255, 255));
        jl42.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl42.setForeground(new java.awt.Color(51, 51, 51));
        jl42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl42.setMaximumSize(new java.awt.Dimension(55, 55));
        jl42.setMinimumSize(new java.awt.Dimension(55, 55));
        jl42.setOpaque(true);
        jl42.setPreferredSize(new java.awt.Dimension(55, 55));
        jl42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl42MousePressed(evt);
            }
        });

        jl43.setBackground(new java.awt.Color(255, 255, 255));
        jl43.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl43.setForeground(new java.awt.Color(51, 51, 51));
        jl43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl43.setMaximumSize(new java.awt.Dimension(55, 55));
        jl43.setMinimumSize(new java.awt.Dimension(55, 55));
        jl43.setOpaque(true);
        jl43.setPreferredSize(new java.awt.Dimension(55, 55));
        jl43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl43MousePressed(evt);
            }
        });

        jl44.setBackground(new java.awt.Color(255, 255, 255));
        jl44.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl44.setForeground(new java.awt.Color(51, 51, 51));
        jl44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl44.setMaximumSize(new java.awt.Dimension(55, 55));
        jl44.setMinimumSize(new java.awt.Dimension(55, 55));
        jl44.setOpaque(true);
        jl44.setPreferredSize(new java.awt.Dimension(55, 55));
        jl44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl44MousePressed(evt);
            }
        });

        jl45.setBackground(new java.awt.Color(255, 255, 255));
        jl45.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl45.setForeground(new java.awt.Color(51, 51, 51));
        jl45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl45.setMaximumSize(new java.awt.Dimension(55, 55));
        jl45.setMinimumSize(new java.awt.Dimension(55, 55));
        jl45.setOpaque(true);
        jl45.setPreferredSize(new java.awt.Dimension(55, 55));
        jl45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl45MousePressed(evt);
            }
        });

        jl46.setBackground(new java.awt.Color(255, 255, 255));
        jl46.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl46.setForeground(new java.awt.Color(51, 51, 51));
        jl46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl46.setMaximumSize(new java.awt.Dimension(55, 55));
        jl46.setMinimumSize(new java.awt.Dimension(55, 55));
        jl46.setOpaque(true);
        jl46.setPreferredSize(new java.awt.Dimension(55, 55));
        jl46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl46MousePressed(evt);
            }
        });

        jl47.setBackground(new java.awt.Color(255, 255, 255));
        jl47.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl47.setForeground(new java.awt.Color(51, 51, 51));
        jl47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl47.setMaximumSize(new java.awt.Dimension(55, 55));
        jl47.setMinimumSize(new java.awt.Dimension(55, 55));
        jl47.setOpaque(true);
        jl47.setPreferredSize(new java.awt.Dimension(55, 55));
        jl47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl47MousePressed(evt);
            }
        });

        jl48.setBackground(new java.awt.Color(255, 255, 255));
        jl48.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl48.setForeground(new java.awt.Color(51, 51, 51));
        jl48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl48.setMaximumSize(new java.awt.Dimension(55, 55));
        jl48.setMinimumSize(new java.awt.Dimension(55, 55));
        jl48.setOpaque(true);
        jl48.setPreferredSize(new java.awt.Dimension(55, 55));
        jl48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl48MousePressed(evt);
            }
        });

        jl49.setBackground(new java.awt.Color(255, 255, 255));
        jl49.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl49.setForeground(new java.awt.Color(51, 51, 51));
        jl49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl49.setMaximumSize(new java.awt.Dimension(55, 55));
        jl49.setMinimumSize(new java.awt.Dimension(55, 55));
        jl49.setOpaque(true);
        jl49.setPreferredSize(new java.awt.Dimension(55, 55));
        jl49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl49MousePressed(evt);
            }
        });

        jl50.setBackground(new java.awt.Color(255, 255, 255));
        jl50.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl50.setForeground(new java.awt.Color(51, 51, 51));
        jl50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl50.setMaximumSize(new java.awt.Dimension(55, 55));
        jl50.setMinimumSize(new java.awt.Dimension(55, 55));
        jl50.setOpaque(true);
        jl50.setPreferredSize(new java.awt.Dimension(55, 55));
        jl50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl50MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jl31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jl26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jl36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jl41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jl42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jl46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jl47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jl29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jl35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jl43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jbReiniciar5x5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbReiniciar5x5.setText("Cambiar configuración");
        jbReiniciar5x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReiniciar5x5ActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(42, 194, 159));
        jPanel11.setPreferredSize(new java.awt.Dimension(320, 428));

        jPanel20.setPreferredSize(new java.awt.Dimension(40, 66));

        jl3Jugador1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl3Jugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl3Jugador1.setText("Jugador 1");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl3Jugador1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl3Jugador1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jl3Jugador2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl3Jugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl3Jugador2.setText("Jugador 2");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jl3Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl3Jugador2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        puntaje3J1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        puntaje3J1.setText("0");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(puntaje3J1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(puntaje3J1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        puntaje3J2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        puntaje3J2.setText("0");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(puntaje3J2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(puntaje3J2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp5X5Layout = new javax.swing.GroupLayout(jp5X5);
        jp5X5.setLayout(jp5X5Layout);
        jp5X5Layout.setHorizontalGroup(
            jp5X5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp5X5Layout.createSequentialGroup()
                .addGroup(jp5X5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp5X5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jbReiniciar5x5))
                    .addGroup(jp5X5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jp5X5Layout.setVerticalGroup(
            jp5X5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp5X5Layout.createSequentialGroup()
                .addGroup(jp5X5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp5X5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp5X5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jbReiniciar5x5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        JTabbedPane.addTab("", jp5X5);

        getContentPane().add(JTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 670, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int casilla = 0;
    boolean turnoJugador1 = true;
    
    private void jl1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl1MousePressed
                
        if (jl1.getText().isEmpty()) {
            
            if (turnoJugador1) {
                
                jl1.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jlJugador1, jl1);
                turnoJugador1 = false;
                
            } 
            
            else {
                
                jl1.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jlJugador2, jl1);
                turnoJugador1 = true;
                
            }
            
        }
        
        casilla = 1;
        String marca = jl1.getText();
        
        tablero.finDelJuego(puntajeJ1,puntajeJ2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl1,  jl2,  jl3,  jl4,  jl5,  jl6,  jl7,  jl8, jl9);
        
        
       
    }//GEN-LAST:event_jl1MousePressed

    private void jl2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl2MousePressed
                
        if (jl2.getText().isEmpty()) {
            
            if (turnoJugador1) {
                
                jl2.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jlJugador1, jl2);
                turnoJugador1 = false;
                
            } 
            
            else {
                
                jl2.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jlJugador2, jl2);
                turnoJugador1 = true;
                
            }
            
        }
        
        casilla = 2;
        String marca = jl2.getText();
        
        tablero.finDelJuego(puntajeJ1,puntajeJ2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl1,  jl2,  jl3,  jl4,  jl5,  jl6,  jl7,  jl8, jl9);
    
    }//GEN-LAST:event_jl2MousePressed

    private void jl3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl3MousePressed
        
        if (jl3.getText().isEmpty()) {
            
            if (turnoJugador1) {
                
                jl3.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jlJugador1, jl3);
                turnoJugador1 = false;
                
            } 
            
            else {
                
                jl3.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jlJugador2, jl3);
                turnoJugador1 = true;
                
            }
            
        }
        
        casilla = 3;
        String marca = jl3.getText();
        
        tablero.finDelJuego(puntajeJ1,puntajeJ2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl1,  jl2,  jl3,  jl4,  jl5,  jl6,  jl7,  jl8, jl9);
       
    }//GEN-LAST:event_jl3MousePressed

    private void jl4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl4MousePressed
        
        boolean cuatro = true;
        
        if (jl4.getText().isEmpty()) {
            
            if (turnoJugador1) {
                
                jl4.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jlJugador1, jl4);
                turnoJugador1 = false;
                
            } 
            
            else {
                
                jl4.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jlJugador2, jl4);
                turnoJugador1 = true;
                
            }
            
        }
        
        casilla = 4;
        String marca = jl4.getText();
        
        tablero.finDelJuego(puntajeJ1,puntajeJ2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl1,  jl2,  jl3,  jl4,  jl5,  jl6,  jl7,  jl8, jl9);
 
    }//GEN-LAST:event_jl4MousePressed

    private void jl5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl5MousePressed
        
        if (jl5.getText().isEmpty()) {
            
            if (turnoJugador1) {
                
                jl5.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jlJugador1, jl5);
                turnoJugador1 = false;
                
            } 
            
            else {
                
                jl5.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jlJugador2, jl5);
                turnoJugador1 = true;
                
            }
            
        }
        
        casilla = 5;
        String marca = jl5.getText();
        
        tablero.finDelJuego(puntajeJ1,puntajeJ2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl1,  jl2,  jl3,  jl4,  jl5,  jl6,  jl7,  jl8, jl9);
    
    }//GEN-LAST:event_jl5MousePressed

    private void jl6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl6MousePressed
        
        if (jl6.getText().isEmpty()) {
            
            if (turnoJugador1) {
                
                jl6.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jlJugador1, jl6);
                turnoJugador1 = false;
                
            } 
            
            else {
                
                jl6.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jlJugador2, jl6);
                turnoJugador1 = true;
                
            }
            
        }
        
        casilla = 6;
        String marca = jl6.getText();
        
        tablero.finDelJuego(puntajeJ1,puntajeJ2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl1,  jl2,  jl3,  jl4,  jl5,  jl6,  jl7,  jl8, jl9);
      
    }//GEN-LAST:event_jl6MousePressed

    private void jl7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl7MousePressed
                
        if (jl7.getText().isEmpty()) {
            
            if (turnoJugador1) {
                
                jl7.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jlJugador1, jl7);
                turnoJugador1 = false;
                
            } 
            
            else {
                
                jl7.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jlJugador2, jl7);
                turnoJugador1 = true;
                
            }
            
        }
        
        casilla = 7;
        String marca = jl7.getText();
        
        tablero.finDelJuego(puntajeJ1,puntajeJ2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl1,  jl2,  jl3,  jl4,  jl5,  jl6,  jl7,  jl8, jl9);
    
    }//GEN-LAST:event_jl7MousePressed

    private void jl8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl8MousePressed
        
        if (jl8.getText().isEmpty()) {
            
            if (turnoJugador1) {
                
                jl8.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jlJugador1, jl8);
                turnoJugador1 = false;
                
            } 
            
            else {
                
                jl8.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jlJugador2, jl8);
                turnoJugador1 = true;
                
            }
            
        }
        
        casilla = 8;
        String marca = jl8.getText();
        
        tablero.finDelJuego(puntajeJ1,puntajeJ2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl1,  jl2,  jl3,  jl4,  jl5,  jl6,  jl7,  jl8, jl9);
       
    }//GEN-LAST:event_jl8MousePressed

    private void jl9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl9MousePressed
        
        if (jl9.getText().isEmpty()) {
            
            if (turnoJugador1) {
                
                jl9.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jlJugador1, jl9);
                turnoJugador1 = false;
                
            } 
            
            else {
                
                jl9.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jlJugador2, jl9);
                turnoJugador1 = true;
                
            }
            
        }
        
        casilla = 9;
        String marca = jl9.getText();
        
        tablero.finDelJuego(puntajeJ1,puntajeJ2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl1,  jl2,  jl3,  jl4,  jl5,  jl6,  jl7,  jl8, jl9);
       
    }//GEN-LAST:event_jl9MousePressed

    private void jbJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbJugarActionPerformed
        
        if (jtNombreJ1.getText().isEmpty() || jtNombreJ2.getText().isEmpty() || buttonGroup1.getSelection() == null){
            
            JOptionPane.showMessageDialog(this, "Faltan campos por llenar.", "Alerta", JOptionPane.WARNING_MESSAGE);
            
        }
        
        else{
            
            jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jlJugador1, jl1);
            jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jlJugador2, jl2);
            
            jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl10);
            jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl11);
            
            jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl10);
            jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl11);
            
            jbJugar.setEnabled(false);
            
            colorJ1.setEnabled(false);
            colorJ2.setEnabled(false);
            
            if (rbt3X3.isSelected()){
                
                JTabbedPane.setSelectedIndex(1);
                
            }
            if (rbt4X4.isSelected()){
                
                JTabbedPane.setSelectedIndex(2);
                
            }
            if (rbt5X5.isSelected()){
                
                JTabbedPane.setSelectedIndex(3);
                
            }
            
            buttonGroup1.clearSelection();
            
            for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
                
                buttons.nextElement().setEnabled(false);
                
            }

        }

    }//GEN-LAST:event_jbJugarActionPerformed

    private void jl10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl10MousePressed
        
        if (jl10.getText().isEmpty()) {
            
            if (turnoJugador1) {
                
                jl10.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl10);
                turnoJugador1 = false;
                
            } 
            
            else {
                
                jl10.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl10);
                turnoJugador1 = true;
                
            }
            
        }
        
        casilla = 1;
        String marca = jl10.getText();
        
        tablero4.finDelJuego4(puntaje4J2, puntaje4J1, casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);
        
    }//GEN-LAST:event_jl10MousePressed

    private void jl11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl11MousePressed
        
        if (jl11.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl11.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl11);
                turnoJugador1 = false;

            } 

            else {

                jl11.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl11);
                turnoJugador1 = true;

            }

        }

        casilla = 2;
        String marca = jl11.getText();

        tablero4.finDelJuego4(puntaje4J2, puntaje4J1,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);

        
    }//GEN-LAST:event_jl11MousePressed

    private void jl12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl12MousePressed
        
        if (jl12.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl12.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl12);
                turnoJugador1 = false;

            } 

            else {

                jl12.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl12);
                turnoJugador1 = true;

            }

        }

        casilla = 3;
        String marca = jl12.getText();

        tablero4.finDelJuego4(puntaje4J2, puntaje4J1,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);
        
    }//GEN-LAST:event_jl12MousePressed

    private void jl13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl13MousePressed
        
        if (jl13.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl13.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl13);
                turnoJugador1 = false;

            } 

            else {

                jl13.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl13);
                turnoJugador1 = true;

            }

        }

        casilla = 4;
        String marca = jl13.getText();

        tablero4.finDelJuego4(puntaje4J2, puntaje4J1,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);

        
    }//GEN-LAST:event_jl13MousePressed

    private void jl14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl14MousePressed
        
        if (jl14.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl14.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl14);
                turnoJugador1 = false;

            } 

            else {

                jl14.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl14);
                turnoJugador1 = true;

            }

        }

        casilla = 5;
        String marca = jl14.getText();

        tablero4.finDelJuego4(puntaje4J2, puntaje4J1,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);
        
    }//GEN-LAST:event_jl14MousePressed

    private void jl15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl15MousePressed
        
        if (jl15.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl15.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl15);
                turnoJugador1 = false;

            } 

            else {

                jl15.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl15);
                turnoJugador1 = true;

            }

        }

        casilla = 6;
        String marca = jl15.getText();

        tablero4.finDelJuego4(puntaje4J2, puntaje4J1,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);

        
    }//GEN-LAST:event_jl15MousePressed

    private void jl16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl16MousePressed
        
        if (jl16.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl16.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl16);
                turnoJugador1 = false;

            } 

            else {

                jl16.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl16);
                turnoJugador1 = true;

            }

        }

        casilla = 7;
        String marca = jl16.getText();

        tablero4.finDelJuego4(puntaje4J2, puntaje4J1,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);

        
    }//GEN-LAST:event_jl16MousePressed

    private void jl17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl17MousePressed
        
        if (jl17.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl17.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl17);
                turnoJugador1 = false;

            } 

            else {

                jl17.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl17);
                turnoJugador1 = true;

            }

        }

        casilla = 8;
        String marca = jl17.getText();

        tablero4.finDelJuego4(puntaje4J2, puntaje4J1,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);

        
    }//GEN-LAST:event_jl17MousePressed

    private void jl18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl18MousePressed
        
        if (jl18.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl18.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl18);
                turnoJugador1 = false;

            } 

            else {

                jl18.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl18);
                turnoJugador1 = true;

            }

        }

        casilla = 9;
        String marca = jl18.getText();

        tablero4.finDelJuego4(puntaje4J2, puntaje4J1,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);

        
    }//GEN-LAST:event_jl18MousePressed

    private void jl19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl19MousePressed
        
        if (jl19.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl19.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl19);
                turnoJugador1 = false;

            } 

            else {

                jl19.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl19);
                turnoJugador1 = true;

            }

        }

        casilla = 10;
        String marca = jl19.getText();

        tablero4.finDelJuego4(puntaje4J2, puntaje4J1,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);
        
    }//GEN-LAST:event_jl19MousePressed

    private void jl20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl20MousePressed
        
        if (jl20.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl20.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl20);
                turnoJugador1 = false;

            } 

            else {

                jl20.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl20);
                turnoJugador1 = true;

            }

        }

        casilla = 11;
        String marca = jl20.getText();

        tablero4.finDelJuego4(puntaje4J2, puntaje4J1,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);

        
    }//GEN-LAST:event_jl20MousePressed

    private void jl21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl21MousePressed
        
        if (jl21.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl21.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl21);
                turnoJugador1 = false;

            } 

            else {

                jl21.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl21);
                turnoJugador1 = true;

            }

        }

        casilla = 12;
        String marca = jl21.getText();

        tablero4.finDelJuego4(puntaje4J2, puntaje4J1,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);
        
    }//GEN-LAST:event_jl21MousePressed

    private void jl22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl22MousePressed
        
        if (jl22.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl22.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl22);
                turnoJugador1 = false;

            } 

            else {

                jl22.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl22);
                turnoJugador1 = true;

            }

        }

        casilla = 13;
        String marca = jl22.getText();

        tablero4.finDelJuego4(puntaje4J2, puntaje4J1,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);

        
    }//GEN-LAST:event_jl22MousePressed

    private void jl23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl23MousePressed
        
        if (jl23.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl23.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl23);
                turnoJugador1 = false;

            } 

            else {

                jl23.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl23);
                turnoJugador1 = true;

            }

        }

        casilla = 14;
        String marca = jl23.getText();

        tablero4.finDelJuego4(puntaje4J2, puntaje4J1,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);

        
    }//GEN-LAST:event_jl23MousePressed

    private void jl24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl24MousePressed
        
        if (jl24.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl24.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl24);
                turnoJugador1 = false;

            } 

            else {

                jl24.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl24);
                turnoJugador1 = true;

            }

        }

        casilla = 15;
        String marca = jl24.getText();

        tablero4.finDelJuego4(puntaje4J2, puntaje4J1,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);
        
    }//GEN-LAST:event_jl24MousePressed

    private void jl25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl25MousePressed
        
        if (jl25.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl25.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl2Jugador1, jl25);
                turnoJugador1 = false;

            } 

            else {

                jl25.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl2Jugador2, jl25);
                turnoJugador1 = true;

            }

        }

        casilla = 16;
        String marca = jl25.getText();

        tablero4.finDelJuego4(puntaje4J2, puntaje4J1,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25);
        
    }//GEN-LAST:event_jl25MousePressed

    private void jl26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl26MousePressed
        
        if (jl26.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl26.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl26);
                turnoJugador1 = false;

            } 

            else {

                jl26.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl26);
                turnoJugador1 = true;

            }

        }

        casilla = 1;
        String marca = jl26.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);
        
    }//GEN-LAST:event_jl26MousePressed

    private void jl27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl27MousePressed
        
        if (jl27.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl27.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl27);
                turnoJugador1 = false;

            } 

            else {

                jl27.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl27);
                turnoJugador1 = true;

            }

        }

        casilla = 2;
        String marca = jl27.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl27MousePressed

    private void jl28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl28MousePressed
        
        if (jl28.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl28.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl28);
                turnoJugador1 = false;

            } 

            else {

                jl28.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl28);
                turnoJugador1 = true;

            }

        }

        casilla = 3;
        String marca = jl28.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2, casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);
        
    }//GEN-LAST:event_jl28MousePressed

    private void jl29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl29MousePressed
        
        if (jl29.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl29.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl29);
                turnoJugador1 = false;

            } 

            else {

                jl29.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl29);
                turnoJugador1 = true;

            }

        }

        casilla = 4;
        String marca = jl29.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);
        
    }//GEN-LAST:event_jl29MousePressed

    private void jl30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl30MousePressed
        
        if (jl30.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl30.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl30);
                turnoJugador1 = false;

            } 

            else {

                jl30.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl30);
                turnoJugador1 = true;

            }

        }

        casilla = 5;
        String marca = jl30.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);
        
    }//GEN-LAST:event_jl30MousePressed

    private void jl31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl31MousePressed
        
        if (jl31.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl31.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl31);
                turnoJugador1 = false;

            } 

            else {

                jl31.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl31);
                turnoJugador1 = true;

            }

        }

        casilla = 6;
        String marca = jl31.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);
        
    }//GEN-LAST:event_jl31MousePressed

    private void jl32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl32MousePressed
        
        if (jl32.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl32.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl32);
                turnoJugador1 = false;

            } 

            else {

                jl32.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl32);
                turnoJugador1 = true;

            }

        }

        casilla = 7;
        String marca = jl32.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);
        
    }//GEN-LAST:event_jl32MousePressed

    private void jl33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl33MousePressed
        
        if (jl33.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl33.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl33);
                turnoJugador1 = false;

            } 

            else {

                jl33.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl33);
                turnoJugador1 = true;

            }

        }

        casilla = 8;
        String marca = jl33.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);
        
    }//GEN-LAST:event_jl33MousePressed

    private void jl34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl34MousePressed
        
        if (jl34.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl34.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl34);
                turnoJugador1 = false;

            } 

            else {

                jl34.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl34);
                turnoJugador1 = true;

            }

        }

        casilla = 9;
        String marca = jl34.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl34MousePressed

    private void jl35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl35MousePressed
        
        if (jl35.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl35.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl35);
                turnoJugador1 = false;

            } 

            else {

                jl35.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl35);
                turnoJugador1 = true;

            }

        }

        casilla = 10;
        String marca = jl35.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl35MousePressed

    private void jl36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl36MousePressed
        
        if (jl36.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl36.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl36);
                turnoJugador1 = false;

            } 

            else {

                jl36.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl36);
                turnoJugador1 = true;

            }

        }

        casilla = 11;
        String marca = jl36.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl36MousePressed

    private void jl37MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl37MousePressed
        
        if (jl37.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl37.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl37);
                turnoJugador1 = false;

            } 

            else {

                jl37.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl37);
                turnoJugador1 = true;

            }

        }

        casilla = 12;
        String marca = jl37.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl37MousePressed

    private void jl38MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl38MousePressed
        
        if (jl38.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl38.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl38);
                turnoJugador1 = false;

            } 

            else {

                jl38.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl38);
                turnoJugador1 = true;

            }

        }

        casilla = 13;
        String marca = jl38.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl38MousePressed

    private void jl39MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl39MousePressed
        
        if (jl39.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl39.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl39);
                turnoJugador1 = false;

            } 

            else {

                jl39.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl39);
                turnoJugador1 = true;

            }

        }

        casilla = 14;
        String marca = jl39.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);
        
    }//GEN-LAST:event_jl39MousePressed

    private void jl40MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl40MousePressed
        
        if (jl40.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl40.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl40);
                turnoJugador1 = false;

            } 

            else {

                jl40.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl40);
                turnoJugador1 = true;

            }

        }

        casilla = 15;
        String marca = jl40.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl40MousePressed

    private void jl41MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl41MousePressed
        
        if (jl41.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl41.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl41);
                turnoJugador1 = false;

            } 

            else {

                jl41.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl41);
                turnoJugador1 = true;

            }

        }

        casilla = 16;
        String marca = jl41.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl41MousePressed

    private void jl42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl42MousePressed
        
        if (jl42.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl42.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl42);
                turnoJugador1 = false;

            } 

            else {

                jl42.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl42);
                turnoJugador1 = true;

            }

        }

        casilla = 17;
        String marca = jl42.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl42MousePressed

    private void jl43MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl43MousePressed
        
        if (jl43.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl43.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl43);
                turnoJugador1 = false;

            } 

            else {

                jl43.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl43);
                turnoJugador1 = true;

            }

        }

        casilla = 18;
        String marca = jl43.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl43MousePressed

    private void jl44MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl44MousePressed
        
        if (jl44.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl44.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl44);
                turnoJugador1 = false;

            } 

            else {

                jl44.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl44);
                turnoJugador1 = true;

            }

        }

        casilla = 19;
        String marca = jl44.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

        
    }//GEN-LAST:event_jl44MousePressed

    private void jl45MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl45MousePressed
        
        if (jl45.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl45.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl45);
                turnoJugador1 = false;

            } 

            else {

                jl45.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl45);
                turnoJugador1 = true;

            }

        }

        casilla = 20;
        String marca = jl45.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl45MousePressed

    private void jl46MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl46MousePressed
        
        if (jl46.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl46.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl46);
                turnoJugador1 = false;

            } 

            else {

                jl46.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl46);
                turnoJugador1 = true;

            }

        }

        casilla = 21;
        String marca = jl46.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl46MousePressed

    private void jl47MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl47MousePressed
        
        if (jl47.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl47.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl47);
                turnoJugador1 = false;

            } 

            else {

                jl47.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl47);
                turnoJugador1 = true;

            }

        }

        casilla = 22;
        String marca = jl47.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl47MousePressed

    private void jl48MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl48MousePressed
        
        if (jl48.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl48.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl48);
                turnoJugador1 = false;

            } 

            else {

                jl48.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl48);
                turnoJugador1 = true;

            }

        }

        casilla = 23;
        String marca = jl48.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl48MousePressed

    private void jl49MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl49MousePressed
        
        if (jl49.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl49.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl49);
                turnoJugador1 = false;

            } 

            else {

                jl49.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl49);
                turnoJugador1 = true;

            }

        }

        casilla = 24;
        String marca = jl49.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl49MousePressed

    private void jl50MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl50MousePressed
        
        if (jl50.getText().isEmpty()) {
            
            if (turnoJugador1) {

                jl50.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, jtNombreJ1.getText(), (String) colorJ1.getSelectedItem(), jl3Jugador1, jl50);
                turnoJugador1 = false;

            } 

            else {

                jl50.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, jtNombreJ2.getText(), (String) colorJ2.getSelectedItem(), jl3Jugador2, jl50);
                turnoJugador1 = true;

            }

        }

        casilla = 25;
        String marca = jl50.getText();

        tablero5.finDelJuego5(puntaje3J1, puntaje3J2,casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre(), jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50);

    }//GEN-LAST:event_jl50MousePressed

    private void jbReiniciar3x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReiniciar3x3ActionPerformed
       
        tablero.cambiarTablero(jbJugar, colorJ1, colorJ2, buttonGroup1, JTabbedPane);
        
    }//GEN-LAST:event_jbReiniciar3x3ActionPerformed

    private void jbReiniciar4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReiniciar4x4ActionPerformed
        
        tablero4.cambiarTablero(jbJugar, colorJ1, colorJ2, buttonGroup1, JTabbedPane);
        
    }//GEN-LAST:event_jbReiniciar4x4ActionPerformed

    private void jbReiniciar5x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReiniciar5x5ActionPerformed

        tablero5.cambiarTablero(jbJugar, colorJ1, colorJ2, buttonGroup1, JTabbedPane);
        
    }//GEN-LAST:event_jbReiniciar5x5ActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTabbedPane;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> colorJ1;
    private javax.swing.JComboBox<String> colorJ2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbJugar;
    private javax.swing.JButton jbReiniciar3x3;
    private javax.swing.JButton jbReiniciar4x4;
    private javax.swing.JButton jbReiniciar5x5;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl10;
    private javax.swing.JLabel jl11;
    private javax.swing.JLabel jl12;
    private javax.swing.JLabel jl13;
    private javax.swing.JLabel jl14;
    private javax.swing.JLabel jl15;
    private javax.swing.JLabel jl16;
    private javax.swing.JLabel jl17;
    private javax.swing.JLabel jl18;
    private javax.swing.JLabel jl19;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl20;
    private javax.swing.JLabel jl21;
    private javax.swing.JLabel jl22;
    private javax.swing.JLabel jl23;
    private javax.swing.JLabel jl24;
    private javax.swing.JLabel jl25;
    private javax.swing.JLabel jl26;
    private javax.swing.JLabel jl27;
    private javax.swing.JLabel jl28;
    private javax.swing.JLabel jl29;
    private javax.swing.JLabel jl2Jugador1;
    private javax.swing.JLabel jl2Jugador2;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jl30;
    private javax.swing.JLabel jl31;
    private javax.swing.JLabel jl32;
    private javax.swing.JLabel jl33;
    private javax.swing.JLabel jl34;
    private javax.swing.JLabel jl35;
    private javax.swing.JLabel jl36;
    private javax.swing.JLabel jl37;
    private javax.swing.JLabel jl38;
    private javax.swing.JLabel jl39;
    private javax.swing.JLabel jl3Jugador1;
    private javax.swing.JLabel jl3Jugador2;
    private javax.swing.JLabel jl4;
    private javax.swing.JLabel jl40;
    private javax.swing.JLabel jl41;
    private javax.swing.JLabel jl42;
    private javax.swing.JLabel jl43;
    private javax.swing.JLabel jl44;
    private javax.swing.JLabel jl45;
    private javax.swing.JLabel jl46;
    private javax.swing.JLabel jl47;
    private javax.swing.JLabel jl48;
    private javax.swing.JLabel jl49;
    private javax.swing.JLabel jl5;
    private javax.swing.JLabel jl50;
    private javax.swing.JLabel jl6;
    private javax.swing.JLabel jl7;
    private javax.swing.JLabel jl8;
    private javax.swing.JLabel jl9;
    private javax.swing.JLabel jlJugador1;
    private javax.swing.JLabel jlJugador2;
    private javax.swing.JPanel jp3X3;
    private javax.swing.JPanel jp4X4;
    private javax.swing.JPanel jp5X5;
    private javax.swing.JTextField jtNombreJ1;
    private javax.swing.JTextField jtNombreJ2;
    private javax.swing.JLabel puntaje3J1;
    private javax.swing.JLabel puntaje3J2;
    private javax.swing.JLabel puntaje4J1;
    private javax.swing.JLabel puntaje4J2;
    private javax.swing.JLabel puntajeJ1;
    private javax.swing.JLabel puntajeJ2;
    private javax.swing.JRadioButton rbt3X3;
    private javax.swing.JRadioButton rbt4X4;
    private javax.swing.JRadioButton rbt5X5;
    // End of variables declaration//GEN-END:variables
}