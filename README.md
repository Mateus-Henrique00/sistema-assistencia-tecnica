
/























Readme v3 · MD
# 🔧 Sistema de Assistência Técnica — API REST

API REST completa para gerenciamento de ordens de serviço de assistência técnica, desenvolvida com Java e Spring Boot.
 
---

## 📋 Sobre o projeto

Esta é a versão 3 do sistema de assistência técnica — uma evolução do sistema de terminal (V2) para uma API REST profissional. Qualquer sistema (web, mobile, desktop) pode consumir essa API para gerenciar clientes e ordens de serviço.
 
---

## ✨ Funcionalidades

- ✅ CRUD completo de Clientes
- ✅ CRUD completo de Ordens de Serviço
- ✅ Vinculação de OS a clientes cadastrados
- ✅ Finalização de OS com registro automático de data
- ✅ Filtro e busca por ID
- ✅ Validações de dados (@NotBlank, @NotNull, @Positive)
- ✅ Tratamento de erros com HTTP status codes (404, 400, 201)
- ✅ Documentação automática com Swagger/OpenAPI
- ✅ Data de abertura preenchida automaticamente
---

## 🛠️ Tecnologias utilizadas

- **Java 21**
- **Spring Boot 4.1.1**
- **Spring Web MVC** — controllers REST
- **Spring Data JPA** — persistência com JpaRepository
- **Spring Validation** — validações de dados
- **MySQL** — banco de dados relacional
- **Hibernate/JPA** — mapeamento objeto-relacional
- **Swagger/OpenAPI** (springdoc) — documentação automática
- **Maven** — gerenciamento de dependências
- **Git & GitHub** — versionamento
---

## 📁 Estrutura do projeto

```
src/
└── main/
    ├── java/
    │   └── com.Mateus.assistencia_tecnica_api/
    │       ├── controller/
    │       │   ├── ClienteController.java
    │       │   └── OrdemServicoController.java
    │       ├── model/
    │       │   ├── Cliente.java
    │       │   ├── OrdemServico.java
    │       │   └── Status.java
    │       ├── repository/
    │       │   ├── ClienteRepository.java
    │       │   └── OrdemServicoRepository.java
    │       └── service/
    │           ├── ClienteService.java
    │           ├── OrdemServicoService.java
    │           └── ResourceNotFoundException.java
    └── resources/
        └── application.properties.example
```
 
---

## 🌐 Endpoints

### Clientes
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/clientes` | Lista todos os clientes |
| GET | `/clientes/{id}` | Busca cliente por ID |
| POST | `/clientes` | Cria um novo cliente |
| DELETE | `/clientes/{id}` | Remove um cliente |

### Ordens de Serviço
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/ordem_servico` | Lista todas as OS |
| GET | `/ordem_servico/{id}` | Busca OS por ID |
| POST | `/ordem_servico` | Cria uma nova OS |
| PUT | `/ordem_servico/{id}/finalizar` | Finaliza uma OS |
| DELETE | `/ordem_servico/{id}` | Remove uma OS |
 
---

## 📝 Exemplos de uso

### Criar cliente
```json
POST /clientes
{
    "nome": "João Silva",
    "telefone": "85999999999"
}
```

### Criar Ordem de Serviço
```json
POST /ordem_servico
{
    "aparelho": "iPhone 14",
    "valorOrcamento": 350.00,
    "status": "ORCAMENTO",
    "cliente": {
        "ID": 1
    }
}
```

### Status disponíveis
- `ORCAMENTO`
- `EM_REPARO`
- `AGUARDANDO_PECA`
- `FINALIZADO`
---

## 🚀 Como executar

### Pré-requisitos
- Java 21 ou superior
- MySQL instalado e rodando
- Maven instalado
### Configuração do banco
1. Crie o banco de dados:
```sql
CREATE DATABASE assistencia_tecnica;
```

2. Copie o arquivo de configuração:
```bash
cp src/main/resources/application.properties.example src/main/resources/application.properties
```

3. Edite o `application.properties` com suas credenciais do MySQL.
### Executando
```bash
# Clone o repositório
git clone https://github.com/Mateus-Henrique00/sistema-assistencia-tecnica.git
 
# Acesse a branch V3
git checkout V3
 
# Execute com Maven
./mvnw spring-boot:run
```

### Documentação
Após subir o projeto, acesse:
```
http://localhost:8080/swagger-ui/index.html
```
 
---

## 🗄️ Banco de dados

O Hibernate cria as tabelas automaticamente ao iniciar:

```sql
clientes (ID, nome, telefone)
Ordem_Servico (numero_OS, aparelho, status, valorOrcamento, dataAbertura, dataFinalizada, cliente_ID)
```
 
---

## 📌 Versões

| Branch | Descrição |
|--------|-----------|
| `master` | Versão inicial — CRUD em terminal com Collections |
| `V2` | Maven + MySQL + Hibernate/JPA + Testes unitários |
| `V3` | API REST com Spring Boot *(versão atual)* |
 
---

## 👨‍💻 Autor

Feito por **Mateus Henrique**

[![GitHub](https://img.shields.io/badge/GitHub-Mateus--Henrique00-181717?style=flat&logo=github)](https://github.com/Mateus-Henrique00)
 







