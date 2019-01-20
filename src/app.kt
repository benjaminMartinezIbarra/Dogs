class Dog (val name: String, weight_param: Int, breed_param: String) {

    init {
        print("Dog $name has been created")
    }
    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    init {
        println("The breed is $breed")
    }

    var weight = weight_param
    set(value) {
        if (value > 0) field = value
    }

    val weightInKgs : Int
    get() = (weight/2.2).toInt()


    fun bark(){
        println(if (weight > 20) "woof" else "wuaf")
    }
}

fun main(args : Array<String>) {

    var myDog = Dog("Fido", 70, "Mixed")
    myDog.bark()
    myDog.weight = 75
    println("Weight in kgs is ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Weight is ${myDog.weight}")
    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for ((indice, item) in myDog.activities.withIndex()) {
        println("$indice My dog enjoys $item")
    }

    var dogs = arrayOf(Dog("toto", 20, "Westie"), Dog("Ripper", 10, "Poodle"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}