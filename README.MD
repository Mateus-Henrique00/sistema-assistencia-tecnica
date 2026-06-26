# 🔧 Sistema de Assistência Técnica

Sistema de gerenciamento de ordens de serviço para assistência técnica, desenvolvido em Java com foco em boas práticas de orientação a objetos.

---

## 📋 Sobre o projeto

Aplicação de terminal para gerenciar clientes e ordens de serviço de uma assistência técnica. O sistema permite cadastrar clientes, abrir ordens de serviço, listar e buscar por diferentes critérios, além de remover registros.

---

## ✨ Funcionalidades

- ✅ Cadastro de clientes com validação de duplicatas
- ✅ Abertura de ordens de serviço vinculadas a clientes
- ✅ Listagem de todas as ordens de serviço
- ✅ Busca por ID com tratamento de não encontrado
- ✅ Filtro por status da ordem de serviço
- ✅ Listagem de aparelhos com orçamento acima de R$ 2.000
- ✅ Remoção de ordens de serviço por ID
- ✅ Auto incremento de IDs

---

## 🛠️ Tecnologias utilizadas

- **Java 17+**
- **IntelliJ IDEA**
- **Git & GitHub**

---

## 📁 Estrutura do projeto

```
src/
├── Main.java
├── Model/
│   ├── Dispositivo.java       # Classe abstrata base
│   ├── Smartphone.java        # Subclasse de Dispositivo
│   ├── Notebook.java          # Subclasse de Dispositivo
│   ├── Cliente.java           # Entidade cliente
│   ├── OrdemServiço.java      # Entidade ordem de serviço
│   ├── Garantia.java          # Interface de garantia
│   └── Status.java            # Enum de status da OS
└── Service/
    └── GerenciadorAssistencia.java  # Regras de negócio
```

---

## 🧠 Conceitos aplicados

- **Orientação a Objetos** — herança, polimorfismo, encapsulamento
- **Classes abstratas e interfaces** — `Dispositivo` abstrato, interface `Garantia`
- **Collections** — `List`, `HashMap`, `HashSet`
- **Optional** — tratamento seguro de valores nulos
- **Streams e Lambdas** — filtros e operações funcionais
- **Enum** — tipagem segura para status
- **Princípio DRY** — reutilização com `super.toString()`

---

## 🚀 Como executar

### Pré-requisitos
- Java 17 ou superior instalado
- IntelliJ IDEA (recomendado) ou qualquer IDE Java

### Passos
```bash
# Clone o repositório
git clone https://github.com/SEU_USUARIO/sistema-assistencia-tecnica.git

# Abra o projeto no IntelliJ IDEA
# Execute a classe Main.java
```

### Menu do sistema
```
--- ASSISTÊNCIA TÉCNICA DO MATEUS ---
1. Nova Ordem de Serviço
2. Listar Todas
3. Ver Faturamento
4. Cadastrar Cliente
0. Sair
```

---

## 📌 Status do projeto

🚧 Em desenvolvimento — próximas melhorias planejadas:
- Persistência em banco de dados com JPA/Hibernate
- API REST com Spring Boot
- Testes unitários com JUnit 5

---

## 👨‍💻 Autor

[![GitHub](https://img.shields.io/badge/GitHub-Mateus-Henrique-181717?style=flat&logo=github)](https://github.com/Mateus-Henrique00)
