package com.Insurance.Claims.Insurance.Repository;

import com.Insurance.Claims.Insurance.Contracts.ClaimsDao;
import com.Insurance.Claims.Insurance.Contracts.IService;
import com.Insurance.Claims.Insurance.Models.Claim;


import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Service
public class ClaimService implements IService {
	@Autowired
	ClaimsDao cdao;
	

	@Override
	public ArrayList<Claim> getAllClaims() {
		// TODO Auto-generated method stub
		System.out.println("hem");
		return (ArrayList<Claim>)cdao.getAllClaims();
	}


	@Override
	public ArrayList<Claim> getFilteredClaims(String status) {
		// TODO Auto-generated method stub
		return (ArrayList<Claim>)cdao.getFilteredClaims(status);
	}


	@Override
	public Claim getClaimById(int clamId) {
		// TODO Auto-generated method stub
		return cdao.getClaimById(clamId);
	}



	


}
