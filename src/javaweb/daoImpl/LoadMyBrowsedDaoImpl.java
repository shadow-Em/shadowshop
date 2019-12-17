package javaweb.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import javaweb.dao.LoadMyBrowsedDao;
import javaweb.pojo.BrowsedCard;

public class LoadMyBrowsedDaoImpl implements LoadMyBrowsedDao {
	public List<BrowsedCard> loadBrowsedCard(String uNo)
	{
		//声明JDBC对象
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<BrowsedCard> list=null;
		try {
			//加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//获取连接对象
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shadowshop?useSSL=false&serverTimezone=UTC","root","root");
			//创建SQL命令
			String sql="call LoadMyBrowsed(?);";
			//创建SQL命令对象
			ps=conn.prepareStatement(sql);
			ps.setString(1, uNo);
			//执行
			rs=ps.executeQuery();
			list=new BeanListHandler<BrowsedCard>(BrowsedCard.class).handle(rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return list;
	}
}
