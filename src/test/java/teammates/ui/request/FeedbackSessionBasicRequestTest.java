package teammates.ui.request;

import org.testng.annotations.Test;
import teammates.test.BaseTestCase;


public class FeedbackSessionBasicRequestTest extends BaseTestCase {
    
    @Test
    public void testValidate_withInValidStartTimestamp_shouldFail() {

        FeedbackSessionBasicRequest request = new FeedbackSessionBasicRequest();
        request.setSubmissionStartTimestamp(-1);
        assertThrows(InvalidHttpRequestBodyException.class, request::validate);
    
    }


    @Test
    public void testValidate_withInvalidEndTimestamp_shouldFail() {

        FeedbackSessionBasicRequest request = new FeedbackSessionBasicRequest();
        request.setSubmissionEndTimestamp(-1);
        assertThrows(InvalidHttpRequestBodyException.class, request::validate);

    }

    
}
