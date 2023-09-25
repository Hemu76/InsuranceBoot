package com.Insurance.Claims.Insurance.Repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Claims.Insurance.Contracts.ClaimsDao;
import com.Insurance.Claims.Insurance.Contracts.IService;
import com.Insurance.Claims.Insurance.Models.Claim;
import com.Insurance.Claims.Insurance.Models.ClaimBills;

@Service
public class ClaimService implements IService {
	@Autowired
	ClaimsDao cdao;

	@Override
	public ArrayList<Claim> getAllClaims() {
		// TODO Auto-generated method stub
		System.out.println("hem");
		return (ArrayList<Claim>) cdao.getAllClaims();
	}

	@Override
	public ArrayList<Claim> getFilteredClaims(String status) {
		// TODO Auto-generated method stub
		return (ArrayList<Claim>) cdao.getFilteredClaims(status);
	}

	@Override
	public Claim getClaimById(int clamId) {
		// TODO Auto-generated method stub
		return cdao.getClaimById(clamId);
	}

	@Override
	public void addClaim(int i) {
		cdao.setClaim(i);

	}

	@Override
	public Claim getClaimByid(int clamIplcId) {
		// TODO Auto-generated method stub
		return cdao.getClaimByid(clamIplcId);
	}

	@Override
	public void addClaimBills(String f, String filePath, int cid) {
		// TODO Auto-generated method stub
		cdao.setDocs(f, filePath, cid);
	}

	@Override
	public ArrayList<ClaimBills> viewClaimDocsById(int clamId) {
		// TODO Auto-generated method stub
		return cdao.getDocs(clamId);
	}

	// Insurance------------

	@Override
	public ArrayList<Claim> viewAllClaims() {
		// TODO Auto-generated method stub
		return (ArrayList<Claim>) cdao.viewAllClaims();
	}

	@Override
	public Claim viewClaimById(int clamId) {
		// TODO Auto-generated method stub
		return cdao.viewClaimById(clamId);
	}

	@Override
	public int editClaimById(int clamId, String clamRemarks, String clamStatus) {
		// TODO Auto-generated method stub
		return cdao.editClaimById(clamId, clamRemarks, clamStatus);
	}

	@Override
	public ClaimBills viewdocBills(int billIndex) {
		// TODO Auto-generated method stub
		return cdao.getDocBills(billIndex);
	}

}
