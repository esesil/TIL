## **Network**

#### reference : [쉽게 배우는 네트워크](https://youtube.com/playlist?list=PLFpZ7zSiHhPxrib8i4XPRKxB6FR9_NlCo)

---

## **9. 이동전화와 위성네트워크**

### 1. 이동전화

_목표 : 이동전화 서비스 구조와 4G에 이르는 시대별 진화_

#### 이동전화

- 각 이동전화 서비스 영역은 **cell**이라 불리는 작은 영역으로 나누어져 있다.
- 각 셀은 **기지국**(Base Station)으로 제어된다.
- 각 기지국은 **MSC**(Mobile Switching Center)로 제어된다.
- MSC는 기지국과 전화국 사이에 통신을 조절한다. ex) 전화연결, 요금관련 처리 등

#### 주파수 재사용

- 셀에서 신호의 출력을 조절하게 되면 동일 주파수를 재사용할 수 있다.

#### Handoff

- 이동전화가 한 셀에서 다른 셀로 이동하는 것을 말한다. 이때, 신호가 한 셀에서는 약해지게 되며 MSC는 통신하기 적절한 다른 셀을 찾는다.
- Hard handoff
  - 이전 기지국과의 통신을 우선 단절하고 새로운 기지국과의 연결을 시도한다.
  - 새로운 기지국 자리가 없으면 통화가 끊김, 그래서 최근엔 다 Soft handoff 사용.
- Soft handoff
  - 이전 기지국과의 통신을 단절하기 전에 새로운 기지국과의 연결을 시도한다. 이동 단말이 동시에 두 기지국과 연결한다.

#### First Generation

- 1세대 휴대전화는 **아날로그** 통신을 하는 것으로 보내는 주파수와 받는 주파수를 정해 놓고 기지국을 통해 아날로그로 서로 받는 형태
- Advanced Mobile Phone System (AMPS)
  - 순방향 채널과 역방향 채널 2개의 아날로그 채널을 사용했던 방식
  - FDMA를 사용하여 각 채널당 주파수를 단말에 할당
  - AMPS는 800MHz 주파수 밴드에서 동작
  - 순방향(base station to mobile station)채널과 역방향(mobile station to base station) 채널 등 2개의 아날로그 채널을 사용

#### Second Generation

- 2세대는 주로 디지털화된 음성 신호를 위해 설계됨
- Global System for Mobile Communication(GSM)은 유럽표준, 다양한 1세대 이동전화를 대체하기 위해 개발됨
- CDMA(Code Division Multiple Access)는 GPS(Global Positioning System)을 사용하고 SMS(Short Message Service)를 사용하게 되었으며, 인터넷 사용이 가능하게 됨.

#### Third Generation

- 3세대는 디지털 데이터와 음성통신을 위해 설계 됨.
- 음성 품질이 기존 전화망에 견줄만하게 됨.
- 데이터 전송 속도가 2Mbps까지 빨라짐. 인터넷 접속이 원활해짐.
- CDMA에서 확장한 Wideband CDMA와 북미 표준인 CDMA2000으로 나타났다.

### 2. 위성 네트워크

_목표 : 궤도의 위치에 따른 분류와 특징_

- 위성 : 지구위에 떠 있는 인공위성

#### 위성 네트워크

인공위성을 이용한 통신 형태를 말하며, 지구를 도는 궤도의 위치에 따라서 **GEO, MEO, LEO** 3가지로 구분된다

- GEO(Geosynchronous Earth Orbit)은 가장 지구에서 멀리 위치, MEO(Medium-Earth Orbit), LEO(Low-Earth Orbit)순으로 가까이 위치함
- 이렇게 위치가 다른 건 2개의 Van Allen 벨트 때문
  - Van Allen 벨트 : 하전입자를 갖는 계층
  - 이 벨트에 인공위성이 위치하면 하전입자에 의해 파괴될 수 있다.

#### GEO Satellites

정지궤도 위성, 지구의 자전속도와 동일하게 움직임.  
북극에서 봤을 때 각 위성이 120도 차이로 존재

#### MEO Satellites

2개의 Van Allen벨트 사이에 위치하며 6~8시간에 한 번씩 지구를 6개의 궤도로 24개의 위성이 돌고있다.  
**GPS**로 주로 사용한다. GPS는 4개의 위성으로부터 정보를 받아야 위치 계산이 가능하다. (평면 3개, 공간에선 고도때문에 4개)

#### LEO Satellites

지구와 가장 가까이 인접해 있기 때문에 가장 빨리 돈다. 전파지연이 적어 **음성통신**에 주로 사용됨. 왕복 전파지연시간이 20ms 이내이다.
