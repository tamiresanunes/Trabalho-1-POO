# Trabalho-1-POO

ASCENSORISTA DE NOÉ

Segundo a mitologia, diversos animais foram certa vez abrigados em uma Arca durante uma
grande inundação. Esses bichos, para desfrutarem de todos os espaços da Arca, precisaram
se deslocar entre os andares usando um elevador controlado por um ascensorista (isto é, uma
pessoa responsável por controlar um elevador).
Esse ascensorista é capaz de controlar o elevador para subir e descer, além de coordenar
quem entra e quem sai do elevador e também de controlar sistemas de ar-condicionado e
alagamento. Obviamente, as intenções dos animais para chegarem a um determinado andar e
as características desses animais devem ser consideradas na hora de escolher quem entra e
quem sai.

Por exemplo, alguns bichos precisam que o elevador esteja cheio d’água para serem
transportados (peixes e mamíferos aquáticos), enquanto outros precisam que o elevador
esteja vazio para serem transportados (aves quaisquer, répteis comuns, mamíferos terrestres
e mamíferos voadores). Há também bichos que podem ser transportados em elevadores com
ou sem água (anfíbios e répteis aquáticos). O ascensorista deve controlar o mecanismo de
alagar e drenar o elevador (não se preocupe, pois o ascensorista usa um snorkel quando o
elevador enche d’água). Transportar animais da forma inadequada causa a morte deles.
Adicionalmente, alguns animais sobrevivem apenas em temperaturas muito baixas (animais
polares), enquanto outros precisam de temperaturas mais altas (animais tropicais). Os
animais têm a temperatura ideal que deve estar a, no máximo, 15 graus de diferença (para
mais ou para menos) da temperatura do ar-condicionado do elevador. Transportar animais
com temperatura de ar-condicionado inadequada causa a morte por hipotermia ou
hipertermia.

Outro detalhe importante é que a paciência dos animais nas filas de espera dos elevadores é
limitada. Se um animal espera tempo demais para ser transportado, ele se irrita e vai embora
da fila, reduzindo a quantidade de animais efetivamente transportados.
Finalmente, o elevador possui um peso máximo de animais que pode transportar, embora o
volume que os bichos ocupam não seja considerado (eles vão se contorcendo e se apertando
para caberem todos dentro do elevador). Tentar transportar animais cujo peso excede a
capacidade máxima do elevador impede o movimento do elevador (ele não vai subir ou
descer mesmo quando o controle é acionado).
Os construtores das classes devem ser completos, exceto por alguma informação que seja
gerada automaticamente de acordo com a documentação do código (confira no JavaDoc).
Os métodos andar, voar e nadar devem simplesmente retornar uma string com a indicação
de deslocamento: “andando”, “voando” ou “nadando”.

Anotações adequadas de documentação em JavaDoc também são necessárias para identificar
adequadamente os elementos relevantes do código.
Essa primeira tarefa será o principal ponto de avaliação do trabalho pelo professor conforme
a rubrica do final desse documento.

SEGUNDA TAREFA

Implementar um algoritmo para o ascensorista gerenciar com a maior eficiência possível o
transporte dos animais entre os andares da Arca sem causar a morte de animais pelo
transporte inadequado e sem exceder o peso limite do elevador. A desistência de animais
depois de esperarem mais tempo que sua paciência permite nas filas de embarque também é
altamente indesejável.

Anotações adequadas de documentação em JavaDoc também são necessárias para identificar
adequadamente os elementos relevantes do código.
Essa segunda tarefa é usada de duas formas: a primeira é o teste do código desenvolvido
pelo professor em várias condições de configuração da Arca, sendo que mortes de animais
não devem acontecer por transporte inadequado; a segunda é a execução do código
desenvolvido em uma competição para conferir quem transporta animais de forma mais
eficiente.

Os testes do professor fazem parte da avaliação do trabalho conforme a rubrica do final
desse documento.

A competição está prevista no cronograma da componente curricular e o resultado NÃO faz
parte da nota do trabalho. A configuração do simulador que será usada na competição será
revelada futuramente
