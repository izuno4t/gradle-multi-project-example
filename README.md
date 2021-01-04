# gradle-multi-project-example

Gradleでマルチモジュールのプロジェクトを作ってみる。

[![Build Status](https://travis-ci.com/izuno4t/gradle-multi-project-example.svg?branch=master)](https://travis-ci.com/izuno4t/gradle-multi-project-example)
[![codecov](https://codecov.io/gh/izuno4t/gradle-multi-project-example/branch/master/graph/badge.svg?token=DQScUGx3cz)](https://codecov.io/gh/izuno4t/gradle-multi-project-example)


## 構成

- Java11
- SpringBoot2.4
- Gradle6.6

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

## 静的解析

- Checkstyle の実行

    ```bash
    ./gradlew checkstyleMain
    ```

- PMD の実行

    ```bash
    ./gradlew pmdMain
    ```

- CPD の実行

    ```bash
    ./gradlew cpdCheck
    ```

- SpotBugs の実行

    ```bash
    ./gradlew spotbugsMain
    ```

## ToDo

- batch、webapp、webservice でそれぞれ異なるバージョンの core に依存させる場合どうやるのか？
  - maven ならローカルもリモートも依存関係の記述の仕方が一緒だけど、gradle は書き方が異なる。
- 依存するSpringBootのバージョンを変更したいときはどうするのか？

## リファレンス

- [Creating a Multi Module Project](https://spring.io/guides/gs/multi-module/#setting-up-the-library-project)
- [Creating Multi-project Builds](https://guides.gradle.org/creating-multi-project-builds/)
- [Authoring Multi-Project Builds](https://docs.gradle.org/current/userguide/multi_project_builds.html)
- [Gradle で Spring Boot 2 のマルチプロジェクト](https://qiita.com/opengl-8080/items/6409669dc3f8b8071af4)
- [Building a Multi-Module Spring Boot Application with Gradle](https://reflectoring.io/spring-boot-gradle-multi-module/)
- [spring-guides/gs-multi-module](https://github.com/spring-guides/gs-multi-module)
- [spring-projects/spring-framework](https://github.com/spring-projects/spring-framework)
- [jaredsburrows/android-gradle-java-multi-module-template](https://github.com/jaredsburrows/android-gradle-java-multi-module-template)
- [project-aries/gradle-multi-project-example](https://github.com/project-aries/gradle-multi-project-example)
- [Multiple projectなgradleのprojectでcheckstyle pluginを有効にする](https://moznion.hatenadiary.com/entry/2017/09/07/194913)
- [codecov/example-gradle](https://github.com/codecov/example-gradle)
- [codecov/example-java](https://github.com/codecov/example-java)
- [Travis CI tutorial Java projects](https://blog.frankel.ch/travis-ci-tutorial-for-java-projects/)
