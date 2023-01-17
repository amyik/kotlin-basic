## Loop

### for loop
- range operator `..`로 범위를 지정
- `in`으로 range 존재 여부 확인

```kotlin
    val intRange = 1..5
    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"

    println(1 in intRange) // true
    println('b' in charRange) // true
    println("ABCDA" in stringRange) //true

    val backwardIntRangeWrong = 5..1
    println(3 in backwardIntRangeWrong) // false; 5 <= 3 <=1 검사를 수행

    val backwardIntRange = 5.downTo(1)
    println(3 in backwardIntRange) // true

    println(3 in intRange.reversed()) // true
    println(3 in backwardIntRangeWrong.reversed()) // false
    
    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    
    println(2 in stepThree) // false
    println(3 in stepThree) // true
    println(4 in stepThree) // false
    println(6 in stepThree) // true
    println(15 in stepThree) // true
    println(16 in stepThree) // false
```

- `!in` not in operator
```kotlin
    val intRange = 1..5
    println(1 !in intRange) //false
```

- for문의 사용
```kotlin
    for (n in 1..5) { // 1 2 3 4 5
        println(n)
    }

    for (n in 5..1) { // print nothing
        println(n)
    }

    for (n in (1..5).reversed()) { // 5 4 3 2 1
        println(n)
    }

    for (ch in "hello") {
        println(ch)
    }

    for (n in 1..20 step 3) { // 1 4 7 .. 19
        println(n)
    }

    for (n in 20 downTo 10) {
        println(n)
    }
    
    for (n in 1 until 10) { // 1 .... 9
        println(n)
    }
```