package events.processed;

public class VoteProcessedEvent {

    // name of the issue.
    private String issueName;

    // unique identifier of voter obtained via hash of social security number.
    private String voterId;

    // voter preference on the issue (affirmative / negative).
    private boolean vote;

    // indicates whether voting event was successfully processed.
    private boolean votingEventSuccessful;

    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public boolean isVote() {
        return vote;
    }

    public void setVote(boolean vote) {
        this.vote = vote;
    }

    public boolean isVotingEventSuccessful() {
        return votingEventSuccessful;
    }

    public void setVotingEventSuccessful(boolean votingEventSuccessful) {
        this.votingEventSuccessful = votingEventSuccessful;
    }
}
