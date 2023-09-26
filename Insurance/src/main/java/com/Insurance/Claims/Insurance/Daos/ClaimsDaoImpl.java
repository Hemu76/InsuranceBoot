package com.Insurance.Claims.Insurance.Daos;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.Insurance.Claims.Insurance.Contracts.ClaimsDao;
import com.Insurance.Claims.Insurance.Models.Claim;
import com.Insurance.Claims.Insurance.Models.ClaimBills;
import com.Insurance.Claims.Insurance.RowMappers.ClaimBillsMap;
import com.Insurance.Claims.Insurance.RowMappers.ClaimsMapper;
import com.Insurance.Claims.Insurance.RowMappers.RowMap;

@Component
public class ClaimsDaoImpl implements ClaimsDao {

	JdbcTemplate jdbcTemplate;

	private String SQL_GET_CLAIMS = "select * from  _Claims";
	private String SQL_GET_FILTERED_CLAIMS = "select * from  _Claims where clam_status=?";
	private String SQL_GET_CLAIM_BY_ID = "select * from  _Claims where clam_id=?";
	private String SQL_INSERT_CLAIM = "insert into _Claims(clam_source,clam_type,clam_date,clam_iplc_id,clam_amount_requested) values(?,?,?,?,?)";
	private String SQL_INSERT_CLAIMBill = "insert into ClaimBills(clam_id,clbl_document_title,clbl_document_path,clbl_claim_amount) values(?,?,?,?)";

	@Autowired
	public ClaimsDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public ArrayList<Claim> getAllClaims() {
		System.out.println("bhav");
		return (ArrayList<Claim>) jdbcTemplate.query(SQL_GET_CLAIMS, new ClaimsMapper());
	}

	@SuppressWarnings("deprecation")
	@Override
	public ArrayList<Claim> getFilteredClaims(String status) {
		// TODO Auto-generated method stub
		return (ArrayList<Claim>) jdbcTemplate.query(SQL_GET_FILTERED_CLAIMS, new Object[] { status },
				new ClaimsMapper());
	}

	@Override
	public Claim getClaimById(int clamId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SQL_GET_CLAIM_BY_ID, new Object[] { clamId }, new ClaimsMapper());
	}

	@Override
	public void addClaim(ClaimBills claim) {
		String query = "insert into Claims(patient_id,patient_name, date_of_birth, gender, contact_number, address, joined_date, disease, diagnosis, treatment, room_charges, medicine_bill, document_path) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] values = {};
		jdbcTemplate.update(query, values);
	}

	@Override
	public Claim getClaimByid(int clamIplcId) {
		// TODO Auto-generated method stub

		return jdbcTemplate.queryForObject("select distinct clam_id from _Claims where clam_iplc_id=" + clamIplcId,
				new RowMap());
	}

	@Override
	public void setDocs(String f, String filePath, int cid, double amt) {
		System.out.println("brooo");
		jdbcTemplate.update(SQL_INSERT_CLAIMBill, cid, f, filePath, amt);
	}

	@Override
	public ArrayList<ClaimBills> getDocs(int clamId) {
		// TODO Auto-generated method stub
		System.out.println("docs");
		return (ArrayList<ClaimBills>) jdbcTemplate.query("select * from ClaimBills where clam_id=" + clamId,
				new ClaimBillsMap());
	}

	private String SQL_VIEW_CLAIMS = "select * from  _Claims where clam_status is null";
	private String SQL_VIEW_CLAIM_BY_ID = "select * from  _Claims where clam_id=?";
	private String SQL_EDIT_CLAIM_BY_ID = "update _claims set clam_remarks=?, clam_status=? where clam_id=?";

	@Override
	public ArrayList<Claim> viewAllClaims() {
		// TODO Auto-generated method stub
		System.out.println("hii");
		return (ArrayList<Claim>) jdbcTemplate.query(SQL_VIEW_CLAIMS, new ClaimsMapper());
	}

	@SuppressWarnings("deprecation")
	@Override
	public Claim viewClaimById(int clamId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SQL_VIEW_CLAIM_BY_ID, new Object[] { clamId }, new ClaimsMapper());
	}

	@Override
	public int editClaimById(int clamId, String clamRemarks, String clamStatus) {
		return jdbcTemplate.update(SQL_EDIT_CLAIM_BY_ID, clamRemarks, clamStatus, clamId);

	}

	@Override
	public void setClaim(int i, double d) {
		try {
			String dateOfBirth = "3003-03-30";
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date utilDate = dateFormat.parse(dateOfBirth);
			Date date = new Date(utilDate.getTime());
			jdbcTemplate.update(SQL_INSERT_CLAIM, "HSPT", "DRCT", date, i, d);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public ClaimBills getDocBills(int billIndex) {
		// TODO Auto-generated method stub
		System.out.println("nooooo");
		return (ClaimBills) jdbcTemplate.queryForObject("select * from ClaimBills where clbl_billindex=" + billIndex,
				new ClaimBillsMap());
	}

}
