# demo-a-contract

Insurance platform PoC, A안(clone + upstream merge)의 비즈니스 프로젝트 `contract`.

- upstream: https://github.com/khkim6040/demo-a-platform (`git remote add upstream`, 태그는 가져오지 않음)
- 플랫폼 변경 반영: `git fetch upstream && git merge upstream/main`
- 패키지: `io.github.khkim6040.contract.*` (플랫폼 코드 `io.github.khkim6040.platform.*`은 그대로)

빌드: `./gradlew build` (JDK 25). 릴리스: `deploy/overlays/dev/kustomization.yaml`의 `newTag`를 올려 커밋한 뒤 `git tag api-v0.1.0 && git push origin api-v0.1.0`.

## 수정 금지 (upstream 소유)

`platform/**`, `build-logic/**`, `gradle/**`, 루트 빌드 파일, `apps/*/build.gradle.kts`, `Dockerfile`, `.github/**`, `deploy/base/**`. 이 파일들은 upstream 머지로만 바뀐다. `deploy/base`의 이미지 이름은 overlay의 `newName`으로 덮는다. `rootProject.name`은 `demo-a-platform`으로 남으며 빌드 산출물·이미지 경로에 영향이 없다.

## 프로젝트 소유

`apps/*/src/**`, `libs/**`, `deploy/overlays/**`, 이 README.
