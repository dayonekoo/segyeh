import events.VotingEvent;

public class VotingEventBiz {

    /** process voting event. */
    public void processVotingEvent(VotingEvent votingEvent) {

        try {
            // update voter database.
            updateVoterDb(votingEvent);

            // update issue database.
            updateIssueDb(votingEvent);

            // publish successful vote processed event.
            publishVoteProcessedEvent(votingEvent, true);

        } catch (Exception e) {

            // publish unsuccessful vote processed event. Categorize retryable & non-retryable exceptions.
            publishVoteProcessedEvent(votingEvent, false);
        }
    }

    /** update voter database. */
    public void updateVoterDb(VotingEvent votingEvent) {

    }

    /** update issue database. */
    public void updateIssueDb(VotingEvent votingEvent) {

    }

    /** publish VoteProcessedEvent indicating success or failure in processing voting event. */
    public void publishVoteProcessedEvent(VotingEvent votingEvent, Boolean success) {

    }
}