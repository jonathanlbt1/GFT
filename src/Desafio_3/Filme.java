package Desafio_3;

public class Filme {

    public String titulo;
    public Enum genero;
    public int duracaoEmMinutos;
    public String horarioSessao;

    public Filme(String titulo, Enum genero, int duracaoEmMinutos, String horarioSessao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.horarioSessao = horarioSessao;
    }

    public void calcularDuracaoEmHoras(double horasparaminutos) {
        int horas = this.duracaoEmMinutos / 60;
        int minutos = duracaoEmMinutos % 60;
        System.out.println(horas + "hr" + minutos + "minutos");
     }

    public void retornarHoraQueAcaba() {

    }
}
