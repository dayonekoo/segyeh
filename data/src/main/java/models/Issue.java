package models;

import java.util.List;
import java.util.UUID;

/**
 * Data model of issues on which voters will express their votes.
 * */
public class Issue {

    // title of the issue in which voters will be polled.
    private String issueName;

    // unique identifier of the issue. Hash of issue title.
    private UUID issueId;

    // number of voters that answered in affirmative.
    private Integer numberOfAffirmative;

    // number of voters that answered in negative.
    private Integer numberOfNegative;

    // list of voter UUIDs that answered in affirmative.
    private List<UUID> listOfAffirmativeIds;

    // list of voter UUIDs that answered in negative.
    private List<UUID> listOfNegativeIds;

    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }

    public UUID getIssueId() {
        return issueId;
    }

    public void setIssueId(UUID issueId) {
        this.issueId = issueId;
    }

    public Integer getNumberOfAffirmative() {
        return numberOfAffirmative;
    }

    public void setNumberOfAffirmative(Integer numberOfAffirmative) {
        this.numberOfAffirmative = numberOfAffirmative;
    }

    public Integer getNumberOfNegative() {
        return numberOfNegative;
    }

    public void setNumberOfNegative(Integer numberOfNegative) {
        this.numberOfNegative = numberOfNegative;
    }

    public List<UUID> getListOfAffirmativeIds() {
        return listOfAffirmativeIds;
    }

    public void setListOfAffirmativeIds(List<UUID> listOfAffirmativeIds) {
        this.listOfAffirmativeIds = listOfAffirmativeIds;
    }

    public List<UUID> getListOfNegativeIds() {
        return listOfNegativeIds;
    }

    public void setListOfNegativeIds(List<UUID> listOfNegativeIds) {
        this.listOfNegativeIds = listOfNegativeIds;
    }
}