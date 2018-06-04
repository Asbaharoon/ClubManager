package data;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import daointerface.MemberDAO;
import model.Member;
import util.PersistenceManager;

public class MemberDAOImpl implements MemberDAO {

	
//	JDBC

//	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/club?useSSL=false", "root","12345678");
//	Statement statement = connection.createStatement();
	
//	@Override
//	public ArrayList<Member> listAllMember() throws SQLException {
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		ResultSet rs = statement.executeQuery("SELECT * FROM members");
//		ArrayList<Member> members = new ArrayList<Member>();
//		while (rs.next()) {
//			Member m = new Member(0, "", "");
//			m.setFirstname(rs.getString("firstname"));
//			m.setMembernumber(rs.getInt("memberid"));
//			m.setSurname(rs.getString("surname"));
//			m.setSecondname(rs.getString("secondname"));
//			members.add(m);
//		}
//		statement.close();
//		connection.close();
//		return members;
//	}
//
//	@Override
//	public Member listMember(int memberno) throws SQLException {
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		ResultSet rs = statement.executeQuery("SELECT * FROM members where memberid =" + memberno);
//		Member m = new Member(0, "", "");
//		while (rs.next()) {
//			m.setFirstname(rs.getString("firstname"));
//			m.setMembernumber(rs.getInt("memberid"));
//			m.setSurname(rs.getString("surname"));
//			m.setSecondname(rs.getString("secondname"));
//		}
//		statement.close();
//		connection.close();
//		return m;
//	}
//
//	@Override
//	public int createMember(Member m) throws ClassNotFoundException, SQLException {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//
//		int status = statement.executeUpdate("Insert into members values (" + m.getMembernumber() + ",\"" + m.getSurname() + "\",\"" + m.getFirstname() +"\",\"" + m.getSecondname() + "\")");
//
//		statement.close();
//		connection.close();
//		return status;
//	}
//
//	@Override
//	public int updateMember(Member m) throws SQLException {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//
//		int status = statement.executeUpdate("update members set surname = \"" + m.getSurname() + "\", firstname = \"" + m.getFirstname() + "\", secondname = \"" + m.getSecondname() + "\" where memberid = " + m.getMembernumber());
//
//		statement.close();
//		connection.close();
//		return status;
//	}
//
//	@Override
//	public int removeMember(int memberno)  throws SQLException{
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//
//		int status = statement.executeUpdate("delete from members where memberid =" + memberno);
//
//		statement.close();
//		connection.close();
//		return status;
//	}
	
	// Using JPA
	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	@Override
	public ArrayList<Member> listAllMember() {
		Query query = em.createQuery("FROM Member");
		@SuppressWarnings("unchecked")
		ArrayList<Member> result = (ArrayList<Member>) query.getResultList();
		return result;
	}

	@Override
	public Member listMember(int memberno) {
		Member m = em.find(Member.class, memberno);
		return m;
	}

	@Override
	public int createMember(Member m) throws ClassNotFoundException, SQLException {
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
		em.close();
		return 0;
	}

	@Override
	public int updateMember(Member m) {
		Member updatemember = em.find(Member.class, m.getMembernumber());
		em.getTransaction().begin();
		updatemember.setFirstname(m.getFirstname());
		updatemember.setSecondname(m.getSecondname());
		updatemember.setSurname(m.getSurname());
		em.getTransaction().commit();
		em.close();
		return 0;
	}

	@Override
	public int removeMember(int memberno) {
		Member removeMember = em.find(Member.class, memberno);
		em.getTransaction().begin();
		em.remove(removeMember);
		em.getTransaction().commit();
		em.close();
		return 0;
	}
	
	
	

}
