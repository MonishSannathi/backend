package net.swe642.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="surveys")
public class SurveyForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "survey_Date")
	private String surveyDate;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "zipCode")
	private String zipCode;
	
	@Column(name = "telephone")
	private String telephone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "most_Liked")
	private String mostLiked;
	
	@Column(name = "know_AboutUs")
	private String knowAboutUs;
	
	@Column(name = "grad_Month")
	private String gradMonth;
	
	@Column(name = "grad_Year")
	private String gradYear;
	
	@Column(name = "your_Recommendation")
	private String yourRecommendation;
	
	@Column(name = "comment")
	private String comment;
	
	public SurveyForm() {
		
	}
	
	public SurveyForm(String surveyDate, String firstName, String lastName,String address, String city, String state, String zipCode,
			String telephone, String email, String mostLiked, String knowAboutUs, String gradMonth, String gradYear,
			String yourRecommendation, String comment) {
		super();
		this.surveyDate = surveyDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.telephone = telephone;
		this.email = email;
		this.mostLiked = mostLiked;
		this.knowAboutUs = knowAboutUs;
		this.gradMonth = gradMonth;
		this.gradYear = gradYear;
		this.yourRecommendation = yourRecommendation;
		this.comment = comment;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSurveyDate() {
		return surveyDate;
	}
	public void setSurveyDate(String surveyDate) {
		this.surveyDate = surveyDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMostLiked() {
		return mostLiked;
	}
	public void setMostLiked(String mostLiked) {
		this.mostLiked = mostLiked;
	}
	public String getKnowAboutUs() {
		return knowAboutUs;
	}
	public void setKnowAboutUs(String knowAboutUs) {
		this.knowAboutUs = knowAboutUs;
	}
	public String getGradMonth() {
		return gradMonth;
	}
	public void setGradMonth(String gradMonth) {
		this.gradMonth = gradMonth;
	}
	public String getGradYear() {
		return gradYear;
	}
	public void setGradYear(String gradYear) {
		this.gradYear = gradYear;
	}
	public String getYourRecommendation() {
		return yourRecommendation;
	}
	public void setYourRecommendation(String yourRecommendation) {
		this.yourRecommendation = yourRecommendation;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
