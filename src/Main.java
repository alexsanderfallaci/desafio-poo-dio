import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Desenvolvimento em Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Desenvolvimento em js");
        curso2.setDescricao("Descrição do curso js");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlex = new Dev();
        devAlex.setNome("Alex");
        devAlex.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alex: " + devAlex.getConteudosInscritos());
        devAlex.progredir();
        devAlex.progredir();
        System.out.println(System.lineSeparator()+"             -----------------------------------------------------------------------------"+ System.lineSeparator());
        System.out.println("Conteúdos Inscritos Alex: " + devAlex.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alex: " + devAlex.getConteudosConcluidos());
        System.out.println("XP:" + devAlex.calcularTotalXp());

        System.out.println(System.lineSeparator()+"             =============================================================================================================================="+ System.lineSeparator());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println(System.lineSeparator()+"             -----------------------------------------------------------------------------"+ System.lineSeparator());
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}

