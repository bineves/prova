/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provagd;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 * nome: gabriela dias - 83957
 */
public class Main {
    public static void main(String[] args) {
        
        Advogado advogado = new Advogado("654", "14323", "31-322-6345", "551262-98", Setor.JURIDICO, 12.540, LocalDate.of(1999, Month.DECEMBER, 31), Genero.FEMININO, "Rebeca", "6542-9876", "reb@gmail.com", new Endereco("Rua UM", "13", "Bloco D", "6552-987", "Salvador", UnidadeFederativa.BAHIA));
        Motoboy motoboy = new Motoboy("413321", "41425", "1441-09872-989", "52423-98", Setor.OPERACOES, 3.550, LocalDate.of(2001, Month.OCTOBER, 7), Genero.MASCULINO, "Mario", "4242-08", "mario@gmail.com", new Endereco("Rua Dois", "43", "Bloco A", "4321-9972", "São Paulo", UnidadeFederativa.SAO_PAULO));
        Medico medico = new Medico("1341", "62542", "4142-8276", "15254241", Setor.SAUDE, 17.550, LocalDate.of(1985, Month.MARCH, 22), Genero.FEMININO, "Claudia", "14322-826726", "claudia@gmail.com", new Endereco("Rua Tres", "42", "Bloco C", "4242-9278", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        Cliente cliente = new Cliente(222, LocalDate.of(1987, Month.MARCH, 21), Genero.FEMININO, "Mariana", "625452-9723", "mariana@gmail.com", new Endereco("Rua Quatro", "76", "Bloco F", "4142-272", "Salvador", UnidadeFederativa.BAHIA));
        Juridica juridica = new Juridica("625123-83", "524241", "Antonio", "5142-2882", "antonio@gmail.com", new Endereco("Rua Cinco", "296", "Bloco A", "726553-8262", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        
        System.out.println(advogado);
        System.out.println("");
        System.out.println(motoboy);
        System.out.println("");
        System.out.println(medico);
        System.out.println("");
        System.out.println(cliente);
        System.out.println("");
        System.out.println(juridica);
    }
    
}
