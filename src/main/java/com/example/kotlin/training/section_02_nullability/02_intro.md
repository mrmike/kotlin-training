# Nullability
* Kotlin is trying to eliminate NPE
* Kotlin supports non-null/nullable types on language level
* All nullable types are marked with ? e.g. `String?`

## Nullable types
```kotlin
val name: String = null // compile error
val name: String? = null // ok
```
* Use `val` to declare value and `var` to declare variable
```kotlin
val name: String? = null // ok
name.toUpperCase() // compile error
name?.toUpperCase() // ok, no NPE
name!!.toUpperCase() // NPE
```
* You have to use safe call `?.` to safely call method on object with nullable type
* Use `!!` to explicitly convert object to non-null type(**Don't do it**)

## Handling nullability
```kotlin
fun toUppercase(name: String?): String {
    return if (name != null) {
        name.toUpperCase()
    } else {
        "Default value"
    }
}
```
* `name: String?` means that function accepts null as an argument
* No need to use `?.` if null check is applied
* return keyword is moved outside if clause
```kotlin
fun toUppercase(name: String?): String {
    return name?.toUpperCase() ?: "Default value"
}
```
* Use Elvis operator `?:` to use non-null default value
* Elvis operator is useful in chained calls
```kotlin
fun toUppercase(name: String?) = name?.toUpperCase() ?: "Default value"
```
* Elvis operator allow us to simplify function further and write it as one-liner