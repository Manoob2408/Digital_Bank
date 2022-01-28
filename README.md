# Digital Bank

### Conceitos de Programação Orientada a Objetos estudados:
#### 1. Herança
#### 2. Polimorfismo
#### 3. Sobrescrita
#### 4. Encapsulamento
#### 5. Abstração

## Herança
>É o relacionamento entre classes em que uma 
> classe chamada de subclasse (classe filha, 
> classe derivada) é uma extensão, um subtipo, de 
> outra classe chamada de superclasse (classe pai, 
> classe mão, classe base).

No projeto  em específico, possuímos a classe **Conta** 
como a **Classe mãe**. E as classes **Conta Corrente** 
e **Conta Poupança** como filhas.

## Polimorfismo
>O polimorfismo permite escrever programas que processam 
> objetos que compartilham a mesma superclasse 
> (direta ou indiretamente) como se todos fossem objetos da 
> superclasse; isso pode simplificar a programação.

> Em outras palavras, podemos ver o polimorfismo como a 
> possibilidade de um mesmo método ser executado de forma 
> diferente de acordo com a classe do objeto que aciona o 
> método e com os parâmetros passados para o método.

> O polimorfismo pode ser obtido pela utilização dos 
> conceitos de **herança**, **sobrecarga de métodos** e 
> **sobrescrita de método** (também conhecida como redefinição 
> ou reescrita de método).

Possuímos o método **imprimirExtrato** sendo executado de forma
diferente nas classes filhas.

## Sobrescrita
>A técnica de sobrescrita permite reescrever um método 
> em uma subclasse de forma que tenha comportamento 
> diferente do método de mesma assinatura existente na 
> sua superclasse.

Isso acontece no próprio método **imprimirExtrato**

## Encapsulamento
>Encapsulamento é uma técnica utilizada para restringir o 
> acesso a variáveis (atributos), métodos ou até à própria 
> classe. Os detalhes da implementação ficam ocultos ao 
> usuário da classe, ou seja, o usuário passa a utilizar os 
> métodos de uma classe sem se preocupar com detalhes sobre 
> como o método foi implementado internamente.

Utilizamos isso quando definimos os atributos ou métodos de uma
classe como **public**, **protected** ou **private**.

## Abstração
>Abstração é a habilidade de concentrar nos aspectos 
> essenciais de um contexto qualquer, ignorando 
> características menos importantes ou acidentais. 
> Em modelagem orientada a objetos, uma classe é uma 
> abstração de entidades existentes no domínio do sistema 
> de software.

Fazemos isso ao definir apenas os atributos essenciais para nossas classes.

Links: 

[Programação Orientada a Objetos](http://redeetec.mec.gov.br/images/stories/pdf/eixo_infor_comun/tec_inf/081112_progr_obj.pdf)

[Java e Orientação a Objetos](https://www.caelum.com.br/apostila/apostila-java-orientacao-objetos.pdf)