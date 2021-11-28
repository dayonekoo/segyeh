import events.VoterRegistrationEvent;

public class VoterBiz {

    /** process voter registration event. */
    public void processVoterRegistrationEvent(VoterRegistrationEvent voterRegistrationEvent) {

        try {

            // update voter database.
            persistVoterRegistration(voterRegistrationEvent);

            // publish successful voter registration processed event.
            publishVoterRegistrationProcessedEvent(voterRegistrationEvent, true);

        } catch (Exception e) {

            // publish unsuccessful voter registration processed event.
            publishVoterRegistrationProcessedEvent(voterRegistrationEvent, false);
        }
    }

    /** update voter database with new voter. */
    public void persistVoterRegistration(VoterRegistrationEvent voterRegistrationEvent) {

    }

    /** publish VoterRegistrationProcessedEvent indicating success or failure in processing voter registration. */
    public void publishVoterRegistrationProcessedEvent(VoterRegistrationEvent voterRegistrationEvent, boolean successful) {

    }

}