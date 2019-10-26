# gradle-multi-module-example
Gradleでマルチモジュールのプロジェクトを作ってみる・

## プロジェクトの構成

プロジェクトの構成は1つのライブラリモジュールを1つのコマンドラインアプリケーション（batch）と2つのWebアプリケーション（webapp、webservice）で参照する以下の様な構成

```bash
gradle-multi-module-example
├ core        # batchとwebappで共用するモジュール
├ batch       # batch アプリケーションのモジュール
├ webapp      # Webアプリケーションのモジュール
└ webservice  # Webサービスのモジュール
```

- code - webapp、webservice、batch から参照されるライブラリモジュール
- batch - SpringBoot を利用したコマンドラインアプリケーション
- webapp - SpringBoot を利用したのWebアプリケーション
- webservice - SpringBoot を利用したのWebアプリケーション

## リファレンス

- [Creating a Multi Module Project](https://spring.io/guides/gs/multi-module/#setting-up-the-library-project)
- [Creating Multi-project Builds](https://guides.gradle.org/creating-multi-project-builds/)
- [Authoring Multi-Project Builds](https://docs.gradle.org/current/userguide/multi_project_builds.html)
- [Gradle で Spring Boot 2 のマルチプロジェクト](https://qiita.com/opengl-8080/items/6409669dc3f8b8071af4)
- [Building a Multi-Module Spring Boot Application with Gradle](https://reflectoring.io/spring-boot-gradle-multi-module/)
- [spring-guides/gs-multi-module](https://github.com/spring-guides/gs-multi-module)
- [spring-projects/spring-framework](https://github.com/spring-projects/spring-framework)
