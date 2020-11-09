package com.example.covid;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Covid {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private String date;
  private String cases;
  private String country;
  private String population;
  private String continent;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getPopulation() {
	return population;
}

public void setPopulation(String population) {
	this.population = population;
}

public String getContinent() {
	return continent;
}

public void setContinent(String continent) {
	this.continent = continent;
}

public String getCases() {
	return cases;
}

public void setCases(String cases) {
	this.cases = cases;
}

}
