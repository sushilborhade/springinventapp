package springapp.web;

import junit.framework.TestCase;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sushilpborhade on 10/06/16.
 */
public class HelloControllerTests extends TestCase {
    public void testHandleRequestView() throws Exception{
        HelloController helloController = new HelloController();
        ModelAndView modelAndView = helloController.handleRequest(null, null);
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String)modelAndView.getModel().get("now");
        assertNotNull(nowValue);
    }
}
