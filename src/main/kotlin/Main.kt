fun main() {
    val myCar = Vehicle("Toyota", "Corolla", 2022)
    myCar.drive()

    fun main() {
        val dog = Dog("Fido", 3)
        val cat = Cat("Whiskers", 2)
        val bird = Bird("Tweety", 1)

        dog.makeSound()
        dog.eat()

        cat.makeSound()
        cat.eat()
        bird.makeSound()
        bird.eat()
    }


}
//Create a class called Vehicle with properties make, model, and year, and a method drive().
// The drive() method should print a message indicating that the vehicle is being driven.
class Vehicle(val make: String, val model: String, val year: Int) {
    fun drive() {
        println("$make $model ($year) is being driven.")
    }
}

//"Create a class hierarchy for animals. Create a base
// class called Animal with properties name and age, and
//methods makeSound() and eat(). Create subclasses for different
// types of animals, such as Dog, Cat, and Bird, and override
// the makeSound() and eat() methods to be appropriate for each subclass.
open class Animal(val name: String, val age: Int) {
    open fun makeSound() {
        println("The $name makes a sound.")
    }

    open fun eat() {
        println("The $name is eating.")
    }
}

class Dog(name: String, age: Int): Animal(name, age) {
    override fun makeSound() {
        println("The $name barks.")
    }

    override fun eat() {
        println("The $name is eating dog food.")
    }
}

class Cat(name: String, age: Int): Animal(name, age) {
    override fun makeSound() {
        println("The $name meows.")
    }

    override fun eat() {
        println("The $name is eating cat food.")
    }
}

class Bird(name: String, age: Int): Animal(name, age) {
    override fun makeSound() {
        println("The $name chirps.")
    }

    override fun eat() {
        println("The $name is eating bird food.")
    }
}
