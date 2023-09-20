# Описание работы
1. POST-запрос осуществляется по адресу 127.0.0.1:8080/getInfo
2. Передаётся JSON с одним полем year, значением которого является год. Например: {"year": 2016}.
3. В ответ приходит JSON с двумя полями: year и isLeap, которое содержит значение "YES", если год високосный, иначе "NO". Например: {"year": 2016, "isLeap": "YES"}.
# Как запустить
1. git clone https://github.com/psevdomatematik/demo.git
2. cd demo
3. mvn install
4. java -jar target/demo-0.0.1-SNAPSHOT.jar
