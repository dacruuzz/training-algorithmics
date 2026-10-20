---
name: Algoritmo / Estrutura de dados
about: Implementar uma classe de algoritmo ou estrutura de dados (uma issue por classe)
title: "[Cap. X] NomeDaClasse: descrição curta"
labels: ["algorithmic", "feature", "backend"]
assignees: ""
---

# Implementar `NomeDaClasse`

## Contexto
<!-- Capítulo do livro, o que o algoritmo resolve e qual o objetivo de aprendizado. -->
Capítulo X do livro "Entendendo Algoritmos".

## Local
`app.trainingalgorithmics.categoria.algoritmo.NomeDaClasse`

## Dependências
<!-- Issues ou classes que precisam estar prontas antes. Apague a seção se não houver. -->
- Nenhuma

## Tarefas
<!-- Uma linha por versão ou método. Varie a abordagem: int vs Integer, iterativo vs recursivo, genérico, in-place, manual vs nativo. -->
- [ ] Versão com `int[]`
- [ ] Versão com `Integer[]`
- [ ] Versão genérica
- [ ] Javadoc em todos os métodos públicos (pré-condições, complexidade de tempo e espaço, retorno em casos especiais)

## Testes
- [ ] Entrada vazia
- [ ] Um elemento
- [ ] Casos extremos (primeiro/último elemento, valores negativos, repetidos)
- [ ] Caso sem resultado (elemento ausente, sem caminho, etc.)
- [ ] Comparar o resultado com a implementação nativa do Java, quando existir

## Critérios de aceite
- Javadoc em todos os métodos públicos
- Testes passando com `mvn test`

## Ideias extras (opcional)
<!-- Desafios para depois. Apague a seção se não houver. -->
-