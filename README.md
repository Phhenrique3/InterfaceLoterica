### InterfaceLoterica ### 

Este é um programa simples em Java que simula uma interface para fazer apostas em três tipos diferentes de jogos. Vou explicar as bibliotecas usadas e cada linha do código a seguir:
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

### Bibliotecas Utilizadas ### 

  ### javax.swing ###
* javax.swing.* é a principal biblioteca usada para criar interfaces gráficas em Java. Ela fornece classes para criar janelas, botões, rótulos, etc.
java.awt
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
###java.awt.*## 
* é uma biblioteca usada para criar elementos de interface gráfica, como o painel e o layout.
 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### java.awt.event ###
* java.awt.event.* contém classes para tratar eventos de interface do usuário, como clique de botões.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### java.util.Random ###
* java.util.Random é uma classe que gera números aleatórios, usada neste programa para gerar números sorteados.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### javax.swing.text.DocumentFilter ### 
* javax.swing.text.DocumentFilter é usado para filtrar a entrada de texto em campos de texto. No entanto, parece que esta importação não está sendo usada no código.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### javax.swing.JTextField ###
* javax.swing.JTextField é uma classe usada para criar campos de texto.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Explicação do Código### 
Classe InterfaceLoterica (construtor)
public InterfaceLoterica() { - 

* Este é o construtor da classe InterfaceLoterica. Ele é chamado quando uma instância da classe é criada. O construtor define a aparência da janela principal e configura os botões e seus ouvintes (listeners).
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

### this.setTitle("Lotofácil");### 
*  Define o título da janela como "Lotofácil".
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### this.setSize(300, 200); ### 
*  Define o tamanho da janela como 300 pixels de largura e 200 pixels de altura.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### painel.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 20)); ###

* Configura o layout do painel para usar um FlowLayout com alinhamento central, uma margem horizontal de 40 pixels e uma margem vertical de 20 pixels.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### painel.setBackground(new Color(45, 30, 50)); ###
* Define a cor de fundo do painel como uma cor personalizada.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### painel.add(jButtonAposta1); ###
* Adiciona o botão jButtonAposta1 ao painel.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### painel.add(jButtonAposta2); ###
* Adiciona o botão jButtonAposta2 ao painel.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

###  painel.add(jButtonAposta3 ###
* Adiciona o botão jButtonAposta3 ao painel.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

### jButtonAposta1.addActionListener(new ActionListener() { ###

* Define um ouvinte de ação para jButtonAposta1. Quando esse botão é clicado, um diálogo de entrada é exibido, e o resultado do jogo é mostrado em uma caixa de mensagem.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### jButtonAposta2.addActionListener(new ActionListener() { ###
* Define um ouvinte de ação para jButtonAposta2. Quando esse botão é clicado, um diálogo de entrada é exibido para adivinhar uma letra.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### jButtonAposta3.addActionListener(new ActionListener() { ###
* Define um ouvinte de ação para jButtonAposta3. Quando esse botão é clicado, um diálogo de entrada é exibido para adivinhar um número par ou ímpar.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### this.getContentPane().add(painel); ###
* Adiciona o painel à janela.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### this.setLocationRelativeTo(null); ###
* Centraliza a janela na tela.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### this.setDefaultCloseOperation(EXIT_ON_CLOSE); ###
* Define o comportamento de fechamento da janela.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
### this.setVisible(true);### 
* Torna a janela visível.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

### Método main ### 
* public static void main(String[] args) { - O método principal que cria uma instância da classe InterfaceLoterica, iniciando o programa.
 ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 ### Random random = new Random(); ###
 Cria uma instância da classe Random para gerar números aleatórios.

  
