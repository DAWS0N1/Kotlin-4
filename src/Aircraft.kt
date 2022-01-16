interface Passenger {
    var peopleCapacity: Int
}

interface Carry {
    var carrying: Int
}

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

    protected val consuption: Float
        get() = tank/(flight/100).toFloat()

    open val info: String
        get() = "Номер: $number\tДальность полета: $flight\tВместимость бака: $tank\tРасход на 100 км: $consuption"
}

class Boeing747: Passenger, Aircraft {
    constructor(number: Int, flight: Int, tank: Int, peopleCapacity: Int) : super(number, flight, tank) {
        this.peopleCapacity = peopleCapacity
    }

    override var peopleCapacity: Int
        set(value) {
            if (value > 0)
                field = value
        }

    override val info: String
        get() = super.info + "\tВместимость пасажиров $peopleCapacity"
}

class Tu140(number: Int, flight: Int, tank: Int) : Aircraft(number, flight, tank) {
    override val info: String
        get() = super.info
}

class An70: Carry, Aircraft {
    constructor(number: Int, flight: Int, tank: Int, carrying: Int) : super(number, flight, tank) {
        this.carrying = carrying
    }

    override var carrying: Int
        set(value) {
            if (value > 0)
                field = value
        }

    override val info: String
        get() = super.info + "\tГрузоподъемность $carrying"
}