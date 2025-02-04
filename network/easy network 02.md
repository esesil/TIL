## **Network**

#### reference : [쉽게 배우는 네트워크](https://youtube.com/playlist?list=PLFpZ7zSiHhPxrib8i4XPRKxB6FR9_NlCo)

---

## **2. 네트워크 모델과 표준 프로토콜**

### 1. 계층화의 개념

### 계층화의 개념

- 사람 사이 대화의 과정 : 생각 -> 언어 -> 입(물리적 전송장치) -> 귀(물리적 수신장치) // 생각, 언어, 물리계층
- 계층화 장점 : 특정 계층의 내용을 다른 것으로 바꿔도 다른 계층의 영향을 받지 않는다.  
  특정 영역을 부품 갈아 끼우듯 **교체 가능**

### 2. 네트워크 모델

_목표 : OSI 표준 모델(7개)과 인터넷 모델(5개)_

### OSI 표준 모델 : 일곱 개 계층

- OSI(Open Systems Interconnection) : 개방형 시스템을 서로 연결하는 모델
- 개방형 시스템 : 표준 프로토콜에 따라 만든 시스템, 서로 다른 기종의 두 컴퓨터간 연결 가능
- Physical -> Data link -> Network -> Transport -> Session -> Presentation -> Application

### TCP/IP 프로토콜(인터넷) : 다섯 개 계층

- Physical -> Data link -> Network -> Transport -> Application
- 물리 계층
  - 장치 연결부분의 물리적인 특성 명시
  - 비트의 전기적, 혹은 광학적 표현
  - 데이터의 속도, 비트의 동기화, 토폴로지, 전송모드, 선로 구성에 관한 사항 명시
  - data link layer에서 받은 메세지를 0,1의 비트로 매체에 맞춰 보내준다.
- 데이터링크 계층
  - <u>에러제어</u> : 비트에 대한 에러검출과 복구
  - 흐름제어 : 장치의 수신능력 이상으로 비트들이 유입되지 않도록 조절 (컴퓨터 간 속도 조절)
  - 접근제어 : 여러 장치들이 동일한 링크를 공유할 때 충돌이 발생하지 않도록 조정
  - 데이터링크에서 유통되는 메세지 단위 : frame
- 네트워크 계층
  - 초기 송신지에서 최종 수신지로 데이터를 전달하는 계층.
  - 송수신 주소를 명시하고 라우팅을 수행함.
    - <u>라우팅</u> : 패킷을 최종 목적지로 경로 설정  
      (송신지에서 수신지에 이르는 여러 경로 중 어느 하나를 선택하는 과정)
- 수송 계층
  - 프로세스(실행 중인 프로그램) 간의 데이터 송수신 기능
  - 송신지에서 보낸 전체 메시지가 온전하게 최종 목적지로 전달 되도록 한다
  - 연결제어, 종단간(수송계층 이상은 네트워크 마지막 시스템인 종단시스템에 상주하기 때문) 흐름제어 및 에러제어
- 네트워크 계층과 수송계층 차이
  - 네트워크 계층은 **라우팅**까지 책임지고 (목적지까지 가는 것)  
    그 안의 프로그램들은 **수송계층에서 담당** (이 프로그램이냐 저 프로그램이냐 정리해주고 온전하게 메세지 보내고...)
- 응용 계층
  - FTP, Talnet, SMTP, HTTP 등 다양한 네트워크 서비스 존재
    - FTP(File Transfer Protocol) : 파일을 송수신하는 프로토콜
    - SMTP(Simple Mail Transfer Protocol) : 전자우편을 주고받는 프로토콜
    - Telnet : 원격지 접속 프로토콜
    - HTTP(Hypertext Transfer Protocol) : World Wide Web 서비스를 제공하는 프로토콜

### 3. 표준 프로토콜

_목표 : 프로토콜의 의미와 표준화 기구_

- 프로토콜 : 데이터를 주고 받는데 이용되는 <u>규칙의 집합</u>
- De facto 표준 : 이미 많이 사용하고 있어 사실상 표준으로 채택된 프로토콜(TCPI)
- De jure 표준 : 의사소통을 가능하도록 임의로 만들어낸 프로토콜
  - 표준화 기구 : ISO, ITU-T, IEEE, EIA, ANSI 등
