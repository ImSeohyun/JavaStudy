package exam07_7;

public class OracleDAO implements DBDAO{
	
	//oracleDB 연동하는 메서드
	@Override
	public void connect() {
		System.out.println("oracleDAO connect");
	}

}
