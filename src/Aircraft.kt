open class Aircraft {
    constructor(number: Int, flight: Int, tank: Int) {
        this.number = number
        this.flight = flight
        this.tank = tank
    }

    var number: Int
        set(value) {
            if (value > 0)
                field = value
        }
    var flight: Int
        set(value) {
            if (value > 0)
                field = value
        }
    var tank: Int
        set(value) {
            if (value > 0)
                field = value
        }

    val consuption: Float
        get() = tank/(flight/100).toFloat()
}