package study.d200611.chap8Ex4;

public class OracleDao implements DataAccessObject {
	public String dbName = "Oracle DB";
	
	public String select() {
		System.out.println(dbName+"���� �˻�");
		return null;
	};
	public String insert() {
		System.out.println(dbName+"�� ����");
		return null;
	};
	public String update() {
		System.out.println(dbName+"�� ����");
		return null;
	};
	public String delete() {
		System.out.println(dbName+"���� ����");
		return null;
	};
	
}
