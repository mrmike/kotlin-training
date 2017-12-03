# Basic syntax

## Hello Kotlin
```kotlin
fun main(args: Array<String>) {
    println("Hello Kotlin")
}
```
* Use fun to declare function
* Declare parameter name first then specify type
* No semicolons
* Implicit return type

## Return type  
```kotlin
fun greetings(): String {
    return "Hello Kotlin"
}
```
* Explicit return type
* Returned type defined after function name

## Single line function
```kotlin
fun greetings() = "Hello Kotlin"
```
* No curly braces
* Return type is implicit again(but not Unit in this case)

## Named arguments and default values
```kotlin
fun greetings(capitalize: Boolean = true, name: String = "Kotlin") {
    if (capitalize) {
        println("Hello ${name.capitalize()}")
    } else {
        println("Hello $name")
    }
}

// say hello
fun main() {
    greetings(name = "michał")
}
```
* You can define default values for function arguments
* When using named arguments then order does not matter
* Use `$` for String formatting