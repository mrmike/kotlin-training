# Extensions functions
Ability to extends a class with new methods or properties without inheritance. Kotlin standard library enriches 
Java API by heavily using extensions functions.

## Simple extension function
```kotlin
fun Int.daysAgo(): Long {
    val now = LocalDateTime.now()
    val localDateTime = now.minusDays(this.toLong())
    return localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli()
}
```
* Use `this` to refer to extended object. `this` can be omitted.
* Extension function is resolved statically
* Function does not have access to object internal state
* Extension function can be defined on nullable type `e.g. Int?`
```kotlin
// usage
val millis = 10.daysAgo() 
```