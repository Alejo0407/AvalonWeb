package test;

import java.sql.Connection;
import java.sql.SQLException;

import conexion.SQL_Conexion;

public class TEST {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		SQL_Conexion con = new SQL_Conexion();
		con.SQL_ConexionGeneral("bdsistema");
		con.openConection();
		
		Connection connection = SQL_Conexion.getConnectionBD();
		if(connection != null)
			System.out.println("CONEXION EXITOSA");
		else
			System.out.println("ERROR");
		connection.close();
	}

}
