# Chain Of Responsibility

------

## Propósito

O Chain of Responsibility é um padrão de projeto comportamental. Sua idéia principal é passar um pedido por uma corrente de handlers. Ao receber um pedido, cada handler decide se processa o pedido ou o passa adiante para o próximo handler na corrente.

## Diagrama de Classes

![](C:\projetos\udemy\DesignPatternsComJava\src\main\java\br\com\estudos\patterns\comportamental\chainofresponsibility\chainofresponsibility.png)

##  Problema :-(

A aplicação pode tentar autenticar um usuário ao sistema sempre que receber um pedido que contém as credenciais do usuário. Contudo, se essas credenciais não estão corretas e a autenticação falha, não há razão para continuar com outras checagens.

Com o tempo você implementa mais diversas checagens sequenciais.

## Solução :-)

Como muitos outros padrões de projeto comportamental o Chain Of Responsibility  se baseia na idéia de transformar comportamentos
em objetos independentes denominados de handlers. 

Asssim as verificações são extraídas para sua própria classa com um único método que faz a checagem. O pedido, junto com seus dados é passadopara esse método como um argumento.

## Exemplo de bibliotecas java que implementam a cadeia de responsabilidades

* javax.servlet.Filter#doFilter()
* java.util.logging.Logger#log()
