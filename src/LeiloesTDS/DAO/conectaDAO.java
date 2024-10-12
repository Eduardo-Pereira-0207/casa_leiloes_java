package LeiloesTDS.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Adm
 */
public class conectaDAO {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/uc11?characterEncoding=utf-8";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    
    public Connection connectDB() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            return conn;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar" + erro.getMessage());
            return null;
        }
        
    }
    
}
