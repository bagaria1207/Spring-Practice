package com.psl.ekart.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.psl.ekart.bean.Customer;
import com.psl.ekart.bean.Product;

@Repository("dao")
public class EkartDaoImpl extends JdbcDaoSupport implements EkartDao {

	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void init(){
		this.setDataSource(dataSource);
	}
	
	@Override
	public Customer loginCustomer(final Customer cust) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM customer";
		return this.getJdbcTemplate().query(sql, new ResultSetExtractor<Customer>(){

			@Override
			public Customer extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				// TODO Auto-generated method stub
				Customer custAux = new Customer();
				while(rs.next()){
					if((cust.getUserName().equals(rs.getString(2))) && (cust.getUserPass().equals(rs.getString(3)))){
						custAux.setCustId(rs.getInt(1));
						custAux.setUserName(rs.getString(2));
						custAux.setUserPass(rs.getString(3));
					}
				}
				return custAux;
			}
			
		});

	}

	@Override
	public Map<Integer, Product> getAllProduct() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM product";
		return this.getJdbcTemplate().query(sql, new ResultSetExtractor<HashMap<Integer, Product>>(){
			HashMap<Integer, Product> prodMap = new HashMap<Integer, Product>();
			@Override
			public HashMap<Integer, Product> extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				// TODO Auto-generated method stub
			
				while(rs.next()){
					Product prod = new Product();
					prod.setProdId(rs.getInt(1));
					prod.setProdName(rs.getString(2));
					prod.setProdPrice(rs.getInt(3));
					prodMap.put(prod.getProdId(), prod);
				}
				return prodMap;
			}
		});

	}

}
