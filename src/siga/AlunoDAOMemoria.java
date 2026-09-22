package siga;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AlunoDAOMemoria implements AlunoDAO{
    
    private final Map<String, Aluno> alunos = new LinkedHashMap<>();

    @Override
    public void inserir(Aluno aluno) {
        alunos.put(aluno.getMatricula(), aluno);
    }

    @Override 
    public Aluno buscarPorMatricula(String matricula) {
        return alunos.get(matricula);
    }

    @Override
    public List<Aluno> listarTodos() {
        return new ArrayList<>(alunos.values());
    }

    @Override
    public void atualizar(Aluno aluno) {
        alunos.put(aluno.getMatricula(), aluno);
    }

    @Override
    public void remover(String matricula) {
        alunos.remove(matricula);
    }
}
