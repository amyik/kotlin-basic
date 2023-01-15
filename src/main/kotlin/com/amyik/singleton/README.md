## Singleton

- `object` 키워드를 사용하는 예 중 하나는 singleton

```kotlin
fun main() {
    println(Timer.getTimeInString())
    Thread.sleep(1000)
    println(Timer.getTimeInString())
}

object Timer {
    val time: String = LocalDateTime.now().toString()
    fun getTimeInString() : String = "The year is $time"
}
```