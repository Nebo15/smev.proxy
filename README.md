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

`http://46.101.155.216:8080/inn?api_key=1&api_secret=1&СвЮЛ.ИННЮЛ=7825497650&СвЮЛ.НаимОрг=Нагрузочное тестирование&СвЮЛ.ОГРН=1037843048880&СвФЛ.ДатаРожд=12.07.1954&СвФЛ.МестоРожд=РОССИЯ,,ГОРЬКОВСКАЯ ОБЛ.,АРЗАМАССКИЙ Р-Н,,НИКОЛЬСКОЕ С., ,,,&СвФЛ.ФИО.Имя=ПЕТР&СвФЛ.ФИО.Фамилия=ЧАХЛОВ&СвФЛ.УдЛичнФЛ.ВыдДок=АРОВД&СвФЛ.УдЛичнФЛ.КодВидДок=21&СвФЛ.УдЛичнФЛ.СерНомДок=22 02 919928`

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