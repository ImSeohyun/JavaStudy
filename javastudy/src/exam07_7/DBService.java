package exam07_7;

public class DBService {

	DBDAO dao;
	
	public void setDAO(DBDAO dao) {//´ÙÇü¼º
		this.dao = dao;
	}
	public void connect() {
		dao.connect();
	}
}
