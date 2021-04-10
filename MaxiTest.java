import org.junit.Test;
import org.junit.Assert;
import java.util.*;

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

      //REFACTOR
      @Test
		public void testGenerics()
		{
			Integer xInt = 3, yInt = 4, zInt = 5;
			Float xf1 = 6.6f, yf1 = 8.8f, zf1 = 7.7f;
			String xStr = "pear", yStr = "apple", zStr = "orange";
			int maxi1 = (int) new MaximumTest(xInt,yInt,zInt).maximum();

			Float maxi2 = (float) new MaximumTest(xf1,yf1,zf1).maximum();
			String maxi3 = (String) new MaximumTest(xStr,yStr,zStr).maximum();

			Assert.assertEquals(5,maxi1);
			Assert.assertEquals(yf1,maxi2);
			Assert.assertEquals("pear",maxi3);
		}

      //TEST CASE 4
      @Test
		public void testGeneric2()
		{
			MaxiGen maxiString = new MaxiGen();
			MaxiGen maxiFloat = new MaxiGen();
			MaxiGen maxiInt = new MaxiGen();

         Scanner sc = new Scanner(System.in);

         ArrayList<String> arString = new ArrayList<String>();
			ArrayList<Float> arFloat = new ArrayList<Float>();
			ArrayList<Integer> arInt = new ArrayList<Integer>();

			System.out.println("Enter Size of String : ");
			int sizeString = sc.nextInt();
			sc.nextLine();

			for(int i=0;i<sizeString;i++)
			{
				System.out.println("Enter String value : ");
				arString.add(sc.nextLine());
			}

			System.out.println("Enter Size of Float : ");
			int sizeFloat = sc.nextInt();
			for(int i=0;i<sizeFloat;i++)
			{
				System.out.println("Enter Float value : ");
				arFloat.add(sc.nextFloat());
			}

			System.out.println("Enter Size of Int : ");
			int sizeInt = sc.nextInt();
			for(int i=0;i<sizeInt;i++)
			{
				System.out.println("Enter Integer value : ");
				arInt.add(sc.nextInt());
			}

			String maxString = maxiString.maximum4(arString);
			Float maxFloat = maxiFloat.maximum4(arFloat);
			int maxInt = maxiInt.maximum4(arInt);

			Float yf1 = 8.8f;
			Assert.assertEquals(5,maxInt);
			Assert.assertEquals(yf1,maxFloat);
			Assert.assertEquals("pear",maxString);

		}
}
