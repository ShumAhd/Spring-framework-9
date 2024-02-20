# Фреймворк Spring (семинары)
## Урок 9. Spring Cloud. Микросервисная архитектура.

### Домашнее задание

Разработайте микросервисную архитектуру для онлайн-магазина электроники с использованием Spring Cloud. Структура должна включать:

Сервис "Товары": Управление каталогом товаров (добавление, удаление, просмотр).

Сервис "Корзина": Добавление товаров в корзину, удаление товаров из корзины и оформление заказа.
Сервис "Отзывы": Добавление и просмотр отзывов на товары.

API Gateway: Централизованный вход для обработки всех запросов.

Используйте Eureka для обнаружения сервисов

# Модули
`Eureka Server:`

Этот модуль содержит Eureka Server, который является реестром сервисов для обнаружения и регистрации микросервисов. Eureka Server предоставляет централизованный механизм для мониторинга доступности сервисов и их распределения.

`Product Service:`

Модуль, ответственный за управление каталогом товаров. Здесь реализованы методы для добавления, удаления и просмотра товаров. Использует Spring Data JPA для взаимодействия с базой данных.

`Cart Service:`

Модуль, отвечающий за управление корзиной покупок. Здесь реализованы методы для добавления товаров в корзину, удаления товаров из корзины и оформления заказа. Также использует Spring Data JPA для взаимодействия с базой данных.

`Review Service:`

Модуль, предоставляющий функциональность для добавления и просмотра отзывов на товары. Пользователи могут оставлять свои отзывы на различные товары. Использует Spring Data JPA для взаимодействия с базой данных.

`API Gateway:`

Этот модуль является централизованным входом для обработки всех запросов к микросервисам. API Gateway обрабатывает запросы клиентов и маршрутизирует их к соответствующим микросервисам. Он также может предоставлять функции аутентификации и авторизации, а также дополнительные функции, такие как мониторинг и журналирование.