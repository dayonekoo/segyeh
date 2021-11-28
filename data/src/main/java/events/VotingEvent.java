package events;

/** Data model representing a voting event created after a voter expresses
 *  their will on a polling issue. */
public class VotingEvent {

    // name of the issue.
    private String issueName;

    // unique identifier of voter obtained via hash of social security number.
    private String voterId;

    // voter preference on the issue.
    private boolean vote;

    public String getIssueName() {
        return issueName;
    }

    public void setIssueTitle(String issueTitle) {
        this.issueName = issueTitle;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public boolean getVote() {
        return vote;
    }

    public void setVote(boolean vote) {
        this.vote = vote;
    }
}