
$5 + 10CHF = $10 (환율이 2:1일 경우)

~~$5 * 2 = $10~~

amount 를 private 로 만들기

~~Dollar 부작용(side effect) ?~~
- Dollar에 대해 연산을 수행한 후에 해당 Dollar의 값이 바뀐다
- times()에서 새로운 객체를 반환하게 한다면 ?

Money 반올림 ?

----
최대한 빨리 초록색을 보기 위해 취할 수 있는 두가지
1. 가짜로 구현하기
- 상수를 반환하게 만들고 진짜 코드를 얻을 때 까지
- 단계적으로 상수를 변수로 바꾸어 간다.
2. 명백한 구현 사용하기
- 실제 구현을 입력한다.