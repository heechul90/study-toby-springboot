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