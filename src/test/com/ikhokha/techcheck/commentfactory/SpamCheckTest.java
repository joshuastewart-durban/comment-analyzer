package test.com.ikhokha.techcheck.commentfactory;

import com.ikhokha.techcheck.commentfactory.MoverCheck;
import com.ikhokha.techcheck.commentfactory.ShorterThan15Check;
import com.ikhokha.techcheck.commentfactory.SpamCheck;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * SpamCheck Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jan 16, 2021</pre>
 */
public class SpamCheckTest {

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
        var spamCheck = new SpamCheck();
        // Act
        var result = spamCheck.check("Test Shaker www.test.com?");
        // Assert
        assertEquals(true, result);
    }

    @Test
    public void testCheck_unhappy_path() throws Exception {
        // Arrange
        var spamCheck = new SpamCheck();
        // Act
        var result = spamCheck.check("Test Shaker");
        // Assert
        assertEquals(false, result);
    }

    @Test
    public void testCheck_uppercase() throws Exception {
        // Arrange
        var spamCheck = new SpamCheck();
        // Act
        var result = spamCheck.check("Test Shaker WWW.test.com?");
        // Assert
        assertEquals(true, result);
    }
} 
