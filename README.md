# Java-Study
자바 문제풀이 정리

- 홀수/짝수 판별하기
</br>
조건 1. while문 사용(for문 사용금지)
</br>
조건 2. (/, %) 연산자 사용금지
</br>
조건 3. boolean 타입으로 리턴(홀수면 true, 짝수면 false)
</br></br>
public class Solve { </br>
while((num & 1) == 1) {</br>
odd = true;</br>
break; </br>
} </br>
</br>
while((num & 1) != 1) { </br>
odd = false; </br>
break; </br>
} </br>
return odd; </br>
} </br>
}
