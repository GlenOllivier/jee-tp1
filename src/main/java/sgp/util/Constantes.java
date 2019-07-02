package sgp.util;

import sgp.entity.Departement;
import sgp.service.CollaborateurService;
import sgp.service.DepartementService;

public abstract class Constantes {
    public static final CollaborateurService COLLAB_SERVICE = new CollaborateurService();
    public static final DepartementService DEP_SERVICE = new DepartementService();

    static {
        DEP_SERVICE.addDepartement(new Departement(1, "Comptabilité"));
        DEP_SERVICE.addDepartement(new Departement(2, "Ressources humaines"));
        DEP_SERVICE.addDepartement(new Departement(3, "Informatique"));
        DEP_SERVICE.addDepartement(new Departement(4, "Administratif"));
    }
}
