package com.itlizeSession.product.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;


@Entity
public class Product {

	@Id
	@GeneratedValue
	private Integer id;

	private BigDecimal price;

	private String type;

	private String brand;

	private int firmSpecs;

	private int globalSpecs;

	private String certifications;

	private Integer detailsID;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getFirmSpecs() {
		return firmSpecs;
	}

	public void setFirmSpecs(int firmSpecs) {
		this.firmSpecs = firmSpecs;
	}

	public int getGlobalSpecs() {
		return globalSpecs;
	}

	public void setGlobalSpecs(int globalSpecs) {
		this.globalSpecs = globalSpecs;
	}

	public String getCertifications() {
		return certifications;
	}

	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}

	public Integer getDetailsID() {
		return detailsID;
	}

	public void setDetailsID(Integer detailsID) {
		this.detailsID = detailsID;
	}

	public Product() {
	}


}
