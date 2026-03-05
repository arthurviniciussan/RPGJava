•Descrição do Jogo e Fluxo do Programa

O nosso projeto consiste no desenvolvimento de um RPG de texto em Java, executado diretamente no terminal. A proposta do jogo é oferecer uma experiência baseada em narrativa e combate, utilizando apenas texto e cores para criar imersão no jogador. Nosso foco neste momento é definir o fluxo geral do jogo, ou seja, como o jogador irá percorrer cada etapa do sistema.

O jogo começa com um sistema de login, onde o jogador deverá informar um usuário e uma senha para acessar o sistema. Essa etapa inicial serve para identificar o jogador antes do início da aventura.

Após o login, o jogador será direcionado para a etapa de criação do personagem. Nesse momento, ele poderá definir algumas características básicas do seu personagem dentro do universo do jogo. Entre as opções disponíveis, o jogador poderá escolher uma classe de RPG, podendo optar entre Guerreiro, Tank ou Assassino. Além disso, também serão solicitadas informações como idade e gênero do personagem. Essas escolhas ajudam a personalizar a experiência do jogador dentro da história.

Depois da criação do personagem, iniciamos a introdução da história do jogo. Essa parte será apresentada em formato de texto narrativo, exibido lentamente no terminal para criar um efeito mais imersivo. Algumas partes do texto serão destacadas com cores, ajudando a enfatizar momentos importantes da narrativa e tornando a leitura mais dinâmica para o jogador.

Em seguida, o jogador será levado para a parte principal do jogo: as dungeons de combate. No MVP (Minimum Viable Product) do projeto, o sistema de combate será simples, oferecendo duas opções principais ao jogador durante as batalhas: atacar ou utilizar uma poção de cura. O objetivo é criar um sistema funcional de batalha que permita ao jogador enfrentar diferentes inimigos ao longo da progressão do jogo.

As dungeons serão organizadas em uma progressão de cinco salas, onde cada sala apresenta um inimigo diferente. À medida que o jogador avança, os inimigos se tornam mais fortes, aumentando gradualmente o nível de desafio. A ordem dos inimigos será a seguinte:

Sala 1: Esqueleto

Sala 2: Goblin

Sala 3: Demônio

Sala 4: Cavaleiro Negro

Sala 5: Rei Demônio

Ao todo, o jogo será dividido em sete cenas principais, que representam o fluxo completo da experiência do jogador:

Cena 1 – Introdução: apresentação da história e contextualização do jogador no mundo do jogo.

Cena 2 – Combate contra o Esqueleto.

Cena 3 – Combate contra o Goblin.

Cena 4 – Combate contra o Demônio.

Cena 5 – Combate contra o Cavaleiro Negro.

Cena 6 – Combate contra o Rei Demônio.

Cena 7 – Final: conclusão da história após o último combate.

Após derrotar o inimigo final, o jogador verá a parte final da narrativa, que servirá como encerramento da história do jogo. Assim como na introdução, essa parte também será apresentada em forma de texto narrativo, permitindo concluir a jornada do personagem dentro do universo que criamos.

Com essa estrutura, buscamos organizar de forma clara o fluxo do programa, mostrando como o jogador irá progredir desde o login inicial até o final da história, passando pela criação do personagem, introdução narrativa e sequência de combates nas dungeons. Nosso objetivo nesta etapa é apresentar a lógica geral da experiência do jogo, sem necessariamente entrar nos detalhes técnicos de implementação.









•Matérias

1. Algoritmos e Programação

A disciplina de Algoritmos e Programação constitui um dos principais fundamentos para o desenvolvimento do nosso jogo de RPG utilizando a linguagem Java. Essa área do conhecimento nos fornece as bases da lógica computacional, permitindo que possamos organizar e estruturar as instruções que determinam o funcionamento do sistema.

No contexto do nosso projeto, os algoritmos são utilizados para definir a lógica das mecânicas do jogo, como o sistema de combate, a movimentação entre as salas, o cálculo de dano, o gerenciamento de atributos e as interações com o ambiente virtual. Por meio de estruturas de controle, como condicionais e laços de repetição, conseguimos programar o comportamento do jogo de forma dinâmica e organizada.

Além disso, a linguagem Java nos permite aplicar conceitos da programação orientada a objetos, possibilitando a criação de classes e objetos que representam os elementos presentes no jogo, como personagens, inimigos e itens. Essa abordagem contribui para uma melhor organização do código, facilitando sua manutenção, reutilização e expansão ao longo do desenvolvimento.

Dessa forma, a disciplina de Algoritmos e Programação desempenha um papel essencial na construção da lógica central do nosso jogo, permitindo que possamos transformar ideias e conceitos em funcionalidades concretas dentro do sistema.





2. Banco de Dados

