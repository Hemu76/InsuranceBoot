package com.Insurance.Claims.Insurance.Controllers;

import java.awt.print.Book;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.OutputStream;
import java.sql.Date;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Insurance.Claims.Insurance.Contracts.IService;
import com.Insurance.Claims.Insurance.Models.Claim;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HospitalController {

    @Autowired
    IService irip;

    // Get all books
    @GetMapping(value = "/getAllClaims")
    public String getAllClaims(Model model) {
        System.out.println("madh");
        ArrayList<Claim> li = (ArrayList<Claim>) irip.getAllClaims();
        System.out.println(li.size());
        model.addAttribute("claims", li);
        return "Claims";
    }
    @PostMapping(value = "/viewClaim")
    public String getClaimById(Model model, @RequestParam("clamId") int clamId) {
        Claim cl = irip.getClaimById(clamId);
        model.addAttribute("claim", cl);
        return "viewclaim";
    }
    @GetMapping(value = "/getFilteredClaims")
    public String getFilteredClaims(Model model,@RequestParam("status") String status) {
        System.out.println("madh");
        ArrayList<Claim> li = (ArrayList<Claim>) irip.getFilteredClaims(status);
        System.out.println(li.size());
        model.addAttribute("claims", li);
        return "Claims";
    }
    @RequestMapping(value = "/excel", method = RequestMethod.POST)
	public void downloadExcel(@RequestParam("selectedStatus") String status, HttpServletResponse response) throws IOException {
		ArrayList<Claim> Claims=new ArrayList<>();
		if(status=="select") {
		Claims = (ArrayList<Claim>) irip.getAllClaims();
		}
		else {
			Claims = (ArrayList<Claim>) irip.getFilteredClaims(status);
		}
        System.out.println(status+"Satish");


		// Create an Excel workbook using Apache POI
		Workbook workbook = new XSSFWorkbook();
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet("Claims Data");
		Row headerRow = sheet.createRow(0);

	    // Define column headings
	    headerRow.createCell(0).setCellValue("Claim_Id");
	    headerRow.createCell(1).setCellValue("ClamSource");
	    headerRow.createCell(2).setCellValue("ClamType");
	    headerRow.createCell(3).setCellValue("ClamDate");
	    headerRow.createCell(4).setCellValue("ClamAmountRequestedt");
	    headerRow.createCell(5).setCellValue("ClamIplcId");
	    headerRow.createCell(6).setCellValue("ClamProcessedAmount");
	    headerRow.createCell(7).setCellValue("ClamProcessedDate");
	    headerRow.createCell(8).setCellValue("ClamProcessedBy");
	    headerRow.createCell(9).setCellValue("ClamRemarks");
	    headerRow.createCell(10).setCellValue("ClamStatus");
	    
	    
	    
		int rowIdx = 1;
		for (Claim claim : Claims) {
			Row row = sheet.createRow(rowIdx++);
			row.createCell(0).setCellValue(claim.getClamId());
			row.createCell(1).setCellValue(claim.getClamSource());
			row.createCell(2).setCellValue(claim.getClamType());
			row.createCell(3).setCellValue(claim.getClamDate());
			row.createCell(4).setCellValue(claim.getClamAmountRequested());
			row.createCell(5).setCellValue(claim.getClamIplcId());
			row.createCell(6).setCellValue(claim.getClamProcessedAmount());
			row.createCell(7).setCellValue(claim.getClamProcessedDate());
			row.createCell(8).setCellValue(claim.getClamProcessedBy());
			row.createCell(9).setCellValue(claim.getClamRemarks());
			row.createCell(10).setCellValue(claim.getClamStatus());


		}

		// Set the response headers for Excel download
		response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		response.setHeader("Content-Disposition", "attachment; filename=claims.xlsx");
		
		// Write the Excel data to the response output stream
		OutputStream outputStream = response.getOutputStream();
		workbook.write(outputStream);
		outputStream.close();
	}
    
    //Insurance----------------------------------------------------------------------------
    @GetMapping(value="/viewClaims")
    public String viewAllClaims(Model model) {
        ArrayList<Claim> li = (ArrayList<Claim>) irip.viewAllClaims();
        System.out.println(li.size());
        model.addAttribute("claims", li);
        return "InsuClaims";
    } 
    @PostMapping(value = "/viewInsuClaim")
    public String viewClaimById(Model model, @RequestParam("clamId") int clamId) {
        Claim cl = irip.viewClaimById(clamId);
        model.addAttribute("claim", cl);
        return "viewInsuclaim";
    }
    @PostMapping(value = "/processClaim")
    public String editClaimById(Model model, @RequestParam("clamId") int clamId,@RequestParam("clamRemarks") String clamRemarks,@RequestParam("clamStatus") String clamStatus) {
        int n = irip.editClaimById(clamId,clamRemarks,clamStatus);
    	System.out.println(clamId+" "+clamRemarks+" "+clamStatus);
        return "viewInsuclaim";
    }
}
