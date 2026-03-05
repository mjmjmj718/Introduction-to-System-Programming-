public class MyCircle
{
	public static void main(String arg[])
	{
		
	}
}

class Circle
{
	private float radius;

	Circle(float my_radius)
	{
		this.radius = my_radius;
	}

	public float getRadios()
	{
		return this.radius;
	}

	float getDiameter()
	{
		return this.radius * 2;
	}
}
