package taller2_arnaldelafuentegallego;

public class Llista implements InterficieLista {

    private Node apunta;

    public Llista() {
        apunta = null; //Variable apuntador inicial instanciada a nil/null
    }

    @Override
    public void meteCurso(Curso c) {
        Node sig = new Node(c, null);

        if (apunta == null) {
            apunta = sig;   // La lista está vacía 
            //System.out.println("Creado");
        } else {
            Node temp = apunta;
            while (temp.getSeg() != null) {
                temp = temp.getSeg();
                //System.out.println("Prueba: " + temp.getInfo() + " ;");
            }
            //en teoria deberiamos tener el ultimo 
            temp.setSeg(sig);

        }

    }

    @Override
    public void imprimeNombreCursos() {
        int i = 1; //Contador para el print
        Node temp = apunta;
        if (apunta == null) {
            System.out.println("La lista está vacía");
            return;
        }
        while (temp != null) {
            System.out.println("    Curso " + i + ", Nombre del curso: " + temp.getC1().getNombreCurso());
            temp = temp.getSeg();
            i++;
        }

    }

    @Override
    public void imprimeCursos() {
        int i = 1; //Contador para el print
        Node temp = apunta;
        if (apunta == null) {
            System.out.println("La lista está vacía");
            return;
        }

        while (temp != null) {
            System.out.println("Curso " + i + ", Info del curso: " + temp.getC1().toString());
            temp = temp.getSeg();
            i++;
        }

    }

    public void imprimeAsignaturasCurso(Curso c) {
        System.out.println(c.imprimeListaAsignaturas());

    }

    public Curso buscaCursos(String nom) {

        Node temp = apunta;
        int i = 1;

        if (apunta == null) {
            System.out.println("La lista está vacía");
            return null;
        }

        while (!temp.getC1().getNombreCurso().equals(nom) && temp.getSeg() != null) {
            temp = temp.getSeg();
            //i++;
        }
        return temp.getC1();
    }

    @Override
    public void eliminaCursos(String nombre) {
        Node actual = apunta;
        Node anterior = null;
        int i = 1;

        if (apunta == null) {
            System.out.println("La lista está vacía");
        }

        while (actual.getSeg() != null && !actual.getC1().getNombreCurso().equals(nombre)) {
            anterior = actual;
            actual = actual.getSeg();
            //i++;
        }

        if (anterior == null) {
            apunta = actual.getSeg();
        } else {
            anterior.setSeg(actual.getSeg());
        }

        System.out.println("Nodo eliminado -> " + actual.getC1());
    }

    // Método para ordenar la lista de menor a mayor
//    public void ordenaAsc() {
//        if (apunta == null || apunta.getSeg() == null) {
//            // Lista vacía o con un solo nodo, ya está ordenada
//            return;
//        }
//
//        boolean cambiado;
//        do {
//            cambiado = false;
//            Node actual = apunta;
//            Node siguiente = apunta.getSeg();
//
//            while (siguiente != null) {
//                if (actual.getC1() > siguiente.getC1()) {
//                    // Intercambiamos los valores
//                    int temp = actual.getInfo();
//                    actual.setInfo(siguiente.getInfo());
//                    siguiente.setInfo(temp);
//                    cambiado = true;
//                }
//                actual = siguiente;
//                siguiente = siguiente.getSeg();
//            }
//        } while (cambiado);
//    }
}
