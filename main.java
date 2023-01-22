package br.com.dio.desafio;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso ();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso ();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devErica = new Dev();
        devErica.setNome("Erica");
        devErica.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Erica:" + devErica.getConteudosInscritos());
        devErica.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Erica:" + devErica.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Erica:" + devErica.getConteudosConcluidos());
        System.out.println("XP:" + devErica.calcularTotalXp());

        System.out.println("----------");

        Dev devTimothy = new Dev();
        devTimothy.setNome("Timothy");
        devTimothy.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Timothy:" + devTimothy.getConteudosInscritos());
        devTimothy.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Timothy:" + devTimothy.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Timothy:" + devErica.getConteudosConcluidos());
        System.out.println("XP:" + devTimothy.calcularTotalXp());
    }
}
