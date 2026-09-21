# SIGA — Atividade de Persistência e padrão DAO (código inicial)

**Técnicas de Programação II (TP2) · Aula 7** — CST em Desenvolvimento de Software Multiplataforma · Fatec de Porto Ferreira


## 1. Identificar o SQL misturado à regra de negócio e registrar, por escrito, as violações de SRP e DIP e a duplicação.
O método "matricular()" valida a média, monta o "INSERT" e chama  o método "BancoSimulado.executar()" e "gerarRelatorio()" monta "SELECT" e chama "BancoSimulado.consultar()".
A classe "ServicoMatricula" cuida da regra de negócio e da persistência, violando o SRP (princípio da responsabilidade única), ou seja, qualquer mudança nas regras ou na camada de persistência pode exigir modificações nessa classe.
Também tem violação do DIP porque "ServicoMatricula" está acoplada à implementação específica de "BancoSimulado", em vez de depender de uma abstração.
Os métodos "matricular()" e "gerarRelatorio()" estão duplicando responsabilidades e dificultando a manutenção do código.

## 2. Definir a interface `AlunoDAO` com as operações do domínio: `inserir`, `buscarPorMatricula`, `listarTodos`, `atualizar` e `remover`. Use o vocabulário do domínio — sem `tabela`, `coluna` ou `INSERT` nos nomes.


## 3. Implementar `AlunoDAOMemoria`, guardando os alunos em um `Map<String, Aluno>` interno. (Opcionalmente, implemente também um `AlunoDAOBanco` que use o `BancoSimulado`.)


## 4. Refatorar `ServicoMatricula` para receber um `AlunoDAO` pelo construtor e remover todo o SQL da classe; ela deve conter apenas regra de negócio.


## 5. Demonstrar a troca de implementação do DAO no `Main`, sem alterar uma linha da regra de negócio.


