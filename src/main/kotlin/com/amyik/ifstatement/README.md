## IF

- java와 많이 다른 부분이 있다.
- ternary operator가 없어졌지만
- if 를 ternary 로 사용 가능하다.

## ternary operator
```kotlin
    val someCondition = true
    val num = if(someCondition) 50 else 32

    val num2 = if (someCondition) {
        println("when true")
        50
    } else {
        println("when false")
        32
    }
    println(num2) // 50
```