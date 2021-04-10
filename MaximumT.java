public class MaximumT {

	Integer x, y, z;

	//USE CASE 1 - Maximum Integer
	public int maximumT(Integer x, Integer y, Integer z)
	{
		Integer max = x;
		if(y.compareTo(max)>0)
		{
			max = y;
		}
		if(z.compareTo(max)>0)
		{
			max = z;
		}
		return max;
	}

   //USE CASE 2 - Maximum Float
   public float maximumF(Float x, Float y, Float z)
	{
		Float max = x;
		if(y.compareTo(max)>0)
		{
			max = y;
		}
		if(z.compareTo(max)>0)
		{
			max = z;
		}
		return max;
	}

   //USE CASE - Maximum String
   public String maximumS(String x, String y, String z)
	{
		String max = x;
		if(y.compareTo(max)>0)
		{
			max = y;
		}
		if(z.compareTo(max)>0)
		{
			max = z;
		}
		return max;
	}
}

// REFACTOR 1 and 2
public class MaximumTest <T extends Comparable<T>>{

	T x,y,z;

	public MaximumTest(T x, T y, T z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}

	public T maximum()
	{
		return MaximumTest.maximum(x, y, z);
	}

	public static <T extends Comparable<T>> T maximum(T x, T y, T z)
	{
		T max = x;
		if(y.compareTo(max)>0)
		{
			max = y;
		}
		if(z.compareTo(max)>0)
		{
			max = z;
		}
		return max;
	}

   //USE CSAE 5 - Print using Gneric
   public static void testMaximum(String x, String y, String z)
   {
      String max = x;
      if(y.compareTo(max)>0)
      {
         max = y;
      }
      if(z.compareTo(max)>0)
      {
         max = z;
      }
      printMax(x,y,z,max);
   }

   public static <T> void printMax(T x, T y, T z, T max)
   {
    System.out.println("Max of %s, %s, %s is %s\n",x,y,z,max);
   }
}

//USe CASE 4 - Generic List
class MaxiGen <T extends Comparable<T>>{

	public static <T extends Comparable<T>> T maximum4(ArrayList<T> list){

		Collections.sort(list,Collections.reverseOrder());
		return list.get(0);

	}
}
