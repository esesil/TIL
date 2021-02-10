## **Network**

#### reference : [쉽게 배우는 네트워크](https://youtube.com/playlist?list=PLFpZ7zSiHhPxrib8i4XPRKxB6FR9_NlCo)

---

## **7. 무선 LAN : Ethernet**

### 1. 무선 LAN 구조

_목표 : Infrastructure 모드와 ad hoc 모드_

- 무선 LAN은 BSS와 ESS라는 두종류의 서비스를 지원한다.
- BSS(Basic Service Set) : 하나의 API내에서의 서비스, 무선랜을 사용하는 기본영역의 단위, 2개의 모드가 있다. 눈에 보이진 않지만 AP를 중심으로 무선 접속 가능한 영역이라고 이해하면 된다. (우리집 와이파이, 핸드폰 등 가운데에 공유기! 그 영역이 BSS)
  - Infrastructure모드 : **AP(Access Point)**라는 중앙의 기지국을 이용하는 모드(Ap는 유무선공유기라고 생각하면 됨)
  - Ad hoc모드 : AP가 없는 모드(무선)
- 연결된 BSS(우리집, 옆집)의 전체 덩어리를 **ESS**라고 부른다. (Extended Service Set), 각각의 BSS가 해당 AP의 관리 하에 존재한다.

### 2. MAC 부계층

_목표 : DCF와 PCF의 기능과 동작_

- 데이터링크 계층은 LLC, MAC으로 나뉘고 MAC은 무선에서 DCF, PCF로 나뉜다.
- 무선랜 표준 IEEE 802.11

#### PCF, DCF의 기능

- PCF(Point Coordination Function)는 선택사항으로 복잡한 접근제어를 수행하며 반드시 AP가 있어야 한다(infrastructure 모드에서만 운용이 가능). 즉, ad hoc 모드에선 안 된다.
  - PCF는 중간에 컨트롤러가 있어서 통제기능을 가진다. ad hoc은 통제가 없어서 안 되고, ap가 있으면 통제가 가능하니까... PCF를 사용하게 되면 제어를 통해 경쟁(contention)이 발생하지 않는다. 누가 보내야 할지 순번을 정해서 고정시켜주기 때문에.
- DCF(Distributed Coordination Function)는 CSMA/CA를 사용한다. (CSMA/CD는 유선랜, CSMA/CA는 무선랜)
- 구조 : LLC sublayer -> PCF MAC(Optional) -> DCF MAC -> Physical layer

#### 무선랜에서 CSMA/CD 사용하지 못하는 이유

1. 신호가 약해져서 다른 컴퓨터에서 발생한 충돌을 감지 못할 수 있음 (무선랜에선 충돌을 피해야 함)
2. 숨겨진 단말기 문제(Hidden Terminal 문제)로 충돌을 인지 못한다.

- B가 A로 데이터를 보낼 때, C는 이 신호를 들을 수 없다. 따라서 C는 A로 데이터를 보내게 된다. 그 결과 A에서 충돌이 발생한다. B와 C는 A에 대해 서로 숨겨져 있다.  
  C가 얘기하고 있는데 못듣고 B가 소릴 보내고 B가 얘기하고 있는데 C는 못듣고 소릴 보내고... A는 무슨소리지 어리둥절
- CSMA를 쓴다고 해서 신호를 보장받지 못한다. 내가 못들은 걸수도 있으니까.. 아무도 말 안하는 줄 알고 데이터를 보냈는데 내가 감지를 못했을 뿐일 수 있음. 즉 신호가 잡히지 않는다고 매체가 유휴하다고 확인할 수 없다. 이 상태에서 데이터 계속 보내면 충돌 계속 일어남.
- 이 문제를 해결하기 위해 **RTS(Request To Send)**와 **CTS(Clear To Send)**를 주고받는 과정이 필요. 데이터를 보내기 전에 RTS를 보내고 CTS로 확인해 충돌 회피(CTS는 B,C 모두에게 보내짐)
- CSMA/CA동작 흐름도 : 데이터를 보내기 전 busy 상태면 기다림 -> busy가 끝나면 쉬었다가 RTS 전송 -> CTS 받은 뒤 데이터 전송 -> ACK 기다림 -> 반복...
- 이렇게 흐름이 기다림이 많고 복잡하기 때문에 같은 속도라도 유선이 더 효율적이다

#### Point Coordination Function

- PCF는 선택사항으로 infrastructure 네트워크에서만 운용이 가능함
- 보통 시간에 민감한 전송(time-sensitive transmission) 하고자 할 때 사용 (계속 충돌이 나면 데이터를 못보낼 수 있음. 그런데 반드시 데이터가 가야하는 응용프로그램이 있을 경우 반드시 데이터 보낼 수 있는 걸 보장해주자)
- 중앙 집중식으로 충돌이 발생하지 않도록 **폴링 방법**을 사용
  - 무선 LAN의 컴퓨터들이 AP에 의해 하나씩 차례로 폴링되며, 이때 AP로 데이터를 전송할 수 있다.

### 3. Bluetooth

_목표 : 기능과 링크의 종류_

서로 다른 기기들이 무선으로 통신하기 위해 고안된 기술이다. AP가 없는 ad hoc 네트워크임.

- IEEE 802.15
- LAN보다 작은 커버리지를 갖는 네트워크를 구성할 때 유용

#### Piconet

- 블루투스 장비들끼리 연결된 네트워크, 8개의 시스템으로 구성되며 하나는 마스터(primary)가 되고 나머지는 종속시스템(secondaries 또는 slaves)이 된다.
- 마스터와 종속시스템 사이에 2가지 형태의 링크가 존재함. SCO 링크, ACL 링크
  - Synchronous Connection-Oriented (SCO) 링크 : 실시간 음성과 같이 지연이 에러보다 중요한 경우에 사용됨, 휴대전화 및 이어폰
  - Asynchronous Connectionless Link (ACL) 링크 : 데이터에 에러가 발생하지 않도록 무결성이 중요한 경우에 사용됨, 키보드
