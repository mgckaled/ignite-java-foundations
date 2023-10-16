# Anotações importantes

## Sumário

- [Anotações importantes](#anotações-importantes)
  - [Sumário](#sumário)
  - [Fundamentos de Java](#fundamentos-de-java)
    - [Categoria / Tipos de dados em Java](#categoria--tipos-de-dados-em-java)
    - [Estrutura de repetição em Java?](#estrutura-de-repetição-em-java)
  - [Conceitos](#conceitos)

## Fundamentos de Java

### Categoria / Tipos de dados em Java

1. **Tipos Primitivos:** São os tipos de dados básicos incorporados na linguagem Java. Eles representam valores simples, como números inteiros e pontos flutuantes. Alguns exemplos de tipos primitivos incluem `int`, `double`, `char`, `boolean`, etc.

2. **Classes e Objetos:** Java é uma linguagem orientada a objetos, e os dados são frequentemente organizados em classes que definem estruturas de dados e objetos que são instâncias dessas classes.

3. **Arrays:** Arrays em Java são coleções de elementos do mesmo tipo de dados. Eles podem ser usados para armazenar múltiplos valores do mesmo tipo em uma única variável.

4. **Enums:** Enums (enumerações) são tipos de dados que representam um conjunto fixo de valores constantes. Eles são frequentemente usados para representar categorias ou opções específicas.

5. **Strings:** Em Java, as strings são objetos que representam sequências de caracteres. A classe `String` é amplamente utilizada para trabalhar com texto.

6. **Coleções:** Java fornece várias estruturas de dados de coleções, como Listas, Conjuntos e Mapas, que permitem armazenar e manipular conjuntos de dados de maneira eficiente.

7. **Tipos Wrapper:** São classes que encapsulam os tipos primitivos, permitindo que sejam tratados como objetos. Exemplos incluem `Integer`, `Double`, `Boolean`, etc.

8. **Tipos Genéricos:** Java oferece suporte a tipos genéricos, que permitem criar classes, interfaces e métodos que operam em tipos de dados específicos sem conhecimento prévio do tipo real.

9. **Tipos Personalizados:** Além dos tipos primitivos, você pode criar seus próprios tipos de dados personalizados definindo classes.

10. **Outros Tipos de Dados:** Java também oferece tipos de dados para representar data e hora, como `Date` e `LocalDate`, e tipos para entrada/saída, como `File` e `InputStream`.

Mais informações aqui: <https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html>

### Estrutura de repetição em Java?

Em Java, você pode usar várias estruturas de repetição para executar um bloco de código várias vezes com base em uma condição. As estruturas de repetição mais comuns em Java são `for`, `while` e `do-while`. Vou explicar cada uma delas:

- **for**:

A estrutura de repetição `for` é usada quando você sabe o número de iterações que deseja executar. A sintaxe básica é a seguinte:

```java
for (inicialização; condição; expressão de iteração) {
    // Bloco de código a ser repetido
}
```

- `inicialização`: Uma instrução que é executada apenas uma vez no início, geralmente usada para inicializar uma variável de controle.
- `condição`: A condição que é avaliada antes de cada iteração. Enquanto a condição for verdadeira, o bloco de código continuará a ser executado.
- `expressão de iteração`: Uma instrução que é executada após cada iteração, geralmente usada para atualizar a variável de controle.

Exemplo:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteração " + i);
}
```

Este código imprimirá "Iteração 0" a "Iteração 4".

- **while**:

A estrutura de repetição `while` é usada quando você não sabe antecipadamente quantas iterações serão necessárias. A sintaxe é a seguinte:

```java
while (condição) {
    // Bloco de código a ser repetido
}
```

- `condição`: A condição que é avaliada antes de cada iteração. Enquanto a condição for verdadeira, o bloco de código continuará a ser executado.

Exemplo:

```java
int i = 0;
while (i < 5) {
    System.out.println("Iteração " + i);
    i++;
}
```

Este código produz o mesmo resultado que o exemplo `for`.

- **do-while**:

A estrutura de repetição `do-while` é semelhante ao `while`, mas garante que o bloco de código seja executado pelo menos uma vez, pois a condição é avaliada após a primeira execução. A sintaxe é a seguinte:

```java
do {
    // Bloco de código a ser repetido
} while (condição);
```

- `condição`: A condição que é avaliada após cada iteração. Enquanto a condição for verdadeira, o bloco de código continuará a ser executado.

Exemplo:

```java
int i = 0;
do {
    System.out.println("Iteração " + i);
    i++;
} while (i < 5);
```

Este código também produz o mesmo resultado que os exemplos anteriores, mas garante que o bloco de código seja executado pelo menos uma vez.

Essas são as estruturas de repetição mais comuns em Java. Você pode escolher a estrutura que melhor se adapte às necessidades do seu programa com base no número de iterações e na lógica de controle.

Além disso, você pode combinar esses loops com estruturas condicionais, como `if`, `else` e `else if`, para controlar o fluxo do programa. Aqui estão exemplos de como essas estruturas podem ser usadas:

- Loop `for`

Exemplo:

```java
for (int i = 1; i <= 5; i++) {
    if (i % 2 == 0) {
        System.out.println(i + " é par");
    } else {
        System.out.println(i + " é ímpar");
    }
}
```

- Loop `while`

Exemplo:

```java
int contador = 1;
while (contador <= 5) {
    if (contador % 2 == 0) {
        System.out.println(contador + " é par");
    } else {
        System.out.println(contador + " é ímpar");
    }
    contador++;
}
```

- Loop `do-while`

Exemplo:

```java
int contador = 1;
do {
    if (contador % 2 == 0) {
        System.out.println(contador + " é par");
    } else {
        System.out.println(contador + " é ímpar");
    }
    contador++;
} while (contador <= 5);
```

Você pode combinar essas estruturas de repetição com estruturas condicionais, como `if`, `else` e `else if`, para controlar o fluxo do programa dentro do loop, com base em condições específicas. Isso permite que você tome decisões em cada iteração do loop.

## Conceitos