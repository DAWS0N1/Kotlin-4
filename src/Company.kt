fun main(args: Array<String>) {
    var activity = true
    val aircrafts = arrayListOf(Tu140(100, 3000, 270),
        Boeing747(747, 10000, 2000, 2000),
        An70(70, 12000, 3700, 12000)
    )

    while (activity) {
        println("""
Главное меню.
1. Информация о всех самолетах;
2. Показать все Боинги
3. Показать все АНы
4. Показать все ТУ
5. Выход
        """)
        when(readLine()) {
            "1" -> {aircrafts.stream().forEach {
                println(it.info)}}
            "2" -> {aircrafts.stream().forEach {
                if (it is Boeing747)
                    println(it.info)}}
            "3" -> {aircrafts.stream().forEach {
                if (it is An70)
                    println(it.info)}}
            "4" -> {aircrafts.stream().forEach {
                if (it is Tu140)
                    println(it.info)}}
            "5" -> {println("Завершение прогрммы")
                activity = false}
        }
    }

}