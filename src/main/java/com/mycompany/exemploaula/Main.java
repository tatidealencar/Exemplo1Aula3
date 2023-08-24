package com.mycompany.exemploaula;

import javax.swing.JOptionPane;

/**
 *
 * @author Tatiana
 */
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("123456789", "Tati");
        
        pessoa1.setCnh("987654321");
        
        JOptionPane.showMessageDialog(null, pessoa1.imprimir());
    }
    
}
