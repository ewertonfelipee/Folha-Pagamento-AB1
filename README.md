# Folha-Pagamento-Refatorada

Code smells encontrados:
    Data Class
    Feature Envy
    Speculative Generality

Padrões Aplicados:
    Move Method
    Remove Setting Methods
    Composite
    State

O code Smell Data Class foi encontrado nas classes Date.java, Hour.java, Sale.java
que são classes que só têm atributos, construtor getters e setters, com isso, apliquei
o padrão Remove Setting Methods para remover os setters desnecessários e a partir disso
tornar o código mais enxuto. Outro lugar que usou-se esse padrão foi na classe PaymentSchedule.java
que apesar dos contrutores terem implementações mais complexas, os seus setters eram descartáveis.

Na classe Empregado(atual CompositeEpregado) havia dois campos chamados "pertenceSindicato" e "numeroUnicoNoSindicato", por esses campos estarem em português se tornavam campos em que seus nomes não dizia muita coisa sobre eles, visto que, o recomendado é usar nomes em inglês nos projetos, esse fato era o smell Speculative Generality, que diz que o nomes não revelam os seus própositos dentro do código. Outro lugar onde foi encontrado esse smell foi na classe Card.java que o seu método se chamava "addPoint", e foi substituido por "addPointCard", por se tratar do cartão de ponto do empregado horista.

Na classe Empregado(atual CompositeEpregado) foi encontrado o smell Feature Envy no trecho de código que
pedia pra escolher a forma de pagamentp, mas esse método não usava nada da classe Empregado, então foi usado o padrão Move Method para extrair esse método e colocar na sua própria classe OptionPaymentMethod.java
no package PaymentMethod.

O padrão State foi usado no package PaymentMethod, onde foi criado a interface StatePaymentMethod que nas classes Deposit.java, CheckMail.java e CheckHand.java funcionam como os estados concretos desse padrão e a classe OptionPaymentMethod foi criado usando o Move Method é usado como o contexto que armazena uma referência à um dos objetos concretos de estados e delega a cada um deles os trabalhos específicos para cada um desses estados.

O padrão Composite empregado no package Employeer, pois nesse package pode-se ser visualizado como uma árvore no qual a raiz é a nova classe criada CompositeEmpregado.java, esta classe tem os elementos folhas da árvore e a interface CompositeEmpregado.java descreve operações dos elementos dessa árvore que são as classes dos tipo de empregados que são PayedByHour.java, Commissioned.java e NonComissioned.java que recebe as implementações das folhas de CompositeEmpregado.java de forma específica para cada uma destas classes.