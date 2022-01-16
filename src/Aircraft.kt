class Aircraft {
    var number: Int = 70
    var flight: Int = 13000
    var tank: Int = 2000
    val consuption: Float
        get() = tank/(flight/100).toFloat()
}