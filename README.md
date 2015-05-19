Адрес сервера http://46.101.155.216:8080/test

Авторизация
===========

Каждый запрос должен содержать два параметра `api_key` и `api_secret`

Сервисы
=======

## Сервис предоставления сведений об ИНН физического лица на основании полных паспортных данных по запросу органов исполнительной власти

СМЭВ код SID0003450, [документация](http://smev.gosuslugi.ru/portal/services.jsp#!/F/LABSlicenzobraz/1.00/testSmev/SID0003450)
Входные параметры описаны в таблицах (4.1 - 4.6) документации СМЭВ

### Индивидуальный запрос

GET|POST `/inn`

Примеры запросов:

POST запрос с JSON:

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

```shell
curl "http://localhost:8080/inn?api_key=1&api_secret=1" -H "Content-Type: application/json;charset=UTF-8" --data-binary "{""СвЮЛ"": {""ИННЮЛ"": ""7825497650"", ""НаимОрг"": ""Нагрузочное тестирование"", ""ОГРН"": ""1037843048880""}, ""СвФЛ"": {""ФИО"": {""Имя"": ""ПЕТР"", ""Фамилия"": ""ЧАХЛОВ""}, ""МестоРожд"": ""РОССИЯ,,ГОРЬКОВСКАЯ ОБЛ.,АРЗАМАССКИЙ Р-Н,,НИКОЛЬСКОЕ С., ,,,"", ""ДатаРожд"": ""12.07.1954"", ""УдЛичнФЛ"": {""ВыдДок"": ""АРОВД"", ""КодВидДок"": ""21"", ""СерНомДок"": ""22 02 919928""}}}" --compressed`
```

или GET запрос:

`http://46.101.155.216:8080/test/inn?api_key=1&api_secret=1&СвЮЛ.ИННЮЛ=7825497650&СвЮЛ.НаимОрг=Нагрузочное тестирование&СвЮЛ.ОГРН=1037843048880&СвФЛ.ДатаРожд=12.07.1954&СвФЛ.МестоРожд=РОССИЯ,,ГОРЬКОВСКАЯ ОБЛ.,АРЗАМАССКИЙ Р-Н,,НИКОЛЬСКОЕ С., ,,,&СвФЛ.ФИО.Имя=ПЕТР&СвФЛ.ФИО.Фамилия=ЧАХЛОВ&СвФЛ.УдЛичнФЛ.ВыдДок=АРОВД&СвФЛ.УдЛичнФЛ.КодВидДок=21&СвФЛ.УдЛичнФЛ.СерНомДок=22 02 919928`

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

### Получение результата группового запроса

GET `/inn/group/<идентификатор групового запроса>`

Пример запроса:

`http://46.101.155.216:8080/inn/group/543901?api_key=1&api_secret=1`

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
   "snils": "027-733-198 62"
}
```

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

Пример ответа:

```json
```

### Проверка действительности паспорта

Проверка действительности Паспорта Гражданина РФ по серии и номеру.

Синхронный

В документации: 3.2	Тип P001:	Проверка действительности паспорта

POST `/fms`

Пример данных запроса (согласно документации):

```json
{
   "organization": "10000001022",
   "person": {
      "firstName": "Тест",
      "lastName": "Тестов",
      "secondName": "Тестович"
   },
   "DOC_SERIE": "0274",
   "DOC_NUMBER": "123456",
   "DOC_ISSUEDATE": "10.01.2008"
}
```

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

POST `/fms/extended`

Пример данных запроса (согласно документации):

```json
{
   "organization": "10000001022",
   "person": {
      "firstName": "Тест",
      "lastName": "Тестов",
      "secondName": "Тестович"
   },
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
```

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
   "organization": "10000001022",
   "person": {
      "firstName": "Тест",
      "lastName": "Тестов",
      "secondName": "Тестович"
   },
   "errorReport": "Сообщение о ошибке"
}
```