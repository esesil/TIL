## **Network**

#### reference : [쉽게 배우는 네트워크](https://youtube.com/playlist?list=PLFpZ7zSiHhPxrib8i4XPRKxB6FR9_NlCo)

---

## **5. LAN에서 사용하는 매체**

### 1. 전송매체의 종류

- 전송 매체는 에너지(신호)를 전달하는 물질, 네트워크에서도 전송자와 수신자 사이에 매체가 존재
- 매체는 물리계층과 연결되어 있음. 디지털, 아날로그 신호를 매체에서 수용하여 전달

### 2. 유도매체 (Guided Media, wired)

> 유선! 신호를 한 장치에서 다른 장치로 전달하는 관(pipe) 같은 역할을 하는 매체  
> 사용빈도 TP > 광섬유(최근 뜨고 있음) > 동축 케이블

- 꼬임선(Twisted-pair cable)
  - 두 개의 도체가 절연체를 감싸고 꼬인 것. LAN 테이블, 전화선 등
  - 신호는 두 개의 선(한 쌍)이 있어야 전달됨, 가는 신호/오는 신호
  - 비닐 피복(절연체)가 두 개의 신호가 서로 영향 받지 않게 함
  - 선이 꼬여있는 이유? 잡음의 영향을 균등하게 받기 위해
  - UTP(Unshielded Twisted-pair) 케이블 : 가장 흔하게 사용. 각 꼬임 쌍을 덮지 않은 것
    - 품질에 따라 여러 등급으로 나뉨.
    - CAT3은 10Mbps 이내, CAT5는 100Mbps(CAT5 가장 많이 쓰임)
    - 숫자가 높을수록 품질이 좋다(CAT5 > CAT3)
  - STP(Shielded Twisted-Pair) 케이블 : 외부잡음을 막기 위해 각 꼬임 쌍을 덮은 것
    - pair별로 외부 잡음을 막는 Metal shield를 갖고 있다
    - 안정적 통신의 서버 및 Gbps를 사용할 때 쓰임
  - TP의 커넥터 : RJ45(RJ stands for Registered Jack) 커넥터가 많이 사용됨
- 동축 케이블(Coaxial cable)
  - TP 케이블보다 높은 주파수의 신호를 전달
  - but 감쇄가 심해서 많이 이용되지 않음
  - 구리선(내외부 도체), 절연체(도체 사이), 비닐피복(외부)로 구성
  - BNC T 커넥터 : T자형 커넥터, 동축 케이블 연결
  - DB15 커넥터 : 랜카드에 연결된 커넥터
- 광섬유 케이블(Fiber-optic cable)
  - 빛 신호를 전달하는 케이블
  - 열이 없고 대역폭이 넓어 고속 전송 가능. 매체 중 가장 고속으로 전송.
  - 해저 케이블, 유선 통신 등 많은 영역에서 다양하게 사용
  - 빛 신호가 코어(core)를 따라 클래딩(cladding)에 반사되며 보내짐
  - SC connector, ST connector, MT-RJ connector

### 3. 비유도매체 (Unguided Media, wireless)

> 무선! 물리적 도체 없이 신호를 전달하는 매체

- Free space(공기)
- 라디오파 : 3KHz~1Ghz, 다방향성
- 마이크로파 : 1GHz~300GHz, 단방향성
- 적외선
