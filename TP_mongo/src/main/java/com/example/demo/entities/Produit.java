package com.example.demo.entities;
import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Produit implements Serializable {
    private String id;
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String designation;
    private double prix;

    protected Produit() {}

    public Produit(String designation) {
        this.designation = designation;
    }

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
}
