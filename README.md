# 자동차 경주 게임 - 김경준

## 구현할 기능 목록

- ### OutputView
  - [x] 결과 메세지 출력
  - [x] 결과 출력
  - [x] 우승자 출력

- ### InputView
  - [x] Car name 입력
  - [x] 게임 진행 횟수 입력

- ### InputHandler
  - [x] Car name 쉼표 기준 구분
  
- ### InputValidator
  - [x] ',' 사이에 문자가 존재하지 않을 경우
  - [x] 중복된 이름을 입력할 경우
  - [x] 5자를 초과하는 이름을 입력 한 경우
  - [x] 시도 횟수가 자연수가 아닐 경우
  - [x] 공백을 입력 할 경우
  
- ### RacingGame
  - [x] Car 생성 기능

- ### Rule
  - [x] 전진 & 멈춤 판단 기능
  - [x] 우승자 판단 기능

- ### Car
  - [x] getName, getPosition 메소드
  - [x] 자동차 전진 기능

## Game Logic
1. 사용에게 Car Name 입력
2. Car 생성
3. 시도 횟수 입력
4. 전진 & 멈춤 판단
    - 전진일 경우 Car Position 증가
5. 결과 출력

## 기능 요구사항

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

## 프로그램 실행 결과

```
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
crong : -
honux : -

pobi : --
crong : -
honux : --

pobi : ---
crong : --
honux : ---

pobi : ----
crong : ---
honux : ----

pobi : -----
crong : ----
honux : -----

pobi, honux가 최종 우승했습니다.
```

## 프로그래밍 요구사항 - 객체

- 다음 Car 객체를 활용해 구현해야 한다.
- Car 기본 생성자를 추가할 수 없다.
- name, position 변수의 접근 제어자인 private을 변경할 수 없다.
- 가능하면 setPosition(int position) 메소드를 추가하지 않고 구현한다.

```java
public class Car {
  private final String name;
  private int position = 0;
  
  public Car(String name) {
    this.name = name;
  }
  
  // 추가 기능 구현
}
```

