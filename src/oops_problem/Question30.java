package oops_problem;

//Design abstract class Database with abstract methods connect() and disconnect(). Implement it for MySQLDatabase and OracleDatabase.
abstract class Database {
	abstract void connect();

	abstract void disconnect();
}

class MySQLDatabase extends Database {
	void connect() {
		System.out.println("Connected to MySQL Database");
	}

	void disconnect() {
		System.out.println("Disconnected from MySQL Database");
	}
}

class OracleDatabase extends Database {
	void connect() {
		System.out.println("Connected to Oracle Database");
	}

	void disconnect() {
		System.out.println("Disconnected from Oracle Database");
	}
}

public class Question30 {
	public static void main(String[] args) {
		Database db1 = new MySQLDatabase();
		db1.connect();
		db1.disconnect();

		Database db2 = new OracleDatabase();
		db2.connect();
		db2.disconnect();
	}
}