A disciplina de Banco de Dados contribui significativamente para o desenvolvimento do nosso projeto ao possibilitar o armazenamento, a organização e o gerenciamento das informações geradas pelo jogo. Em um jogo de RPG, é necessário lidar com uma grande quantidade de dados relacionados ao progresso do jogador e aos elementos presentes no universo do jogo.

Em nosso projeto, o banco de dados pode ser utilizado para armazenar informações como dados dos personagens, inventário de itens e progresso do jogador ao longo da narrativa. Dessa forma, conseguimos preservar essas informações mesmo após o encerramento da sessão de jogo, permitindo que o jogador continue sua jornada posteriormente sem perda de dados.

Além disso, a utilização de bancos de dados contribui para uma melhor organização das informações, facilitando a consulta, atualização e gerenciamento dos dados durante a execução do sistema. Essa estrutura permite que as informações sejam manipuladas de forma eficiente, garantindo maior confiabilidade e integridade dos dados.

Portanto, a aplicação dos conceitos de Banco de Dados em nosso projeto é fundamental para garantir o armazenamento seguro e estruturado das informações, contribuindo para o funcionamento adequado e contínuo do jogo.






3. Interface no Terminal e Experiência do Usuário

No desenvolvimento do nosso jogo de RPG, a interação com o usuário será realizada por meio do terminal, utilizando apenas a execução do código em Java. Dessa forma, não haverá uma interface gráfica tradicional, sendo necessário organizar todas as informações e interações diretamente por meio de textos exibidos na tela.

Nesse contexto, torna-se fundamental planejar cuidadosamente a forma como as informações serão apresentadas ao jogador, garantindo que os comandos, mensagens e opções estejam organizados de maneira clara e compreensível. A estruturação adequada dos textos no terminal permite que o usuário entenda facilmente as ações disponíveis, como movimentação e progressão no jogo.

Além disso, pretendemos utilizar recursos de coloração de texto no terminal para melhorar a visualização das informações. Essa estratégia possibilita destacar elementos importantes do jogo, como mensagens de combate, danos causados, avisos do sistema e resultados das ações do jogador. Por exemplo, cores diferentes podem ser utilizadas para representar ataques, mensagens de erro ou eventos importantes durante a partida.

Portanto, mesmo utilizando apenas o terminal como meio de interação, buscamos aplicar princípios de organização e clareza na apresentação das informações, utilizando a formatação e a coloração dos textos para proporcionar uma experiência de uso mais intuitiva e agradável para o jogador.





•Usuário mínimo e usuário perfeito



1.Público-alvo

O público-alvo do nosso projeto são pessoas que gostam de jogos do gênero RPG, principalmente aqueles que se interessam por histórias de fantasia, evolução de personagens e tomadas de decisão durante o jogo. Como o nosso jogo será executado por meio do terminal, ele é voltado para usuários que possuem pelo menos uma familiaridade básica com o uso de computadores.

Além disso, buscamos atingir jogadores que gostam de experiências baseadas em leitura e escolhas, já que grande parte da interação do jogo acontece por meio de textos exibidos no terminal. Nosso objetivo é proporcionar uma experiência simples, mas envolvente, onde o jogador possa acompanhar a evolução do personagem e participar da história do jogo.



2.Usuário mínimo

O usuário mínimo representa o perfil básico necessário para conseguir jogar o nosso jogo sem grandes dificuldades. Para isso, consideramos que o usuário precisa ter conhecimentos básicos sobre o uso do computador, como abrir programas, utilizar o teclado e interagir com o terminal.

Também é importante que o jogador seja alfabetizado, já que todas as ações do jogo dependem da leitura das mensagens que aparecem na tela e da escolha de opções durante a partida. Pensando nisso, estimamos uma idade mínima de aproximadamente 10 anos, pois nessa fase a maioria das pessoas já possui uma capacidade de leitura e compreensão suficiente para acompanhar o jogo.

Outro ponto importante é que o usuário mínimo precisa ter paciência, já que o jogo exige atenção para ler os textos e entender as situações apresentadas antes de tomar uma decisão.



3.Usuário perfeito

Para nós, o usuário perfeito do jogo seria um adolescente entre 14 e 17 anos que tenha interesse pelo gênero fantasia e goste de jogos de RPG. Esse tipo de jogador normalmente se envolve mais com a história, com os personagens e com os desafios que aparecem ao longo do jogo.

Além disso, acreditamos que o usuário ideal seja uma pessoa curiosa e paciente, que goste de explorar as possibilidades do jogo e acompanhar o desenvolvimento da narrativa com atenção.

Outro fator que contribui bastante é ter alguma experiência com RPG, seja em jogos digitais ou até mesmo em outros tipos de RPG. Isso ajuda o jogador a entender mais facilmente mecânicas como evolução de personagem, combate, itens e tomada de decisões estratégicas, permitindo que ele aproveite melhor a experiência que estamos propondo com o projeto.




