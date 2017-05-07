package KFc;

public class KFCWaiter {
	private MealBuilder mealBuilder;
	
	public void setMealBuilder(MealBuilder mealBuilder)
	{
		this.mealBuilder = mealBuilder;
	}
	public Meal construct(){
		mealBuilder.food();
		mealBuilder.drink();
		return mealBuilder.getMeal();
	}
}
