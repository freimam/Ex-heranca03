class RodarAplicacao {

    public static void main(String[] args) {
        //vetor tipo ClasseMae chamado classes - com 3 objetos = ClasseFilha1, ClasseFilha2, ClasseMae
        //Polimorfismo nas classes ClasseFilha1 e ClasseFilha2, pois são diferentes da classe chamadora ClasseMae
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //Foreach percorrendo todo o vetor e informando os metodos 1 de cada um.
        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println(""); // imprimindo

        //Foreach percorrendo todo o vetor e informando os metodos 2 de cada um.
        //Sendo que o Metodo 2 inexiste na ClasseFilha1, não ocorrerá polimosfismo na ClasseFilha1 e na ClasseMae
        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println(""); // imprimindo

        //Abaixo so ocorreu sobrescrita
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }

}