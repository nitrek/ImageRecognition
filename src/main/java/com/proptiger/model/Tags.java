package com.proptiger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tags")
public class Tags {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="primaryId")
	private int primaryId;
	
	@Column(name = "id")
	private int id;

	@Column(name = "imageUrl")
	private String url;

	public int getPrimaryId() {
		return primaryId;
	}

	public void setPrimaryId(int primaryId) {
		this.primaryId = primaryId;
	}

	@Column(name = "tag")
	private String tag;

	@Column(name = "probability")
	private double probability;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public double getProbability() {
		return probability;
	}

	public void setProbability(double probability) {
		this.probability = probability;
	}

}
