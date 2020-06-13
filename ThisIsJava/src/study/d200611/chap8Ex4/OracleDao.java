package study.d200611.chap8Ex4;

public class OracleDao implements DataAccessObject {
	public String dbName = "Oracle DB";
	
	public String select() {
		System.out.println(dbName+"에서 검색");
		return null;
	};
	public String insert() {
		System.out.println(dbName+"에 삽입");
		return null;
	};
	public String update() {
		System.out.println(dbName+"를 수정");
		return null;
	};
	public String delete() {
		System.out.println(dbName+"에서 삭제");
		return null;
	};
	
}
