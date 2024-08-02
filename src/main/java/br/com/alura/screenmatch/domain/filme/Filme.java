package br.com.alura.screenmatch.domain.filme;

public class Filme {

    private String nome;
    private Integer duracaoEmMinutos;
    private Integer anoLancamenteo;
    private String genero;

    public Filme(DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamenteo = dados.ano();
        this.genero = dados.genero();
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", anoLancamenteo=" + anoLancamenteo +
                ", genero='" + genero + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Integer getAnoLancamenteo() {
        return anoLancamenteo;
    }

    public String getGenero() {
        return genero;
    }
}
