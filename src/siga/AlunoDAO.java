package siga;

import java.util.List;

public interface AlunoDAO {

    void inserir(Aluno aluno);

    Aluno buscarPorMatricula(String matricula);

    List<Aluno> buscarTodos();

    void atualizar(Aluno aluno);

    void remover(String matricula);
    
}
