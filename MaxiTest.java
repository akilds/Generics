import org.junit.Test;
import org.junit.Assert;

public class MaxiTest {

      //TEST CASE 1.1
		@Test
		public void testInteger()
		{
			MaximumT maxi = new MaximumT();
			int max = maxi.maximumT(6,5,4);
			Assert.assertEquals(6, max);
		}

		//TEST CASE 1.2
		@Test
		public void testInteger2()
		{
			MaximumT maxi = new MaximumT();
			int max = maxi.maximumT(5,6,4);
			Assert.assertEquals(6, max);
		}

		//TEST CASE 1.3
		@Test
		public void testInteger3()
		{
			MaximumT maxi = new MaximumT();
			int max = maxi.maximumT(5,4,6);
			Assert.assertEquals(6, max);
		}
}
