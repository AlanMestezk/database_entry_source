package Application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		//aqui eu chamo a conexão com o banco
		Connection conn = DB.getConnection();
		DB.closeConnection();
		
	}

}
