package com.Insurance.Claims.Insurance.Models;


public class DataEntity {
    private Long id;

    // Define fields for your data
    private String name;
    private String description;

    private String pdfLink; // Store the Google Drive link here

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPdfLink() {
		return pdfLink;
	}

	public void setPdfLink(String pdfLink) {
		this.pdfLink = pdfLink;
	}

    // Constructors, getters, and setters
}
