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
}

