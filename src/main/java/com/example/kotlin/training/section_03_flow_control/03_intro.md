# Flow control
* Supporting “standard” if, for, while
* `when` is an equivalent to switch-case in Java
* Supporting ranges like `for (i in 1..100)`
* Collections operators

## If
```kotlin
fun len(input: Any) {
    if (input is String) {
        println(input.length) // calling String's method
    } else {
        // Do sth else
    }
}
```
* Any is like Java Object
* 
* Smart cast

## When 
```kotlin
fun dayOfWeek(day: Int): String {
    return when (day) {
        0 -> "Monday"
        1 -> "Tuesday"
        2 -> "Wednesday"
        3 -> "Thursday"
        4 -> "Friday"
        else -> "Weekend"
    }
}
```
* Support for else branch 

# Collections
* Kotlin supports standard Java collections

```kotlin
val langs = listOf("Java", "Kotlin", "Javascript") // Java's List<String>
langs.add("Go") // compile error - immutable list
```
* Implicit `List<String>` type 
* By default list is immutable
* Sets and maps works in similar manner(use `setOf`, `mapOf`)
```kotlin
val langs = mutableListOf("Java", "Kotlin", "Javascript")
langs.add("Go") // OK
```
* Use `mutableList(Set/Map)Of` to create mutable collection

## Nullability in collections
* Be careful where you put nullable type - `?`
```kotlin
val list: List<String> // non-nullable list of non-nullable values
val list: List<String?> // non-nullable list of nullable values
val list: List<String>? // nullable list of non-nullable values
val list: List<String?>? // nullable list of nullable values
```

## Collections operators
```kotlin
fun map(items: List<String>): String {
    return items
            .filter { it.length > 10 }
            .map { item -> item.toUpperCase() }
            .map(String::toLowerCase)
            .first()
}
```