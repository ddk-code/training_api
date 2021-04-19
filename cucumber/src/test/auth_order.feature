Feature: Requests in a specific Order
  Correct order: auth purchase payment payment

  Scenario: Successful request to /auth (POST)
    Given User sends a request to /auth (POST)
    When User sends a request to /auth (POST) with the first request
    Then the server replies that the user is successfully authorized

  Scenario: Unsuccessful request to / auth (POST)
    Given User sends a request to / auth (POST)
    When User sends a request to / auth (POST) with the first request
    Then the server replies that the operation is incorrect and you need to choose another one

    #  @Success
#  Scenario: Sunday isn't Friday
#    Given Пользователь отправляет запрос на /auth (POST)
#    When Пользователь отправляет запрос на /auth (POST) первым запросом
#    Then Тогда сервер отвечает что пользователь успешно авторизован
#
#  @Fail
#  Scenario: Sunday isn't Friday
#    Given Пользователь отправляет запрос на /auth (POST)
#    When Пользователь отправляет запрос на /auth (POST) первым запросом
#    Then Тогда сервер отвечает что операция неверная и надо выбрать другую