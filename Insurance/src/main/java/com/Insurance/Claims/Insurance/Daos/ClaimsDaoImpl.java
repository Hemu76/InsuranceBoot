package com.Insurance.Claims.Insurance.Daos;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.Insurance.Claims.Insurance.Contracts.ClaimsDao;
import com.Insurance.Claims.Insurance.Models.Claim;
import com.Insurance.Claims.Insurance.RowMappers.ClaimsMapper;



@Component
public class ClaimsDaoImpl implements ClaimsDao {

	
	JdbcTemplate jdbcTemplate;
	
	
	private String SQL_GET_CLAIMS = "select * from  Claims";
	private String SQL_GET_FILTERED_CLAIMS = "select * from  Claims where clam_status=?";
	private String SQL_GET_CLAIM_BY_ID = "select * from  Claims where clam_id=?";
	
	@Autowired
	public ClaimsDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	@Override
	public ArrayList<Claim> getAllClaims() {
		System.out.println("bhav");
		return (ArrayList<Claim>) jdbcTemplate.query(SQL_GET_CLAIMS,new ClaimsMapper());
	}

	@Override
	public ArrayList<Claim> getFilteredClaims(String status) {
		// TODO Auto-generated method stub
		return (ArrayList<Claim>) jdbcTemplate.query(SQL_GET_FILTERED_CLAIMS,new Object[] {status},new ClaimsMapper());
	}

	@Override
	public Claim getClaimById(int clamId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SQL_GET_CLAIM_BY_ID,new Object[] {clamId},new ClaimsMapper());
	}


}
