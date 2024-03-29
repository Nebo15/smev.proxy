Адрес сервера http://46.101.155.216:8080/(test|prod)

Авторизация
===========

BASIC user:secret

Сервисы
=======

## Сервис предоставления сведений об ИНН физического лица на основании полных паспортных данных по запросу органов исполнительной власти

СМЭВ код SID0003450, [документация](http://smev.gosuslugi.ru/portal/services.jsp#!/F/LABSlicenzobraz/1.00/testSmev/SID0003450)
Входные параметры описаны в таблицах (4.1 - 4.6) документации СМЭВ

### Индивидуальный запрос

GET|POST `/inn`

Примеры запросов:

POST запрос:

```json
{
   "СвЮЛ": {
      "ИННЮЛ": "7825497650",
      "НаимОрг": "Нагрузочное тестирование",
      "ОГРН": "1037843048880"
   },
   "СвФЛ": {
      "ФИО": {
         "Имя": "ПЕТР",
         "Фамилия": "ЧАХЛОВ",
         "Отчество": "АЛЕКСЕЕВИЧ"
      },
      "МестоРожд": "РОССИЯ,,ГОРЬКОВСКАЯ ОБЛ.,АРЗАМАССКИЙ Р-Н,,НИКОЛЬСКОЕ С., ,,,",
      "ДатаРожд": "12.07.1954",
      "УдЛичнФЛ": {
         "ВыдДок": "АРОВД",
         "ДатаДок": "16.11.2002",
         "КодВидДок": "21",
         "СерНомДок": "22 02 919928"
      }
   }
}
```

Обязательные поля:
* `СвЮЛ.*`
* `СвФЛ.ДатаРожд`
* `СвФЛ.ФИО.Имя`
* `СвФЛ.ФИО.Фамилия`
* `СвФЛ.УдЛичнФЛ.КодВидДок` - [СПРАВОЧНИК "ВИДЫ ДОКУМЕНТОВ, УДОСТОВЕРЯЮЩИХ ЛИЧНОСТЬ НАЛОГОПЛАТЕЛЬЩИКА”  (СПДУЛ)](docs/SPDUL.DOC)
* `СвФЛ.УдЛичнФЛ.СерНомДок`

Пример запроса

```shell
curl "http://46.101.155.216:8080/inn" -H "Content-Type: application/json;charset=UTF-8" --data-binary "{""СвЮЛ"": {""ИННЮЛ"": ""7825497650"", ""НаимОрг"": ""Нагрузочное тестирование"", ""ОГРН"": ""1037843048880""}, ""СвФЛ"": {""ФИО"": {""Имя"": ""ПЕТР"", ""Фамилия"": ""ЧАХЛОВ""}, ""МестоРожд"": ""РОССИЯ,,ГОРЬКОВСКАЯ ОБЛ.,АРЗАМАССКИЙ Р-Н,,НИКОЛЬСКОЕ С., ,,,"", ""ДатаРожд"": ""12.07.1954"", ""УдЛичнФЛ"": {""ВыдДок"": ""АРОВД"", ""КодВидДок"": ""21"", ""СерНомДок"": ""22 02 919928""}}}" --compressed`
```

или GET запрос:

`http://46.101.155.216:8080/test/inn?СвЮЛ.ИННЮЛ=7825497650&СвЮЛ.НаимОрг=Нагрузочное тестирование&СвЮЛ.ОГРН=1037843048880&СвФЛ.ДатаРожд=12.07.1954&СвФЛ.МестоРожд=РОССИЯ,,ГОРЬКОВСКАЯ ОБЛ.,АРЗАМАССКИЙ Р-Н,,НИКОЛЬСКОЕ С., ,,,&СвФЛ.ФИО.Имя=ПЕТР&СвФЛ.ФИО.Фамилия=ЧАХЛОВ&СвФЛ.УдЛичнФЛ.ВыдДок=АРОВД&СвФЛ.УдЛичнФЛ.КодВидДок=21&СвФЛ.УдЛичнФЛ.СерНомДок=22 02 919928`

Пример ответа:

```json
{
   "data": "520205004556"
}
```

Пример не удачного ответа:

```json
{
   "data":{
      "error":{
         "message":"по заданным сведениям о ФЛ не найдено ни одного либо найдено несколько ИНН ФЛ",
         "code":"90"
      }
   }
}
```

### Групповой запрос

POST `/inn/group`

Пример данных запроса:

```json
{
   "СвЮЛ": {
      "ИННЮЛ": "7825497650",
      "НаимОрг": "Нагрузочное тестирование",
      "ОГРН": "1037843048880"
   },
   "Запрос": [
      {
         "СвФЛ": {
            "ФИО": {
               "Имя": "ПЕТР",
               "Фамилия": "ЧАХЛОВ",
               "Отчество": "АЛЕКСЕЕВИЧ"
            },
            "МестоРожд": "РОССИЯ,,ГОРЬКОВСКАЯ ОБЛ.,АРЗАМАССКИЙ Р-Н,,НИКОЛЬСКОЕ С., ,,,",
            "ДатаРожд": "12.07.1954",
            "УдЛичнФЛ": {
               "ВыдДок": "АРОВД",
               "КодВидДок": "21",
               "СерНомДок": "22 02 919928"
            }
         }
      }
   ]
}
```

Обязательные поля:
* `СвЮЛ.*`
* `Запрос.СвФЛ.ДатаРожд`
* `Запрос.СвФЛ.ФИО.Имя`
* `Запрос.СвФЛ.ФИО.Фамилия`
* `Запрос.СвФЛ.УдЛичнФЛ.КодВидДок`
* `Запрос.СвФЛ.УдЛичнФЛ.СерНомДок`

Пример ответа (идентификатор групового запроса):

```json
{
    "data": "459911"
}
```

### Получение результата группового запроса

GET `/inn/group/<идентификатор групового запроса>`

Пример запроса:

`http://46.101.155.216:8080/test/inn/group/459913`

Пример ответа:

```json
{
   "data":[
      {
         "идЗапрос":"1",
         "ИННФЛ":"520205004556"
      }
   ]
}
```


## Валидация СНИЛС

СМЭВ код SID0003822, [документация](http://smev.gosuslugi.ru/portal/services.jsp#!/F/SPFRvalidasiyasnils/3.00/p00smev/SID0003822)

POST `/snils`

Параметры с примером данных:

```json
{
   "fio": {
      "firstName": "ЕЛЕНА",
      "lastName": "ПЕТИНА",
      "patronymic": "ВЛАДИМИРОВНА"
   },
   "snils": "027-733-198 62",
   "gender": "M",
   "birthDate": "22-12-1988"
}
```

Обязательные поля:
* `fio.firstName`
* `fio.lastName`
* `fio.patronymic` - Обязательно при наличии у застрахованного лица
* `snils`

Успешный ответ:
```json
{
   "result": "true"
}
```

Безуспешный ответ:
```json
{
   "fault": {
      "code": "SKMV-SNILS-0001",
      "message": "СНИЛС не соответствует контрольной сумме"
   }
}
```

## Сервисный концентратор ФМС России

[Документация](http://smev.gosuslugi.ru/portal/services.jsp#!/F/2356SKFMS/1.00/p00smev/SID0003418)

### Загрузка словарей

GET `fms/dictionary/{code}`

Примеры кодов: `DOC_STATUS`, `INVALIDITY_REASON`, `REGION_CODE`

Пример данных запроса:

```json
{
   "user":{
      "organization":"10000001022",
      "person":{
         "firstName":"Тест",
         "lastName":"Тестов",
         "secondName":"Тестович"
      }
   }
}
```

Обязательные поля:
* `user` - Пользователь (организация), представляющий запрашивающую сторону
* `user.organization` - Код запрашивающего ФОИВа – заполняется в соответствии с приложением 4.4.3
* `user.person.*`

Пример ответа:

```json
```

### Проверка действительности паспорта

Проверка действительности Паспорта Гражданина РФ по серии и номеру.

Синхронный

В документации: 3.2	Тип P001:	Проверка действительности паспорта

POST `/fms/passport`

Пример данных запроса:

```json
{
   "user":{
      "organization":"10000001022",
      "person":{
         "firstName":"Тест",
         "lastName":"Тестов",
         "secondName":"Тестович"
      }
   },
   "passport":{
      "DOC_SERIE":"0274",
      "DOC_NUMBER":"123456",
      "DOC_ISSUEDATE":"10.01.2008"
   }
}
```

Обязательные поля:
* `user` - Пользователь (организация), представляющий запрашивающую сторону
* `user.organization` - Код запрашивающего ФОИВа – заполняется в соответствии с приложением 4.4.3
* `user.person.*`
* `passport.DOC_SERIE` - Серия паспорта
* `passport.DOC_NUMBER` - Номер паспорта

Пример ответа с ошибкой (из документации: 4.3 Приложение 3. Коды ошибок):

```json
{
   "data": {
      "errorCode": -1,
      "errorDescription": "Техническая ошибка обработки входящего SOAP сообщения"
   }
}
```



### Расширенная Проверка действительности паспорта

Проверка действительности паспорта гражданина Российской Федерации, предъявленного на определённое имя

Асинхронный

В документации: 3.3	Тип P002:	Проверка действительности паспорта (расширенная)

#### Отправка асинхронного запроса

POST `/fms/passport/extended`

Пример данных запроса:

```json
{
   "user": {
       "organization": "10000001022",
       "person": {
          "firstName": "Тест",
          "lastName": "Тестов",
          "secondName": "Тестович"
       },
   },
   "passport": {
       "CITIZEN_FIRSTNAME": "Иван",
       "CITIZEN_GIVENNAME": "Иванович",
       "CITIZEN_LASTNAME": "Иванов",
       "CITIZEN_BIRTHDAY": "10.10.1978"
       "DOC_SERIE": "8888",
       "DOC_NUMBER": "444444",
       "DOC_ISSUEDATE": "10.10.2008",
       "DOC_ISSUER": "120012",
       "REGION_CODE": "4000"
   }
}
```

Обязательные поля:
* `user` - Пользователь (организация), представляющий запрашивающую сторону
* `user.organization` - Код запрашивающего ФОИВа – заполняется в соответствии с приложением 4.4.3
* `user.person.*`
* `passport.CITIZEN_LASTNAME`
* `passport.CITIZEN_FIRSTNAME`
* `passport.CITIZEN_BIRTHDAY`
* `passport.DOC_SERIE` - Серия паспорта
* `passport.DOC_NUMBER` - Номер паспорта
* `passport.DOC_ISSUEDATE` - Дата выдачи документа
* `passport.DOC_ISSUER` - Код выдавшего подразделения

Пример ответа:

```json
{
   "data": {
      "taskId": "T-0001"
   }
}
```

#### Проверка результата

GET `/fms/extended/{taskId}`

Пример ответа:

```json
```

### Операция «Известить об ошибке»

Метод используется для извещения ФМС России о некорректной информации, обнаруженной в одном из базовых реестров ФМС России в результате исполнения одного из запросов.

POST `error_report/{taskId}`

Тело запроса: сообщение об ошибке.

```json
{
   "user": {
      "organization": "10000001022",
      "person": {
         "firstName": "Тест",
         "lastName": "Тестов",
         "secondName": "Тестович"
      }
   },
   "errorReport": "Сообщение о ошибке"
}
```