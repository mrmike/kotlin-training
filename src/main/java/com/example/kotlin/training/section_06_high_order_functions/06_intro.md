# High order functions
In Kotlin we can treat function type as any other type.

```kotlin
fun <T> filterList(list: List<T>, filterFunc: (T) -> Boolean): List<T> {
    return list.filter { item -> filterFunc.invoke(item) }
}
```
```kotlin
val names = listOf("Alice", "Bob")
val filteredList = filterList(names, { name -> name.length > 4 })
```

## Lock example
```kotlin
fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}
```

# Standard library functions
### apply
```kotlin
fun <T> T.apply(block: T.() -> Unit): T
```

### with
```kotlin
fun <T, R> with(receiver: T, block: T.() -> R): R 
```

### let
```kotlin
fun <T, R> T.let(block: (T) -> R): R 
```