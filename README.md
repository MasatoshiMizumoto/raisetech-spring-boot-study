# RaiseTech Spring Boot Study App

## 環境

- Project: Gradle - Groovy
- Java: 17
- Spring Boot: 2.7.7

## ローカル環境DB

```shell
$ cd docker-my-sql
$ docker-compose up -d
```

## 設計

|Method| Path   | Query String | Response(sample)                                                   |
|:---|:-------|:-------------|:-----------------------------------|
|GET| /names | (none)         | ["koyama","enami","noda","akamatsu"]                               |
