package exam07_6;

public class DBService {

//	OracleDAO dao;
	MySQLDAO dao;
	
	public void setDAO(MySQLDAO dao) {
		this.dao = dao;
	}
	public void connect() {
		dao.connect_mysql();
	}
}
