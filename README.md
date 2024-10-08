Sistema de Conta Bancária - Projeto Java


Descrição

Este projeto simula um Sistema de Conta Bancária básico, desenvolvido em Java, utilizando os conceitos de Programação Orientada a Objetos (POO). Ele implementa funcionalidades essenciais como depósito, saque, transferência entre contas e visualização de extrato. O sistema suporta diferentes tipos de contas bancárias (por exemplo, Conta Corrente, Conta Poupança) e utiliza os pilares da POO: abstração, encapsulamento, herança e polimorfismo.


Funcionalidades

Depósito: Adicionar um valor ao saldo da conta bancária.

Saque: Retirar um valor do saldo da conta bancária, respeitando o limite disponível.

Transferência: Transferir um valor de uma conta bancária para outra.

Extrato: Exibir o histórico completo de todas as transações realizadas na conta.

Saldo: Consultar o saldo atual da conta.


Conceitos de POO Utilizados

Abstração: Criamos uma classe abstrata ContaBancaria que define os atributos e comportamentos essenciais de uma conta, como saldo e operações de depositar() e sacar().

Encapsulamento: Protegemos os atributos da classe ContaBancaria e só permitimos que sejam manipulados por métodos específicos, como depositar(), sacar(), e transferir().

Herança: A classe ContaCorrente herda da classe ContaBancaria, reutilizando métodos e atributos, e podendo adicionar novos comportamentos.

Polimorfismo: Usamos polimorfismo para garantir que uma mesma operação, como depositar() ou sacar(), possa ter diferentes implementações dependendo do tipo da conta.

Estrutura do Projeto
├── ContaBancaria.java     # Classe abstrata que define o comportamento básico das contas
├── ContaCorrente.java     # Classe que implementa os métodos de Conta Corrente
└── Banco.java             # Classe principal para simular o funcionamento do sistema

1. ContaBancaria.java
   
Define os atributos e métodos básicos de uma conta bancária, como titular, saldo, e uma lista de transações para o extrato. Os métodos depositar(), sacar() e exibirExtrato() são abstratos e devem ser implementados pelas subclasses.

3. ContaCorrente.java

Esta classe estende ContaBancaria e implementa os métodos de depósito, saque e transferência. Cada transação é registrada no extrato.

4. Banco.java
   
Este arquivo simula o uso das contas bancárias, permitindo criar contas, realizar operações de depósito, saque, transferência e exibir o extrato de transações.


Como Executar o Projeto

Pré-requisitos

Java JDK (versão 8 ou superior) instalado.

IDE ou Editor de Código com suporte a Java (por exemplo, IntelliJ IDEA, Eclipse, VSCode).


Passo a Passo para Rodar

Clone o repositório para sua máquina local:

git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git

Navegue até a pasta do projeto:

cd Projeto-Banco

Compile os arquivos Java:

javac src/*.java

Execute a classe principal (Banco.java):

java src/Banco

Exemplo de Uso

A seguir, um exemplo de como o sistema opera:

Depósito: João deposita R$ 1000,00 em sua conta.

Saque: João saca R$ 200,00.

Transferência: João transfere R$ 300,00 para Maria.

Extrato: Exibe todas as transações realizadas por João e Maria.

Saída Esperada:

Saldo atual: R$0.0

Saldo atual: R$0.0

Depósito de R$ 1000.0 realizado com sucesso.

Depósito de R$ 500.0 realizado com sucesso.

Saldo atual: R$1000.0

Saldo atual: R$500.0

Saque de R$ 200.0 realizado com sucesso.

Saldo atual: R$800.0

Transferência de R$ 300.0 para Maria realizada com sucesso.

Saldo atual: R$500.0

Saldo atual: R$800.0

Extrato João:

Depósito: R$ 1000.0

Saque: R$ 200.0

Transferência para Maria: R$ 300.0


Extrato Maria:

Depósito: R$ 500.0

Transferência recebida de João: R$ 300.0


Contribuição

Se você quiser contribuir com melhorias no projeto:

Faça um fork do repositório.

Crie uma nova branch para sua funcionalidade:

git checkout -b minha-nova-funcionalidade

Faça o commit das suas alterações:

git commit -m "Adiciona nova funcionalidade"

Faça o push para a branch:

git push origin minha-nova-funcionalidade

Abra um Pull Request no repositório original.



Licença
Este projeto é distribuído sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

