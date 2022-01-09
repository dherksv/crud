package com.example.springstudent.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student {
  @Id
  private String id;
  private String dob;
  private String classi;
  private String division;
  private String gender;
  private boolean published;
  
  public Student() {

  }

  public Student(String name, String Dob, String classi , String division,String gender, boolean published) {
    this.name = name;
    this.dob = dob;
    this.classi = classi;
    this.division = division;
    this.gender= gender;
    this.published = published;
  }

  private String name;
  public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getClassi() {
	return classi;
}
public void setClassi(String classi) {
	this.classi = classi;
}
public String getDivision() {
	return division;
}
public void setDivision(String division) {
	this.division = division;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public boolean isPublished() {
	return published;
}
public void setPublished(boolean published) {
	this.published = published;
}

@Override
public String toString() {
  return "Tutorial [id=" + id + ", name=" + name + ",dob=" + dob + ",classi="+ classi + ",divisiion=" + division +", published=" + published + "]";
}
}
