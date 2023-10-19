# Anotações importantes

## Sumário

- [Anotações importantes](#anotações-importantes)
  - [Sumário](#sumário)
  - [Dicas](#dicas)
  - [Conceitos](#conceitos)
    - [O que é Java?](#o-que-é-java)
    - [O que é JDK?](#o-que-é-jdk)
    - [O que é JRE?](#o-que-é-jre)
    - [O que é JMV?](#o-que-é-jmv)
  - [Fundamentos de Java](#fundamentos-de-java)
    - [Categoria / Tipos de dados em Java](#categoria--tipos-de-dados-em-java)
    - [Estrutura de repetição em Java?](#estrutura-de-repetição-em-java)
    - [Como funciona uma lista em Java?](#como-funciona-uma-lista-em-java)
      - [Importando a classe ArrayList](#importando-a-classe-arraylist)
      - [Criando uma lista](#criando-uma-lista)
      - [Adicionando elementos à lista](#adicionando-elementos-à-lista)
      - [Acessando elementos da lista](#acessando-elementos-da-lista)
      - [Iterando sobre a lista](#iterando-sobre-a-lista)
      - [Removendo elementos da lista](#removendo-elementos-da-lista)
      - [Tamanho da lista](#tamanho-da-lista)
      - [Verificando se a lista está vazia](#verificando-se-a-lista-está-vazia)
      - [Considerações finais](#considerações-finais)
    - [Como funciona o HashMap em Java?](#como-funciona-o-hashmap-em-java)
    - [Como funciona o HashSet em Java?](#como-funciona-o-hashset-em-java)
    - [POO em Java](#poo-em-java)
    - [Encapsulamento em Java](#encapsulamento-em-java)
    - [Herança em Java](#herança-em-java)
    - [Polimorfismo em Java](#polimorfismo-em-java)
    - [Exceções em Java](#exceções-em-java)
    - [Qual a função do `static` em Java?](#qual-a-função-do-static-em-java)
    - [Exemplos de Construtores](#exemplos-de-construtores)
    - [*Wrapper classes* em Java](#wrapper-classes-em-java)

## Dicas

- Não é possível instanciar interfaces
- No construtor não há retorno (`return`), logo não há necessidade de incluir `void`.
- O construtor pode ter ou não parâmetros

## Conceitos

### O que é Java?

Java é uma linguagem de programação amplamente utilizada e uma plataforma de desenvolvimento associada. Foi inicialmente desenvolvida pela Sun Microsystems (agora pertencente à Oracle Corporation) na década de 1990 e é uma linguagem orientada a objetos, robusta, de alto desempenho e multiplataforma.

A principal característica do Java é sua portabilidade, o que significa que os programas escritos em Java podem ser executados em qualquer dispositivo que tenha uma máquina virtual Java (JVM) instalada, sem necessidade de recompilação. Isso é possível devido ao conceito "write once, run anywhere" (escreva uma vez, execute em qualquer lugar).

Além disso, o Java possui uma vasta biblioteca padrão (Java Class Library) que fornece funcionalidades prontas para uso, facilitando o desenvolvimento de aplicativos. A linguagem é conhecida por sua segurança, gerenciamento automático de memória (coleta de lixo), suporte a programação concorrente e robustez.

Java é amplamente usado para desenvolver uma variedade de aplicativos, incluindo aplicativos de desktop, aplicativos para dispositivos móveis (Android), aplicativos da web, sistemas embarcados, jogos, aplicativos de servidor, aplicativos empresariais e muito mais. A popularidade do Java e sua vasta comunidade de desenvolvedores contribuem para a sua contínua relevância e evolução.

### O que é JDK?

O JDK, que significa Java Development Kit em inglês, é um conjunto de ferramentas, utilitários e documentação necessários para o desenvolvimento de aplicativos Java. É um pacote essencial para os desenvolvedores que desejam criar, compilar, testar e depurar programas em Java.

O JDK inclui diversos componentes fundamentais para o desenvolvimento de software em Java, tais como:

1. **Compilador Java (javac)**: É uma ferramenta que converte o código-fonte Java em código de bytecode, que é executado pela JVM (Java Virtual Machine).

2. **JRE (Java Runtime Environment)**: Embora o JRE seja um componente separado, o JDK inclui uma versão do JRE. O JRE é necessário para executar aplicativos Java e contém a JVM, bem como as bibliotecas padrão do Java.

3. **Ferramentas de linha de comando**: O JDK oferece várias ferramentas de linha de comando que auxiliam no desenvolvimento, depuração e teste de aplicativos Java, como javac (compilador), java (execução), javadoc (geração de documentação), entre outras.

4. **Bibliotecas e APIs**: O JDK inclui as bibliotecas padrão do Java, que fornecem um conjunto rico de classes e métodos prontos para uso, facilitando o desenvolvimento de aplicativos.

5. **Ferramentas de depuração**: Oferece ferramentas para depuração de código, permitindo aos desenvolvedores identificar e corrigir erros no código.

6. **Outras ferramentas**: O JDK também inclui outras ferramentas úteis para perfis de desempenho, monitoramento, empacotamento e mais.

Em suma, o JDK é essencial para os desenvolvedores que desejam criar aplicativos Java, pois fornece todos os recursos necessários para desenvolvimento, compilação e execução bem-sucedidos de programas Java.

### O que é JRE?

O JRE, ou Java Runtime Environment, é um ambiente de tempo de execução que permite a execução de aplicativos Java em um computador. Ele contém a Java Virtual Machine (JVM), bibliotecas padrão do Java e outros componentes necessários para executar aplicativos Java.

A JVM é a peça central do JRE, pois é responsável por interpretar e executar o código de bytecode gerado a partir do código-fonte Java. A JVM traduz esse bytecode em instruções executáveis específicas da plataforma em tempo de execução, permitindo que os aplicativos Java sejam executados em diferentes sistemas operacionais sem a necessidade de recompilação.

Além da JVM, o JRE inclui as bibliotecas padrão do Java, que consistem em uma ampla gama de classes e métodos prontos para uso que os aplicativos Java podem chamar durante sua execução. Essas bibliotecas fornecem funcionalidades essenciais para operações comuns, como manipulação de strings, entrada e saída, gráficos, rede e muito mais.

Os usuários finais que desejam executar aplicativos Java em seus computadores precisam ter o JRE instalado. Sem o JRE, os aplicativos Java não podem ser executados, pois não haveria um ambiente apropriado para interpretar e executar o código Java.

É importante notar que o JRE não inclui ferramentas de desenvolvimento, como o compilador Java (javac). Para desenvolver aplicativos Java, os desenvolvedores precisam do JDK (Java Development Kit), que inclui o JRE, além das ferramentas de compilação e desenvolvimento necessárias.

### O que é JMV?

A JVM, ou Java Virtual Machine (Máquina Virtual Java), é um componente essencial no ecossistema da linguagem de programação Java. Ela desempenha um papel fundamental na execução de aplicativos Java. Aqui estão os principais aspectos da JVM:

1. **Máquina Virtual**: A JVM é uma máquina virtual, o que significa que é uma camada de software que atua como uma máquina virtual dentro do sistema operacional. Ela permite a execução de código Java independentemente do sistema operacional subjacente. Isso significa que um programa Java pode ser escrito uma vez e executado em qualquer sistema que tenha uma JVM compatível.

2. **Interpretação e Compilação Just-In-Time**: A JVM pode interpretar o código Java (conhecido como bytecode) ou, em muitos casos, compilá-lo just-in-time (JIT) para código de máquina nativo. A compilação JIT melhora o desempenho, uma vez que o código nativo é mais eficiente que o bytecode interpretado. Isso significa que a JVM equilibra entre a portabilidade e o desempenho.

3. **Gerenciamento de Memória**: A JVM é responsável pelo gerenciamento de memória. Ela aloca e desaloca automaticamente a memória usada pelos objetos Java e realiza a coleta de lixo para liberar a memória de objetos que não são mais referenciados. Isso ajuda a evitar vazamentos de memória e a simplificar a programação.

4. **Carregamento de Classes**: A JVM é responsável pelo carregamento de classes em tempo de execução. Ela carrega as classes Java conforme necessário, à medida que são referenciadas no código, o que permite um carregamento dinâmico de classes.

5. **Segurança**: A JVM inclui recursos de segurança que ajudam a proteger o sistema contra códigos maliciosos. Ela aplica regras de segurança para controlar o acesso a recursos do sistema e garantir que os aplicativos Java sejam executados de forma segura.

6. **Independência de Plataforma**: Uma das características mais importantes da JVM é a independência de plataforma. Os aplicativos Java podem ser desenvolvidos em um sistema e executados em qualquer sistema que tenha uma JVM compatível, desde que o código seja escrito de maneira apropriada.

Existem várias implementações da JVM, incluindo a JVM da Oracle (anteriormente conhecida como HotSpot), a JVM da OpenJDK e implementações personalizadas. A JVM desempenha um papel crucial na popularidade e na longevidade da linguagem de programação Java, tornando-a uma escolha atraente para desenvolvedores que buscam portabilidade e segurança em suas aplicações.

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

### Como funciona uma lista em Java?

Uma lista em Java é uma estrutura de dados que permite armazenar e manipular uma coleção de elementos. Existem várias classes no Java que implementam a interface `java.util.List`, como `ArrayList`, `LinkedList` e `Vector`. Neste exemplo, vou explicar o funcionamento de uma lista usando a classe `ArrayList`.

#### Importando a classe ArrayList

Para usar uma lista em Java, você deve importar a classe `ArrayList` do pacote `java.util`. Você pode fazer isso da seguinte maneira:

```java
import java.util.ArrayList;
import java.util.List;
```

#### Criando uma lista

Para criar uma lista em Java, você instancia um objeto da classe `ArrayList`. Por exemplo:

```java
List<String> minhaLista = new ArrayList<>();
```

Neste exemplo, criamos uma lista chamada `minhaLista` que armazena elementos do tipo `String`. A lista está vazia no momento da criação.

#### Adicionando elementos à lista

Você pode adicionar elementos à lista usando o método `add()` da classe `ArrayList`. Por exemplo:

```java
minhaLista.add("Maçã");
minhaLista.add("Banana");
minhaLista.add("Laranja");
```

Agora, `minhaLista` contém três elementos: "Maçã", "Banana" e "Laranja".

#### Acessando elementos da lista

Você pode acessar elementos da lista usando seu índice. Os índices em Java começam em 0. Por exemplo:

```java
String primeiraFruta = minhaLista.get(0); // Retorna "Maçã"
String segundaFruta = minhaLista.get(1);  // Retorna "Banana"
```

#### Iterando sobre a lista

Você pode percorrer todos os elementos da lista usando loops, como um loop `for` ou um loop `foreach` (introduzido no Java 5). Aqui está um exemplo usando um loop `foreach`:

```java
for (String fruta : minhaLista) {
    System.out.println(fruta);
}
```

Isso imprimirá cada elemento da lista.

#### Removendo elementos da lista

Você pode remover elementos da lista usando o método `remove()` da classe `ArrayList`. Por exemplo:

```java
minhaLista.remove(1); // Remove a segunda fruta, que é "Banana"
```

Agora, `minhaLista` contém apenas duas frutas: "Maçã" e "Laranja".

#### Tamanho da lista

Para obter o tamanho da lista (ou seja, o número de elementos nela), você pode usar o método `size()` da classe `ArrayList`:

```java
int tamanho = minhaLista.size(); // Retorna 2 no exemplo atual
```

#### Verificando se a lista está vazia

Você pode verificar se a lista está vazia usando o método `isEmpty()` da classe `ArrayList`:

```java
boolean estaVazia = minhaLista.isEmpty(); // Retorna false no exemplo atual
```

#### Considerações finais

As listas em Java são uma estrutura de dados flexível e amplamente utilizada para armazenar coleções de elementos. Você pode adicionar, acessar, remover e iterar sobre elementos com facilidade. Lembre-se de importar a classe apropriada, criar a lista com o tipo de elemento desejado e usar os métodos apropriados para manipular os dados na lista.

### Como funciona o HashMap em Java?

Um `HashMap` em Java é uma estrutura de dados que armazena pares chave-valor, permitindo a recuperação rápida de valores com base em suas chaves. Ele faz parte do pacote `java.util` e implementa a interface `Map`. A principal característica de um `HashMap` é que ele usa a função de hash da chave para calcular um índice onde o valor correspondente é armazenado. Isso permite uma recuperação eficiente dos valores com base em suas chaves.

Aqui está um resumo de como um `HashMap` funciona em Java:

1. Inicialização:
   Você pode criar um `HashMap` em Java da seguinte forma:

   ```java
   HashMap<KeyType, ValueType> hashMap = new HashMap<>();
   ```

   `KeyType` é o tipo de dados da chave e `ValueType` é o tipo de dados do valor que você deseja armazenar.

2. Inserção de elementos:
   Você pode adicionar pares chave-valor ao `HashMap` usando o método `put`:

   ```java
   hashMap.put(key, value);
   ```

   Isso associa a chave `key` com o valor `value` no `HashMap`.

3. Recuperação de elementos:
   Você pode recuperar valores com base em suas chaves usando o método `get`:

   ```java
   ValueType retrievedValue = hashMap.get(key);
   ```

   Isso retorna o valor associado à chave `key` ou `null` se a chave não existir no `HashMap`.

4. Verificação de existência:
   Você pode verificar se uma chave está presente no `HashMap` usando o método `containsKey`:

   ```java
   if (hashMap.containsKey(key)) {
       // A chave está no HashMap
   }
   ```

5. Remoção de elementos:
   Você pode remover elementos do `HashMap` com o método `remove`:

   ```java
   hashMap.remove(key);
   ```

   Isso remove a chave e seu valor associado do `HashMap`.

6. Iteração:
   Você pode iterar sobre as chaves, valores ou entradas (pares chave-valor) usando iterações `for-each` ou um `Iterator`.

O `HashMap` é uma estrutura de dados altamente eficiente para recuperação de valores com base em chaves, desde que as funções de hash das chaves distribuam os elementos de forma uniforme no `HashMap`. No entanto, é importante observar que as chaves em um `HashMap` devem ser únicas, mas os valores podem ser repetidos.

Lembre-se de que a complexidade de tempo média para operações de inserção, recuperação e remoção em um `HashMap` é O(1) quando a função de hash é bem distribuída e O(n) no pior caso. Portanto, escolher uma função de hash adequada e considerar fatores como a carga do `HashMap` (fator de carga) é importante para manter o desempenho ideal.

### Como funciona o HashSet em Java?

Em Java, `HashSet` é uma implementação da interface `Set` que é baseada na estrutura de dados de tabela de dispersão (hash table). Ele é projetado para armazenar elementos sem duplicatas e não garante a ordem dos elementos. Aqui está um resumo de como o `HashSet` funciona:

1. **Armazenamento baseado em tabela de dispersão:** O `HashSet` usa uma tabela de dispersão interna para armazenar os elementos. Cada elemento é mapeado para um índice na tabela de acordo com sua função de hash.

2. **Função de hash:** Cada elemento do `HashSet` deve implementar o método `hashCode()` da classe `Object`, que retorna um valor inteiro representando o hash do objeto. A função de hash é usada para calcular o índice da tabela de dispersão onde o elemento será armazenado.

3. **Resolução de colisões:** Às vezes, dois objetos diferentes podem ter o mesmo valor de hash. Isso é chamado de colisão. O `HashSet` lida com colisões usando listas vinculadas. Cada índice na tabela de dispersão pode conter uma lista de elementos que têm o mesmo valor de hash. Quando ocorre uma colisão, o `HashSet` adiciona o novo elemento à lista vinculada correspondente.

4. **Verificação de duplicatas:** Antes de adicionar um elemento ao `HashSet`, ele verifica se o elemento já está presente usando o método `equals()`. Se o elemento for igual a um elemento já presente no conjunto, ele não será adicionado, pois o `HashSet` não permite elementos duplicados.

5. **Não mantém ordem:** O `HashSet` não mantém a ordem dos elementos. Se você precisa de uma coleção que mantenha a ordem de inserção, você pode usar o `LinkedHashSet`, que é uma implementação do `Set` que mantém a ordem dos elementos em que foram inseridos.

Aqui está um exemplo de como usar um `HashSet` em Java:

```java
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Maçã");
        set.add("Banana");
        set.add("Laranja");
        set.add("Maçã"); // Não será adicionado, pois é uma duplicata

        System.out.println(set); // Imprimirá [Laranja, Banana, Maçã]
    }
}
```

Lembre-se de que a ordem dos elementos no `HashSet` pode variar e não é garantida. Se você precisar de uma ordem específica, considere o uso de outras implementações, como `LinkedHashSet` ou `TreeSet`.

### POO em Java

O paradigma orientado a objetos (POO) é um modelo de programação que se baseia em conceitos como classes, objetos, herança, encapsulamento e polimorfismo. Vou explicar cada um desses conceitos-chave no contexto do Java com exemplos.

1 - **Classe**:
Uma classe é um modelo ou planta baixa para criar objetos. Ela define os atributos (variáveis) e métodos (funções) que os objetos criados a partir dela terão.

Exemplo em Java:

```java
public class Carro {
    // Atributos
    String marca;
    String modelo;
    int ano;

    // Métodos
    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    public void desligar() {
        System.out.println("O carro está desligado.");
    }
}
```

2 - **Objeto**:
Um objeto é uma instância de uma classe, uma entidade concreta que contém dados e comportamento.

Exemplo em Java, criando objetos a partir da classe "Carro":

```java
Carro meuCarro = new Carro();
meuCarro.marca = "Toyota";
meuCarro.modelo = "Corolla";
meuCarro.ano = 2022;

Carro outroCarro = new Carro();
outroCarro.marca = "Ford";
outroCarro.modelo = "Mustang";
outroCarro.ano = 2021;
```

3 - **Herança**:
Herança é um mecanismo que permite que uma classe herde atributos e métodos de outra classe. A classe que herda é chamada de subclasse, e a classe da qual ela herda é chamada de superclasse.

Exemplo em Java:

```java
public class Veiculo {
    String cor;
    int velocidadeMaxima;
}

public class Carro extends Veiculo {
    int numeroPortas;
}

// Usando a classe Carro
Carro meuCarro = new Carro();
meuCarro.cor = "Azul";
meuCarro.velocidadeMaxima = 200;
meuCarro.numeroPortas = 4;
```

4 -  **Encapsulamento**:
O encapsulamento é o conceito de esconder os detalhes de implementação de uma classe, expondo apenas a interface necessária para interagir com ela. Isso é feito usando modificadores de acesso (como public, private, protected) para controlar o acesso aos membros da classe.

Exemplo em Java:

```java
public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        if (novaIdade >= 0) {
            idade = novaIdade;
        }
    }
}
```

5 - **Polimorfismo**:
Polimorfismo permite que objetos de classes diferentes sejam tratados de maneira uniforme. Isso pode ser alcançado por meio de sobrescrita de métodos ou interfaces.

Exemplo em Java usando sobrescrita de método:

```java
public class Animal {
    public void fazerSom() {
        System.out.println("O animal faz algum som.");
    }
}

public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late.");
    }
}

public class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato mia.");
    }
}

// Usando polimorfismo
Animal meuAnimal = new Cachorro();
meuAnimal.fazerSom(); // Saída: "O cachorro late"

meuAnimal = new Gato();
meuAnimal.fazerSom(); // Saída: "O gato mia"
```

Esses são conceitos fundamentais do paradigma orientado a objetos no Java, que permitem criar sistemas organizados, flexíveis e reutilizáveis.

### Encapsulamento em Java

O encapsulamento é um dos princípios fundamentais da programação orientada a objetos (POO) e é amplamente aplicado na linguagem de programação Java. Ele se baseia na ideia de ocultar os detalhes internos de uma classe e fornecer uma interface pública para interagir com os objetos dessa classe. O encapsulamento é implementado em Java principalmente através do uso de modificadores de acesso, como `public`, `private`, `protected` e `default`.

Aqui está como o encapsulamento funciona em Java:

1. **Atributos Privados**: A maioria dos atributos de uma classe deve ser declarada como privados (usando o modificador `private`). Isso significa que os atributos não podem ser acessados diretamente por código fora da classe.

   ```java
   public class Exemplo {
       private int idade;
   }
   ```

2. **Métodos Públicos**: Para permitir que outros objetos acessem ou modifiquem os atributos privados, você deve fornecer métodos públicos, chamados "métodos de acesso" ou "getters" e "setters". Os getters são usados para obter o valor dos atributos e os setters para definir o valor dos atributos.

   ```java
   public class Exemplo {
       private int idade;

       public int getIdade() {
           return idade;
       }

       public void setIdade(int novaIdade) {
           idade = novaIdade;
       }
   }
   ```

3. **Encapsulamento em Ação**: Ao usar métodos getters e setters, você pode controlar como os atributos são acessados e modificados. Isso permite que você adicione lógica de validação, execução de ações especiais ou qualquer outra manipulação necessária.

   ```java
   Exemplo objeto = new Exemplo();
   objeto.setIdade(25); // Usando o setter para definir a idade.
   int idade = objeto.getIdade(); // Usando o getter para obter a idade.
   ```

4. **Proteção de Dados**: O encapsulamento ajuda a proteger os dados da classe, evitando que sejam corrompidos ou acessados de maneira inadequada. Ele também permite que você faça alterações internas na implementação da classe sem afetar o código que a utiliza, desde que a interface pública (métodos públicos) permaneça a mesma.

5. **Modificadores de Acesso**: Além do `private`, Java oferece outros modificadores de acesso, como `public`, `protected` e o pacote (sem especificador). Você pode escolher o modificador que melhor atenda às necessidades de encapsulamento de sua classe.

   - `private`: Acesso restrito somente à própria classe.
   - `public`: Acesso irrestrito de qualquer lugar.
   - `protected`: Acesso dentro da mesma classe, subclasse e pacote.
   - (sem especificador): Acesso dentro da mesma classe e pacote.

Em resumo, o encapsulamento em Java é alcançado definindo os atributos de uma classe como privados e fornecendo métodos públicos (getters e setters) para acessar e modificar esses atributos. Isso ajuda a proteger os dados da classe e oferece um nível de abstração e controle sobre como esses dados são manipulados.

### Herança em Java

A herança é um dos princípios fundamentais da programação orientada a objetos e é amplamente utilizada na linguagem de programação Java. Ela permite que uma classe (chamada de subclasse ou classe derivada) herde atributos e métodos de outra classe (chamada de superclasse ou classe base). A herança no Java é usada para promover a reutilização de código e criar uma hierarquia de classes.

Aqui estão os conceitos-chave de como a herança funciona no Java:

1. **Superclasse e Subclasse**: No Java, você começa definindo uma classe base (superclasse) com atributos e métodos comuns que você deseja compartilhar com outras classes. Em seguida, você cria uma classe derivada (subclasse) que herda os membros da superclasse.

2. **Palavra-chave `extends`**: Para criar uma subclasse que herda de uma superclasse, você utiliza a palavra-chave `extends`. A subclasse declara a superclasse da seguinte forma:

   ```java
   public class Subclasse extends Superclasse {
       // Atributos e métodos da subclasse
   }
   ```

3. **Membros Herdados**: A subclasse herda todos os atributos e métodos públicos e protegidos da superclasse. Os membros privados não são herdados.

4. **Sobrescrita de Métodos**: Uma subclasse pode fornecer uma implementação específica para um método herdado da superclasse. Isso é chamado de sobrescrita de método. A assinatura do método (nome, tipo de retorno e parâmetros) na subclasse deve ser a mesma que na superclasse.

   ```java
   @Override
   public void metodoDaSuperclasse() {
       // Implementação da subclasse
   }
   ```

5. **Chamada a Métodos da Superclasse**: Você pode chamar métodos da superclasse na subclasse usando a palavra-chave `super`. Isso é útil quando você deseja executar o código da superclasse antes ou depois de adicionar a lógica da subclasse.

   ```java
   public void metodoDaSubclasse() {
       super.metodoDaSuperclasse(); // Chama o método da superclasse
       // Implementação da subclasse
   }
   ```

6. **Construtores**: O construtor da superclasse pode ser chamado a partir do construtor da subclasse usando `super()`. Isso garante que os atributos herdados sejam inicializados corretamente.

   ```java
   public Subclasse() {
       super(); // Chama o construtor da superclasse
       // Inicialização adicional da subclasse
   }
   ```

A herança é uma forma poderosa de organizar e estender classes no Java. No entanto, lembre-se de que o Java suporta apenas herança única (uma classe só pode herdar de uma superclasse), o que limita a flexibilidade em comparação com outros mecanismos de herança múltipla encontrados em algumas outras linguagens. Além disso, é importante usar a herança com sabedoria para evitar acoplamento excessivo e problemas de manutenção de código.

### Polimorfismo em Java

O polimorfismo é um dos conceitos fundamentais na programação orientada a objetos e é amplamente utilizado na linguagem de programação Java. O polimorfismo permite que objetos de diferentes classes sejam tratados de maneira uniforme, proporcionando uma maior flexibilidade e extensibilidade em seu código. Existem dois tipos principais de polimorfismo em Java: polimorfismo de sobrecarga (compile-time) e polimorfismo de sobrescrita (runtime).

1. Polimorfismo de Sobrecarga (Compile-time Polymorphism):
   Este tipo de polimorfismo ocorre durante a fase de compilação do código e envolve a sobrecarga de métodos em uma classe. A sobrecarga de métodos é quando você tem vários métodos com o mesmo nome em uma classe, mas com diferentes parâmetros. O compilador decide qual método chamar com base no número e nos tipos de argumentos fornecidos. Isso é comumente conhecido como "sobrecarga de método".

   Exemplo de polimorfismo de sobrecarga:

   ```java
   public class Calculator {
       public int add(int a, int b) {
           return a + b;
       }
       public double add(double a, double b) {
           return a + b;
       }
   }
   ```

   No exemplo acima, a classe `Calculator` possui dois métodos `add`, um para inteiros e outro para números de ponto flutuante. O compilador decide qual método chamar com base nos tipos de argumentos passados.

2. Polimorfismo de Sobrescrita (Runtime Polymorphism):
   Este tipo de polimorfismo ocorre durante a execução do programa e envolve a substituição de métodos em classes relacionadas por meio da herança. O polimorfismo de sobrescrita é frequentemente chamado de "sobrescrita de método". Para que ele funcione, você deve ter uma classe pai (superclasse) e uma classe filha (subclasse) com um método na superclasse que é sobrescrito na subclasse.

   Exemplo de polimorfismo de sobrescrita:

   ```java
   class Animal {
       public void makeSound() {
           System.out.println("Animal makes a sound");
       }
   }

   class Dog extends Animal {
       @Override
       public void makeSound() {
           System.out.println("Dog barks");
       }
   }

   class Cat extends Animal {
       @Override
       public void makeSound() {
           System.out.println("Cat meows");
       }
   }
   ```

   Nesse exemplo, as classes `Dog` e `Cat` herdam da classe `Animal` e sobrescrevem o método `makeSound`. Quando você chama `makeSound` em uma instância de `Animal`, a implementação específica da classe concreta (Dog ou Cat) é chamada em tempo de execução, permitindo o polimorfismo.

O polimorfismo é uma técnica poderosa que ajuda a escrever código flexível e extensível em Java, permitindo que você trabalhe com objetos de diferentes tipos de maneira mais genérica. Isso é fundamental para o princípio da programação orientada a objetos e ajuda na criação de hierarquias de classes bem organizadas e reutilizáveis.

### Exceções em Java

Em Java, as exceções são eventos que ocorrem durante a execução de um programa e que podem interromper o fluxo normal de execução. As exceções são usadas para lidar com situações de erro, como divisão por zero, acesso a um elemento fora dos limites de um array, tentativa de abrir um arquivo que não existe, entre outros. O tratamento de exceções é uma parte importante da programação em Java, e é feito por meio do uso de blocos try-catch, juntamente com outras construções relacionadas.

Aqui estão os principais conceitos relacionados a exceções em Java:

1. **Tipos de Exceção:** Em Java, as exceções são representadas como objetos de classes que herdam da classe `java.lang.Exception`. Existem duas categorias principais de exceções: exceções verificadas (checked exceptions) e exceções não verificadas (unchecked exceptions).

   - Exceções verificadas: Essas são exceções que o compilador Java requer que você lide explicitamente usando blocos try-catch ou declarando-as em uma cláusula `throws` na assinatura de um método. Por exemplo, `IOException` é uma exceção verificada.

   - Exceções não verificadas: São exceções que não precisam ser tratadas explicitamente pelo código. Elas geralmente ocorrem devido a erros de programação, como divisão por zero ou acesso a índices inválidos em arrays. Por exemplo, `NullPointerException` é uma exceção não verificada.

2. **Blocos try-catch:** Você pode usar blocos `try` e `catch` para lidar com exceções. O código que pode gerar uma exceção é colocado no bloco `try`, enquanto o código que lida com a exceção é colocado no bloco `catch`.

   ```java
   try {
       // Código que pode gerar uma exceção
   } catch (ExcecaoType e) {
       // Código para lidar com a exceção
   }
   ```

3. **Bloco finally:** Você pode opcionalmente usar um bloco `finally` para conter código que será executado, independentemente de uma exceção ser lançada ou não.

   ```java
   try {
       // Código que pode gerar uma exceção
   } catch (ExcecaoType e) {
       // Código para lidar com a exceção
   } finally {
       // Código que será executado sempre
   }
   ```

4. **Lançamento de exceções:** Você pode lançar uma exceção explicitamente usando a palavra-chave `throw`. Isso é útil quando você deseja indicar que ocorreu um erro específico em seu código.

   ```java
   throw new MinhaExcecao("Ocorreu um erro personalizado.");
   ```

5. **Declaração de exceções em métodos:** Se um método pode lançar exceções, você deve declará-las na assinatura do método usando a palavra-chave `throws`. Isso informa aos chamadores do método que eles precisam lidar com essas exceções.

   ```java
   public void meuMetodo() throws MinhaExcecao {
       // Código que pode lançar MinhaExcecao
   }
   ```

6. **Cláusula throws:** Você pode usar a cláusula `throws` em um método para indicar que o método pode lançar exceções verificadas.

   ```java
   public void meuMetodo() throws MinhaExcecao {
       // Código que pode lançar MinhaExcecao
   }
   ```

7. **Exceções personalizadas:** Você pode criar suas próprias classes de exceção personalizadas estendendo `Exception` ou `RuntimeException`, dependendo do tipo de exceção que deseja criar.

   ```java
   public class MinhaExcecao extends Exception {
       // Construtores e métodos personalizados
   }
   ```

Lidar adequadamente com exceções é importante para criar código robusto e confiável em Java. Certifique-se de entender as exceções específicas que seu código pode lançar ou capturar e trate-as apropriadamente para evitar falhas inesperadas.

### Qual a função do `static` em Java?

A palavra-chave `static` é usada para criar membros (variáveis ou métodos) que pertencem à classe em si, em vez de pertencerem a instâncias específicas (objetos) dessa classe. A principal função do modificador `static` é associar membros a uma classe em vez de a objetos individuais. Isso tem várias implicações:

1. **Variáveis Estáticas (Static Fields):** Quando você declara uma variável como `static`, ela é compartilhada entre todas as instâncias da classe. Isso significa que todas as instâncias da classe têm acesso a essa variável e compartilham o mesmo valor. Variáveis estáticas são muitas vezes usadas para armazenar valores comuns a todas as instâncias da classe.

   Exemplo:

   ```java
   public class MinhaClasse {
       static int contador = 0;

       public MinhaClasse() {
           contador++;
       }
   }
   ```

2. **Métodos Estáticos (Static Methods):** Métodos estáticos pertencem à classe em si, não a instâncias específicas. Isso significa que você pode chamar um método estático diretamente na classe, sem precisar criar uma instância da classe. Métodos estáticos são frequentemente usados para funções utilitárias que não dependem do estado de objetos individuais.

   Exemplo:

   ```java
   public class MinhaClasse {
       static void metodoEstatico() {
           // Código do método estático
       }
   }

   // Chamando o método estático
   MinhaClasse.metodoEstatico();
   ```

3. **Blocos Estáticos (Static Blocks):** Blocos estáticos são usados para inicializar variáveis estáticas ou executar código que precisa ser executado apenas uma vez quando a classe é carregada. Eles são úteis para tarefas de inicialização que não dependem de instâncias da classe.

   Exemplo:

   ```java
   public class MinhaClasse {
       static {
           // Código de inicialização estática
       }
   }
   ```

O uso de membros estáticos é comum quando você deseja compartilhar informações ou funcionalidades em toda a classe, independentemente das instâncias individuais. No entanto, é importante notar que variáveis e métodos estáticos não têm acesso aos membros de instância não estáticos, porque eles não estão associados a uma instância específica da classe. Em vez disso, eles acessam apenas outros membros estáticos ou membros públicos de instância por meio de uma instância específica da classe.

### Exemplos de Construtores

1. **Construtor Padrão (sem argumentos):**

   ```java
   public class ConstrutorExemplo {
       public ConstrutorExemplo() {
           System.out.println("Construtor Padrão");
       }
   
       public static void main(String[] args) {
           ConstrutorExemplo obj = new ConstrutorExemplo(); // Chama o construtor padrão
       }
   }
   ```

2. **Construtor com Argumentos:**

   ```java
   public class ConstrutorComArgumentos {
       private int valor;

       public ConstrutorComArgumentos(int valorInicial) {
           valor = valorInicial;
       }

       public void exibirValor() {
           System.out.println("Valor: " + valor);
       }

       public static void main(String[] args) {
           ConstrutorComArgumentos obj = new ConstrutorComArgumentos(42); // Chama o construtor com argumentos
           obj.exibirValor(); // Exibe o valor inicial
       }
   }
   ```

3. **Sobrecarga de Construtores:**

   ```java
   public class SobrecargaConstrutores {
       private int valor;

       public SobrecargaConstrutores() {
           valor = 0; // Construtor padrão
       }

       public SobrecargaConstrutores(int valorInicial) {
           valor = valorInicial; // Construtor com argumento
       }

       public void exibirValor() {
           System.out.println("Valor: " + valor);
       }

       public static void main(String[] args) {
           SobrecargaConstrutores obj1 = new SobrecargaConstrutores(); // Chama o construtor padrão
           SobrecargaConstrutores obj2 = new SobrecargaConstrutores(42); // Chama o construtor com argumento
           obj1.exibirValor(); // Exibe o valor inicializado pelo construtor padrão
           obj2.exibirValor(); // Exibe o valor inicializado pelo construtor com argumento
       }
   }
   ```

4. **Construtor de Cópia (Clonagem de Objetos):**

   ```java
   public class ConstrutorCopia {
       private int valor;

       public ConstrutorCopia(int valorInicial) {
           valor = valorInicial;
       }

       // Construtor de cópia
       public ConstrutorCopia(ConstrutorCopia outro) {
           valor = outro.valor;
       }

       public void exibirValor() {
           System.out.println("Valor: " + valor);
       }

       public static void main(String[] args) {
           ConstrutorCopia objOriginal = new ConstrutorCopia(42); // Cria um objeto original
           ConstrutorCopia objCopia = new ConstrutorCopia(objOriginal); // Cria uma cópia
           objOriginal.exibirValor(); // Exibe o valor do objeto original
           objCopia.exibirValor(); // Exibe o valor do objeto de cópia
       }
   }
   ```

Esses exemplos demonstram vários tipos de construtores em Java, incluindo o construtor padrão, construtores com argumentos, sobrecarga de construtores e um construtor de cópia para clonagem de objetos. Cada tipo de construtor é útil em diferentes situações, dependendo das necessidades do seu programa.

### *Wrapper classes* em Java

As *wrapper classes* (ou classes de invólucro) são um conjunto de classes que fornecem um invólucro ao redor dos tipos primitivos. Isso permite que os tipos primitivos sejam tratados como objetos em situações em que os objetos são necessários. As wrapper classes são usadas para converter tipos primitivos em objetos, facilitando sua manipulação em contextos que requerem objetos, como coleções (por exemplo, Listas, Mapas) ou ao trabalhar com APIs que aceitam apenas objetos.

Aqui estão as principais wrapper classes em Java e os tipos primitivos que elas representam:

1. `Integer`: Representa valores inteiros. O tipo primitivo correspondente é `int`.

2. `Long`: Representa valores longos. O tipo primitivo correspondente é `long`.

3. `Short`: Representa valores curtos. O tipo primitivo correspondente é `short`.

4. `Byte`: Representa valores de byte. O tipo primitivo correspondente é `byte`.

5. `Float`: Representa valores de ponto flutuante de precisão simples. O tipo primitivo correspondente é `float`.

6. `Double`: Representa valores de ponto flutuante de precisão dupla. O tipo primitivo correspondente é `double`.

7. `Character`: Representa caracteres únicos. O tipo primitivo correspondente é `char`.

8. `Boolean`: Representa valores booleanos. O tipo primitivo correspondente é `boolean`.

As wrapper classes são usadas para criar objetos a partir de valores primitivos ou para extrair valores primitivos de objetos. Elas também fornecem métodos e constantes úteis para realizar operações comuns em valores primitivos. Por exemplo, as classes `Integer` e `Double` têm métodos para converter uma string em seu tipo correspondente, realizar operações matemáticas e muito mais.

Aqui está um exemplo de como usar uma wrapper class, como `Integer`, para converter um valor primitivo em um objeto:

```java
int valorPrimitivo = 42;
Integer valorObjeto = Integer.valueOf(valorPrimitivo); // Conversão de int para Integer

System.out.println("Valor primitivo: " + valorPrimitivo);
System.out.println("Valor objeto: " + valorObjeto);
```

O uso de wrapper classes é comum em situações onde tipos primitivos precisam ser tratados como objetos, especialmente ao trabalhar com coleções e APIs que esperam objetos em vez de tipos primitivos.
