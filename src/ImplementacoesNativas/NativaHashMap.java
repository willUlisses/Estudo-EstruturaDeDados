package ImplementacoesNativas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NativaHashMap {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Jose");
        aluno.put("Idade", "19");
        aluno.put("Curso", "Sistemas de Informação");
        aluno.put("Turma", "1AN");

        System.out.println(aluno);
        System.out.println(aluno.keySet());

        // pode-se adicionar esse map de alunos numa lista, em que cada espaço da lista armazena os vários dados
        // de cada map de aluno.

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Will");
        aluno2.put("Idade", "18");
        aluno2.put("Curso", "Sistemas de Informação");
        aluno2.put("Turma", "1BN");

        listaAlunos.add(aluno2);
        System.out.println(listaAlunos);

        System.out.println(aluno2.containsKey("Nome"));

    }
 
}
