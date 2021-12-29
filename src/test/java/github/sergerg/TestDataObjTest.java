package github.sergerg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDataObjTest {

    @Test
    public void testObj()
    {
        TestDataObj testDataObj = new TestDataObj(12, 22);
        assertEquals( testDataObj.a(), 12 );
        assertEquals( testDataObj.b(), 22);
    }

}
