# Base2 - Test Automation / Automação de Testes Base2

This repository contains automated tests developed for **Base2**. The goal of these tests is to validate the **user registration** functionality in a user management system by performing the login process and verifying user data on the web interface.

Este repositório contém testes automatizados desenvolvidos para a **Base2**. O objetivo desses testes é validar a funcionalidade de **registro de usuário** em um sistema de gerenciamento de usuários, realizando o processo de login e verificando os dados do usuário na interface web.

## Pre requisites / Pré-requisitos

To run the tests, the following tools are required:

Para rodar os testes, é necessário ter as seguintes ferramentas instaladas:

- **Java 11 or higher**: The programming language used for developing the tests.
- **Maven**: For dependency management and test execution.
- **WebDriver Manager**: For automatic browser driver management.
- **ChromeDriver** or **GeckoDriver (Firefox)**: Browser drivers, automatically configured by WebDriver Manager.

- **Java 11 ou superior**: A linguagem de programação usada para o desenvolvimento dos testes.
- **Maven**: Para gerenciamento de dependências e execução dos testes.
- **WebDriver Manager**: Para gerenciamento automático dos drivers dos navegadores.
- **ChromeDriver** ou **GeckoDriver (Firefox)**: Drivers de navegação, configurados automaticamente pelo WebDriver Manager.

## Dependencies / Dependências

This project uses the following dependencies:

Este projeto utiliza as seguintes dependências:

- **Selenium WebDriver**: Automation tool for browser interaction.
- **JUnit 5**: Testing framework used.
- **WebDriverManager**: For automatic browser driver management.

- **Selenium WebDriver**: Ferramenta de automação para interação com navegadores.
- **JUnit 5**: Framework de testes utilizado.
- **WebDriverManager**: Para gerenciar os drivers de navegadores automaticamente.

## How to Run the Tests / Como Executar os Testes

1. **Clone the repository**:

   ```bash
   git clone https://github.com/your-username/base2-test.git
   cd base2-test
   ```

   ```bash
   git clone https://github.com/seu-usuario/base2-test.git
   cd base2-test
   ```

2. **Compile and run the tests** with Maven:

   ```bash
   mvn clean test
   ```

   Isso vai baixar as dependências necessárias e executar os testes configurados no projeto.

3. **Choose the browser**:

   The browser to be used in the tests can be configured in the static variable `navegador` in the code (inside the `SignUpTests` class). The possible values for the variable are:

   O navegador a ser utilizado nos testes pode ser configurado na variável estática `navegador` no código (dentro da classe `SignUpTests`). Os valores possíveis para a variável são:

   - `"chrome"`: To use Google Chrome.
   - `"firefox"`: To use Mozilla Firefox.

   Exemplo de configuração da variável `navegador`:

   ```java
   public static String navegador = "chrome";  // Or "firefox"
   ```

4. **Test Results**:

   After running the tests, you will see the results in the console, indicating whether the tests passed or failed.

   Após a execução dos testes, você verá o resultado no console, indicando se os testes passaram ou falharam.

## Project Structure / Estrutura do Projeto

- **src/test/java/br/com/mantis/provabase/signup**: Contains the test class `SignUpTests`, which performs the login process and verifies the presence of the user name on the interface.
  
  - **SignUpTests.java**: Test that validates the registration of a new user with valid data.

  - **SignUpTests.java**: Teste que valida o registro de um novo usuário com dados válidos.

## Test Description / Descrição do Teste

The test simulates the process of registering a new user by performing the following steps:

O teste simula o processo de registro de um novo usuário, realizando os seguintes passos:

1. **Open the system**: Access the login system of the Base2 application through the configured browser.
2. **Fill in the login fields**: Enter the username and password in the respective fields.
3. **Validate user name**: After logging in, the user name is verified on the interface to ensure successful login.
4. **Close the browser**: After the test execution, the browser is closed.

1. **Abrir o sistema**: O sistema de login da aplicação Base2 é acessado através do navegador configurado.
2. **Preencher os campos de login**: O nome de usuário e a senha são inseridos nos campos correspondentes.
3. **Validar o nome do usuário**: Após o login, o nome do usuário é verificado na interface para garantir que o login foi realizado corretamente.
4. **Fechar o navegador**: Após a execução do teste, o navegador é fechado.

## Contributions / Contribuições

Feel free to contribute to the project. To do so, follow these steps:

Sinta-se à vontade para contribuir com o projeto. Para isso, siga os seguintes passos:

1. Fork this repository.
2. Create a new branch for your feature (`git checkout -b feature/new-feature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the remote repository (`git push origin feature/new-feature`).
5. Open a Pull Request.

1. Faça um fork deste repositório.
2. Crie uma branch com a sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas alterações (`git commit -m 'Add some feature'`).
4. Envie para o repositório remoto (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## License / Licença

This project is licensed under the [MIT License](LICENSE).

Este projeto está licenciado sob a [Licença MIT](LICENSE).