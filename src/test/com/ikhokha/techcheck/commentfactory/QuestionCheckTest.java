package test.com.ikhokha.techcheck.commentfactory;

import com.ikhokha.techcheck.commentfactory.MoverCheck;
import com.ikhokha.techcheck.commentfactory.QuestionCheck;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * QuestionCheck Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jan 16, 2021</pre>
 */
public class QuestionCheckTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: check(String comment)
     */
    @Test
    public void testCheck() throws Exception {
        // Arrange
        var questionCheck = new QuestionCheck();
        // Act
        var result = questionCheck.check("Test Mover?");
        // Assert
        assertEquals(true, result);
    }

    @Test
    public void testCheck_unhappy_path() throws Exception {
        // Arrange
        var questionCheck = new QuestionCheck();
        // Act
        var result = questionCheck.check("Test Mover");
        // Assert
        assertEquals(false, result);
    }
}

