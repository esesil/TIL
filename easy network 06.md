## **Network**

#### reference : [쉽게 배우는 네트워크](https://youtube.com/playlist?list=PLFpZ7zSiHhPxrib8i4XPRKxB6FR9_NlCo)

---

## **6. 유선 LAN : Ethernet**

### 1. IEEE 표준 프로토콜

_목표 : 계층구조와 워킹 그룹_

- 미국 Xerox 팔로알토 연구소의 로버트 멧칼프가 발명
- 초기에 Digital Equipment, Intel, Xerox (DIX) 3사는 이더넷을 표준으로 제안, 미국 표준기구인 IEE에서 표준으로 정함. 이어 국제표준화기구인 ISO에서 국제표준으로 채택.
- 이더넷은 `LLC(Logical link control), MAC(Media access control)` 2개의 부계층을 가진다.
  - LLC 계층 : 매체의 특성 관계없이 공통적으로 사용하는 부분
  - MAC 계층 : 매체의 특성, 운용방식에 따라 여러 개의 프로토콜 존재(Ethernet, Token ring, Token bus)

### LLC

- LAN에서 흐름제어, 에러제어 등 각종 제어에 대한 행위를 수행함
- 모든 LAN에서 공통의 계층이다.
- 선택적 사용임. MAC 만으로도 해결 가능하기 때문
- IEEE : LAN의 유명한 표준 기관(미국) 학술활동 뿐 아니라 LAN의 표준을 만듦

### MAC

### 2. 이더넷

_목표 : 프레임구조, 주소지정, 프로토콜, 개발된 형태_

- 초기 이더넷은 10Mbps를 제공하였고 그 후 Fast Ethernet(100Mbps), Gigabit Ethernet(1Gbps), Ten-Gigabit Ethernet(10Gbps)로 발전함.

### 프레임 구조

- **이더넷 프레임 7개의 필드 구성**
  > (Preamble, SFD), Destination address, Source address, Length of type, Data and padding, CRC

앞의 Preamble, SFD는 제외하는 경우도 있음(5개의 필드). 이더넷의 필드라기 보단 물리계층에서 붙이는 것이기 때문에. 데이터 바로 보내면 수신측에서 놓칠 수 있기 때문에 임의로 첨가하는 비트임(총 8바이트), 그게 바로 Preamble(7바이트, 프레임이 곧 도착하니 준비하라), SFD(1바이트, 프레임의 시작을 알린다).

- Destination Addrdss : 목적지 주소(6바이트)
- SA필드(Source Address) : 송신자 주소(6바이트)
- Length/type 필드 : 데이터 필드의 길이, 네트워크 계층 프로토콜 명시(2바이트)
- Data and Padding : 최소 46바이트~최대 1500바이트
- CRC 필드 : 에러를 검출하는 기능 수행(4바이트)

### 주소 지정

LAN 카드 : 각 시스템은 NIC(Nework Interface Card)란 걸 갖고 있음  
LAN 카드는 주소가 설정되어 있음. MAC주소 = Ethernet 주소 = 하드웨어 주소

- 6바이트(48비트)로 이루어졌으며 보통 16진수로 표기함. ex) 06:01:02:01:2C:4B (6 bytes = 12 hex digits = 48 bits)
- 각 시스템마다 하나씩 할당되어 있다.
- 브로드캐스트 주소는 모든 비트가 '1'인 ff-ff-ff-ff-ff-ff로 구성된다.

### MAC 프로토콜 : CSMA/DE

이더넷은 1-persistent CSMA/CD를 사용한다. CSMA/CD의 기본 동작은 차례를 기다려 데이터를 보내고 충돌이 나면 즉시 전송 중지하는 것.

- 1-persistent : Busy인 동안 누가 데이터 보내는지 계속 체크함. 어느 순간 데이터를 보내지 않으면 바로 전송! 즉 다른 데이터 전송을 기다렸다가 끊기면 즉시 보낸다. 유선 LAN에서 사용한다.

### 이더넷의 형태

기본 10Mbps, 사용매체에 따라 여러 종류로 나뉜다.

- 10 Base 5 : Bus, thick coaxial
  - 처음 만들어진 이더넷, thick Ethernet or Thick net
  - 동축케이블을 여러 시스템들이 공유매체로 사용하는 LAN
  - 10Mbps, 베이스밴드 신호방식(TP나 동축케이블에 적용, 디지털 신호 형태로 전송하는 방식), 동축케이블 최대길이(세그먼트) 500m => (10Mbps Baseband 500meters)
  - 동축케이블의 LAN카드(NIK(Nework Interface Card))에서 나오는 케이블을 동축케이블에 연결해 사용
- 10 Base 2 : Bus, thin coaxial
  - 두 번째 개발된 형태. thin Ethernet or Cheaper net
  - 동축케이블을 여러 시스템들이 공유매체로 사용하는 LAN, 두께가 10BASE5보다 얇음
  - 10Mbps 속도, 베이스밴드 신호방식, 한 세그먼트가 185m => (10Mbps Baseband 약200meters)
  - BNC-T 커넥터 사용
- 10 Base-T : Star, UTP
  - 10Mbps, Baseband, Twisted pair cable
  - _HUB_ Lan에서 가장 많이 사용되는 네트워크 장비, 포트 수에 따라 16포트허브, 24포트 허브 등으로 불림.
- 10 Base-F : Star, fiber
  - Fiber Ethernet, 시스템과 허브를 광케이블로 연결

### 3. Fast 이더넷

기존의 이더넷보다 10배 빠른 것으로 10Mbps를 제공  
Fast Ethernet은 기존 이더넷과 호환된다.

- 프레임 형태, 최소/최대 프레임크기, 주소지정, CSMA/CD 사용 등이 모두 동일
- 버스 토폴로지를(10Base5, 10Base2, 동축 케이블) 사용하지 않고 스타형 토폴로지만(10BaseT, 허브) 사용

자동협상(Autonegotiation) 기능이 있어서 속도 조정 가능  
개발된 형태 3가지

- 100 Base-T4 : Two wires category 3 UTP
- 100 Base-TX : Two wires category 5 UTP
- 100 Base-FX : Two wires fiber

### 4. Gigabit 이더넷

Fast Ethernet보다 10배 빠름(1Gbps)  
이전 시스템과 호환 : 주소와 프레임형태, 최소/최대 프레임 크기 동일
개발된 형태 4가지

- 1000 Base-T : Four-wire UTP (UTP)
- 1000 Base-CX : Two-wire copper (STP)
- 1000 Base-LX : Two-wire long-wave fiber
- 1000 Base-SX : Two-wire short-wave fiber

Ten Gigabit Ethernet : 10Gbps로 속도가 상향되었으나 기존 이더넷, 고속 이더넷, 기가비트 이더넷과 서로 호환되도록 설계됨.  
48비트 주소, 프레임 형태, 최소/최대 프레임 크기 등 지원함.
