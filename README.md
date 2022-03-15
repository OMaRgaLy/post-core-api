# post-core-api
Homework "post-core-api" at DAR Academy.

Задание выполненое по следующим условиям.

1 Создать Spring Boot проект для доставки почты (post-core-api)

Проект post-core-api - сервис для обслуживания клиентов почтового отделения. 

Перейти на официальный сайт https://start.spring.io/ для генерации проекта 
Заполнить поля и добавить зависимости:
Spring Web,
Validation,
Lombok (optional). 
Скачать сгенерированный проект.
Открыть проект с помощью IDE IntelliJ Idea. 

2 Реализовать логику веб-сервиса для проекта post-core-api 
2.1 Контроллер PostController. 
   
- Проверка работоспособности проекта (вывод строки "post-core-api is working") Метод GET /post/check;
        
- Отправить посылку Метод POST /post;
        
- Получить список всех посылок Метод GET /post/all;

- Просмотреть статус посылки по ID Метод GET /post/{postId};

- Изменить данные о посылке по ID Метод PUT /post/{postId};

- Удалить данные о посылке по ID Метод DELETE /post/{userId};

2.2 Модель PostModel: 

- String postId - ID посылки - поле обязательное к заполнению (@NotNull) 

- String clientId - ID клиента - поле обязательное к заполнению (@NotNull) 

- String postRecipientId - ID получателя - поле обязательное к заполнению (@NotNull) 

- String postItem - Наименование посылки 

- String status - Статус заказа

// Можете также добавить свои поля и дополнительные проверки для них

2.3 Реализовать RESTful методы для проекта post-core-api сервиса PostService и его имплементации PostServiceImpl: 

- Метод createPost() для создания заказа посылки

- Метод getAllPosts() для вывода списка посылок

- Метод getPostById() для вывода данных о посылке по ID

- Метод updatePostById() для обновления данных о посылке по ID

- Метод deletePostById() для удаления данных о посылке по ID
