package com.Insurance.Claims.Insurance.Contracts;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import com.Insurance.Claims.Insurance.Models.Claim;


public interface ClaimsDao {


	ArrayList<Claim> getAllClaims();

	ArrayList<Claim> getFilteredClaims(String status);

	Claim getClaimById(int clamId);

	ArrayList<Claim> viewAllClaims();

	Claim viewClaimById(int clamId);
int editClaimById(int clamId, String clamRemarks, String clamStatus);

}
