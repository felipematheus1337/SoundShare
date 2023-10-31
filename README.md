# MusicShare - Plataforma de Compartilhamento de Músicas em Tempo Real
### Visão Geral
O MusicShare é uma plataforma de compartilhamento de músicas em tempo real que permite aos usuários compartilhar e ouvir músicas juntos, participar de chats temáticos de gênero musical e receber notificações em tempo real sobre novas músicas e atividades de amigos. Esta plataforma é construída com base em várias tecnologias modernas e conceitos de microsserviços.

### Tecnologias Utilizadas
Java: A linguagem de programação principal do lado do servidor, usando o framework Spring Boot.

Angular: O framework de desenvolvimento front-end.

MongoDB: Banco de dados NoSQL para armazenamento de dados de usuário, mensagens e informações sobre músicas.

Redis: Armazenamento em cache para melhorar o desempenho e acelerar consultas frequentes.

Kafka e RabbitMQ: Sistemas de mensageria para notificações em tempo real.

Spring WebSocket: Para criar uma experiência de bate-papo em tempo real.

AWS S3: Armazenamento em nuvem para arquivos de mídia, como músicas.

OAuth2: Para autenticação segura dos usuários.

### Funcionalidades Principais
Compartilhamento de Músicas: Os usuários podem enviar suas músicas para a plataforma, que são armazenadas no AWS S3 e catalogadas no MongoDB.

Chat em Tempo Real: Os usuários podem participar de chats com base em gênero musical, onde podem conversar e compartilhar músicas.

Notificações em Tempo Real: Os usuários recebem notificações em tempo real sobre novas músicas, listas de reprodução compartilhadas e atividades de amigos.

Gerenciamento de Perfil de Usuário: Os usuários podem criar e atualizar seus perfis, incluindo preferências de gênero musical.

## Estrutura de Microsserviços
O projeto é implementado usando uma arquitetura de microsserviços com os seguintes componentes:

Serviço de Usuário: Gerencia informações de usuário, perfil e gêneros musicais favoritos.

Serviço de Música: Lida com o armazenamento e recuperação de músicas no AWS S3 e MongoDB.

Serviço de Chat: Implementa o chat em tempo real, permitindo que os usuários enviem e recebam mensagens em chats temáticos.

Serviço de Notificações: Utiliza Kafka ou RabbitMQ para enviar notificações em tempo real sobre novas músicas e atividades de amigos.

Serviço de Cache: Utiliza o Redis para armazenamento em cache de dados e recursos frequentemente acessados.

## Como Executar o Projeto
Requisitos
JDK 11 ou superior
Node.js e Angular CLI (para o front-end)
MongoDB
Redis
Kafka ou RabbitMQ
AWS S3 (ou configurações de armazenamento em nuvem equivalente)
Passos
Clone este repositório:
shell
Copy code
git clone https://github.com/felipematheus1337/SoundShare.git
cd music-share
Configuração de Variáveis de Ambiente:

Configure as variáveis de ambiente necessárias, como as credenciais do AWS S3, informações de conexão com o MongoDB, Redis e Kafka/RabbitMQ.

Inicie os serviços de microsserviço (Serviço de Usuário, Serviço de Música, Serviço de Chat, Serviço de Notificações e Serviço de Cache).

Inicie o front-end (pasta music-share-frontend) com o Angular CLI.

Abra o aplicativo em seu navegador.

Comece a compartilhar músicas, participar de chats temáticos e receber notificações em tempo real!

Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas ou enviar solicitações de pull para melhorar este projeto.

Licença
Este projeto é licenciado sob a Licença MIT.

