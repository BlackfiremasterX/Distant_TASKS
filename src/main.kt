import java.lang.Math.*
import java.lang.NumberFormatException
import kotlin.math.roundToInt

fun main() {
    Undead_Console_Calculator_4_Operations()
}

fun Begin7() {
    print(
        "Begin7. Найти длину окружности L и площадь круга S заданного радиуса R:\n" +
                "L = 2*π*R, S = π*R^2. В качестве значения π использовать 3.14.\n"
    )

    val π = 3.14
    print("Введите число - радиус окружности: ")
    var R = readLine()!!.toDouble()
    var L = 2 * π * R
    var S = π * pow(R, 2.0)

    print("Ответ: Длина оружности = $L ; Площадь = $S")
}

fun Begin21() {
    print("Begin21. Даны координаты трех вершин треугольника: (x1, y1), (x2, y2), (x3, y3).\n" +
            "Найти его периметр и площадь, используя формулу для расстояния между двумя точками на плоскости." +
            "Для нахождения площади треугольника со сторонами a, b, c использовать формулу Герона:\n" +
            "S =√p·(p − a)·(p − b)·(p − c),\n" +
            "где p = (a + b + c)/2 — полупериметр.\n" +
            "Расстояние вычисляется по формуле: √(x2 − x1)^2 + (y2 − y1)^2\n")


    print("Введите координату x1: ");
    var x1 = readLine()!!.toInt()
    print("Введите координату y1: ");
    var y1 = readLine()!!.toInt()
    print("Введите координату x2: ");
    var x2 = readLine()!!.toInt()
    print("Введите координату y2: ");
    var y2 = readLine()!!.toInt()
    print("Введите координату x3: ");
    var x3 = readLine()!!.toInt()
    print("Введите координату y3: ");
    var y3 = readLine()!!.toInt()


    var a = sqrt(pow(((x2 - x1).toDouble()), 2.0) + pow(((y2 - y1).toDouble()), 2.0))
    var b = sqrt(pow(((x3 - x2).toDouble()), 2.0) + pow(((y3 - y2).toDouble()), 2.0))
    var c = sqrt(pow(((x1 - x3).toDouble()), 2.0) + pow(((y1 - y3).toDouble()), 2.0))
    var p = (a + b + c) / 2
    var S = sqrt(p * (p - a) * (p - b) * (p - c))

    print("Сторона а: $a\n")
    print("Сторона b: $b\n")
    print("Сторона c: $c\n")
    print("Полупериметр треугольника аbc: $p\n")
    print("Площадь треугольника аbc: $S\n")


}

fun Integer1() {
    print("Integer1. Дано расстояние L в сантиметрах.\n" +
            "Используя операцию деления нацело,\n" +
            "найти количество полных метров в нем (1 метр = 100 см).\n")
    print("Введите целое число: ")
    var L_santimetr = readLine()!!.toInt()
    var L_metr = L_santimetr / 100
    println("Ответ: Целых метров: $L_metr")
}

fun Integer7() {
    print("Integer7. Дано двузначное число. Найти сумму и произведение его цифр.\n")
    print("Введите двузначное число: ")
    var number = readLine()!!.toInt()
    var number_1 = number / 10
    var number_2 = number % 10
    println("Первая цифра: $number_1, вторая цифра: $number_2")
    println("Произведение: ${number_1 * number_2}, сумма: ${number_1 + number_2}")
    print("Привет! Шо-как?")
}

fun If8() {
    print("If8. Даны два числа. Вывести вначале большее, а затем меньшее из них.\n")
    print("Введите первое число: ") //Сtrl + D
    var num1 = readLine()!!.toDouble()
    print("Введите второе число: ") //Сtrl + D
    var num2 = readLine()!!.toDouble() //Сtrl+Shift+стрелки вниз\вверх

    if (num1 == num2) {
        println("Они равны!")
        println(num1)
        println(num2)
    } else {
        if (num1 > num2) {
            println(num1)
            println(num2)
        } else {
            println(num2)
            println(num1)
        }
    }
}

fun If29_30() {
    println("\n\nIf29. Дано целое число.\n" +
            "Вывести его строку-описание вида «отрицательное четное число»,\n" +
            "«нулевое число», «положительное нечетное число» и т. д.\n" +
            "If30. Дано целое число, лежащее в диапазоне 1–999.\n" +
            "Вывести его строку-описание вида «четное двузначное число»,\n" +
            "«нечетное трехзначное число» и т. д.\n")
    print("Введите целое число[-999;999]: ")
    var number = readLine()!!.toInt()
    var string = ""
    if (number <= 999 && number >= -999) {
        if (number == 0) {
            string += "Нулевое число! "
        } else {
            if (number > 0) {
                string += "Положительное "
            } else {
                string += "Отрицательное "
            }
            if (number / 100 > 0) {
                string += "трехзначное "
            } else {
                if (number / 10 > 0) {
                    string += "двухзначное "
                } else {
                    string += "однозначное "
                }
            }
            if (number % 2 == 0) {
                string += "четное "
            } else {
                string += "нечетное "
            }
            string += "число!"
        }
        println(string)
    } else {
        print("Вы ввели неверное число!(Читайте условие)")
    }
}

