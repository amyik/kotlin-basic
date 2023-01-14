# Inheritance 

- class상속을 하는 방법은 `자식 class의 이름` 뒤에 `: 부모class이름`을 붙이면 된다.
```kotlin
class Parent {
}

class Child : Parent {
}
```
- 그런데 두 가지 이유에서 오류가 난다.
  1. Kotlin에서 모든 것의 기본 값은 `pulbic`이며 `final`이다.
  2. 자식 class는 부모의 생성자를 호출해야 한다.

- 해결법은
  1. 상속을 사용하려면 부모 class는 `final`이 아니어야 하므로 `open` 키워드를 사용한다.
  2. 부모 class의 생성자를 호출하도록 한다.
```kotlin
open class Parent { //0. default primary constructor가 존재한다.
}

class Child1 : Parent() { //1. 부모 생성자 호출 - 간결한 방법
}

class Child2 : Parent { //2. 부모 생성자 호출 - 덜 간결한 방법
  constructor() : super()
}
```

- 부모 class가 생성자에서 초기화 되는 field를 가지면 부모의 생성자 호출 시 field에 대응하는 argument를 함께 넘겨준다.
```kotlin
open class Parent(val lastName: String) {
}

class Child1(lastName: String) : Parent(lastName) {
}

class Child2 : Parent {
    constructor(lastName: String) : super(lastName)
}
```

- 부모 class가 `abstract`라면 `open`키워드는 불필요하다. 당연히 final이 아니므로.
```kotlin
abstract class Parent(val lastName: String) {
}

class Child1(lastName: String) : Parent(lastName) {
}

class Child2 : Parent {
  constructor(lastName: String) : super(lastName)
}
```

- 부모 class에 정의된 함수를 자식 class에서 override하려면
- 자식 class의 함수에 override 키워드 추가한다.
- 부모 class의 함수에 open 키워드를 추가한다.
```kotlin
abstract class Parent(val lastName: String) {
    open fun sayLastName(): String { // to make this method non-final
        return "Parent's lastname is $lastName"
    }
}

class Child1(lastName: String) : Parent(lastName) {
    override fun sayLastName(): String {
        return "Child1's lastname is $lastName"
    }
}
```