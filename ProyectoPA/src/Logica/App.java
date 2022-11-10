package Logica;

import GUI.Login;

import java.io.IOException;
import java.sql.SQLException;

import Dominio.ConnectionDB;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Login l = new Login();
		l.setVisible(true);

	}

}
