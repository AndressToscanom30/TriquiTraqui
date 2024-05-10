package TriquiTraque;

import java.awt.Color;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;


public class Tablero {

    private String[][] tablero;
    private boolean turnoJugador1;
    private boolean ganador;
    
    int puntosJ1 = 0;
    int puntosJ2 = 0;
    
    public Tablero() {
    }

    public Tablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public boolean isTurnoJugador1() {
        return turnoJugador1;
    }

    public void setTurnoJugador1(boolean turnoJugador1) {
        this.turnoJugador1 = turnoJugador1;
    }

    public boolean isGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

    Jugador jugador1 = new Jugador("", "X", Color.BLACK);
    Jugador jugador2 = new Jugador("", "O", Color.BLACK);

    public String colocarFicha(boolean turnoJugador) {

        String marca;

        if (turnoJugador) {

            marca = jugador1.getMarca();

        } else {

            marca = jugador2.getMarca();

        }

        return marca;

    }

    public void cambiarTablero(JButton jbJugar, JComboBox colorJ1, JComboBox colorJ2, ButtonGroup buttonGroup, JTabbedPane tabedPane) {

        jbJugar.setEnabled(true);
        colorJ1.setEnabled(true);
        colorJ2.setEnabled(true);

        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {

            buttons.nextElement().setEnabled(true);

        }

        tabedPane.setSelectedIndex(0);

    }

