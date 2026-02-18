##  Descrição do Projeto

**Padrao-Projetos** é uma aplicação desenvolvida em **Spring Boot** com o objetivo de demonstrar o uso de **padrões de projeto** aplicados em uma API REST simples.  
O projeto implementa um CRUD básico para a entidade **Pedido**, utilizando **JPA** e banco de dados em memória **H2**, além de documentação automática com **Swagger/OpenAPI**.

### 🔹 Funcionalidades
- Criar pedidos (`POST /pedidos`)  
- Listar todos os pedidos (`GET /pedidos`)  
- Buscar pedido por ID (`GET /pedidos/{id}`)  

### 🔹 Tecnologias utilizadas
- **Java 17**  
- **Spring Boot 3.2.2**  
- **Spring Data JPA**  
- **H2 Database**  
- **Springdoc OpenAPI (Swagger UI)**  

### 🔹 Padrões de Projeto aplicados
- **Singleton**: Beans do Spring (`Service`, `Repository`, `Controller`) são instanciados uma única vez e gerenciados pelo container.  
- **Facade**: O `PedidoController` atua como fachada, expondo endpoints simples e escondendo a complexidade interna.  
- **Repository Pattern**: O `PedidoRepository` abstrai o acesso ao banco de dados, permitindo que a lógica de negócio trabalhe apenas com objetos de domínio.  
- **Dependency Injection (IoC)**: O Spring injeta automaticamente as dependências entre classes, promovendo baixo acoplamento.  

### 🔹 Como executar
1. Clone o repositório.  
2. Rode o projeto com:
   ```bash
   mvn spring-boot:run
   ```
3. Acesse:
   - Swagger UI: `http://localhost:8080/swagger-ui.html` [(localhost in Bing)](https://www.bing.com/search?q="http%3A%2F%2Flocalhost%3A8080%2Fswagger-ui.html")  
   - H2 Console: `http://localhost:8080/h2-console` [(localhost in Bing)](https://www.bing.com/search?q="http%3A%2F%2Flocalhost%3A8080%2Fh2-console")  
     - JDBC URL: `jdbc:h2:mem:testdb`  
     - User: `sa`  
     - Password: *(vazio)*  


