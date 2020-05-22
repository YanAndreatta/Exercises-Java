/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisepoo.pkg09b;

/**
 *
 * @author yandu
 */
public class Livro implements Publicacao{
    // Atributos
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Métodos Públicos

    public String detalhes() {
        return "Livro{" + "\ntitulo = " + titulo + "\nautor = " + autor + "\ntotPaginas = " + totPaginas 
                + " pagAtual = " + pagAtual + " aberto = " + aberto + "\nleitor = " + leitor.getNome() + "\nidade = " + leitor.getIdade() + " sexo = " + leitor.getSexo() + '}';
    }
    
   

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.totPaginas = totPaginas;
        this.autor = autor;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    
    
    // Métodos Especiais
    

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private int getTotPaginas() {
        return totPaginas;
    }

    private void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean getAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    

    // Métodos Abstratos

    @Override
    public void abrir() {
        //this.aberto = true;
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        //this.setAberto(false);
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(p > this.totPaginas){
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
    
    
}
