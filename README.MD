# 🔧 Sistema de Assistência Técnica

Sistema de gerenciamento de ordens de serviço para assistência técnica, desenvolvido em Java com foco em boas práticas de orientação a objetos e persistência de dados.

---

## 📋 Sobre o projeto

Aplicação de terminal para gerenciar clientes e ordens de serviço de uma assistência técnica. O sistema permite cadastrar clientes, abrir ordens de serviço, listar e buscar por diferentes critérios, finalizar OS com registro de data, além de remover registros — tudo persistido em banco de dados MySQL.

---

## ✨ Funcionalidades

- ✅ Cadastro de clientes com validação de duplicatas
- ✅ Abertura de ordens de serviço vinculadas a clientes
- ✅ Listagem de todas as ordens de serviço
- ✅ Busca por ID com tratamento de não encontrado
- ✅ Filtro por status da ordem de serviço
- ✅ Listagem de aparelhos com orçamento acima de R$ 2.000
- ✅ Finalização de OS com registro automático de data
- ✅ Remoção de ordens de serviço por ID
- ✅ Persistência completa em banco de dados MySQL
- ✅ Carregamento automático dos dados ao iniciar o sistema

---

## 🛠️ Tecnologias utilizadas

- **Java 21**
- **Maven** — gerenciamento de dependências
- **MySQL** — banco de dados relacional
- **Hibernate/JPA** — mapeamento objeto-relacional (ORM)
- **Gson** — serialização JSON (versão anterior)
- **JUnit 5** — testes unitários
- **IntelliJ IDEA**
- **Git & GitHub**

---

## 📁 Estrutura do projeto

```
src/
├── main/
│   ├── java/
│   │   ├── main.java
│   │   ├── model/
│   │   │   ├── Dispositivo.java       # Classe abstrata base
│   │   │   ├── Smartphone.java        # Subclasse de Dispositivo
│   │   │   ├── Notebook.java          # Subclasse de Dispositivo
│   │   │   ├── Cliente.java           # Entidade cliente
│   │   │   ├── OrdemServico.java      # Entidade ordem de serviço
│   │   │   ├── Garantia.java          # Interface de garantia
│   │   │   └── Status.java            # Enum de status da OS
│   │   └── service/
│   │       ├── GerenciadorAssistencia.java  # Regras de negócio
│   │       ├── ClienteRepository.java       # Persistência de clientes
│   │       ├── OrdemServicoRepository.java  # Persistência de OS
│   │       └── HibernateUtil.java           # Configuração do Hibernate
│   └── resources/
│       └── hibernate.cfg.xml.example  # Template de configuração
└── test/
    └── java/
        ├── ClienteTest.java           # Testes unitários de Cliente
        └── OrdemServicoTest.java      # Testes unitários de OrdemServico
```

---

## 🧠 Conceitos aplicados

- **Orientação a Objetos** — herança, polimorfismo, encapsulamento
- **Classes abstratas e interfaces** — `Dispositivo` abstrato, interface `Garantia`
- **Collections** — `List`, `HashMap`, `HashSet`
- **Optional** — tratamento seguro de valores nulos
- **Streams e Lambdas** — filtros e operações funcionais
- **Enum** — tipagem segura para status
- **JPA/Hibernate** — mapeamento de entidades com `@Entity`, `@Id`, `@ManyToOne`, `@Enumerated`
- **Repository Pattern** — separação da camada de persistência
- **Testes unitários** — JUnit 5 com `@Test`, `@BeforeEach`, `assertEquals`, `assertTrue`, `assertNotNull`
- **Princípio DRY** — reutilização com `super.toString()`

---

## 🗄️ Banco de dados

O sistema usa MySQL com as seguintes tabelas criadas automaticamente pelo Hibernate:

```sql
clientes (ID, nome, telefone)
Ordem_Servico (numero_OS, aparelho, status, valorOrcamento, dataAbertura, dataFinalizada, cliente_ID)
```

---

## 🚀 Como executar

### Pré-requisitos
- Java 21 ou superior
- Maven instalado
- MySQL instalado e rodando

### Configuração do banco
1. Crie o banco de dados:
```sql
CREATE DATABASE assistencia_tecnica;
```

2. Copie o arquivo de configuração:
```bash
cp src/main/resources/hibernate.cfg.xml.example src/main/resources/hibernate.cfg.xml
```

3. Edite o `hibernate.cfg.xml` com suas credenciais do MySQL.

### Executando
```bash
# Clone o repositório
git clone https://github.com/Mateus-Henrique00/sistema-assistencia-tecnica.git

# Acesse a branch V2
git checkout V2

# Abra no IntelliJ IDEA e execute a classe main.java
```

### Menu do sistema
```
--- ASSISTÊNCIA TÉCNICA DO MATEUS ---
1. Nova Ordem de Serviço
2. Listar Todas Ordem de Serviço
3. Listar OS por Status
4. Cadastrar Cliente novo
5. Remover OS por ID
6. Finalizar OS
0. Sair
```

---

## 🧪 Testes

O projeto conta com testes unitários cobrindo:

- Criação de cliente com nome e telefone corretos
- Validação de igualdade entre clientes (`equals` e `hashCode`)
- Preenchimento automático de `dataAbertura` na OS
- Atualização de status da OS para `FINALIZADO`

Para rodar os testes, execute a classe de teste diretamente no IntelliJ ou via Maven:
```bash
mvn test
```

---

## 📌 Versões

| Branch | Descrição |
|--------|-----------|
| `master` | Versão inicial — CRUD em terminal com Collections |
| `V2` | Maven + MySQL + Hibernate/JPA + Testes unitários |
| `V3` | API REST com Spring Boot *(em desenvolvimento)* |

---

## 👨‍💻 Autor

Feito com 💙 por **Mateus Henrique**

[![GitHub](https://img.shields.io/badge/GitHub-Mateus--Henrique00-181717?style=flat&logo=github)](https://github.com/Mateus-Henrique00)
