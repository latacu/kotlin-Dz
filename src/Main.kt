
fun main() {
  var balance = 10000
    var minussum = 0
    var itog = 0
    var run = true
    while (run) {
        println("1. Посмотреть баланс")
        println("2. Снять деньги")
        println("3. Пополнить счет")
        println("4. Выйти")
        val vibor =readln().toInt()

        when (vibor) {
            1 -> println("Ваш баланс - ${balance}")
            2 -> {
                println("Ввидите сумму  снятия -")
                val  sum = readln().toInt()
                if (sum < balance) {
                    balance -= sum
                    println("Вы сняли ${sum} c своего  баланса ")
                    println("На данный момент баланс состовляет ${balance}")
                }else{
                    println("Невозможно соверишить операцую ")
                }

            }
            3 -> {
                println("Ввидите сумму пополнения ")
                val  sum = readln().toInt()
                if (sum > 0){
                    balance += sum
                    println("ВЫ пополнили баланс на ${sum}")
                    println("Ваш баланс состовляет ${balance}")
                }
            }
            4 -> {
                println("До свидание ")
                run = false
                }

            }

        }


    }
