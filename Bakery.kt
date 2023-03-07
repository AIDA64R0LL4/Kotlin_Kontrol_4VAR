package PackageBakery
open class Bakery (var _NameCake: String, var _Dough: String,var _Сream: String){
    var NameCake: String =_NameCake;
    var Dough: String =_Dough;
    var Сream: String =_Сream;
    open fun BakeryInfo(){
        println("Название пироженого $NameCake, сорт теста $Dough, вид крема $Сream")
    }
}