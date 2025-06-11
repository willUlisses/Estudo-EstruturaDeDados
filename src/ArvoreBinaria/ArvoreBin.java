package ArvoreBinaria;

import Nodes.NoArvore;

public class ArvoreBin<T extends Comparable<T>> {

    private NoArvore<T> raiz;

 public ArvoreBin() {
     this.raiz = null;
 }

 public void inserir(T conteudo) {
     NoArvore<T> novoNo = new NoArvore<>(conteudo);
     raiz = inserir(raiz, novoNo);
 }

 private NoArvore<T> inserir(NoArvore<T> atual, NoArvore<T> novoNo) {
     if (atual == null) {
         return novoNo;
     } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
         atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
     } else {
         atual.setNoDir(inserir(atual.getNoDir(), novoNo));
     }
     return atual;
 }

 public void exibirInOrder() {
     System.out.println("Exibindo em Ordem");
     exibirInOrder(this.raiz);
 }

 private void exibirInOrder(NoArvore<T> atual) {
     if (atual != null) {
         exibirInOrder(atual.getNoEsq());
         System.out.println(atual.getConteudo() + ", ");
         exibirInOrder(atual.getNoDir());
     }
 }

 public void exibirPostOrder() {
     System.out.println("\n Exibindo em Pós-Ordem");
     exibirPostOrder(this.raiz);
 }

 private void exibirPostOrder(NoArvore<T> atual) {
     if (atual != null) {
         exibirPostOrder(atual.getNoEsq());
         exibirPostOrder(atual.getNoDir());
         System.out.println(atual.getConteudo() + ", ");
     }
 }

 public void exibirPreOrder() {
     System.out.println("\n Exibindo em Pré-Ordem");
     exibirPreOrder(this.raiz);
 }

 private void exibirPreOrder(NoArvore<T> atual) {
     if (atual != null) {
         System.out.println(atual.getConteudo() + ", ");
         exibirPreOrder(atual.getNoEsq());
         exibirPreOrder(atual.getNoDir());
     }
 }

 public void remover(T conteudo) {
    try {
        NoArvore<T> atual = this.raiz;
        NoArvore<T> pai = null;
        NoArvore<T> filho = null;
        NoArvore<T> temp = null;

        while(atual != null && !atual.getConteudo().equals(conteudo)) {
            pai = atual;
            if (conteudo.compareTo(atual.getConteudo()) < 0) {
                atual = atual.getNoEsq();
            } else {
                atual = atual.getNoDir();
            }
        }

    if (atual == null) {
        System.out.println("Conteudo não encontrado. Bloco Try");
        return;
    }

        if (pai == null) {
            if (atual.getNoDir() == null) {
                this.raiz = atual.getNoEsq();
            } else if (atual.getNoEsq() == null) {
                this.raiz = atual.getNoDir();
            } else {
                for (temp = atual, filho = atual.getNoEsq();
                     filho.getNoDir() != null;
                     temp = filho, filho = filho.getNoDir()
                ){
                    if (filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(raiz.getNoEsq());
                    }
                }
                filho.setNoDir(raiz.getNoDir());
                raiz = filho;
            }
        } else if (atual.getNoDir() == null) {
            if (pai.getNoEsq() == atual) {
                pai.setNoEsq(atual.getNoEsq());
            } else {
                pai.setNoDir(atual.getNoEsq());
            }
        } else if (atual.getNoEsq() == null) {
            if (pai.getNoEsq() == atual) {
                pai.setNoEsq(atual.getNoDir());
            } else {
                pai.setNoDir(atual.getNoDir());
            }
        } else {
            for (temp = atual, filho = atual.getNoEsq();
                 filho.getNoDir() != null;
                 temp = filho, filho = filho.getNoDir())
            {
                if (filho != atual.getNoEsq()) {
                    temp.setNoDir(filho.getNoEsq());
                    filho.setNoEsq(atual.getNoEsq());
                }
                filho.setNoDir(atual.getNoDir());
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(filho);
                } else {
                    pai.setNoDir(filho);
                }
            }
        }


    } catch (NullPointerException e) {
    System.out.println("Conteudo não encontrado. Bloco Catch");
    }
 }


}
