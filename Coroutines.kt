open class Coroutines {
    fun input(): Int {
        try {
            println("Введите сколько раз вы хотите выполнить функцию: ")
            var chislo = readLine()!!.toInt()
            if (chislo > 0)
                return chislo
            else println("Ошибка, число не может быть меньше нуля или нулем")
        } catch (e: Exception) {
            ("Вы ввели недопустимые значения")
        }
        return 1
    }

    fun Zapusk() {
        println("Если хотите узнать информацию о Брауни, то введите с клавиатуры 1, если хотите узнать информацию о Эклерах, то введите с клавиаутуры 2")
        var X = readLine()!!.toInt()
        if (X == 1) {
            var Brownie = BekaryShop("Брауни", "Песочное", "Баварский крем")
            println("Напишите калорийность пироженого")
            var Calories = readLine()!!.toDouble()
            Brownie.SetCalories(Calories)
            println("Напишите стоимость пироженого")
            var Price = readLine()!!.toDouble()
            Brownie.SetPrice(Price)
            Brownie.BakeryInfo()
        }
        if (X == 2) {
            var eclairs = BekaryShop("Эклеры", "Песочное", "Молочный крем")
            println("Напишите калорийность пироженого")
            var Calories = readLine()!!.toDouble()
            eclairs.SetCalories(Calories)
            println("Напишите стоимость пироженого")
            var Price = readLine()!!.toDouble()
            eclairs.SetPrice(Price)
            eclairs.BakeryInfo()
        }
    }
}

