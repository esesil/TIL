## **Network**

#### reference : [쉽게 배우는 네트워크](https://youtube.com/playlist?list=PLFpZ7zSiHhPxrib8i4XPRKxB6FR9_NlCo)

---

## **4. 다중접속 프로토콜**

### 1. 다중접속(Multiple-access protocols)

### 멀티포인트 링크

- 매체를 여러 대의 시스템이 공유
- 데이터를 서로 보내는 과정에서 충돌 가능성
- 다수의 시스템이 공통 매체를 사용할 경우 매체 접근 문제를 해결해야 함

### 다중접속

- 다수의 시스템들이 매체를 공유하는 환경에서(멀티포인트 링크) 충돌 없이 데이터 전송해야 함  
  다중접속은 <u>링크를 여러 장치들이 공유하는 환경에서 전송을 시도하는 경우</u>를 의미
- 일반적으로 데이터링크 계층에서 수행, 두개의 부계층을 가짐.
  - 상위 부계층은 <u>데이터 링크를 제어</u> (ex. Error Control)
  - 하위 부계층은 <u>공유 매체에 대한 접근 문제를 해결</u>(Multiple-access resolution)
- 무작위 접근, 통제된 접근, 채널화 세 가지 방법

### 2. 무작위 접근(Random Access protocols)

- 특징
  - 서로 대등한 관계의 통신
  - 전송 시간을 정해두지 않음
  - 보낼 차례를 정하는 규칙이 없다(경쟁)
  - 충돌(collision)이 생길 수 있다
- ALOHA
- CSMA
  - 충돌 발생에 대한 절차가 명시 X
- CSMA/CD (CSMA with Collision Detection)
  - 충돌이 났을 경우 처리방안을 명시
  - 데이터를 전송한 시스템은 전송이 성공적으로 이루어지고 있는지 계속해서 매체를 감시함
    - 충돌이 감지(Collision Detection)되면 즉시 전송 중지
  - Start -> Set backoff to zero -> Persistence strategy -> Send the frame -> Collision?
    - Persistence strategy : 누군가 데이터를 보내고 있을 때 대처법과 타이밍 결정
- CSMA/CA(CSMA with Collision Avoidance)
  - CSMA/CD는 충돌시 에너지가 두 배가 되기 때문에 감지 가능
  - 무선네트워크는 에너지 손실로 인해 충돌 감지가 어려움
  - 충돌을 피하기 위해 CSMA/CA에서는 3가지 기법을 사용
    - IFS(InterFrame Space) : 데이터를 바로 보내지 않고 잠시 기다리는 기간 (채널이 빈 경우라도 다른 시스템이 이미 데이터를 전송 중에 있을 수 있으므로)
    - 충돌 윈도우(Contention window) : 데이터를 보내기 전에 기다리는 시간(a random number of slots)
    - ACK(Acknowledgments) : 데이터를 수신한 시스템이 보내는 응답. ACK가 없을 경우 송신 시스템은 데이터가 유실되었다고 판단함.

### 3. 통제된 접근(Controlled-access protocols)

- 특징
  - 누가 데이터를 전송할 수 있는지 정해주는 통제 존재
- Reservation : 데이터 전송을 사전에 예약함
- Polling : 데이터 전송을 물어봄 (중재자 존재)
- Token passing : 토큰을 가져야 전달 가능

### 4. 채널화(Channelization protocols)

- 특징
  - 링크를 시간, 주파수, 코드로 나누어서 여러 개의 채널을 만들고 이들을 서로 다른 시스템들이 이용하는 방법
- FDMA(Frequency-Division Multiple Access) : 주파수를 나누어 채널 사용
- TDMA(Time-Division Multiple Access) : 시간을 나누어 채널 사용
- CDMA(Code-Division multiple Access) : 코드를 나누어 채널 사용
