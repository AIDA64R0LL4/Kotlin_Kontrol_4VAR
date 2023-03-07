import PackageBakery.Bakery
class BekaryShop (NameCake: String, Dough: String, Сream: String) : Bakery(NameCake,Dough,Сream){
    private var Price: Double=1.0;
    public fun SetPrice(): Double{
    return Price
    }
    public fun SetPrice(Price: Double){
        if (Price<0){
            println("Цена пироженого не может быть отрицательной")
        }
        else{
            this.Price=Price
        }
    }
    private var Calories: Double=10.0;
    public fun SetCalories(): Double{
        return Calories
    }
    public fun SetCalories(Calories: Double){
        if (Calories<0){
            println("Калорийность пироженого не может быть отрицательной")
        }
        else{
            this.Calories=Calories
        }
    }
    override fun BakeryInfo(){
        println("Название пироженого $NameCake, сорт теста $Dough, вид крема $Сream, калорийность пироженого $Calories  , стоимость пироженого $Price")
    }
}