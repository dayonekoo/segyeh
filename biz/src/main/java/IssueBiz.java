import events.IssueRegistrationEvent;

public class IssueBiz {

    /** process issue registration event. */
    public void processIssueRegistrationEvent(IssueRegistrationEvent issueRegistrationEvent) {

        try {

            // update issue database.
            persistIssueRegistration(issueRegistrationEvent);

            // publish successful issue registration processed event.
            publishIssueRegistrationProcessedEvent(issueRegistrationEvent, true);

        } catch (Exception e) {

            // publish unsuccessful issue registration processed event.
            publishIssueRegistrationProcessedEvent(issueRegistrationEvent, false);
        }
    }

    /** update issue database with a new issue. */
    public void persistIssueRegistration(IssueRegistrationEvent issueRegistrationEvent) {

    }

    /** publish IssueRegistrationProcessedEvent indicating success or failure in processing issue registration. */
    public void publishIssueRegistrationProcessedEvent(IssueRegistrationEvent issueRegistrationEvent, boolean successful) {

    }

}