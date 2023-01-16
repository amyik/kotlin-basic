- Kotlin에 `static` 키워드가 없다.
- 대신 `companion object`를 이용해 java의 `static`처럼 클래스 인스턴턴스 없이 변수나 함수를 호출한다.

```kotlin
fun main() {
    println(SomeClass.accessPrivateVar())
}

class SomeClass {
    companion object {
        private val privateVar = "private variable value"
        fun accessPrivateVar() = "Accessing private variable $privateVar"
    }
}
```

- `companion object` 의 function은 private constructor 호출이 가능하다.
- `companion object`로 Factory Pattern 구현이 가능하다.

```kotlin
fun main() {
    val instance = SomeClass.getInstance("hello")
    println(instance.strProperty)
}

class SomeClass private constructor(val strProperty: String){
    companion object {
        fun getInstance(str: String): SomeClass {
            return SomeClass(str)
        }
    }
}
```