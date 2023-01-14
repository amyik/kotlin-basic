

- When an inline function is compiled, its body is directly substituted for the function call.
- 성능 향상을 위해 inline 함수를 사용하며, lambda 파라미터(function type)를 가진 함수의 경우 성능 향상이 크다.

- `functionTobeInlined`이름을 가진 함수를 호출 하는 코드가 있다.
```kotlin
fun main() {
    normalFunction()
    functionTobeInlined()
}

fun normalFunction() {
    println("function called")
}

inline fun functionTobeInlined() {
    println("function to be inlined")
}
```

- byte code를 java로 decompile하면 inline함수인 `functionTobeInlined`의 body가 호출부인 `main` 함수에 치환되어 있다.
```java
public final class InlineFunctionKt {
   public static final void main() {
      normalFunction();
      int $i$f$functionTobeInlined = false;
      String var1 = "function to be inlined";
      System.out.println(var1);
   }

   // $FF: synthetic method
   public static void main(String[] var0) {
      main();
   }

   public static final void normalFunction() {
      String var0 = "function called";
      System.out.println(var0);
   }

   public static final void functionTobeInlined() {
      int $i$f$functionTobeInlined = 0;
      String var1 = "function to be inlined";
      System.out.println(var1);
   }
}
```