package Spring_jdbc1.Spring_jdbc1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class foodDAO implements foodCRUD{
	//predefind jdbc which is present in spring jdbc jar file
	JdbcTemplate temp;   //this (jdbc template) predefinded object is activated by sitting up with getters and setters

	public JdbcTemplate getTemp() {
		return temp;
	}

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

	public int save(foodBean s) {
		String sql="insert into food values("+s.getQuality()+","+"'"+s.getFood()+"')";
		return temp.update(sql);//to insert update delete 
		
	}

	public List<foodBean> getallfoodlist() {
		String sql="select * from food";
		return temp.query(sql, new ResultSetExtractor<List<foodBean>>() {

			public List<foodBean> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<foodBean> list = new ArrayList<foodBean>();
				while (rs.next()){
				foodBean fb=new foodBean();
				fb.setQuality(rs.getInt(1)); //gets the value from bean or db
				fb.setFood(rs.getString(2));
				}
				return list;
			}
		}); //(prepared stmt=sql) result set
	}

}
