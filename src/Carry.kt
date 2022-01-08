abstract class Aircraft {
    constructor(number: Int, flight: Int, tank: Int) {
        this.number = number
        this.flight = flight
        this.tank = tank
    }

    protected var number: Int
        set(value) {
            if (value > 0)
                field = value
        }
    protected var flight: Int
        set(value) {
            if (value > 0)
                field = value
        }
    protected var tank: Int
        set(value) {
            if (value > 0)
                field = value
        }
    private val consuption: Float
        get(){
            return  tank/(flight/100).toFloat()
        }

    open val info: String
        get() = "Номер: $number\tДальность полета: $flight\tВместимость бака: $tank\tРасход на 100 км: $consuption"
}

interface Passenger {
    var peopleCapacity: Int
}

interface Carry {
    var carrying: Int
}