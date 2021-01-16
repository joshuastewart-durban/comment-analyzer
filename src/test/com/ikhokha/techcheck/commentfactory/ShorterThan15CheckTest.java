package test.com.ikhokha.techcheck.commentfactory;

import com.ikhokha.techcheck.commentfactory.MoverCheck;
import com.ikhokha.techcheck.commentfactory.ShakerCheck;
import com.ikhokha.techcheck.commentfactory.ShorterThan15Check;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * ShorterThan15Check Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jan 16, 2021</pre>
 */
public class ShorterThan15CheckTest {

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
        var shorterThan15Check = new ShorterThan15Check();
        // Act
        var result = shorterThan15Check.check("Test Shaker?");
        // Assert
        assertEquals(true, result);
    }

    @Test
    public void testCheck_unhappy_path() throws Exception {
        // Arrange
        var shorterThan15Check = new ShorterThan15Check();
        // Act
        var result = shorterThan15Check.check("Test Shakerrrrrrrrrrrrrrrrrrrr?");
        // Assert
        assertEquals(false, result);
    }
} 
