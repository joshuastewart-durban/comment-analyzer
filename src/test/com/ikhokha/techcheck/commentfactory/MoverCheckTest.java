package test.com.ikhokha.techcheck.commentfactory;

import com.ikhokha.techcheck.commentfactory.MoverCheck;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * MoverCheck Tester.
 *
 * @author <Joshua Stewart>
 * @version 1.0
 * @since <pre>Jan 16, 2021</pre>
 */
public class MoverCheckTest {

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
    public void testCheck_happy_path() throws Exception {
        // Arrange
        var moverCheck = new MoverCheck();
        // Act
        var result = moverCheck.check("Test Mover");
        // Assert
        assertEquals(true, result);
    }

    @Test
    public void testCheck_unhappy_path() throws Exception {
        // Arrange
        var moverCheck = new MoverCheck();
        // Act
        var result = moverCheck.check("Test Shaker");
        // Assert
        assertEquals(false, result);
    }

    @Test
    public void testCheck_uppercase() throws Exception {
        // Arrange
        var moverCheck = new MoverCheck();
        // Act
        var result = moverCheck.check("Test MOVER");
        // Assert
        assertEquals(true, result);
    }
} 
