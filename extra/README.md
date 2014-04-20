番外編
==========

## ブラウザのテストを行う

## Gebとは

http://www.gebish.org


特徴として挙げられるのは、以下の3つ

* Selenium WebDriverのラッパー
* jQueryのように要素を指定できる
* Page Object Pattern 指向


## 準備

### ChromeDriverのダウンロード

https://code.google.com/p/selenium/wiki/ChromeDriver

* 以下のURLからOS毎のファイルをダウンロードする
    * http://chromedriver.storage.googleapis.com/index.html
* ダウンロードしたファイルを解凍する
* 解答したファイルを**drivers**ディレクトリへコピーする。
* **/src/test/resources/GebConfig.groovy**の*driverFileName*を修正する。


## テスト

`gradlew.bat test`

または、

`./gradlew test`

を実行


## 参考

geb/geb-example-gradle

https://github.com/geb/geb-example-gradle
