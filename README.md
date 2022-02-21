# Challange-Capgemini-Academy-2022
DESAFIO DE PROGRAMAÇÃO - ACADEMIA CAPGEMINI
(Challanger Capemini Academy Developer 2022)

O objetivo geral do desafio é testar a logica de programacao na seleção para a academia capgemini.

# Tecnologias Utilizadas

Linguagem de Programacao: Java

IDE: intellij IDEA

# Casos de usos

Questão 01

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

Resposta: Na primeira questao foi feito um simples for, que gera nossa escada em ordem. No nosso exemplo, testamos uma escada de 6 degraus.

Onde temos a saida:

![image](https://user-images.githubusercontent.com/63883466/154873811-504618e6-6a32-4d29-a766-15c667ab021f.png)

Questão 02

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro 
exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma
senha forte quando ela satisfaz os seguintes critérios:

Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para
ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados
para uma string qualquer ser considerada segura.

Resposta: Na segunda, usamos o termo regex(expressao regular), para verificar nossa password e validar as senhas. 
Neste caso, utilizamos um Classe principal. Que utiliza-se de uma Classe segundaria, que realiza a validacao dos casos
de uso. 
Usamos expressões regulares para validar nossa senha!
      @param senha para validação
      @return senha válida verdadeira, falsa senha inválida

saida:

![image](https://user-images.githubusercontent.com/63883466/154874252-2224f353-bbb2-4c21-ba7b-b68ec5b060e3.png)

Questão 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para
formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de 
substrings que são anagramas.

Resposta: Tive um pouco de problema para resolver essa questao, porem consegui! Onde fiz uma funcao do tipo boolean,
que faz uma comparacao entra as variaveis. Em seguida, e criado dois arrays que recebem essas variaveis.
Em seguina no meu main, solicito o usuario os dois valores de entrada e mostro na tela se as palavras sao anagramas.

saida:

![image](https://user-images.githubusercontent.com/63883466/154875011-f7ad9701-d9a2-40e9-8a00-e7978c8a1499.png)

Observacoes:
-> Nao consegui implementar os testes unitarios, mas tentei.
-> Nao sei se ficou bom meu codigo, pois minha stack de estudo e javascript e node. Mas tentei e isso é o que importa, e lembrei algumas coisas de java.


  