fun When_Operator() {
    var stroka = readLine()!!.toInt()

    when {
        stroka < 0 -> println("Строка меньше нуля")
        stroka > 0 -> println("Строка больше нуля")
        stroka == 0 -> println("Строка равна нулю")
        else -> println("А такого быть не может!")
    }
}

fun When3() {
    print("Case3. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и т. д.).\n" +
            "Вывести название соответствующего времени года («зима», «весна», «лето», «осень»).\n")
    print("Введите номер месяца: ")
    var month = readLine()!!.toInt()
    when {
        month in 1..12 -> {
            print("Все норм")
            for (i in 1..3) {
                Thread.sleep(300);print(".")
            }
            print("Продолжаем!")
            when (month) {
                in 1..2 -> println("\nЗима. ")
                in 3..5 -> println("\nВесна. ")
                in 6..8 -> println("\nЛето. ")
                in 9..11 -> println("\nОсень. ")
                12 -> println("\nЗима. Декабрь")
            }
        }
        else -> {

            print("Так, погоди")
            for (i in 1..3) {
                Thread.sleep(300);print(".")
            }
            print("Алё! В году 12 месяцев!")
        }

    }

}

fun For3() {
    print("For3. Даны два целых числа begin и end (begin < end).\n" +
            "Вывести в порядке убывания все целые числа, расположенные между begin и end\n" +
            "(не включая сами числа), а также количество quantity этих чисел.\n")
    print("Введите начальное число: ")
    var begin = readLine()!!.toInt()
    print("Введите конечное число: ")
    var end = readLine()!!.toInt()

    var quantity = 0

    if (begin < end) {
        for (i in begin + 1..end - 1) {
            print("$i ")
            quantity++
        }
    } else {
        for (i in begin - 1 downTo end + 1) {
            print("$i ")
            quantity++
        }
    }

    println("\nКоличество чисел в выводе: $quantity")


}

fun Try_Catch_Test() {

    try {
        var num1 = readLine()!!.toDouble()
        var num2 = readLine()!!.toDouble()
        var num3 = 0.0
        num3 = num1 / num2
        println("Результат деления $num1 на $num2 = $num3")
    } catch (e: NumberFormatException) {
        print("Число вводи!")
    } catch (e: Exception) {
        print("Ошибка!")
    }
}


fun Undead_Console_Calculator_4_Operations() {
    /*Блок инициализации переменных*/
    var number1: Double = 0.0
    var number2: Double = 0.0
    var operation: String = ""
    var run = true
    var operation_counter = 1
    var buffer = 0

    Calc_Info()

    main_loop@ while (run){
        try {
            print("\n\nОперация №$operation_counter\n")
            print("Введите первое число: ")
            number1 = readLine()!!.toDouble()
            print("Введите второе число: ")
            number2 = readLine()!!.toDouble()

            print("Выберите операцию: ")
            operation = readLine().toString().toLowerCase()
            when (operation) {
                "+" -> println("Результат сложения: $number1+$number2 = ${number1 + number2}")
                "-" -> println("Результат вычитания: $number1-$number2 = ${number1 - number2}")
                "*" -> println("Результат умножения: $number1*$number2 = ${number1 * number2}")
                "/" -> println("Результат деления: $number1/$number2 = ${number1 / number2}")
                else -> println("Ошибка! Такая операция не предусмотрена!")
            }


            continue_loop@ while (run) {
                print("Хотите ли вы продолжить?[y/n]: ")
                operation = readLine().toString()
                when (operation) {
                    "y" -> continue@main_loop
                    "n" -> {
                        print("До свидания!")
                        break@main_loop
                    }
                    else -> {
                        continue
                        print("Ошибка!")
                    }
                }
            }
        } catch (e: NumberFormatException) {
            print("Нужно вводить только числа!")
        } catch (e: Exception) {
            print("Ошибка!")
        }
        operation_counter++ // инкремент +1
        // operation_counter-- // декремент -1
    }
}
fun Calc_Info() {
    print("Вас приветствует консольный калькулятор.\n" +
            "Я работаю по принципу последовательного ввода чисел и выбора операции с ними.\n" +
            "Введите первое и второе число. Выберите операцию, для ввода - нажмите Enter.\n" +
            "Предусмотренные операции вводятся с помощью кодовых слов или соответствующих символов\n" +
            "+ - сложение\n" +
            "- - вычитание\n" +
            "* - умножение\n" +
            "/ - деление\n" +
            "Приятного использования!\n")
}
