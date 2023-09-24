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
	
	
	
	private String SQL_VIEW_CLAIMS = "select * from  Claims where clam_status is null";
	private String SQL_VIEW_CLAIM_BY_ID = "select * from  Claims where clam_id=?";
	private String SQL_EDIT_CLAIM_BY_ID = "update claims set clam_remarks=?, clam_status=? where clam_id=?";
	@Override
	public ArrayList<Claim> viewAllClaims() {
		// TODO Auto-generated method stub
		return (ArrayList<Claim>) jdbcTemplate.query(SQL_VIEW_CLAIMS,new ClaimsMapper());
	}
	@Override
	public Claim viewClaimById(int clamId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SQL_VIEW_CLAIM_BY_ID,new Object[] {clamId},new ClaimsMapper());
	}
	@Override
	public int editClaimById(int clamId, String clamRemarks, String clamStatus) {
		return jdbcTemplate.update(SQL_EDIT_CLAIM_BY_ID,clamRemarks,clamStatus,clamId);

		
	}
		

}
