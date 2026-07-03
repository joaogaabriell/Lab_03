# Lab 03 — Figuras Geométricas (Interfaces e Polimorfismo)

Atividade de laboratório da disciplina de **Métodos Avançados de Programação (MAP)**.

## Sobre o projeto

Exercício de modelagem orientada a objetos usando **interface** e **polimorfismo**: a interface `FiguraGeometrica` define o contrato (`calcularArea()`, `calcularPerimetro()` e `descricao()`) e cada figura o implementa à sua maneira.

| Classe | Descrição |
|---|---|
| `FiguraGeometrica` | Interface com os métodos comuns a todas as figuras |
| `Circulo` | Área e perímetro a partir do raio |
| `Quadrado` | Área e perímetro a partir do lado |
| `Retangulo` | Área e perímetro a partir de altura e largura |
| `Main` | Demonstração do uso polimórfico das figuras |

Os construtores validam as dimensões e lançam `IllegalArgumentException` para valores menores ou iguais a zero.

## Tecnologias

- Java
- Maven
- JUnit 5 (testes unitários)

## Como executar

```bash
mvn compile exec:java -Dexec.mainClass="Map.Main"
```

Ou abra o projeto em uma IDE (IntelliJ, Eclipse) e execute a classe `Map.Main`.

## Testes

```bash
mvn test
```

Há testes unitários para cada figura cobrindo área, perímetro, descrição e entradas inválidas.
