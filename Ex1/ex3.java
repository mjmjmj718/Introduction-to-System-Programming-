public class ex3
{
	public static void main(String arg[])
	{
		Ingredient rice = new Ingredient("rice", 1.4f);
		Ingredient chicken = new Ingredient("chicken", 1.9f);
		Ingredient oliveOil = new Ingredient("olive oil", 9f);
		Ingredient onion = new Ingredient("onion", 0.4f);
		Ingredient water = new Ingredient("water", 0.4f);
		System.out.println(rice.getKJpg());

		System.out.println("==================");

		Recipe chickenAndRiceSoup = new Recipe("chicken and rice soup");
		chickenAndRiceSoup.addIngredient(rice, 100f);
		chickenAndRiceSoup.addIngredient(chicken, 450f);
		chickenAndRiceSoup.addIngredient(oliveOil, 14f);
		chickenAndRiceSoup.addIngredient(onion, 150f);
		chickenAndRiceSoup.addIngredient(water, 1000f);
		System.out.println(chickenAndRiceSoup.getGram());
		System.out.println(chickenAndRiceSoup.getKJ());
	}
}

class Ingredient
{
	private String name;
	private float KJpg; //kilocalories per gram

	Ingredient(String name, float KJpg)
	{
		this.name = name;
		this.KJpg = KJpg;
	}

	String getName()
	{
		return this.name;
	}

	float getKJpg()
	{
		return this.KJpg;
	}
}


class Recipe
{
	private String name;
	private float  gram;
	private float  KJ;

	Recipe(String name)
	{
		this.name = name;
		this.gram = 0;
		this.KJ = 0;
	}

	void addIngredient(Ingredient thing, float weight)
	{
		this.gram += weight;
		this.KJ += thing.getKJpg() * weight;
	}

	float getGram()
	{
		return this.gram;
	}

	float getKJ()
	{
		return this.KJ;
	}
	

}
