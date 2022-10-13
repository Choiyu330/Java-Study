# Java-Study
자바 문제풀이 정리

Ex)
- 홀수/짝수 판별하기
```java
// 조건 1. while문 사용(for문 사용금지)
// 조건 2. (/, %) 연산자 사용금지
// 조건 3. boolean 타입으로 리턴(홀수면 true, 짝수면 false)

public class Solve {
  while((num & 1) == 1) {
    odd = true;
    break;
  }

  while((num & 1) != 1) {
    odd = false;
    break;
  }
  return odd;
}
```
