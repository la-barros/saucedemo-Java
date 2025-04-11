# 🧪 Testes Automatizados - Sauce Demo com Selenium + Java

Este projeto realiza testes automatizados no site [SauceDemo](https://www.saucedemo.com/) utilizando **Java**, **Selenium WebDriver** e **JUnit 4**, com foco no fluxo de compra completo: login, adicionar ao carrinho, preencher informações e finalizar a compra.

---

## ✅ Funcionalidades testadas

| Teste                    | Descrição                                                                 |
|--------------------------|--------------------------------------------------------------------------|
| `LoginTest.java`         | Verifica se o login com credenciais válidas funciona corretamente.        |
| `ProductsPageTest.java`  | Adiciona um produto ao carrinho e valida se foi adicionado com sucesso.   |
| `CheckoutPageTest.java`  | Preenche dados pessoais, avança no checkout e finaliza a compra com sucesso. |

---

## ⚙️ Tecnologias utilizadas

- Java 21
- Maven
- Selenium WebDriver
- JUnit 4
- ChromeDriver
- IDE (IntelliJ IDEA, Eclipse ou VS Code)

---

## 💻 Passo a passo para rodar localmente

### 1. Clone o projeto
```bash
git clone https://github.com/seu-usuario/seu-repo.git
cd seu-repo

2. Importe o projeto na sua IDE

➤ IntelliJ IDEA
Abra o IntelliJ e selecione "Open"
Selecione o diretório do projeto (onde está o pom.xml)
O IntelliJ detectará o Maven automaticamente

➤ Eclipse
Vá em File > Import > Maven > Existing Maven Project
Selecione o diretório do projeto

➤ VS Code
Instale as extensões: Java Extension Pack e Maven for Java
Abra a pasta do projeto
O VS Code reconhecerá o pom.xml e instalará as dependências automaticamente

3. Adicione as dependências no pom.xml

-Adicionar o selenium nas dependências

<dependencies>
  <!-- Selenium WebDriver -->
  <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.18.1</version>
  </dependency>

-Adicionar o JUnit nas dependências

  <!-- JUnit 4 -->
  <dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
  </dependency>
</dependencies>

4. Baixe o ChromeDriver compatível com seu navegador
Acesse: https://chromedriver.chromium.org/downloads

Coloque o executável na pasta drive/ do projeto.

No código, certifique-se que este caminho está correto:

System.setProperty("webdriver.chrome.driver", "drive/chromedriver.exe");

🚀 Como rodar os testes

Pela IDE:
Clique com o botão direito sobre a classe desejada (LoginTest, CheckoutPageTest, etc) e selecione Run.

Pelo terminal:
mvn test
Certifique-se que sua IDE ou terminal estejam na pasta do projeto.

📁 Estrutura do projeto
├── drive/
│   └── chromedriver.exe
├── pages/
│   ├── LoginPage
│   ├── ProductsPage
│   └── CheckoutPage
├── tests/
│   ├── LoginTest
│   ├── ProductsPageTest
│   └── CheckoutPageTest
├── pom.xml
└── README.md
