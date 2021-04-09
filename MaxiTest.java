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

      //TEST CASE 2.1
      Float maxim = 6.3f;
		@Test
		public void testFloat1()
		{
			MaximumT maxi = new MaximumT();
			Float max = maxi.maximumF(6.3f,4.1f,5.02f);
			Assert.assertEquals(maxim,max);
		}

		//TEST CASE 2.2
		@Test
		public void testFloat2()
		{
			MaximumT maxi = new MaximumT();
			Float max = maxi.maximumF(5.02f,6.3f,4.1f);
			Assert.assertEquals(maxim,max);
		}

		//TEST CASE 2.3
		@Test
		public void testFloat3()
		{
			MaximumT maxi = new MaximumT();
			Float max = maxi.maximumF(5.02f,4.1f,6.3f);
			Assert.assertEquals(maxim,max);
		}

      //TEST CASE 3.1
      @Test
		public void testString1()
		{
			MaximumT maxi = new MaximumT();
			String max = maxi.maximumS("Peaches","Apple","Banana");
			Assert.assertEquals("Peaches",max);
		}

		//TEST CASE 3.2
		@Test
		public void testString2()
		{
			MaximumT maxi = new MaximumT();
			String max = maxi.maximumS("Apple","Peaches","Banana");
			Assert.assertEquals("Peaches",max);
		}

		//TEST CASE 3.3
		@Test
		public void testString3()
		{
			MaximumT maxi = new MaximumT();
			String max = maxi.maximumS("Apple","Banana","Peaches");
			Assert.assertEquals("Peaches",max);
		}
}
