package teammates.ui.request;

import org.testng.annotations.Test;
import teammates.test.BaseTestCase;

// CS427 Issue link: https://github.com/TEAMMATES/teammates/issues/11236
public class FeedbackSessionBasicRequestTest extends BaseTestCase {
    
    //testing if SubmissionStartTimestamp enter is negative timestamp - nonvalid date
    @Test
    public void testValidate_withInValidStartTimestamp_shouldFail() {

        FeedbackSessionBasicRequest request = new FeedbackSessionBasicRequest();
        request.setSubmissionStartTimestamp(-1);
        assertThrows(InvalidHttpRequestBodyException.class, request::validate);
    
    }

	
    //testing if SubmissionEndTimestamp enter is negative timestamp - nonvalid date
    @Test
    public void testValidate_withInvalidEndTimestamp_shouldFail() {

        FeedbackSessionBasicRequest request = new FeedbackSessionBasicRequest();
        request.setSubmissionEndTimestamp(-1);
        assertThrows(InvalidHttpRequestBodyException.class, request::validate);

    }

    
}
