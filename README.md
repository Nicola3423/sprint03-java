# Projeto CP03 - Gerenciamento de Pacientes

## Integrantes do Grupo

*Nicola Monte Cravo Garofalo - responsável pelo código fonte.*

*Igor Akira Bortolini Tateishi - responsável pelo código fonte.*

*Willyam Santos Sousa - responsável pelo documento.*

## Requisitos do Software
 
- Instalação do Java 17;
 
## Instruções de como rodar a aplicação
 
1. Clonar o projeto;
2. Baixar as dependências do Groovy;
3. Rodar o projeto;
4. Executar as requisições.

## Descrição:

Este projeto é uma aplicação Java desenvolvida com Spring Boot, utilizando JPA para persistência de dados, destinada ao gerenciamento de informações de pacientes, incluindo médicos. 

## Estrutura das Entidades

### 1. Paciente
- Representa o paciente, contendo informações pessoais como:
  - id: Identificador único do paciente.
  - nome: Nome do paciente.
  - email: Email válido do paciente.
  - telefone: Telefone do paciente.
  - dataNascimento: Data de nascimento do paciente.

### 2. Medico
- Representa o médico responsável pelo paciente.
  - id: Identificador único do médico.
  - nome: Nome do médico.
  - telefone: Telefone do médico (máx. 15 caracteres).
  - email: Email válido do médico.
  - crm: Número do CRM, com tamanho entre 5 e 15 caracteres.

## Tecnologias Utilizadas

- *Java 17*
- *Spring Boot*
- *Jakarta Persistence API (JPA)*
- *Banco de Dados Relacional ORACLE *

## Diagrama:
![java](https://github.com/user-attachments/assets/60264022-3a21-435c-8b27-997127e997cf)

## Instalação e Configuração

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/JavaSprint02/.git
