import br.com.dio.dominio.*;

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

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJessica = new Dev();
        devJessica.setNome("Jéssica");
        devJessica.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devJessica.getConteudosIncritos());

        devJessica.progredir();
        devJessica.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devJessica.getConteudosIncritos());
        System.out.println("Conteudos Concluidos" + devJessica.getConteudosConcluidos());
        System.out.println("XP: " + devJessica.calcularTotalXp());

        System.out.println("----------");

        Dev devLeo = new Dev();
        devLeo.setNome("Leo");
        devLeo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devLeo.getConteudosIncritos());

        devLeo.progredir();
        devLeo.progredir();
        devLeo.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devLeo.getConteudosIncritos());
        System.out.println("Conteudos Concluidos" + devLeo.getConteudosConcluidos());
        System.out.println("XP: " + devLeo.calcularTotalXp());




    }
}