<img src="https://user-images.githubusercontent.com/38113015/110805359-c4c9de00-825f-11eb-991e-25f4c98e1518.png" width="100"> 

# Capacitação QA Testes e Automação 
Desafio de automação de testes da empresa DBServer, desenvolvido para realizar testes utilizando o serviço do link https://viacep.com.br/ws/91060900/json.

## Execução
<ul>
  <li>Abra um ambiente de desenvolvimento JAVA</li>
  <li>Abra o projeto desafio-web</li>
  <li>Acesse as classe que estão localizadas no pacote "src/test/java/TestCases/viaCep"</li>
  <li>Execute as classe clicando no botão Run</li>
</ul>

## Tecnologias utilizadas
<li>JUnit5</li>
<li>Java</li>
<li>Gradle</li>

## Testes
<li>Consulta CEP válido, é retornado o CEP, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd e siafi.</li>
<li>Consulta CEP inexistente, é retornado um atributo erro.</li>
<li>Consulta CEP inválido, é retornado uma mensagem de erro.</li>
<li>Consulta o retorno do link https://viacep.com.br/ws/RS/Gravatai/Barroso/json, é retornado o logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd e siafi das duas cidades.</li>
