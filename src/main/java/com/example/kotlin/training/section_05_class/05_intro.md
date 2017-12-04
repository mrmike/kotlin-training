# Class

```kotlin
class Person(val name: String, val age: Int)
```
* Very concise class declaration
* Constructor with two arguments
* Class with two fields
* Supporting named arguments and default values
```kotlin
val person = Person("Bob", 20)
println(person.name) // prints "Bob"
println(person.age) // prints 20
person.age = 35 // compile error, final field
```
* no `new` keyword
* no getter methods
* use `var` in constructor to make field non-final

## Objects
```kotlin
object Logger {

    fun log() { // ... }
}
```
* Singleton

## Delegation pattern
* Kotlin support delegation on language level
```kotlin
interface Connection { ... }
  
class TracingConnection(private val original: Coonnection) : Connection by original {
    // override only the methods you need 
}  
```

## Data class
```kotlin
data class Person(val firstName: String, val lastName: String, val age: Int)
```
* Generated `equals()/hashCode()`
* Readable `toString()` message
* `copy()` function
```kotlin
val person = Person("Bob", "Foo", 20)
val copyOfBob = person.copy(age = 35) 
```

## Sealed class
It's like enum on steroids.
```kotlin
sealed class Error

data class AuthError(val message: String) : Error()
data class ServerError(val code: String) : Error()
data class TimeoutError(val timeout: Long) : Error()
```

```kotlin
    fun getErrorMessage(error: Error): String {
        return when (error) {
            is AuthError -> "Auth error: ${error.message}"
            is ServerError -> "${error.code} server error"
            is TimeoutError -> "Timeout (${error.timeout}) was exceeded"
        }
    }
```
* Smart casts
* All types has to be handled
* Introducing new type will cause compile error
* It's not recommended to use else clause 