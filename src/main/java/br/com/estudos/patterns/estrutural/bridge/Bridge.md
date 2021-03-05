# Bridge
__________________
## Criar um servidor de streaming
Você precisa desenvolver um sistema de transmissão de lives, eventos ao vivo pela internet.

Mas em vez de conectar somente ao **Youtube** será necessário
que a mesma live seja transmitida na **TwitchTV** e no **Facebook**. Neste momento
temos um problema, afinal as três plataformas trabalham com
os mesmos padrões, porém cada uma com sua especificação.

Podemos criar uma classe enorme com todos os requisitos
das três plataformas, mas isso iria ferir os princípios
do SOLID além de engessar o código.

Todas as plataformas precisam de uma transmissão, conexão, configuração
streaming, endereço IP, então como podemos separar a plataforma
do conceito da live, e escalar para qualquer quantidade de 
plataformas?

## A solução seria usar o Bridge

Podemos quebrar a classe grande em várias? E ainda assim compartilhar
os recursos da transmissão como configuração RMTP, autenticação
e outros métodos necessários parar fazer a Live?

O Bridge é um padrão de projeto estrutural que permite que você divida
uma classe grande em um conjunto de classes intimamente ligadas
em duas hierarquias separadas.

## Abstração e Implementação

Abstração neste caso não tem haver diretamente com interface ou classe 
abstrata

**Abstração** é uma camada de controle de alto nível para alguma
entidade. Neste caso será nossa Live. Essa camada não deve fazer 
nenhum tipo de trabalho por conta própria. Ela deve delegar o trabalho
para a camada de implementação (também chamada de plataforma) - será
Youtube, TwitchTV e Facebook.


