# study-toby-springbooot

1. 스프링 부트 살펴보기
2. 스프링 부트 시작하기
3. 독립 실행형 서블릿 애플리케이션
    1. Containerless 개발 준비
    2. 서블릿 컨테이너 띄우기
    3. 서블릿 등록
        - 웹 클라이언트가 서블릿 컨테이너에게 요청을 해서 해당 작업을 서블릿에게 알려주는것을 매핑(Mapping)이라고 한다.
        - Request
          - Request Line : Method, Path, HTTP Version
          - Headers
          - Message Body
        - Response
          - Status Line : HTTP Version, Status Code, Status Text
          - Headers
          - Message Body
    4. 서블릿 요청 처리
    5. 프론트 컨트롤러
        - 모든 서블릿에 공통적인 코드를 처리하는 부분
          - 인증/보안, 다국어 등등 공통적인 사항을 처리한다.
    6. 프론트 컨트롤러로 전환
    7. Hello 컨트롤러 매핑과 바인딩 
4. 독립 실행형 스프링 애플리케이션
    1. 스프링 컨테이너 사용
        - 스프링 컨테이너는 Your Business Objects(POJOs)와 Configuration Metadata 가 필요하다
        - 스프링 컨테이너가 두 가지를 조합해서 내부의 빈을 구성해서 서블릿 애플리케이션을 만든다.용
    2. 의존 오브젝트 추가
        - 스프링 컨테이너는 하나의 오브젝트만 만들고 이것을 계속 사용한다.
        - 이것을 싱글톤이라고 한다.
        - 역할에 따라서 기능을 계속 만든다.
    3. Dependency Injection
        - HelloController 는 SimpleHelloService 에 의존하고 있다.
          - SimpleHelloService 의 변경에 따라 HelloController 는 영향을 받는다.
        - HelloController 는 HelloService interface 를 두고 SimpleHelloService 와 ComplexHelloService 구현체를 따로 만든다.
        - 외부에서 HelloCo용ntroller 가 사용할 수 있게 Assembler(조립)을 한다.
        - 스프링 컨테이너가 빈으로 등록하고 주입을 해준다.
    4. 의존 오브젝트 DI 적용
    5. DispatcherServlet 으로 전환 
    6. 애노테이션 매핑 정보 사용
    7. 스프링 컨테이너로 통합
    8. 자바코드 구성 정보 사용
        - 팩토리 메소드 사용해서 빈을 등록한다.
    9. @Component 스캔
    10. Bean 의 생명주기 메소드 