import br.com.dio.dominio.Conteudo;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Jas");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Curso java");
        mentoria.setDescricao("Descricao curso java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}