package com.company;
public class Pessoa {
    int id;
    int age;
    String nome;

    public Pessoa(String nome, int age1, int id){
        this.age=age1;
        this.nome=nome;
        this.id=id;
    }

    public static Pessoa[] ProcurarNome(Pessoa[] a, String nome){
        int i=0;
        while (a[i].nome!=nome) {
            i=i+1;
        }
        if (a[i].nome.compareTo(nome)==0){
            System.out.println("[nome: "+a[i].nome + " age: "+a[i].age+"]");
            return a;
        }
        return null;
    }

    public static String[] VetorNomes(Pessoa[] a){
        String[] aux= new String[a.length];
        for(int i=0; i<a.length;i++){
            aux[i]=a[i].nome;
            System.out.println("[nome:"+a[i].nome+"]");
       }
        return aux;

    }
    public static Pessoa[] AddId(Pessoa[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i].id = i;
            System.out.println("[nome:" + a[i].nome + " age:" + a[i].age + " id: " + a[i].id + "]");
        }
        return a;
    }

    public static int MediadasIdades(Pessoa[] a){
        int aux1=0;
        int soma=0;
        for(int i=0;i<a.length;i++){
            soma = a[i].age + soma;
            aux1= aux1+1;
       }
       return soma/aux1;
    }
    public static Pessoa[] IdHabilitacao(Pessoa[] a){
       Pessoa vetoraux[] = new Pessoa[a.length];
       for (int i=0; i<a.length;i++){
           if (a[i].age>18){
               vetoraux[i]= a[i];
               System.out.println("[nome:"+vetoraux[i].nome+ " age:"+ vetoraux[i].age+
                       " id: "+vetoraux[i].id+"]");
           }
       }
       return vetoraux;
    }

}
