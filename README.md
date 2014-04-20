Groovyノススメ
===================

## アジェンダ

* Groovyとは
* テストコードにGroovyを使うのを勧める理由
* Groovy導入までのステップ
* ツールの紹介
* 質疑応答


## 自己紹介

* `#agilesamurai #横浜道場`
* `#tddbc`
* `#yokohamagroovy`


## Groovyとは

http://groovy.codehaus.org/Japanese+Home

より抜粋

* ほとんどゼロの学習曲線で、現代的なプログラミング機能を
  Java開発者が利用できるようになります。

* ドメイン固有言語(DSL)をサポートし、
  その他の構文もコンパクトなので、
  読みやすくメンテナンスしやすいコードになります。

* シームレスに既存のあらゆるJavaクラスとライブラリを統合できます。

* 直接Javaバイトコードにコンパイルされるため、
  Javaを利用できる環境ならどこでも利用可能です。


## テストコードにGroovyを使うのを勧める理由

### JUnit実践入門 第7章 テストフィクスチャ


> もし、外部リソースを使わずに宣言的なフィクスチャのセットアップを行いたいならば、
Groovyの導入をお勧めします。

>Groovyを使えば、Javaのクラスに対して宣言的なコードを書く事が出来るようになります。

> GroovyをJavaのテスト用ライブラリとして利用しても、プロダクションコードに全く影響を与えません。

> ユニットテストのフィクスチャセットアップに限定して利用するならば、
学習コストもほとんどかかりません。

> 可読性の高いテストコードを書くためにGroovyの導入を検討してみてください。


```groovy
class BookStoreGroovyTestHelper {
	static Book Bookオブジェクトの生成_MartinFowlerのRefactoring() {
		new Book(
			title: "Refactoring",
			price: 4500,
			author: new Author(
				firstName: "Martin",
				lastName: "Fowler"
			)
		)
	}
}
```

渡辺修司 「JUnit実践入門 ── 体系的に学ぶユニットテストの技法」技術評論社 2012年 P.118 - 119

http://gihyo.jp/book/2012/978-4-7741-5377-3


## Groovy導入までのステップ

### 導入編: JUnitのテストコード

JUnitでテストコードを書いてみます。


### 初級編: JUnitをそのままGroovyにする。

JUnitのテストをコピーして、Groovyで動かしてみます。


### 中級編: Groovyでテストコードを書く。

メソッド名の文字列化して書いてみます。

失敗するテストで、power-assertの表現力を見てみます。


### 上級編: SpockとTheoriesの比較をする。

予めJUnitのTheoriesで書かれたテストコードを見てみます。

簡単にSpockのテストコードを書いてみます。

その際に失敗するテストで、Spockでのpower-assertを見てみます。


## ツール紹介

### Gradleの紹介

【東京】 JJUG&JGGUG 共催ナイトセミナ 「4.30 2時間で分かる！次世代ビルドツールの本命Gradleの全貌」

http://jjug.doorkeeper.jp/events/10618


### Groovyを使うためのIDEの紹介

* Eclipse
	- Groovy/Grails Tool Suite™
	- https://spring.io/tools/ggts

* IntelliJ IDEA
	- http://www.jetbrains.com/idea/

	- Ultimate Edition
		+ 30日間試用可能

	- Community Edition
		+ 機能制限があるが、Groovyは使用可能。


## 質疑応答


## 番外編: Gebの紹介
