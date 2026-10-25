# demo-a-platform

Insurance platform PoC, A안(Fork + Upstream Merge)의 플랫폼 레포이자 참조 모노레포.

- `apps/{api,admin,consumer,batch}`: 독립 실행·배포되는 네 앱 (api 8080, admin 8081, consumer·batch는 웹 서버 없음)
- `libs/domain`: Spring에 의존하지 않는 계약 도메인
- `platform/http-starter`: Correlation ID, ProblemDetail, 기본 프로퍼티를 제공하는 스타터
- `platform/observability-starter`: Actuator, Prometheus, OpenTelemetry tracing 기본값
- `platform/resilience-starter`: Resilience4j Circuit Breaker·Retry 기본값
- `build-logic`: 컨벤션 플러그인 `platform.kotlin-library`, `platform.spring-boot-app`
- `deploy/`: Kustomize (`base`는 플랫폼 소유, `overlays`는 프로젝트 소유)

빌드: `./gradlew build` (JDK 25). 이미지: `./gradlew :apps:api:bootJar && docker build --build-arg APP=api .`
릴리스: `deploy/overlays/dev`의 태그를 올려 커밋한 뒤 `git tag api-v0.1.0 && git push --tags`.

A안 비즈니스 프로젝트의 수정 금지 파일: `platform/**`, `build-logic/**`, `gradle/**`, 루트 빌드 파일, `apps/*/build.gradle.kts`, `Dockerfile`, `.github/**`, `deploy/base/**`.
