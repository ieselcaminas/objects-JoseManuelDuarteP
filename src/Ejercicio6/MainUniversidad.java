package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class MainUniversidad {
    public static void main(String[] args) {
        List<AreaConocimiento> areaConocimientos = new ArrayList<>();
        List<Facultad> facultades = new ArrayList<>();

        AreaConocimiento ingNuclear = new AreaConocimiento(1,"Ingeniería Nuclear");
        areaConocimientos.add(ingNuclear);
            Departamento depFisica = new Departamento(1,"Departamento de Física Nuclear",ingNuclear);
            ingNuclear.addDepartamento(depFisica);

            Departamento depQuimica = new Departamento(2,"Departamento de Quimica Nuclear",ingNuclear);
            ingNuclear.addDepartamento(depQuimica);

            Profesor paco = new Profesor("4242G","Paco García",depFisica);
            depFisica.addProfesor(paco);

            Profesor ximo = new Profesor("7859H","Ximo Roque",depFisica);
            depFisica.addProfesor(ximo);

            Profesor juan = new Profesor("6747L","Juan Henrique",depFisica);
            depFisica.addProfesor(juan);

            Profesor manolo = new Profesor("5346V","Manolo Nurio",depQuimica);
            depQuimica.addProfesor(manolo);

            Profesor hugo = new Profesor("4561N","Hugo Gama",depQuimica);
            depQuimica.addProfesor(hugo);

            Facultad facCiencias = new Facultad(1,"Facultad de Ciencias");
            facultades.add(facCiencias);

                Catedra fisParticulas = new Catedra(1,"Física de partículas",depFisica, facCiencias);
                facCiencias.addCatedra(fisParticulas);
                depFisica.addCatedra(fisParticulas);
                paco.addCatedra(fisParticulas);
                fisParticulas.addProfesor(paco);

                Catedra quiDeNucleos = new Catedra(2,"Química de Núcleos",depQuimica, facCiencias);
                facCiencias.addCatedra(quiDeNucleos);
                depQuimica.addCatedra(quiDeNucleos);
                hugo.addCatedra(quiDeNucleos);
                quiDeNucleos.addProfesor(hugo);

        for (AreaConocimiento areaConocimiento : areaConocimientos) {
            System.out.println(areaConocimiento);
            for (Departamento departamento : areaConocimiento.getDepartamentos()) {
                System.out.println("\t" + departamento);
                for (Profesor profesor : departamento.getProfesores()) {
                    System.out.println("\t\t" + profesor);
                    for (Catedra catedra : profesor.getCatedras()) {
                        System.out.println("\t\t\t" + catedra);
                    }
                }
            }
        }

        System.out.println("--------------------------------");

        for (Facultad facultad : facultades) {
            System.out.println(facultad);
            for (Catedra catedra : facultad.getCatedras()) {
                System.out.println("\t" + catedra);
            }
        }
    }
}