    public void reiniciarTablero(JLabel jl1, JLabel jl2, JLabel jl3, JLabel jl4, JLabel jl5, JLabel jl6, JLabel jl7, JLabel jl8, JLabel jl9, String[][] tablero) {

        jl1.setText("");
        jl2.setText("");
        jl3.setText("");
        jl4.setText("");
        jl5.setText("");
        jl6.setText("");
        jl7.setText("");
        jl8.setText("");
        jl9.setText("");

        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {

                tablero[i][j] = null;

            }

        }

    }

    public void finDelJuego(JLabel puntajeJ1, JLabel puntajeJ2,int casilla, String marca, Boolean turno, String nombreJ1, String nombreJ2, JLabel jl1, JLabel jl2, JLabel jl3, JLabel jl4, JLabel jl5, JLabel jl6, JLabel jl7, JLabel jl8, JLabel jl9) {

        boolean empate = true;
        
        switch (casilla) {

            case 1:
                tablero[0][0] = marca;
                break;

            case 2:
                tablero[0][1] = marca;
                break;

            case 3:
                tablero[0][2] = marca;
                break;

            case 4:
                tablero[1][0] = marca;
                break;

            case 5:
                tablero[1][1] = marca;
                break;

            case 6:
                tablero[1][2] = marca;
                break;

            case 7:
                tablero[2][0] = marca;
                break;

            case 8:
                tablero[2][1] = marca;
                break;

            case 9:
                tablero[2][2] = marca;
                break;

            default:
                System.out.println("Casilla inválida");
                break;

        }

        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {

                if (tablero[i][j] == null) {

                    empate = false;
                    break;

                }

            }

        }
        
        if (hayGanador(tablero)) {

            String nombreGanador = "";

            if (turno) {

                nombreGanador = nombreJ2;
                
                puntosJ2++;
                puntajeJ2.setText(Integer.toString(puntosJ2));

            } else if (!turno) {

                nombreGanador = nombreJ1;
                
                puntosJ1++;
                puntajeJ1.setText(Integer.toString(puntosJ1));

            }

            JOptionPane.showMessageDialog(null, "¡El jugador " + nombreGanador + " es el ganador!", "Ganador", JOptionPane.WARNING_MESSAGE);

            reiniciarTablero(jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8, jl9, tablero);

            ganador = false;

        } else if (empate){

            JOptionPane.showMessageDialog(null, "El juego ha terminado en empate", "Fin el juego", JOptionPane.WARNING_MESSAGE);

            reiniciarTablero(jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8, jl9, tablero);

        }

    }

    public boolean hayGanador(String[][] tablero) {

        for (int fila = 0; fila < 3; fila++) {
            if (tablero[fila][0] != null && tablero[fila][0].equals(tablero[fila][1]) && tablero[fila][0].equals(tablero[fila][2])) {
                return true;
            }
        }

        for (int columna = 0; columna < 3; columna++) {
            if (tablero[0][columna] != null && tablero[0][columna].equals(tablero[1][columna]) && tablero[0][columna].equals(tablero[2][columna])) {
                return true;
            }
        }

        if (tablero[0][0] != null && tablero[0][0].equals(tablero[1][1]) && tablero[0][0].equals(tablero[2][2])) {
            return true;
        }

        if (tablero[0][2] != null && tablero[0][2].equals(tablero[1][1]) && tablero[0][2].equals(tablero[2][0])) {
            return true;
        }

        return false;

    }

    public void reiniciarTablero4(JLabel jl10, JLabel jl11, JLabel jl12, JLabel jl13, JLabel jl14, JLabel jl15, JLabel jl16, JLabel jl17, JLabel jl18, JLabel jl19, JLabel jl20, JLabel jl21, JLabel jl22, JLabel jl23, JLabel jl24, JLabel jl25, String[][] tablero) {

        jl10.setText("");
        jl11.setText("");
        jl12.setText("");
        jl13.setText("");
        jl14.setText("");
        jl15.setText("");
        jl16.setText("");
        jl17.setText("");
        jl18.setText("");
        jl19.setText("");
        jl20.setText("");
        jl21.setText("");
        jl22.setText("");
        jl23.setText("");
        jl24.setText("");
        jl25.setText("");

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = null;
            }
        }

    }

    public void finDelJuego4(JLabel puntajeJ1, JLabel puntajeJ2,int casilla, String marca, Boolean turno, String nombreJ1, String nombreJ2, JLabel jl10, JLabel jl11, JLabel jl12, JLabel jl13, JLabel jl14, JLabel jl15, JLabel jl16, JLabel jl17, JLabel jl18, JLabel jl19, JLabel jl20, JLabel jl21, JLabel jl22, JLabel jl23, JLabel jl24, JLabel jl25) {

        boolean empate = true;
        
        switch (casilla) {

            case 1:
                tablero[0][0] = marca;
                break;

            case 2:
                tablero[0][1] = marca;
                break;

            case 3:
                tablero[0][2] = marca;
                break;

            case 4:
                tablero[0][3] = marca;
                break;

            case 5:
                tablero[1][0] = marca;
                break;

            case 6:
                tablero[1][1] = marca;
                break;

            case 7:
                tablero[1][2] = marca;
                break;

            case 8:
                tablero[1][3] = marca;
                break;

            case 9:
                tablero[2][0] = marca;
                break;

            case 10:
                tablero[2][1] = marca;
                break;

            case 11:
                tablero[2][2] = marca;
                break;

            case 12:
                tablero[2][3] = marca;
                break;

            case 13:
                tablero[3][0] = marca;
                break;

            case 14:
                tablero[3][1] = marca;
                break;

            case 15:
                tablero[3][2] = marca;
                break;

            case 16:
                tablero[3][3] = marca;
                break;

            default:
                System.out.println("Casilla inválida");
                break;

        }

        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {

                if (tablero[i][j] == null) {

                    empate = false;

                }

            }

        }

        if (hayGanador4(tablero)) {

            String nombreGanador = "";

            if (turno) {

                nombreGanador = nombreJ2;
                
                puntosJ1++;
                puntajeJ1.setText(Integer.toString(puntosJ1));

            } else if (!turno) {

                nombreGanador = nombreJ1;
                
                puntosJ2++;
                puntajeJ2.setText(Integer.toString(puntosJ2));

            }

            JOptionPane.showMessageDialog(null, "¡El jugador " + nombreGanador + " es el ganador!", "Ganador", JOptionPane.WARNING_MESSAGE);

            reiniciarTablero4(jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25, tablero);

            ganador = false;

        } else if (empate) {

            JOptionPane.showMessageDialog(null, "El juego ha terminado en empate", "Fin el juego", JOptionPane.WARNING_MESSAGE);

            reiniciarTablero4(jl10, jl11, jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19, jl20, jl21, jl22, jl23, jl24, jl25, tablero);

        }

    }

    public boolean hayGanador4(String[][] tablero) {

        for (int fila = 0; fila < 3; fila++) {
            if (tablero[fila][0] != null && tablero[fila][0].equals(tablero[fila][1]) && tablero[fila][0].equals(tablero[fila][2]) && tablero[fila][0].equals(tablero[fila][3])) {
                return true;
            }
        }

        for (int columna = 0; columna < 3; columna++) {
            if (tablero[0][columna] != null && tablero[0][columna].equals(tablero[1][columna]) && tablero[0][columna].equals(tablero[2][columna]) && tablero[0][columna].equals(tablero[3][columna])) {
                return true;
            }
        }

        if (tablero[0][0] != null && tablero[0][0].equals(tablero[1][1]) && tablero[0][0].equals(tablero[2][2]) && tablero[0][0].equals(tablero[3][3])) {
            return true;
        }

        if (tablero[0][3] != null && tablero[0][3].equals(tablero[1][2]) && tablero[0][3].equals(tablero[2][1]) && tablero[0][3].equals(tablero[3][0])) {
            return true;
        }

        return false;

    }

    public void reiniciarTablero5(JLabel jl26, JLabel jl27, JLabel jl28, JLabel jl29, JLabel jl30, JLabel jl31, JLabel jl32, JLabel jl33, JLabel jl34, JLabel jl35, JLabel jl36, JLabel jl37, JLabel jl38, JLabel jl39, JLabel jl40, JLabel jl41, JLabel jl42, JLabel jl43, JLabel jl44, JLabel jl45, JLabel jl46, JLabel jl47, JLabel jl48, JLabel jl49, JLabel jl50, String[][] tablero) {

        jl26.setText("");
        jl27.setText("");
        jl28.setText("");
        jl29.setText("");
        jl30.setText("");
        jl31.setText("");
        jl32.setText("");
        jl33.setText("");
        jl34.setText("");
        jl35.setText("");
        jl36.setText("");
        jl37.setText("");
        jl38.setText("");
        jl39.setText("");
        jl40.setText("");
        jl41.setText("");
        jl42.setText("");
        jl43.setText("");
        jl44.setText("");
        jl45.setText("");
        jl46.setText("");
        jl47.setText("");
        jl48.setText("");
        jl49.setText("");
        jl50.setText("");

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = null;
            }
        }
        
    }

    
    public void finDelJuego5(JLabel puntajeJ1, JLabel puntajeJ2,int casilla, String marca, Boolean turno, String nombreJ1, String nombreJ2, JLabel jl26, JLabel jl27, JLabel jl28, JLabel jl29, JLabel jl30, JLabel jl31, JLabel jl32, JLabel jl33, JLabel jl34, JLabel jl35, JLabel jl36, JLabel jl37, JLabel jl38, JLabel jl39, JLabel jl40, JLabel jl41, JLabel jl42, JLabel jl43, JLabel jl44, JLabel jl45, JLabel jl46, JLabel jl47, JLabel jl48, JLabel jl49, JLabel jl50) {

        boolean empate = true;

        switch (casilla) {

            case 1:
                tablero[0][0] = marca;
                break;

            case 2:
                tablero[0][1] = marca;
                break;

            case 3:
                tablero[0][2] = marca;
                break;

            case 4:
                tablero[0][3] = marca;
                break;

            case 5:
                tablero[0][4] = marca;
                break;

            case 6:
                tablero[1][0] = marca;
                break;

            case 7:
                tablero[1][1] = marca;
                break;

            case 8:
                tablero[1][2] = marca;
                break;

            case 9:
                tablero[1][3] = marca;
                break;

            case 10:
                tablero[1][4] = marca;
                break;

            case 11:
                tablero[2][0] = marca;
                break;

            case 12:
                tablero[2][1] = marca;
                break;

            case 13:
                tablero[2][2] = marca;
                break;

            case 14:
                tablero[2][3] = marca;
                break;

            case 15:
                tablero[2][4] = marca;
                break;

            case 16:
                tablero[3][0] = marca;
                break;

            case 17:
                tablero[3][1] = marca;
                break;

            case 18:
                tablero[3][2] = marca;
                break;

            case 19:
                tablero[3][3] = marca;
                break;

            case 20:
                tablero[3][4] = marca;
                break;

            case 21:
                tablero[4][0] = marca;
                break;

            case 22:
                tablero[4][1] = marca;
                break;

            case 23:
                tablero[4][2] = marca;
                break;

            case 24:
                tablero[4][3] = marca;
                break;

            case 25:
                tablero[4][4] = marca;
                break;

            default:
                System.out.println("Casilla inválida");
                break;

        }

        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {

                if (tablero[i][j] == null) {

                    empate = false;

                }

            }

        }

        if (hayGanador5(tablero)) {

            String nombreGanador = "";

            if (turno) {

                nombreGanador = nombreJ2;
                
                puntosJ2++;
                puntajeJ2.setText(Integer.toString(puntosJ2));

            } else if (!turno) {

                nombreGanador = nombreJ1;
                
                puntosJ1++;
                puntajeJ1.setText(Integer.toString(puntosJ1));

            }

            JOptionPane.showMessageDialog(null, "¡El jugador " + nombreGanador + " es el ganador!", "Ganador", JOptionPane.WARNING_MESSAGE);
            
            reiniciarTablero5(jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50, tablero);

            ganador = false;
            
        } else if (empate) {

            JOptionPane.showMessageDialog(null, "El juego ha terminado en empate", "Fin el juego", JOptionPane.WARNING_MESSAGE);
            
            reiniciarTablero5(jl26, jl27, jl28, jl29, jl30, jl31, jl32, jl33, jl34, jl35, jl36, jl37, jl38, jl39, jl40, jl41, jl42, jl43, jl44, jl45, jl46, jl47, jl48, jl49, jl50, tablero);

        }

    }

    public boolean hayGanador5(String[][] tablero) {

        for (int fila = 0; fila < 4; fila++) {
            if (tablero[fila][0] != null && tablero[fila][0].equals(tablero[fila][1]) && tablero[fila][0].equals(tablero[fila][2]) && tablero[fila][0].equals(tablero[fila][3]) && tablero[fila][0].equals(tablero[fila][4])) {
                return true;
            }
        }

        for (int columna = 0; columna < 4; columna++) {
            if (tablero[0][columna] != null && tablero[0][columna].equals(tablero[1][columna]) && tablero[0][columna].equals(tablero[2][columna]) && tablero[0][columna].equals(tablero[3][columna]) && tablero[0][columna].equals(tablero[4][columna])) {
                return true;
            }
        }

        if (tablero[0][0] != null && tablero[0][0].equals(tablero[1][1]) && tablero[0][0].equals(tablero[2][2]) && tablero[0][0].equals(tablero[3][3]) && tablero[0][0].equals(tablero[4][4])) {
            return true;
        }

        if (tablero[0][4] != null && tablero[0][4].equals(tablero[1][3]) && tablero[0][4].equals(tablero[2][2]) && tablero[0][4].equals(tablero[1][3]) && tablero[0][4].equals(tablero[0][4])) {
            return true;
        }

        return false;

    }

    /*
    Teoría que podría romper el código ¡Dangerous!
    void jugarEnCasilla(JLabel label, int casilla, boolean turnoJugador1, JComboBox colorJ1, JComboBox colorJ2, JLabel jlJugador1, JLabel jlJugador2, String nombre1, String nombre2, String [][] matriz) {
    
        Tablero tablero = new Tablero(matriz);
        
        if (label.getText().isEmpty()) {
            if (turnoJugador1) {
                label.setText(tablero.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, nombre1, (String) colorJ1.getSelectedItem(), jlJugador1, label);
                turnoJugador1 = false;
            } else {
                label.setText(tablero.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, nombre2, (String) colorJ2.getSelectedItem(), jlJugador2, label);
                turnoJugador1 = true;
            }
        }

        tablero.finDelJuego(casilla, label.getText(), turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }*/
}
