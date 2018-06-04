package daointerface;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Member;


public interface MemberDAO {

	public ArrayList<Member> listAllMember() throws SQLException;

	public Member listMember(int memberno) throws SQLException;

	public int createMember(Member m) throws ClassNotFoundException, SQLException;

	public int updateMember(Member m) throws SQLException;

	public int removeMember(int memberno) throws SQLException;

}
