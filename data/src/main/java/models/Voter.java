package models;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * Data model representing each individual voter participating in Segyeh.
 */
public class Voter {

    // unique identifier of voter obtained via hash of social security number.
    private UUID voterId;

    // city of residence.
    private String city;

    // ethnicity of voter.
    private String ethnicity;

    // gender of voter.
    private String gender;

    // yearly salary of voter.
    private String income;

    // occupation of voter.
    private String employment;

    // education level of voter.
    private String education;

    // marital status of voter.
    private String maritalStatus;

    // religion of voter.
    private String religion;

    // date of birth of voter.
    private Date dateOfBirth;

    // map of issueId to voter preference.
    private Map<UUID, Boolean> voteSummary;

    public UUID getVoterId() {
        return voterId;
    }

    public void setVoterId(UUID voterId) {
        this.voterId = voterId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public Date getDateOfBirth() {return dateOfBirth;}

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Map<UUID, Boolean> getVoteSummary() {
        return voteSummary;
    }

    public void setVoteSummary(Map<UUID, Boolean> voteSummary) {
        this.voteSummary = voteSummary;
    }
}